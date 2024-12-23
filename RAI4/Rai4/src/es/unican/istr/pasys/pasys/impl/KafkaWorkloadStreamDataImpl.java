/**
 */
package es.unican.istr.pasys.pasys.impl;

import es.unican.istr.pasys.pasys.CommunicationService;
import es.unican.istr.pasys.pasys.ConfigurationException;
import es.unican.istr.pasys.pasys.DeploymentFileDescriptor;
import es.unican.istr.pasys.pasys.DeployableComponentType;
import es.unican.istr.pasys.pasys.DeploymentConfiguration;
import es.unican.istr.pasys.pasys.KafkaService;
import es.unican.istr.pasys.pasys.KafkaWorkloadStreamData;
import es.unican.istr.pasys.pasys.NodeDeploymentConf;
import es.unican.istr.pasys.pasys.OrchestratorDeploymentConf;
import es.unican.istr.pasys.pasys.PasysPackage;
import es.unican.istr.pasys.pasys.ProcessingNode;
import es.unican.istr.pasys.pasys.ProcessingNodeCluster;
import es.unican.istr.pasys.pasys.deploymentTools.DeploymentToolsUtils;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kafka Workload Stream Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class KafkaWorkloadStreamDataImpl extends WorkloadStreamDataImpl implements KafkaWorkloadStreamData {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KafkaWorkloadStreamDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.KAFKA_WORKLOAD_STREAM_DATA;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void configureDeployment() throws ConfigurationException {
		
		CommunicationService server = this.getHolder();
		if (!(server instanceof KafkaService)) 
			throw new ConfigurationException("The topic "+getName()+ " is not assigned to a Kafka Server");
		
		// Launching script generation
		// De estos puede haber muchos en un mismo nodo, as� que le ponemos el id
		String scriptName = "topic_"+this.getId()+".sh";
		DeploymentConfiguration conf = getDeploymentConfig();
		String scriptContent= getScriptContent(getName(), server, conf);
		
		if (getDeploymentConfig() instanceof NodeDeploymentConf) {
		
			NodeDeploymentConf nodeConf = (NodeDeploymentConf) getDeploymentConfig();
		
			DeploymentFileDescriptor script = new DeploymentFileDescriptorImpl(scriptName, nodeConf.getScriptFolderPath(), 
				scriptContent, DeployableComponentType.KAFKA_FLOW_STREAM);
		
			// If Kakfa is deployed in a cluster, the topic must be created in only one of the instances
			ProcessingNodeCluster serverHost = (ProcessingNodeCluster) server.getHost();		
			ProcessingNode node = serverHost.getNodes().get(0);
			node.addLaunchingScript(script);
		} else {
			DeploymentFileDescriptor script = new DeploymentFileDescriptorImpl(scriptName, "C:\\Temp\\localScripts", 
					scriptContent, DeployableComponentType.KAFKA_FLOW_STREAM);
			ComputationalSystemImpl.getLocalNode().addLaunchingScript(script);
			
			script = new DeploymentFileDescriptorImpl("helm_"+scriptName, "C:\\Temp\\localScripts", 
					getHelmScriptContent(scriptName, server), DeployableComponentType.KAFKA_FLOW_STREAM);
			ComputationalSystemImpl.getLocalNode().addLaunchingScript(script);
		}
	}
	
	private String getHelmScriptContent(String scriptName, CommunicationService server)  {
		String content = "kubectl cp "+"C:\\Temp\\localScripts\\"+scriptName+" "+server.getName()+"-0\n";
		content+="kubectl exec "+server.getName()+"-0 -- /bin/bash "+scriptName;
		return content;
	}
	
	
	private String getScriptContent(String topicName, CommunicationService server, DeploymentConfiguration conf) {
		String bootstrapServer=null;
		String port = ((KafkaService)server).getClientPort();
		String command= "kafka-topics.sh";
		String configPath=null;
		if (conf instanceof NodeDeploymentConf) { 
			NodeDeploymentConf nodeConf = (NodeDeploymentConf) getDeploymentConfig();
			ProcessingNodeCluster serverHost = (ProcessingNodeCluster) server.getHost();		
			String ip = serverHost.getNodes().get(0).getIp();
			bootstrapServer = ip+":"+port;
			configPath= nodeConf.getScriptFolderPath();
			command=nodeConf.getArtifactLocator()+"/"+nodeConf.getArtifactName();
		} else {
			OrchestratorDeploymentConf orcConf =(OrchestratorDeploymentConf) conf;
			configPath="/tmp";
			bootstrapServer = server.getName()+"-hs"+":"+port;
		}
		
		
		String scriptContent = "TOPIC_NAME=\""+topicName+"\"\n";
		scriptContent += command+" --list --bootstrap-server "+bootstrapServer+ " | grep "+topicName+"\n";
		scriptContent += "#Si existe el topico \n";
		scriptContent += "if [ $? -eq 0 ]; then\n"+"exit 0\n"+"fi\n";
		scriptContent +=  "#Si no existe el topico se crea \n";
		scriptContent += command+" --create --bootstrap-server " +bootstrapServer+
				" --replication-factor "+this.numReplication+ " --partitions "+this.numPartitions + " --topic "+this.getName();
			
		
		scriptContent=DeploymentToolsUtils.scriptHeaders(configPath)+scriptContent;
		return scriptContent;
	}

} //KafkaWorkloadStreamDataImpl
