package es.unican.istr.pasys.generator

import es.unican.istr.pasys.pasys.CassandraService
import es.unican.istr.pasys.pasys.KafkaService
import es.unican.istr.pasys.pasys.StormService
import es.unican.istr.pasys.pasys.ZookeeperService
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import es.unican.istr.pasys.generator.MyPasysGenerator.DeployableComponentType
import es.unican.istr.pasys.pasys.ProcessingNode
import es.unican.istr.pasys.pasys.ProcessingResourceCluster
import es.unican.istr.pasys.pasys.ProcessingNodeCluster
import java.util.Collections
import es.unican.istr.pasys.pasys.NodeDeploymentConf
import es.unican.istr.pasys.pasys.DeploymentConfiguration
import es.unican.istr.pasys.pasys.OrchestrationCluster
import es.unican.istr.pasys.pasys.NomadDeploymentConf
import es.unican.istr.pasys.pasys.KubernetesDeploymentConf
import es.unican.istr.pasys.pasys.SwarmDeploymentConf

class MyPasysGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
	    for (element : resource.allContents.toIterable.filter(EObject)) {
	        switch element {
	        	CassandraService: {
	                generateCassandraConfigFiles(element, fsa)
	                generateCassandraRackConfigFiles(element, fsa)
	                generateCassandraScriptFiles(element, fsa)
	            }
	            KafkaService: {
	                generateKafkaConfigFile(element, fsa)
	                generateKafkaScriptFile(element, fsa)
	        	}
	        	StormService: {
	                generateStormConfigFile(element, fsa)
	                generateStormScriptFile(element, fsa)
	            }
	        	ZookeeperService: {
	                generateZookeeperConfigFile(element, fsa)
	                generateZookeeperScriptFile(element, fsa)
	                generateZookeeperIdFile(element, fsa)    
	            }
	       }
	    }
	}
	
	
	// Cassandra Service
	
	def void generateCassandraConfigFiles(CassandraService cassandraService, IFileSystemAccess2 fsa) {   
	    val seedsValue = generateSeedsValue(cassandraService)
	    
		val configContent = '''
		# Licensed to the Apache Software Foundation (ASF) under one or more
		# contributor license agreements.
		
		# Model-specific configurations
		cluster_name: «cassandraService.host.name»
		num_tokens: «cassandraService.numTokens»
		auto_bootstrap: «cassandraService.autoBootstrap»
		endpoint_snitch: «cassandraService.endpointSnitch»
		
		# Network configuration
		storage_port: «cassandraService.storagePort»
		ssl_storage_port: «cassandraService.sslStoragePort»
		rpc_port: «cassandraService.rpcPort»
		
		# Data directories
		data_file_directories:
		- «cassandraService.dataFileDir»
		
		# Seed provider configuration
		seed_provider:
		- class_name: «IF cassandraService.seedProviderClass !== null»«cassandraService.seedProviderClass»«ELSE»org.apache.cassandra.locator.SimpleSeedProvider«ENDIF»
		  parameters:
		  - seeds: "«seedsValue»"
		
		# Performance settings
		concurrent_reads: 32
		concurrent_writes: 32
		concurrent_counter_writes: 32
		concurrent_materialized_view_writes: 32
		
		# Inter-node settings
		internode_compression: dc
		inter_dc_tcp_nodelay: false
		
		# TTL settings
		tracetype_query_ttl: 86400
		tracetype_repair_ttl: 604800
		
		# Feature flags
		enable_user_defined_functions: false
		enable_scripted_user_defined_functions: false
		enable_materialized_views: true
		
		# System settings
		windows_timer_interval: 1
		
		# Memory and cache settings
		memtable_allocation_type: heap_buffers
		
		# Timeout settings
		read_request_timeout_in_ms: 5000
		write_request_timeout_in_ms: 2000
		counter_write_request_timeout_in_ms: 5000
		cas_contention_timeout_in_ms: 1000
		range_request_timeout_in_ms: 10000
		truncate_request_timeout_in_ms: 60000
		request_timeout_in_ms: 10000
		
		# Security settings
		authenticator: AllowAllAuthenticator
		authorizer: AllowAllAuthorizer
		
		# Transport settings
		start_native_transport: true
		start_rpc: false
		
		# Auto-tuning settings
		trickle_fsync: false
		trickle_fsync_interval_in_kb: 10240
		
		# GC settings
		gc_warn_threshold_in_ms: 1000
        '''
	        
        fsa.generateFile('''cassandra/cassandra«cassandraService.id».yaml''', configContent)
	}
	       
	def void generateCassandraRackConfigFiles(CassandraService cassandraService, IFileSystemAccess2 fsa) {
	    val rackConfigs = newHashMap()
	    
	    for (dc : cassandraService.dataCenters) {
	        for (rack : dc.racks) {
	            for (node : rack.nodes.nodes) {
	                val content = '''
	                    dc=«dc.name»
	                    rack=«rack.name»
	                '''
	                rackConfigs.put(node.ip, content)
	            }
	        }
	    }
	    
	    for (entry : rackConfigs.entrySet) {
	        fsa.generateFile('''cassandra/cassandra-rackcd.properties''', entry.value.toString)
	    }
	}

	def void generateCassandraScriptFiles(CassandraService cassandraService, IFileSystemAccess2 fsa) {
	    if (!(cassandraService.deploymentConfig instanceof NodeDeploymentConf)) {
	        return;
	    }
	    
	    val nodeConf = cassandraService.deploymentConfig as NodeDeploymentConf
	    
	    for (node : (cassandraService.host as ProcessingNodeCluster).nodes) {
	        val scriptContent = '''
	            cd «nodeConf.scriptFolderPath»
	            rm -rf «cassandraService.dataFileDir»/system/*
	            rm -f «nodeConf.configFolderPath»/cassandra-topology.properties
	            «nodeConf.artifactLocator»/«nodeConf.artifactName» -Dcassandra.config=file:///«nodeConf.configFolderPath»/cassandra«cassandraService.id».yaml
	            
	            sleep 60
	            
	            «FOR schema : cassandraService.cqlSchemas»
	            «nodeConf.artifactLocator»/cqlsh «node.ip» -f «nodeConf.scriptFolderPath»/«schema.fileName»
	            «ENDFOR»
	        '''
	        
	        fsa.generateFile('''cassandra/cassandra«cassandraService.id».sh''', scriptContent)
	    }
	}
	
	private def String generateSeedsValue(CassandraService service) {
	    if (service?.seeds === null) {
	        return ""
	    }
	    
	    try {
	        return service.seeds.nodes.map[node | node.ip].join(",")
	    } catch (Exception e) {
	        return ""
	    }
	}
    
    
    // Kafka Service
    
	def void generateKafkaConfigFile(KafkaService kafkaService, IFileSystemAccess2 fsa) {
	    val logPath = switch (kafkaService.deploymentConfig) {
	        NodeDeploymentConf: {
	            (kafkaService.deploymentConfig as NodeDeploymentConf).logFolderPath
	        }
	        default: {
	            // Valor por defecto para despliegues en contenedores
	            "/var/log/kafka"
	        }
	    }
	    
	    val configContent = '''
        # Licensed to the Apache Software Foundation (ASF) under one or more
        # contributor license agreements.  See the NOTICE file distributed with
        # this work for additional information regarding copyright ownership.
        # The ASF licenses this file to You under the Apache License, Version 2.0
        # (the "License"); you may not use this file except in compliance with
        # the License.  You may obtain a copy of the License at
        #
        #    http://www.apache.org/licenses/LICENSE-2.0
        #
        # Unless required by applicable law or agreed to in writing, software
        # distributed under the License is distributed on an "AS IS" BASIS,
        # WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        # See the License for the specific language governing permissions and
        # limitations under the License.

        ############################# Server Basics #############################
        broker.id=«kafkaService.commId»

        ############################# Socket Server Settings #############################
        listeners=«kafkaService.listeners»
        advertised.listeners=«kafkaService.advertisedListeners»

        num.network.threads=«kafkaService.numNetworkThreads»
        num.io.threads=«kafkaService.numIOThreads»

        socket.send.buffer.bytes=«kafkaService.socketSendBufferBytes»
        socket.receive.buffer.bytes=«kafkaService.socketReceiveBufferBytes»
        socket.request.max.bytes=«kafkaService.socketRequestMaxBytes»

        ############################# Log Basics #############################
        log.dirs=«logPath»
        num.partitions=«kafkaService.numPartitions»
        num.recovery.threads.per.data.dir=«kafkaService.numRecoveryThreadsPerDataDir»

        ############################# Internal Topic Settings  #############################
        offsets.topic.replication.factor=1
        transaction.state.log.replication.factor=1
        transaction.state.log.min.isr=1

        ############################# Log Flush Policy #############################
        log.flush.interval.messages=«kafkaService.logFlushIntervalMessages»
        log.flush.interval.ms=«kafkaService.logFlushInterval»

        ############################# Log Retention Policy #############################
        log.retention.hours=168
        log.segment.bytes=1073741824
        log.retention.check.interval.ms=300000

        ############################# Feature Flags #############################
        auto.create.topics.enable=«kafkaService.autoCreateTopicEnable»
        delete.topic.enable=«kafkaService.deleteTopicEnable»

        ############################# Zookeeper #############################
        zookeeper.connect=«generateZookeeperConnectString(kafkaService)»
        zookeeper.connection.timeout.ms=«kafkaService.zookeeperConnectionTimeout»

        ############################# Group Coordinator Settings #############################
        group.initial.rebalance.delay.ms=0
	    '''
	    
	    fsa.generateFile('''kafka«kafkaService.commId».properties''', configContent)
	}
	
	def String generateZookeeperConnectString(KafkaService kafkaService) {
	    val cluster = kafkaService.zookeeperConnect.host
	    val port = kafkaService.zookeeperConnect.clientPort
	    
	    switch (cluster) {
	        ProcessingNodeCluster: {
	            return cluster.nodes.map[node | '''«node.ip»:«port»'''].join(",")
	        }
	        OrchestrationCluster: {
	            // TODO 
	            return ""
	        }
	        default: return ""
	    }
	}
	
	def void generateKafkaScriptFile(KafkaService kafkaService, IFileSystemAccess2 fsa) {
	    if (!(kafkaService.deploymentConfig instanceof NodeDeploymentConf)) {
	        return;
	    }
	    
	    val nodeConf = kafkaService.deploymentConfig as NodeDeploymentConf
	    
	    val scriptContent = '''
	        cd «nodeConf.scriptFolderPath»
	        rm -f «nodeConf.logFolderPath»/meta.properties
	        «nodeConf.artifactLocator»/«nodeConf.artifactName» -daemon «nodeConf.configFolderPath»/kafka«kafkaService.commId».properties
	    '''
	    
	    fsa.generateFile('''kafka/kafka«kafkaService.commId».sh''', scriptContent)
	}
	
	
    // Storm Service
    
	def void generateStormConfigFile(StormService stormService, IFileSystemAccess2 fsa) {
		val configContent = '''
		# Storm Configuration
		
		# Local directory configuration
		storm.local.dir: "«stormService.localDir»"

		# UI configuration
        «IF stormService.ui !== null»
ui.port: «stormService.ui.uiPort»
        «ENDIF»
		
		storm.zookeeper.servers:
		«FOR zookeeperNode : getNodesFromCluster(stormService.zookeeperConnect.host)»
		  - "«zookeeperNode.name»"
		«ENDFOR»

		storm.zookeeper.port: «stormService.zookeeperConnect.clientPort»

		# Supervisor configuration
        «IF stormService.supervisor?.supervisorSlotPorts !== null»
supervisor.slots.ports:
        «FOR port : stormService.supervisor.supervisorSlotPorts»
        - «port»
        «ENDFOR»
        «ENDIF»
		
		# Nimbus configuration
		nimbus.seeds: [«FOR node : getNodesFromCluster(stormService.nimbus.host) SEPARATOR ", "»"«node.name»"«ENDFOR»]
		'''
		fsa.generateFile("storm/storm.yaml", configContent)
	}
	
	// Returns nodes of type ProcessingNodeCluster
	def Iterable<ProcessingNode> getNodesFromCluster(ProcessingResourceCluster cluster) {
	    if (cluster instanceof ProcessingNodeCluster) {
	        return (cluster as ProcessingNodeCluster).nodes
	    } else {
	        return Collections::emptyList
	    }
	}

	def void generateStormScriptFile(StormService stormService, IFileSystemAccess2 fsa) {
		val nimbusScript = generateStormScriptContent(stormService, DeployableComponentType::STORM_NIMBUS)
		val supervisorScript = generateStormScriptContent(stormService, DeployableComponentType::STORM_SUPERVISOR)
		val uiScript = generateStormScriptContent(stormService, DeployableComponentType::STORM_UI)

		fsa.generateFile("storm/scripts/stormNimbus" + stormService.id + ".sh", nimbusScript)
		fsa.generateFile("storm/scripts/stormSupervisor" + stormService.id + ".sh", supervisorScript)
		fsa.generateFile("storm/scripts/stormUI" + stormService.id + ".sh", uiScript)
	}

	def String generateStormScriptContent(StormService stormService, DeployableComponentType type) {
	    if (!(stormService.deploymentConfig instanceof NodeDeploymentConf)) {
	        return "";
	    }
	    
	    val nodeConf = stormService.deploymentConfig as NodeDeploymentConf	    
	    
	    '''
	    #!/bin/bash
	    cd «nodeConf.scriptFolderPath»
	    launch «nodeConf.artifactLocator»/«nodeConf.artifactName» «toScriptCommand(type)»
	    '''
	}
	
	enum DeployableComponentType {
		STORM_NIMBUS,
		STORM_SUPERVISOR,
		STORM_UI
	}
		
	def String toScriptCommand(DeployableComponentType type) {
	    switch type {
	        case DeployableComponentType::STORM_NIMBUS: "nimbus"
	        case DeployableComponentType::STORM_SUPERVISOR: "supervisor"
	        case DeployableComponentType::STORM_UI: "ui"
	    }
	}


	// Zookeeper Service
	
	def void generateZookeeperConfigFile(ZookeeperService zkService, IFileSystemAccess2 fsa) {
	    val deploymentConfig = zkService?.deploymentConfig
	    if (deploymentConfig === null) {
	        throw new IllegalStateException(
	            '''ZookeeperService «zkService.id» has no deployment configuration'''
	        )
	    }
	    
        val configContent = '''
        # The number of milliseconds of each tick
        tickTime=«zkService.tickTime»
        
        # The number of ticks that the initial synchronization phase can take
        initLimit=«zkService.initLimit»
        
        # The number of ticks that can pass between sending a request and getting an acknowledgement
        syncLimit=«zkService.syncLimit»
        
        # the port at which the clients will connect
        clientPort=«zkService.clientPort»
        
        # Leader election settings
        leaderServers=«IF zkService.leaderServers»yes«ELSE»no«ENDIF»
        
        # Server definitions
        # Server ID (used for leader election)
        myid=«zkService.serverId»
        
        # Peer and leader ports
        peerPort=«zkService.peerPort»
        leaderPort=«zkService.leaderPort»
        
        # Data directory - depends on deployment type
        dataDir=«getDataDir(zkService)»
    '''
	    
        fsa.generateFile('''zookeeper/zoo«zkService.serverId».cfg''', configContent)
    }
    	
	def void generateZookeeperIdFile(ZookeeperService zkService, IFileSystemAccess2 fsa) {
	    val idContent = zkService.serverId.toString
	    
	    fsa.generateFile('''zookeeper/myid''', idContent)
	}
	
	def void generateZookeeperScriptFile(ZookeeperService zkService, IFileSystemAccess2 fsa) {
	    if (!(zkService.deploymentConfig instanceof NodeDeploymentConf)) {
	        return;
	    }
	    
	    val nodeConf = zkService.deploymentConfig as NodeDeploymentConf
	    
	    val scriptContent = '''
	        cd «nodeConf.scriptFolderPath»
	        «nodeConf.artifactLocator»/«nodeConf.artifactName» start «nodeConf.configFolderPath»/zoo«zkService.serverId».cfg
	        sleep 30
	    '''
	    
	    fsa.generateFile('''zookeeper/zkServer«zkService.serverId».sh''', scriptContent)
	}
	
    def private String getDataDir(ZookeeperService zkService) {
	    switch (zkService.deploymentConfig) {
	        NodeDeploymentConf: {
	            return (zkService.deploymentConfig as NodeDeploymentConf).dataFolderPath
	        }
	        NomadDeploymentConf,
	        KubernetesDeploymentConf,
	        SwarmDeploymentConf: {
	            // Para despliegues en contenedores, usamos una ruta estándar
	            return "/var/lib/zookeeper/data"
	        }
	        default: {
	            return "/tmp/zookeeper"
	        }
	    }
	}
	
}

	