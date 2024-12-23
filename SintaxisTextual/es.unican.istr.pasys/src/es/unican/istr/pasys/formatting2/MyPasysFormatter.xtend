/*
 * generated by Xtext 2.35.0
 */
package es.unican.istr.pasys.formatting2

import com.google.inject.Inject
import es.unican.istr.pasys.pasys.ComputationalSystem
import es.unican.istr.pasys.pasys.PhysicalProcessingNode
import es.unican.istr.pasys.services.MyPasysGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class MyPasysFormatter extends AbstractFormatter2 {
	
	@Inject extension MyPasysGrammarAccess

	def dispatch void format(ComputationalSystem computationalSystem, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (systemElement : computationalSystem.ownedElements) {
			systemElement.format
		}
		for (stringToStringMap : computationalSystem.authenticationFiles) {
			stringToStringMap.format
		}
	}

	def dispatch void format(PhysicalProcessingNode physicalProcessingNode, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (artifactDescriptor : physicalProcessingNode.codeFiles) {
			artifactDescriptor.format
		}
		for (deploymentFileDescriptor : physicalProcessingNode.configFiles) {
			deploymentFileDescriptor.format
		}
		for (deploymentFileDescriptor : physicalProcessingNode.launchingScripts) {
			deploymentFileDescriptor.format
		}
		for (nodeHostedMeter : physicalProcessingNode.ownedMeters) {
			nodeHostedMeter.format
		}
	}
	
	// TODO: implement for AWSVirtualProcessingNode, AVROService, ZookeeperService, KafkaService, NodeScheduler, SparkService, StormService, Neo4JService, MemSQLService, CassandraService, PrometheusService, KafkaWorkloadStreamData, Workflow, NodeResourceMeter, CommunicationMeter, KubernetesDeploymentConf, SwarmDeploymentConf, NomadDeploymentConf, StreamRateMeter, WorkflowLatencyMeter, TaskProcessingAmountMeter, StormNimbus, StormSupervisor, StormUI, DataCenter, TaskExecutor, KafkaFlowStreamData, DerivedStreamData
}