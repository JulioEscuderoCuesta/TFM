package es.unican.istr.pasys.xtext.generator;

import com.google.common.collect.Iterables;
import es.unican.istr.pasys.pasys.CassandraService;
import es.unican.istr.pasys.pasys.CommunicationService;
import es.unican.istr.pasys.pasys.DataCenter;
import es.unican.istr.pasys.pasys.DeploymentConfiguration;
import es.unican.istr.pasys.pasys.FileDescriptor;
import es.unican.istr.pasys.pasys.FlowStreamData;
import es.unican.istr.pasys.pasys.KafkaService;
import es.unican.istr.pasys.pasys.KafkaWorkloadStreamData;
import es.unican.istr.pasys.pasys.KubernetesDeploymentConf;
import es.unican.istr.pasys.pasys.NodeDeploymentConf;
import es.unican.istr.pasys.pasys.NomadDeploymentConf;
import es.unican.istr.pasys.pasys.OrchestrationCluster;
import es.unican.istr.pasys.pasys.OrchestratorDeploymentConf;
import es.unican.istr.pasys.pasys.ProcessingNode;
import es.unican.istr.pasys.pasys.ProcessingNodeCluster;
import es.unican.istr.pasys.pasys.ProcessingResourceCluster;
import es.unican.istr.pasys.pasys.Rack;
import es.unican.istr.pasys.pasys.SchedulingService;
import es.unican.istr.pasys.pasys.StormService;
import es.unican.istr.pasys.pasys.StormSupervisor;
import es.unican.istr.pasys.pasys.StormUI;
import es.unican.istr.pasys.pasys.SwarmDeploymentConf;
import es.unican.istr.pasys.pasys.TaskExecutor;
import es.unican.istr.pasys.pasys.Workflow;
import es.unican.istr.pasys.pasys.WorkflowStreamData;
import es.unican.istr.pasys.pasys.ZookeeperService;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class Rai4Generator extends AbstractGenerator {
  public enum DeployableComponentType {
    STORM_NIMBUS,

    STORM_SUPERVISOR,

    STORM_UI;
  }

  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<EObject> _filter = Iterables.<EObject>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), EObject.class);
    for (final EObject element : _filter) {
      boolean _matched = false;
      if (element instanceof CassandraService) {
        _matched=true;
        this.generateCassandraConfigFiles(((CassandraService)element), fsa);
        this.generateCassandraRackConfigFiles(((CassandraService)element), fsa);
        this.generateCassandraScriptFiles(((CassandraService)element), fsa);
      }
      if (!_matched) {
        if (element instanceof KafkaService) {
          _matched=true;
          this.generateKafkaConfigFile(((KafkaService)element), fsa);
          this.generateKafkaScriptFile(((KafkaService)element), fsa);
        }
      }
      if (!_matched) {
        if (element instanceof KafkaWorkloadStreamData) {
          _matched=true;
          this.generateTopicScript(((KafkaWorkloadStreamData)element), fsa);
        }
      }
      if (!_matched) {
        if (element instanceof StormService) {
          _matched=true;
          this.generateStormConfigFile(((StormService)element), fsa);
          this.generateStormScriptFile(((StormService)element), fsa);
        }
      }
      if (!_matched) {
        if (element instanceof Workflow) {
          _matched=true;
          this.generateWorkflowFiles(((Workflow)element), fsa);
        }
      }
      if (!_matched) {
        if (element instanceof ZookeeperService) {
          _matched=true;
          this.generateZookeeperConfigFile(((ZookeeperService)element), fsa);
          this.generateZookeeperScriptFile(((ZookeeperService)element), fsa);
          this.generateZookeeperIdFile(((ZookeeperService)element), fsa);
        }
      }
    }
  }

  public void generateCassandraConfigFiles(final CassandraService cassandraService, final IFileSystemAccess2 fsa) {
    final String seedsValue = this.generateSeedsValue(cassandraService);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Licensed to the Apache Software Foundation (ASF) under one or more");
    _builder.newLine();
    _builder.append("# contributor license agreements.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Model-specific configurations");
    _builder.newLine();
    _builder.append("cluster_name: ");
    String _name = cassandraService.getHost().getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.append("num_tokens: ");
    int _numTokens = cassandraService.getNumTokens();
    _builder.append(_numTokens);
    _builder.newLineIfNotEmpty();
    _builder.append("auto_bootstrap: ");
    boolean _isAutoBootstrap = cassandraService.isAutoBootstrap();
    _builder.append(_isAutoBootstrap);
    _builder.newLineIfNotEmpty();
    _builder.append("endpoint_snitch: ");
    String _endpointSnitch = cassandraService.getEndpointSnitch();
    _builder.append(_endpointSnitch);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("# Network configuration");
    _builder.newLine();
    _builder.append("storage_port: ");
    String _storagePort = cassandraService.getStoragePort();
    _builder.append(_storagePort);
    _builder.newLineIfNotEmpty();
    _builder.append("ssl_storage_port: ");
    String _sslStoragePort = cassandraService.getSslStoragePort();
    _builder.append(_sslStoragePort);
    _builder.newLineIfNotEmpty();
    _builder.append("rpc_port: ");
    String _rpcPort = cassandraService.getRpcPort();
    _builder.append(_rpcPort);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("# Data directories");
    _builder.newLine();
    _builder.append("data_file_directories:");
    _builder.newLine();
    _builder.append("- ");
    String _dataFileDir = cassandraService.getDataFileDir();
    _builder.append(_dataFileDir);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("# Seed provider configuration");
    _builder.newLine();
    _builder.append("seed_provider:");
    _builder.newLine();
    _builder.append("- class_name: ");
    {
      String _seedProviderClass = cassandraService.getSeedProviderClass();
      boolean _tripleNotEquals = (_seedProviderClass != null);
      if (_tripleNotEquals) {
        String _seedProviderClass_1 = cassandraService.getSeedProviderClass();
        _builder.append(_seedProviderClass_1);
      } else {
        _builder.append("org.apache.cassandra.locator.SimpleSeedProvider");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("parameters:");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("- seeds: \"");
    _builder.append(seedsValue, "  ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("# Performance settings");
    _builder.newLine();
    _builder.append("concurrent_reads: 32");
    _builder.newLine();
    _builder.append("concurrent_writes: 32");
    _builder.newLine();
    _builder.append("concurrent_counter_writes: 32");
    _builder.newLine();
    _builder.append("concurrent_materialized_view_writes: 32");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Inter-node settings");
    _builder.newLine();
    _builder.append("internode_compression: dc");
    _builder.newLine();
    _builder.append("inter_dc_tcp_nodelay: false");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# TTL settings");
    _builder.newLine();
    _builder.append("tracetype_query_ttl: 86400");
    _builder.newLine();
    _builder.append("tracetype_repair_ttl: 604800");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Feature flags");
    _builder.newLine();
    _builder.append("enable_user_defined_functions: false");
    _builder.newLine();
    _builder.append("enable_scripted_user_defined_functions: false");
    _builder.newLine();
    _builder.append("enable_materialized_views: true");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# System settings");
    _builder.newLine();
    _builder.append("windows_timer_interval: 1");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Memory and cache settings");
    _builder.newLine();
    _builder.append("memtable_allocation_type: heap_buffers");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Timeout settings");
    _builder.newLine();
    _builder.append("read_request_timeout_in_ms: 5000");
    _builder.newLine();
    _builder.append("write_request_timeout_in_ms: 2000");
    _builder.newLine();
    _builder.append("counter_write_request_timeout_in_ms: 5000");
    _builder.newLine();
    _builder.append("cas_contention_timeout_in_ms: 1000");
    _builder.newLine();
    _builder.append("range_request_timeout_in_ms: 10000");
    _builder.newLine();
    _builder.append("truncate_request_timeout_in_ms: 60000");
    _builder.newLine();
    _builder.append("request_timeout_in_ms: 10000");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Security settings");
    _builder.newLine();
    _builder.append("authenticator: AllowAllAuthenticator");
    _builder.newLine();
    _builder.append("authorizer: AllowAllAuthorizer");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Transport settings");
    _builder.newLine();
    _builder.append("start_native_transport: true");
    _builder.newLine();
    _builder.append("start_rpc: false");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Auto-tuning settings");
    _builder.newLine();
    _builder.append("trickle_fsync: false");
    _builder.newLine();
    _builder.append("trickle_fsync_interval_in_kb: 10240");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# GC settings");
    _builder.newLine();
    _builder.append("gc_warn_threshold_in_ms: 1000");
    _builder.newLine();
    final String configContent = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("cassandra/cassandra");
    String _id = cassandraService.getId();
    _builder_1.append(_id);
    _builder_1.append(".yaml");
    fsa.generateFile(_builder_1.toString(), configContent);
  }

  public void generateCassandraRackConfigFiles(final CassandraService cassandraService, final IFileSystemAccess2 fsa) {
    final HashMap<String, String> rackConfigs = CollectionLiterals.<String, String>newHashMap();
    EList<DataCenter> _dataCenters = cassandraService.getDataCenters();
    for (final DataCenter dc : _dataCenters) {
      EList<Rack> _racks = dc.getRacks();
      for (final Rack rack : _racks) {
        EList<ProcessingNode> _nodes = rack.getNodes().getNodes();
        for (final ProcessingNode node : _nodes) {
          {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("dc=");
            String _name = dc.getName();
            _builder.append(_name);
            _builder.newLineIfNotEmpty();
            _builder.append("rack=");
            String _name_1 = rack.getName();
            _builder.append(_name_1);
            _builder.newLineIfNotEmpty();
            final String content = _builder.toString();
            rackConfigs.put(node.getIp(), content);
          }
        }
      }
    }
    Set<Map.Entry<String, String>> _entrySet = rackConfigs.entrySet();
    for (final Map.Entry<String, String> entry : _entrySet) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("cassandra/cassandra-rackcd.properties");
      fsa.generateFile(_builder.toString(), entry.getValue().toString());
    }
  }

  public void generateCassandraScriptFiles(final CassandraService cassandraService, final IFileSystemAccess2 fsa) {
    DeploymentConfiguration _deploymentConfig = cassandraService.getDeploymentConfig();
    boolean _not = (!(_deploymentConfig instanceof NodeDeploymentConf));
    if (_not) {
      return;
    }
    DeploymentConfiguration _deploymentConfig_1 = cassandraService.getDeploymentConfig();
    final NodeDeploymentConf nodeConf = ((NodeDeploymentConf) _deploymentConfig_1);
    ProcessingResourceCluster _host = cassandraService.getHost();
    EList<ProcessingNode> _nodes = ((ProcessingNodeCluster) _host).getNodes();
    for (final ProcessingNode node : _nodes) {
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("cd ");
        String _scriptFolderPath = nodeConf.getScriptFolderPath();
        _builder.append(_scriptFolderPath);
        _builder.newLineIfNotEmpty();
        _builder.append("rm -rf ");
        String _dataFileDir = cassandraService.getDataFileDir();
        _builder.append(_dataFileDir);
        _builder.append("/system/*");
        _builder.newLineIfNotEmpty();
        _builder.append("rm -f ");
        String _configFolderPath = nodeConf.getConfigFolderPath();
        _builder.append(_configFolderPath);
        _builder.append("/cassandra-topology.properties");
        _builder.newLineIfNotEmpty();
        String _artifactLocator = nodeConf.getArtifactLocator();
        _builder.append(_artifactLocator);
        _builder.append("/");
        String _artifactName = nodeConf.getArtifactName();
        _builder.append(_artifactName);
        _builder.append(" -Dcassandra.config=file:///");
        String _configFolderPath_1 = nodeConf.getConfigFolderPath();
        _builder.append(_configFolderPath_1);
        _builder.append("/cassandra");
        String _id = cassandraService.getId();
        _builder.append(_id);
        _builder.append(".yaml");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("sleep 60");
        _builder.newLine();
        _builder.newLine();
        {
          EList<FileDescriptor> _cqlSchemas = cassandraService.getCqlSchemas();
          for(final FileDescriptor schema : _cqlSchemas) {
            String _artifactLocator_1 = nodeConf.getArtifactLocator();
            _builder.append(_artifactLocator_1);
            _builder.append("/cqlsh ");
            String _ip = node.getIp();
            _builder.append(_ip);
            _builder.append(" -f ");
            String _scriptFolderPath_1 = nodeConf.getScriptFolderPath();
            _builder.append(_scriptFolderPath_1);
            _builder.append("/");
            String _fileName = schema.getFileName();
            _builder.append(_fileName);
            _builder.newLineIfNotEmpty();
          }
        }
        final String scriptContent = _builder.toString();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("cassandra/cassandra");
        String _id_1 = cassandraService.getId();
        _builder_1.append(_id_1);
        _builder_1.append(".sh");
        fsa.generateFile(_builder_1.toString(), scriptContent);
      }
    }
  }

  private String generateSeedsValue(final CassandraService service) {
    ProcessingNodeCluster _seeds = null;
    if (service!=null) {
      _seeds=service.getSeeds();
    }
    boolean _tripleEquals = (_seeds == null);
    if (_tripleEquals) {
      return "";
    }
    try {
      final Function1<ProcessingNode, String> _function = (ProcessingNode node) -> {
        return node.getIp();
      };
      return IterableExtensions.join(ListExtensions.<ProcessingNode, String>map(service.getSeeds().getNodes(), _function), ",");
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        return "";
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }

  public void generateKafkaConfigFile(final KafkaService kafkaService, final IFileSystemAccess2 fsa) {
    String _switchResult = null;
    DeploymentConfiguration _deploymentConfig = kafkaService.getDeploymentConfig();
    boolean _matched = false;
    if (_deploymentConfig instanceof NodeDeploymentConf) {
      _matched=true;
      DeploymentConfiguration _deploymentConfig_1 = kafkaService.getDeploymentConfig();
      _switchResult = ((NodeDeploymentConf) _deploymentConfig_1).getLogFolderPath();
    }
    if (!_matched) {
      _switchResult = "/var/log/kafka";
    }
    final String logPath = _switchResult;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Licensed to the Apache Software Foundation (ASF) under one or more");
    _builder.newLine();
    _builder.append("# contributor license agreements.  See the NOTICE file distributed with");
    _builder.newLine();
    _builder.append("# this work for additional information regarding copyright ownership.");
    _builder.newLine();
    _builder.append("# The ASF licenses this file to You under the Apache License, Version 2.0");
    _builder.newLine();
    _builder.append("# (the \"License\"); you may not use this file except in compliance with");
    _builder.newLine();
    _builder.append("# the License.  You may obtain a copy of the License at");
    _builder.newLine();
    _builder.append("#");
    _builder.newLine();
    _builder.append("#    http://www.apache.org/licenses/LICENSE-2.0");
    _builder.newLine();
    _builder.append("#");
    _builder.newLine();
    _builder.append("# Unless required by applicable law or agreed to in writing, software");
    _builder.newLine();
    _builder.append("# distributed under the License is distributed on an \"AS IS\" BASIS,");
    _builder.newLine();
    _builder.append("# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.");
    _builder.newLine();
    _builder.append("# See the License for the specific language governing permissions and");
    _builder.newLine();
    _builder.append("# limitations under the License.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("############################# Server Basics #############################");
    _builder.newLine();
    _builder.append("broker.id=");
    int _commId = kafkaService.getCommId();
    _builder.append(_commId);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("############################# Socket Server Settings #############################");
    _builder.newLine();
    _builder.append("listeners=");
    String _listeners = kafkaService.getListeners();
    _builder.append(_listeners);
    _builder.newLineIfNotEmpty();
    _builder.append("advertised.listeners=");
    String _advertisedListeners = kafkaService.getAdvertisedListeners();
    _builder.append(_advertisedListeners);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("num.network.threads=");
    int _numNetworkThreads = kafkaService.getNumNetworkThreads();
    _builder.append(_numNetworkThreads);
    _builder.newLineIfNotEmpty();
    _builder.append("num.io.threads=");
    int _numIOThreads = kafkaService.getNumIOThreads();
    _builder.append(_numIOThreads);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("socket.send.buffer.bytes=");
    int _socketSendBufferBytes = kafkaService.getSocketSendBufferBytes();
    _builder.append(_socketSendBufferBytes);
    _builder.newLineIfNotEmpty();
    _builder.append("socket.receive.buffer.bytes=");
    int _socketReceiveBufferBytes = kafkaService.getSocketReceiveBufferBytes();
    _builder.append(_socketReceiveBufferBytes);
    _builder.newLineIfNotEmpty();
    _builder.append("socket.request.max.bytes=");
    int _socketRequestMaxBytes = kafkaService.getSocketRequestMaxBytes();
    _builder.append(_socketRequestMaxBytes);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("############################# Log Basics #############################");
    _builder.newLine();
    _builder.append("log.dirs=");
    _builder.append(logPath);
    _builder.newLineIfNotEmpty();
    _builder.append("num.partitions=");
    int _numPartitions = kafkaService.getNumPartitions();
    _builder.append(_numPartitions);
    _builder.newLineIfNotEmpty();
    _builder.append("num.recovery.threads.per.data.dir=");
    int _numRecoveryThreadsPerDataDir = kafkaService.getNumRecoveryThreadsPerDataDir();
    _builder.append(_numRecoveryThreadsPerDataDir);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("############################# Internal Topic Settings  #############################");
    _builder.newLine();
    _builder.append("offsets.topic.replication.factor=1");
    _builder.newLine();
    _builder.append("transaction.state.log.replication.factor=1");
    _builder.newLine();
    _builder.append("transaction.state.log.min.isr=1");
    _builder.newLine();
    _builder.newLine();
    _builder.append("############################# Log Flush Policy #############################");
    _builder.newLine();
    _builder.append("log.flush.interval.messages=");
    int _logFlushIntervalMessages = kafkaService.getLogFlushIntervalMessages();
    _builder.append(_logFlushIntervalMessages);
    _builder.newLineIfNotEmpty();
    _builder.append("log.flush.interval.ms=");
    int _logFlushInterval = kafkaService.getLogFlushInterval();
    _builder.append(_logFlushInterval);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("############################# Log Retention Policy #############################");
    _builder.newLine();
    _builder.append("log.retention.hours=168");
    _builder.newLine();
    _builder.append("log.segment.bytes=1073741824");
    _builder.newLine();
    _builder.append("log.retention.check.interval.ms=300000");
    _builder.newLine();
    _builder.newLine();
    _builder.append("############################# Feature Flags #############################");
    _builder.newLine();
    _builder.append("auto.create.topics.enable=");
    boolean _isAutoCreateTopicEnable = kafkaService.isAutoCreateTopicEnable();
    _builder.append(_isAutoCreateTopicEnable);
    _builder.newLineIfNotEmpty();
    _builder.append("delete.topic.enable=");
    boolean _isDeleteTopicEnable = kafkaService.isDeleteTopicEnable();
    _builder.append(_isDeleteTopicEnable);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("############################# Zookeeper #############################");
    _builder.newLine();
    _builder.append("zookeeper.connect=");
    String _generateZookeeperConnectString = this.generateZookeeperConnectString(kafkaService);
    _builder.append(_generateZookeeperConnectString);
    _builder.newLineIfNotEmpty();
    _builder.append("zookeeper.connection.timeout.ms=");
    int _zookeeperConnectionTimeout = kafkaService.getZookeeperConnectionTimeout();
    _builder.append(_zookeeperConnectionTimeout);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("############################# Group Coordinator Settings #############################");
    _builder.newLine();
    _builder.append("group.initial.rebalance.delay.ms=0");
    _builder.newLine();
    final String configContent = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("kafka/kafka");
    int _commId_1 = kafkaService.getCommId();
    _builder_1.append(_commId_1);
    _builder_1.append(".properties");
    fsa.generateFile(_builder_1.toString(), configContent);
  }

  public String generateZookeeperConnectString(final KafkaService kafkaService) {
    final ProcessingResourceCluster cluster = kafkaService.getZookeeperConnect().getHost();
    final String port = kafkaService.getZookeeperConnect().getClientPort();
    boolean _matched = false;
    if (cluster instanceof ProcessingNodeCluster) {
      _matched=true;
      final Function1<ProcessingNode, String> _function = (ProcessingNode node) -> {
        StringConcatenation _builder = new StringConcatenation();
        String _ip = node.getIp();
        _builder.append(_ip);
        _builder.append(":");
        _builder.append(port);
        return _builder.toString();
      };
      return IterableExtensions.join(ListExtensions.<ProcessingNode, String>map(((ProcessingNodeCluster)cluster).getNodes(), _function), ",");
    }
    if (!_matched) {
      if (cluster instanceof OrchestrationCluster) {
        _matched=true;
        return "";
      }
    }
    return "";
  }

  public void generateKafkaScriptFile(final KafkaService kafkaService, final IFileSystemAccess2 fsa) {
    DeploymentConfiguration _deploymentConfig = kafkaService.getDeploymentConfig();
    boolean _not = (!(_deploymentConfig instanceof NodeDeploymentConf));
    if (_not) {
      return;
    }
    DeploymentConfiguration _deploymentConfig_1 = kafkaService.getDeploymentConfig();
    final NodeDeploymentConf nodeConf = ((NodeDeploymentConf) _deploymentConfig_1);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("cd ");
    String _scriptFolderPath = nodeConf.getScriptFolderPath();
    _builder.append(_scriptFolderPath);
    _builder.newLineIfNotEmpty();
    _builder.append("rm -f ");
    String _logFolderPath = nodeConf.getLogFolderPath();
    _builder.append(_logFolderPath);
    _builder.append("/meta.properties");
    _builder.newLineIfNotEmpty();
    String _artifactLocator = nodeConf.getArtifactLocator();
    _builder.append(_artifactLocator);
    _builder.append("/");
    String _artifactName = nodeConf.getArtifactName();
    _builder.append(_artifactName);
    _builder.append(" -daemon ");
    String _configFolderPath = nodeConf.getConfigFolderPath();
    _builder.append(_configFolderPath);
    _builder.append("/kafka");
    int _commId = kafkaService.getCommId();
    _builder.append(_commId);
    _builder.append(".properties");
    _builder.newLineIfNotEmpty();
    final String scriptContent = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("kafka/kafka");
    int _commId_1 = kafkaService.getCommId();
    _builder_1.append(_commId_1);
    _builder_1.append(".sh");
    fsa.generateFile(_builder_1.toString(), scriptContent);
  }

  public void generateTopicScript(final KafkaWorkloadStreamData kafkaStream, final IFileSystemAccess2 fsa) {
    final CommunicationService server = kafkaStream.getHolder();
    if ((!(server instanceof KafkaService))) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Topic ");
      String _name = kafkaStream.getName();
      _builder.append(_name);
      _builder.append(" is not assigned to a Kafka Server");
      throw new IllegalStateException(_builder.toString());
    }
    final KafkaService kafkaService = ((KafkaService) server);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("topic_");
    String _id = kafkaStream.getId();
    _builder_1.append(_id);
    _builder_1.append(".sh");
    final String scriptName = _builder_1.toString();
    String _switchResult = null;
    DeploymentConfiguration _deploymentConfig = kafkaStream.getDeploymentConfig();
    boolean _matched = false;
    if (_deploymentConfig instanceof NodeDeploymentConf) {
      _matched=true;
      String _xblockexpression = null;
      {
        DeploymentConfiguration _deploymentConfig_1 = kafkaStream.getDeploymentConfig();
        final NodeDeploymentConf nodeConf = ((NodeDeploymentConf) _deploymentConfig_1);
        ProcessingResourceCluster _host = kafkaService.getHost();
        final ProcessingNodeCluster serverHost = ((ProcessingNodeCluster) _host);
        StringConcatenation _builder_2 = new StringConcatenation();
        String _ip = serverHost.getNodes().get(0).getIp();
        _builder_2.append(_ip);
        _builder_2.append(":");
        String _clientPort = kafkaService.getClientPort();
        _builder_2.append(_clientPort);
        final String bootstrapServer = _builder_2.toString();
        _xblockexpression = this.generateNodeScriptContent(kafkaStream, bootstrapServer, nodeConf);
      }
      _switchResult = _xblockexpression;
    }
    if (!_matched) {
      if (_deploymentConfig instanceof OrchestratorDeploymentConf) {
        _matched=true;
        String _xblockexpression = null;
        {
          StringConcatenation _builder_2 = new StringConcatenation();
          String _name_1 = kafkaService.getName();
          _builder_2.append(_name_1);
          _builder_2.append("-hs:");
          String _clientPort = kafkaService.getClientPort();
          _builder_2.append(_clientPort);
          final String bootstrapServer = _builder_2.toString();
          _xblockexpression = this.generateOrchestratorScriptContent(kafkaStream, bootstrapServer);
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      throw new IllegalStateException("Unsupported deployment configuration");
    }
    final String scriptContent = _switchResult;
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("kafkaworkloadstreamdata/");
    _builder_2.append(scriptName);
    fsa.generateFile(_builder_2.toString(), scriptContent);
    DeploymentConfiguration _deploymentConfig_1 = kafkaStream.getDeploymentConfig();
    if ((_deploymentConfig_1 instanceof OrchestratorDeploymentConf)) {
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("kubectl cp C:\\\\Temp\\\\localScripts\\\\");
      _builder_3.append(scriptName);
      _builder_3.append(" ");
      String _name_1 = kafkaService.getName();
      _builder_3.append(_name_1);
      _builder_3.append("-0");
      _builder_3.newLineIfNotEmpty();
      _builder_3.append("kubectl exec ");
      String _name_2 = kafkaService.getName();
      _builder_3.append(_name_2);
      _builder_3.append("-0 -- /bin/bash ");
      _builder_3.append(scriptName);
      _builder_3.newLineIfNotEmpty();
      final String helmContent = _builder_3.toString();
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("kafkaworkloadstreamdata/helm_");
      _builder_4.append(scriptName);
      fsa.generateFile(_builder_4.toString(), helmContent);
    }
  }

  private String generateNodeScriptContent(final KafkaWorkloadStreamData stream, final String bootstrapServer, final NodeDeploymentConf nodeConf) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#!/bin/bash");
    _builder.newLine();
    _builder.append("cd ");
    String _scriptFolderPath = nodeConf.getScriptFolderPath();
    _builder.append(_scriptFolderPath);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("TOPIC_NAME=\"");
    String _name = stream.getName();
    _builder.append(_name);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _artifactLocator = nodeConf.getArtifactLocator();
    _builder.append(_artifactLocator);
    _builder.append("/");
    String _artifactName = nodeConf.getArtifactName();
    _builder.append(_artifactName);
    _builder.append(" --list --bootstrap-server ");
    _builder.append(bootstrapServer);
    _builder.append(" | grep ");
    String _name_1 = stream.getName();
    _builder.append(_name_1);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#Si existe el topico");
    _builder.newLine();
    _builder.append("if [ $? -eq 0 ]; then");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("exit 0");
    _builder.newLine();
    _builder.append("fi");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#Si no existe el topico se crea");
    _builder.newLine();
    String _artifactLocator_1 = nodeConf.getArtifactLocator();
    _builder.append(_artifactLocator_1);
    _builder.append("/");
    String _artifactName_1 = nodeConf.getArtifactName();
    _builder.append(_artifactName_1);
    _builder.append(" --create --bootstrap-server ");
    _builder.append(bootstrapServer);
    _builder.append(" \\");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("--replication-factor ");
    int _numReplication = stream.getNumReplication();
    _builder.append(_numReplication, "    ");
    _builder.append(" \\");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("--partitions ");
    int _numPartitions = stream.getNumPartitions();
    _builder.append(_numPartitions, "    ");
    _builder.append(" \\");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("--topic ");
    String _name_2 = stream.getName();
    _builder.append(_name_2, "    ");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  private String generateOrchestratorScriptContent(final KafkaWorkloadStreamData stream, final String bootstrapServer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#!/bin/bash");
    _builder.newLine();
    _builder.append("cd /tmp");
    _builder.newLine();
    _builder.newLine();
    _builder.append("TOPIC_NAME=\"");
    String _name = stream.getName();
    _builder.append(_name);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("kafka-topics.sh --list --bootstrap-server ");
    _builder.append(bootstrapServer);
    _builder.append(" | grep ");
    String _name_1 = stream.getName();
    _builder.append(_name_1);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("#Si existe el topico");
    _builder.newLine();
    _builder.append("if [ $? -eq 0 ]; then");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("exit 0");
    _builder.newLine();
    _builder.append("fi");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#Si no existe el topico se crea");
    _builder.newLine();
    _builder.append("kafka-topics.sh --create --bootstrap-server ");
    _builder.append(bootstrapServer);
    _builder.append(" \\");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("--replication-factor ");
    int _numReplication = stream.getNumReplication();
    _builder.append(_numReplication, "    ");
    _builder.append(" \\");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("--partitions ");
    int _numPartitions = stream.getNumPartitions();
    _builder.append(_numPartitions, "    ");
    _builder.append(" \\");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("--topic ");
    String _name_2 = stream.getName();
    _builder.append(_name_2, "    ");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public void generateStormConfigFile(final StormService stormService, final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Storm Configuration");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Local directory configuration");
    _builder.newLine();
    _builder.append("storm.local.dir: \"");
    String _localDir = stormService.getLocalDir();
    _builder.append(_localDir);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("# UI configuration");
    _builder.newLine();
    {
      StormUI _ui = stormService.getUi();
      boolean _tripleNotEquals = (_ui != null);
      if (_tripleNotEquals) {
        _builder.append("ui.port: ");
        String _uiPort = stormService.getUi().getUiPort();
        _builder.append(_uiPort);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("storm.zookeeper.servers:");
    _builder.newLine();
    {
      Iterable<ProcessingNode> _nodesFromCluster = this.getNodesFromCluster(stormService.getZookeeperConnect().getHost());
      for(final ProcessingNode zookeeperNode : _nodesFromCluster) {
        _builder.append("- \"");
        String _ip = zookeeperNode.getIp();
        _builder.append(_ip);
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("storm.zookeeper.port: ");
    String _clientPort = stormService.getZookeeperConnect().getClientPort();
    _builder.append(_clientPort);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("# Supervisor configuration");
    _builder.newLine();
    {
      StormSupervisor _supervisor = stormService.getSupervisor();
      EList<String> _supervisorSlotPorts = null;
      if (_supervisor!=null) {
        _supervisorSlotPorts=_supervisor.getSupervisorSlotPorts();
      }
      boolean _tripleNotEquals_1 = (_supervisorSlotPorts != null);
      if (_tripleNotEquals_1) {
        _builder.append("supervisor.slots.ports:");
        _builder.newLine();
        {
          EList<String> _supervisorSlotPorts_1 = stormService.getSupervisor().getSupervisorSlotPorts();
          for(final String port : _supervisorSlotPorts_1) {
            _builder.append("        ");
            _builder.append("- ");
            _builder.append(port, "        ");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("# Nimbus configuration");
    _builder.newLine();
    _builder.append("nimbus.seeds: [");
    {
      Iterable<ProcessingNode> _nodesFromCluster_1 = this.getNodesFromCluster(stormService.getNimbus().getHost());
      boolean _hasElements = false;
      for(final ProcessingNode node : _nodesFromCluster_1) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        _builder.append("\"");
        String _ip_1 = node.getIp();
        _builder.append(_ip_1);
        _builder.append("\"");
      }
    }
    _builder.append("]");
    _builder.newLineIfNotEmpty();
    final String configContent = _builder.toString();
    fsa.generateFile("storm/storm.yaml", configContent);
  }

  public Iterable<ProcessingNode> getNodesFromCluster(final ProcessingResourceCluster cluster) {
    if ((cluster instanceof ProcessingNodeCluster)) {
      return ((ProcessingNodeCluster) cluster).getNodes();
    } else {
      return Collections.<ProcessingNode>emptyList();
    }
  }

  public void generateStormScriptFile(final StormService stormService, final IFileSystemAccess2 fsa) {
    final String nimbusScript = this.generateStormScriptContent(stormService, Rai4Generator.DeployableComponentType.STORM_NIMBUS);
    final String supervisorScript = this.generateStormScriptContent(stormService, Rai4Generator.DeployableComponentType.STORM_SUPERVISOR);
    final String uiScript = this.generateStormScriptContent(stormService, Rai4Generator.DeployableComponentType.STORM_UI);
    String _id = stormService.getId();
    String _plus = ("storm/scripts/stormNimbus" + _id);
    String _plus_1 = (_plus + ".sh");
    fsa.generateFile(_plus_1, nimbusScript);
    String _id_1 = stormService.getId();
    String _plus_2 = ("storm/scripts/stormSupervisor" + _id_1);
    String _plus_3 = (_plus_2 + ".sh");
    fsa.generateFile(_plus_3, supervisorScript);
    String _id_2 = stormService.getId();
    String _plus_4 = ("storm/scripts/stormUI" + _id_2);
    String _plus_5 = (_plus_4 + ".sh");
    fsa.generateFile(_plus_5, uiScript);
  }

  public String generateStormScriptContent(final StormService stormService, final Rai4Generator.DeployableComponentType type) {
    String _xblockexpression = null;
    {
      DeploymentConfiguration _deploymentConfig = stormService.getDeploymentConfig();
      boolean _not = (!(_deploymentConfig instanceof NodeDeploymentConf));
      if (_not) {
        return "";
      }
      DeploymentConfiguration _deploymentConfig_1 = stormService.getDeploymentConfig();
      final NodeDeploymentConf nodeConf = ((NodeDeploymentConf) _deploymentConfig_1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("#!/bin/bash");
      _builder.newLine();
      _builder.append("cd ");
      String _scriptFolderPath = nodeConf.getScriptFolderPath();
      _builder.append(_scriptFolderPath);
      _builder.newLineIfNotEmpty();
      _builder.append("launch ");
      String _artifactLocator = nodeConf.getArtifactLocator();
      _builder.append(_artifactLocator);
      _builder.append("/");
      String _artifactName = nodeConf.getArtifactName();
      _builder.append(_artifactName);
      _builder.append(" ");
      String _scriptCommand = this.toScriptCommand(type);
      _builder.append(_scriptCommand);
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  public String toScriptCommand(final Rai4Generator.DeployableComponentType type) {
    String _switchResult = null;
    if (type != null) {
      switch (type) {
        case STORM_NIMBUS:
          _switchResult = "nimbus";
          break;
        case STORM_SUPERVISOR:
          _switchResult = "supervisor";
          break;
        case STORM_UI:
          _switchResult = "ui";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }

  public void generateWorkflowFiles(final Workflow workflow, final IFileSystemAccess2 fsa) {
    EList<WorkflowStreamData> _ownedStreamData = workflow.getOwnedStreamData();
    for (final WorkflowStreamData streamData : _ownedStreamData) {
      if ((streamData instanceof FlowStreamData)) {
        this.generateFlowStreamData(((FlowStreamData) streamData), fsa);
      }
    }
    EList<TaskExecutor> _ownedTaskExecutors = workflow.getOwnedTaskExecutors();
    for (final TaskExecutor taskExecutor : _ownedTaskExecutors) {
      this.generateTaskExecutor(taskExecutor, fsa);
    }
    ProcessingResourceCluster _host = workflow.getScheduler().getHost();
    boolean _tripleNotEquals = (_host != null);
    if (_tripleNotEquals) {
      this.generateWorkflowHostDeployment(workflow, fsa);
    } else {
      this.generateWorkflowOrchestratorDeployment(workflow, fsa);
    }
  }

  private void generateWorkflowHostDeployment(final Workflow workflow, final IFileSystemAccess2 fsa) {
    final SchedulingService server = workflow.getScheduler();
    DeploymentConfiguration _deploymentConfig = workflow.getDeploymentConfig();
    boolean _matched = false;
    if (_deploymentConfig instanceof NodeDeploymentConf) {
      if ((server instanceof StormService)) {
        _matched=true;
        DeploymentConfiguration _deploymentConfig_1 = workflow.getDeploymentConfig();
        final NodeDeploymentConf nodeConf = ((NodeDeploymentConf) _deploymentConfig_1);
        DeploymentConfiguration _deploymentConfig_2 = server.getDeploymentConfig();
        final NodeDeploymentConf serverConf = ((NodeDeploymentConf) _deploymentConfig_2);
        final StormService stormService = ((StormService) server);
        StringConcatenation _builder = new StringConcatenation();
        String _artifactLocator = serverConf.getArtifactLocator();
        _builder.append(_artifactLocator);
        _builder.append("/");
        String _artifactName = serverConf.getArtifactName();
        _builder.append(_artifactName);
        _builder.append(" jar ");
        String _scriptFolderPath = nodeConf.getScriptFolderPath();
        _builder.append(_scriptFolderPath);
        _builder.append("/");
        String _artifactName_1 = nodeConf.getArtifactName();
        _builder.append(_artifactName_1);
        _builder.append(" ");
        String _implementingClassName = workflow.getRootTask().getImplementingClassName();
        _builder.append(_implementingClassName);
        _builder.append(" ");
        String _generateArguments = this.generateArguments(nodeConf);
        _builder.append(_generateArguments);
        _builder.newLineIfNotEmpty();
        final String scriptContent = _builder.toString();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("workflow/Workflow");
        String _id = workflow.getId();
        _builder_1.append(_id);
        _builder_1.append(".sh");
        final String fileName = _builder_1.toString();
        fsa.generateFile(fileName, scriptContent);
        this.generateArtifactFile(workflow, nodeConf, stormService, fsa);
      }
    }
  }

  private void generateWorkflowOrchestratorDeployment(final Workflow workflow, final IFileSystemAccess2 fsa) {
  }

  private String generateArguments(final NodeDeploymentConf conf) {
    boolean _isEmpty = conf.getArguments().isEmpty();
    if (_isEmpty) {
      return "";
    }
    return IterableExtensions.join(conf.getArguments(), " ");
  }

  private void generateArtifactFile(final Workflow workflow, final NodeDeploymentConf nodeConf, final StormService stormService, final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("artifactName=");
    String _artifactName = nodeConf.getArtifactName();
    _builder.append(_artifactName);
    _builder.newLineIfNotEmpty();
    _builder.append("scriptFolderPath=");
    String _scriptFolderPath = nodeConf.getScriptFolderPath();
    _builder.append(_scriptFolderPath);
    _builder.newLineIfNotEmpty();
    _builder.append("artifactLocator=");
    String _artifactLocator = nodeConf.getArtifactLocator();
    _builder.append(_artifactLocator);
    _builder.newLineIfNotEmpty();
    final String artifactContent = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("workflow/artifacts/");
    String _artifactName_1 = nodeConf.getArtifactName();
    _builder_1.append(_artifactName_1);
    _builder_1.append(".properties");
    fsa.generateFile(_builder_1.toString(), artifactContent);
  }

  private void generateFlowStreamData(final FlowStreamData flowData, final IFileSystemAccess2 fsa) {
  }

  private void generateTaskExecutor(final TaskExecutor taskExecutor, final IFileSystemAccess2 fsa) {
  }

  public void generateZookeeperConfigFile(final ZookeeperService zkService, final IFileSystemAccess2 fsa) {
    DeploymentConfiguration _deploymentConfig = null;
    if (zkService!=null) {
      _deploymentConfig=zkService.getDeploymentConfig();
    }
    final DeploymentConfiguration deploymentConfig = _deploymentConfig;
    if ((deploymentConfig == null)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("ZookeeperService ");
      String _id = zkService.getId();
      _builder.append(_id);
      _builder.append(" has no deployment configuration");
      throw new IllegalStateException(_builder.toString());
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(" ");
    _builder_1.append("# The number of milliseconds of each tick");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("tickTime=");
    long _tickTime = zkService.getTickTime();
    _builder_1.append(_tickTime, " ");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append(" ");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("# The number of ticks that the initial synchronization phase can take");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("initLimit=");
    int _initLimit = zkService.getInitLimit();
    _builder_1.append(_initLimit, " ");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append(" ");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("# The number of ticks that can pass between sending a request and getting an acknowledgement");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("syncLimit=");
    int _syncLimit = zkService.getSyncLimit();
    _builder_1.append(_syncLimit, " ");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append(" ");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("# the port at which the clients will connect");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("clientPort=");
    String _clientPort = zkService.getClientPort();
    _builder_1.append(_clientPort, " ");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append(" ");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("# Leader election settings");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("leaderServers=");
    {
      boolean _isLeaderServers = zkService.isLeaderServers();
      if (_isLeaderServers) {
        _builder_1.append("yes");
      } else {
        _builder_1.append("no");
      }
    }
    _builder_1.newLineIfNotEmpty();
    _builder_1.append(" ");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("# Peer and leader ports");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("peerPort=");
    String _peerPort = zkService.getPeerPort();
    _builder_1.append(_peerPort, " ");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append(" ");
    _builder_1.append("leaderPort=");
    String _leaderPort = zkService.getLeaderPort();
    _builder_1.append(_leaderPort, " ");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append(" ");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("# Data directory - depends on deployment type");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("dataDir=");
    String _dataDir = this.getDataDir(zkService);
    _builder_1.append(_dataDir, " ");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append(" ");
    _builder_1.newLine();
    _builder_1.append("# Servers");
    _builder_1.newLine();
    {
      ProcessingResourceCluster _host = zkService.getHost();
      if ((_host instanceof ProcessingNodeCluster)) {
        _builder_1.append(" ");
        ProcessingResourceCluster _host_1 = zkService.getHost();
        final ProcessingNodeCluster cluster = ((ProcessingNodeCluster) _host_1);
        _builder_1.newLineIfNotEmpty();
        _builder_1.append(" ");
        int i = 1;
        _builder_1.newLineIfNotEmpty();
        {
          EList<ProcessingNode> _nodes = cluster.getNodes();
          for(final ProcessingNode node : _nodes) {
            _builder_1.append(" ");
            _builder_1.append("server.");
            _builder_1.append(i, " ");
            _builder_1.append("=");
            String _ip = node.getIp();
            _builder_1.append(_ip, " ");
            _builder_1.append(":");
            String _peerPort_1 = zkService.getPeerPort();
            _builder_1.append(_peerPort_1, " ");
            _builder_1.append(":");
            String _leaderPort_1 = zkService.getLeaderPort();
            _builder_1.append(_leaderPort_1, " ");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append(" ");
            String _xblockexpression = null;
            {
              i = (i + 1);
              _xblockexpression = "";
            }
            _builder_1.append(_xblockexpression, " ");
            _builder_1.newLineIfNotEmpty();
          }
        }
      }
    }
    final String configContent = _builder_1.toString();
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("zookeeper/zoo");
    int _serverId = zkService.getServerId();
    _builder_2.append(_serverId);
    _builder_2.append(".cfg");
    fsa.generateFile(_builder_2.toString(), configContent);
  }

  public void generateZookeeperIdFile(final ZookeeperService zkService, final IFileSystemAccess2 fsa) {
    final String idContent = Integer.valueOf(zkService.getServerId()).toString();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("zookeeper/myid");
    fsa.generateFile(_builder.toString(), idContent);
  }

  public void generateZookeeperScriptFile(final ZookeeperService zkService, final IFileSystemAccess2 fsa) {
    DeploymentConfiguration _deploymentConfig = zkService.getDeploymentConfig();
    boolean _not = (!(_deploymentConfig instanceof NodeDeploymentConf));
    if (_not) {
      return;
    }
    DeploymentConfiguration _deploymentConfig_1 = zkService.getDeploymentConfig();
    final NodeDeploymentConf nodeConf = ((NodeDeploymentConf) _deploymentConfig_1);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("cd ");
    String _scriptFolderPath = nodeConf.getScriptFolderPath();
    _builder.append(_scriptFolderPath);
    _builder.newLineIfNotEmpty();
    String _artifactLocator = nodeConf.getArtifactLocator();
    _builder.append(_artifactLocator);
    _builder.append("/");
    String _artifactName = nodeConf.getArtifactName();
    _builder.append(_artifactName);
    _builder.append(" start ");
    String _configFolderPath = nodeConf.getConfigFolderPath();
    _builder.append(_configFolderPath);
    _builder.append("/zoo");
    int _serverId = zkService.getServerId();
    _builder.append(_serverId);
    _builder.append(".cfg");
    _builder.newLineIfNotEmpty();
    _builder.append("sleep 30");
    _builder.newLine();
    final String scriptContent = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("zookeeper/zkServer");
    int _serverId_1 = zkService.getServerId();
    _builder_1.append(_serverId_1);
    _builder_1.append(".sh");
    fsa.generateFile(_builder_1.toString(), scriptContent);
  }

  private String getDataDir(final ZookeeperService zkService) {
    DeploymentConfiguration _deploymentConfig = zkService.getDeploymentConfig();
    boolean _matched = false;
    if (_deploymentConfig instanceof NodeDeploymentConf) {
      _matched=true;
      DeploymentConfiguration _deploymentConfig_1 = zkService.getDeploymentConfig();
      return ((NodeDeploymentConf) _deploymentConfig_1).getDataFolderPath();
    }
    if (!_matched) {
      if (_deploymentConfig instanceof NomadDeploymentConf) {
        _matched=true;
      }
      if (!_matched) {
        if (_deploymentConfig instanceof KubernetesDeploymentConf) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (_deploymentConfig instanceof SwarmDeploymentConf) {
          _matched=true;
        }
      }
      if (_matched) {
        return "/var/lib/zookeeper/data";
      }
    }
    return "/tmp/zookeeper";
  }
}
