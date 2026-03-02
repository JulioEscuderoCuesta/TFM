/**
 */
package es.unican.istr.rai4.impl;

import es.unican.istr.rai4.AVROService;
import es.unican.istr.rai4.AWSVirtualProcessingNode;
import es.unican.istr.rai4.ArtifactDescriptor;
import es.unican.istr.rai4.CassandraService;
import es.unican.istr.rai4.CommunicationMeter;
import es.unican.istr.rai4.ComputationalSystem;
import es.unican.istr.rai4.DataCenter;
import es.unican.istr.rai4.DeployableComponentType;
import es.unican.istr.rai4.DeploymentConstraints;
import es.unican.istr.rai4.DeploymentFileDescriptor;
import es.unican.istr.rai4.DerivedStreamData;
import es.unican.istr.rai4.ExporterData;
import es.unican.istr.rai4.FileDescriptor;
import es.unican.istr.rai4.FlowStreamData;
import es.unican.istr.rai4.KafkaFlowStreamData;
import es.unican.istr.rai4.KafkaService;
import es.unican.istr.rai4.KafkaWorkloadStreamData;
import es.unican.istr.rai4.KubernetesCluster;
import es.unican.istr.rai4.KubernetesDeploymentConf;
import es.unican.istr.rai4.MemSQLService;
import es.unican.istr.rai4.Neo4JService;
import es.unican.istr.rai4.Network;
import es.unican.istr.rai4.NetworkUtilization;
import es.unican.istr.rai4.NodeDeploymentConf;
import es.unican.istr.rai4.NodeResourceMeter;
import es.unican.istr.rai4.NodeScheduler;
import es.unican.istr.rai4.NomadCluster;
import es.unican.istr.rai4.NomadDeploymentConf;
import es.unican.istr.rai4.NomadDriver;
import es.unican.istr.rai4.OrchestrationCluster;
import es.unican.istr.rai4.PhysicalProcessingNode;
import es.unican.istr.rai4.Port;
import es.unican.istr.rai4.PortMode;
import es.unican.istr.rai4.ProcessingNodeCluster;
import es.unican.istr.rai4.ProcessingNodeMemory;
import es.unican.istr.rai4.ProcessingNodeUtilization;
import es.unican.istr.rai4.PrometheusMeter;
import es.unican.istr.rai4.PrometheusService;
import es.unican.istr.rai4.Protocol;
import es.unican.istr.rai4.Rack;
import es.unican.istr.rai4.Rai4Factory;
import es.unican.istr.rai4.Rai4Package;
import es.unican.istr.rai4.SchedulableSet;
import es.unican.istr.rai4.ServiceType;
import es.unican.istr.rai4.SparkService;
import es.unican.istr.rai4.StormNimbus;
import es.unican.istr.rai4.StormService;
import es.unican.istr.rai4.StormSupervisor;
import es.unican.istr.rai4.StormUI;
import es.unican.istr.rai4.StreamDataPartition;
import es.unican.istr.rai4.StreamDataRate;
import es.unican.istr.rai4.StreamRateMeter;
import es.unican.istr.rai4.SwarmCluster;
import es.unican.istr.rai4.SwarmDeploymentConf;
import es.unican.istr.rai4.Task;
import es.unican.istr.rai4.TaskExecutor;
import es.unican.istr.rai4.TaskProcessingAmount;
import es.unican.istr.rai4.TaskProcessingAmountMeter;
import es.unican.istr.rai4.Volume;
import es.unican.istr.rai4.VolumeAccessMode;
import es.unican.istr.rai4.VolumeType;
import es.unican.istr.rai4.Workflow;
import es.unican.istr.rai4.WorkflowLatency;
import es.unican.istr.rai4.WorkflowLatencyMeter;
import es.unican.istr.rai4.WorkloadStreamData;
import es.unican.istr.rai4.ZookeeperService;

import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Rai4FactoryImpl extends EFactoryImpl implements Rai4Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Rai4Factory init() {
		try {
			Rai4Factory theRai4Factory = (Rai4Factory)EPackage.Registry.INSTANCE.getEFactory(Rai4Package.eNS_URI);
			if (theRai4Factory != null) {
				return theRai4Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Rai4FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rai4FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Rai4Package.COMPUTATIONAL_SYSTEM: return createComputationalSystem();
			case Rai4Package.PHYSICAL_PROCESSING_NODE: return createPhysicalProcessingNode();
			case Rai4Package.AWS_VIRTUAL_PROCESSING_NODE: return createAWSVirtualProcessingNode();
			case Rai4Package.PROCESSING_NODE_CLUSTER: return createProcessingNodeCluster();
			case Rai4Package.ORCHESTRATION_CLUSTER: return createOrchestrationCluster();
			case Rai4Package.KUBERNETES_CLUSTER: return createKubernetesCluster();
			case Rai4Package.SWARM_CLUSTER: return createSwarmCluster();
			case Rai4Package.NOMAD_CLUSTER: return createNomadCluster();
			case Rai4Package.NETWORK: return createNetwork();
			case Rai4Package.AVRO_SERVICE: return createAVROService();
			case Rai4Package.ZOOKEEPER_SERVICE: return createZookeeperService();
			case Rai4Package.KAFKA_SERVICE: return createKafkaService();
			case Rai4Package.NODE_SCHEDULER: return createNodeScheduler();
			case Rai4Package.SPARK_SERVICE: return createSparkService();
			case Rai4Package.STORM_SERVICE: return createStormService();
			case Rai4Package.STORM_UI: return createStormUI();
			case Rai4Package.STORM_NIMBUS: return createStormNimbus();
			case Rai4Package.STORM_SUPERVISOR: return createStormSupervisor();
			case Rai4Package.NEO4_JSERVICE: return createNeo4JService();
			case Rai4Package.MEM_SQL_SERVICE: return createMemSQLService();
			case Rai4Package.CASSANDRA_SERVICE: return createCassandraService();
			case Rai4Package.DATA_CENTER: return createDataCenter();
			case Rai4Package.RACK: return createRack();
			case Rai4Package.PROMETHEUS_SERVICE: return createPrometheusService();
			case Rai4Package.EXPORTER_DATA: return createExporterData();
			case Rai4Package.STREAM_DATA_PARTITION: return createStreamDataPartition();
			case Rai4Package.FLOW_STREAM_DATA: return createFlowStreamData();
			case Rai4Package.KAFKA_FLOW_STREAM_DATA: return createKafkaFlowStreamData();
			case Rai4Package.DERIVED_STREAM_DATA: return createDerivedStreamData();
			case Rai4Package.WORKLOAD_STREAM_DATA: return createWorkloadStreamData();
			case Rai4Package.KAFKA_WORKLOAD_STREAM_DATA: return createKafkaWorkloadStreamData();
			case Rai4Package.WORKFLOW: return createWorkflow();
			case Rai4Package.SCHEDULABLE_SET: return createSchedulableSet();
			case Rai4Package.TASK: return createTask();
			case Rai4Package.TASK_EXECUTOR: return createTaskExecutor();
			case Rai4Package.PROCESSING_NODE_UTILIZATION: return createProcessingNodeUtilization();
			case Rai4Package.PROCESSING_NODE_MEMORY: return createProcessingNodeMemory();
			case Rai4Package.NETWORK_UTILIZATION: return createNetworkUtilization();
			case Rai4Package.WORKFLOW_LATENCY: return createWorkflowLatency();
			case Rai4Package.TASK_PROCESSING_AMOUNT: return createTaskProcessingAmount();
			case Rai4Package.STREAM_DATA_RATE: return createStreamDataRate();
			case Rai4Package.PROMETHEUS_METER: return createPrometheusMeter();
			case Rai4Package.NODE_RESOURCE_METER: return createNodeResourceMeter();
			case Rai4Package.COMMUNICATION_METER: return createCommunicationMeter();
			case Rai4Package.STREAM_RATE_METER: return createStreamRateMeter();
			case Rai4Package.WORKFLOW_LATENCY_METER: return createWorkflowLatencyMeter();
			case Rai4Package.TASK_PROCESSING_AMOUNT_METER: return createTaskProcessingAmountMeter();
			case Rai4Package.NODE_DEPLOYMENT_CONF: return createNodeDeploymentConf();
			case Rai4Package.KUBERNETES_DEPLOYMENT_CONF: return createKubernetesDeploymentConf();
			case Rai4Package.SWARM_DEPLOYMENT_CONF: return createSwarmDeploymentConf();
			case Rai4Package.NOMAD_DEPLOYMENT_CONF: return createNomadDeploymentConf();
			case Rai4Package.VOLUME: return createVolume();
			case Rai4Package.PORT: return createPort();
			case Rai4Package.DEPLOYMENT_CONSTRAINTS: return createDeploymentConstraints();
			case Rai4Package.STRING_TO_STRING_MAP: return (EObject)createStringToStringMap();
			case Rai4Package.FILE_DESCRIPTOR: return createFileDescriptor();
			case Rai4Package.DEPLOYMENT_FILE_DESCRIPTOR: return createDeploymentFileDescriptor();
			case Rai4Package.ARTIFACT_DESCRIPTOR: return createArtifactDescriptor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Rai4Package.VOLUME_ACCESS_MODE:
				return createVolumeAccessModeFromString(eDataType, initialValue);
			case Rai4Package.VOLUME_TYPE:
				return createVolumeTypeFromString(eDataType, initialValue);
			case Rai4Package.NOMAD_DRIVER:
				return createNomadDriverFromString(eDataType, initialValue);
			case Rai4Package.PORT_MODE:
				return createPortModeFromString(eDataType, initialValue);
			case Rai4Package.SERVICE_TYPE:
				return createServiceTypeFromString(eDataType, initialValue);
			case Rai4Package.PROTOCOL:
				return createProtocolFromString(eDataType, initialValue);
			case Rai4Package.DEPLOYABLE_COMPONENT_TYPE:
				return createDeployableComponentTypeFromString(eDataType, initialValue);
			case Rai4Package.PROPERTIES:
				return createPropertiesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Rai4Package.VOLUME_ACCESS_MODE:
				return convertVolumeAccessModeToString(eDataType, instanceValue);
			case Rai4Package.VOLUME_TYPE:
				return convertVolumeTypeToString(eDataType, instanceValue);
			case Rai4Package.NOMAD_DRIVER:
				return convertNomadDriverToString(eDataType, instanceValue);
			case Rai4Package.PORT_MODE:
				return convertPortModeToString(eDataType, instanceValue);
			case Rai4Package.SERVICE_TYPE:
				return convertServiceTypeToString(eDataType, instanceValue);
			case Rai4Package.PROTOCOL:
				return convertProtocolToString(eDataType, instanceValue);
			case Rai4Package.DEPLOYABLE_COMPONENT_TYPE:
				return convertDeployableComponentTypeToString(eDataType, instanceValue);
			case Rai4Package.PROPERTIES:
				return convertPropertiesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputationalSystem createComputationalSystem() {
		ComputationalSystemImpl computationalSystem = new ComputationalSystemImpl();
		return computationalSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalProcessingNode createPhysicalProcessingNode() {
		PhysicalProcessingNodeImpl physicalProcessingNode = new PhysicalProcessingNodeImpl();
		return physicalProcessingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AWSVirtualProcessingNode createAWSVirtualProcessingNode() {
		AWSVirtualProcessingNodeImpl awsVirtualProcessingNode = new AWSVirtualProcessingNodeImpl();
		return awsVirtualProcessingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingNodeCluster createProcessingNodeCluster() {
		ProcessingNodeClusterImpl processingNodeCluster = new ProcessingNodeClusterImpl();
		return processingNodeCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrchestrationCluster createOrchestrationCluster() {
		OrchestrationClusterImpl orchestrationCluster = new OrchestrationClusterImpl();
		return orchestrationCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KubernetesCluster createKubernetesCluster() {
		KubernetesClusterImpl kubernetesCluster = new KubernetesClusterImpl();
		return kubernetesCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwarmCluster createSwarmCluster() {
		SwarmClusterImpl swarmCluster = new SwarmClusterImpl();
		return swarmCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NomadCluster createNomadCluster() {
		NomadClusterImpl nomadCluster = new NomadClusterImpl();
		return nomadCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AVROService createAVROService() {
		AVROServiceImpl avroService = new AVROServiceImpl();
		return avroService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZookeeperService createZookeeperService() {
		ZookeeperServiceImpl zookeeperService = new ZookeeperServiceImpl();
		return zookeeperService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KafkaService createKafkaService() {
		KafkaServiceImpl kafkaService = new KafkaServiceImpl();
		return kafkaService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeScheduler createNodeScheduler() {
		NodeSchedulerImpl nodeScheduler = new NodeSchedulerImpl();
		return nodeScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SparkService createSparkService() {
		SparkServiceImpl sparkService = new SparkServiceImpl();
		return sparkService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StormService createStormService() {
		StormServiceImpl stormService = new StormServiceImpl();
		return stormService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StormUI createStormUI() {
		StormUIImpl stormUI = new StormUIImpl();
		return stormUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StormNimbus createStormNimbus() {
		StormNimbusImpl stormNimbus = new StormNimbusImpl();
		return stormNimbus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StormSupervisor createStormSupervisor() {
		StormSupervisorImpl stormSupervisor = new StormSupervisorImpl();
		return stormSupervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Neo4JService createNeo4JService() {
		Neo4JServiceImpl neo4JService = new Neo4JServiceImpl();
		return neo4JService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemSQLService createMemSQLService() {
		MemSQLServiceImpl memSQLService = new MemSQLServiceImpl();
		return memSQLService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CassandraService createCassandraService() {
		CassandraServiceImpl cassandraService = new CassandraServiceImpl();
		return cassandraService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCenter createDataCenter() {
		DataCenterImpl dataCenter = new DataCenterImpl();
		return dataCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rack createRack() {
		RackImpl rack = new RackImpl();
		return rack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrometheusService createPrometheusService() {
		PrometheusServiceImpl prometheusService = new PrometheusServiceImpl();
		return prometheusService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExporterData createExporterData() {
		ExporterDataImpl exporterData = new ExporterDataImpl();
		return exporterData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreamDataPartition createStreamDataPartition() {
		StreamDataPartitionImpl streamDataPartition = new StreamDataPartitionImpl();
		return streamDataPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlowStreamData createFlowStreamData() {
		FlowStreamDataImpl flowStreamData = new FlowStreamDataImpl();
		return flowStreamData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KafkaFlowStreamData createKafkaFlowStreamData() {
		KafkaFlowStreamDataImpl kafkaFlowStreamData = new KafkaFlowStreamDataImpl();
		return kafkaFlowStreamData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedStreamData createDerivedStreamData() {
		DerivedStreamDataImpl derivedStreamData = new DerivedStreamDataImpl();
		return derivedStreamData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkloadStreamData createWorkloadStreamData() {
		WorkloadStreamDataImpl workloadStreamData = new WorkloadStreamDataImpl();
		return workloadStreamData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KafkaWorkloadStreamData createKafkaWorkloadStreamData() {
		KafkaWorkloadStreamDataImpl kafkaWorkloadStreamData = new KafkaWorkloadStreamDataImpl();
		return kafkaWorkloadStreamData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workflow createWorkflow() {
		WorkflowImpl workflow = new WorkflowImpl();
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchedulableSet createSchedulableSet() {
		SchedulableSetImpl schedulableSet = new SchedulableSetImpl();
		return schedulableSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskExecutor createTaskExecutor() {
		TaskExecutorImpl taskExecutor = new TaskExecutorImpl();
		return taskExecutor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingNodeUtilization createProcessingNodeUtilization() {
		ProcessingNodeUtilizationImpl processingNodeUtilization = new ProcessingNodeUtilizationImpl();
		return processingNodeUtilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingNodeMemory createProcessingNodeMemory() {
		ProcessingNodeMemoryImpl processingNodeMemory = new ProcessingNodeMemoryImpl();
		return processingNodeMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkUtilization createNetworkUtilization() {
		NetworkUtilizationImpl networkUtilization = new NetworkUtilizationImpl();
		return networkUtilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkflowLatency createWorkflowLatency() {
		WorkflowLatencyImpl workflowLatency = new WorkflowLatencyImpl();
		return workflowLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskProcessingAmount createTaskProcessingAmount() {
		TaskProcessingAmountImpl taskProcessingAmount = new TaskProcessingAmountImpl();
		return taskProcessingAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreamDataRate createStreamDataRate() {
		StreamDataRateImpl streamDataRate = new StreamDataRateImpl();
		return streamDataRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrometheusMeter createPrometheusMeter() {
		PrometheusMeterImpl prometheusMeter = new PrometheusMeterImpl();
		return prometheusMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeResourceMeter createNodeResourceMeter() {
		NodeResourceMeterImpl nodeResourceMeter = new NodeResourceMeterImpl();
		return nodeResourceMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationMeter createCommunicationMeter() {
		CommunicationMeterImpl communicationMeter = new CommunicationMeterImpl();
		return communicationMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreamRateMeter createStreamRateMeter() {
		StreamRateMeterImpl streamRateMeter = new StreamRateMeterImpl();
		return streamRateMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkflowLatencyMeter createWorkflowLatencyMeter() {
		WorkflowLatencyMeterImpl workflowLatencyMeter = new WorkflowLatencyMeterImpl();
		return workflowLatencyMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskProcessingAmountMeter createTaskProcessingAmountMeter() {
		TaskProcessingAmountMeterImpl taskProcessingAmountMeter = new TaskProcessingAmountMeterImpl();
		return taskProcessingAmountMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeDeploymentConf createNodeDeploymentConf() {
		NodeDeploymentConfImpl nodeDeploymentConf = new NodeDeploymentConfImpl();
		return nodeDeploymentConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KubernetesDeploymentConf createKubernetesDeploymentConf() {
		KubernetesDeploymentConfImpl kubernetesDeploymentConf = new KubernetesDeploymentConfImpl();
		return kubernetesDeploymentConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwarmDeploymentConf createSwarmDeploymentConf() {
		SwarmDeploymentConfImpl swarmDeploymentConf = new SwarmDeploymentConfImpl();
		return swarmDeploymentConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NomadDeploymentConf createNomadDeploymentConf() {
		NomadDeploymentConfImpl nomadDeploymentConf = new NomadDeploymentConfImpl();
		return nomadDeploymentConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Volume createVolume() {
		VolumeImpl volume = new VolumeImpl();
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentConstraints createDeploymentConstraints() {
		DeploymentConstraintsImpl deploymentConstraints = new DeploymentConstraintsImpl();
		return deploymentConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createStringToStringMap() {
		StringToStringMapImpl stringToStringMap = new StringToStringMapImpl();
		return stringToStringMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileDescriptor createFileDescriptor() {
		FileDescriptorImpl fileDescriptor = new FileDescriptorImpl();
		return fileDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentFileDescriptor createDeploymentFileDescriptor() {
		DeploymentFileDescriptorImpl deploymentFileDescriptor = new DeploymentFileDescriptorImpl();
		return deploymentFileDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtifactDescriptor createArtifactDescriptor() {
		ArtifactDescriptorImpl artifactDescriptor = new ArtifactDescriptorImpl();
		return artifactDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumeAccessMode createVolumeAccessModeFromString(EDataType eDataType, String initialValue) {
		VolumeAccessMode result = VolumeAccessMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVolumeAccessModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumeType createVolumeTypeFromString(EDataType eDataType, String initialValue) {
		VolumeType result = VolumeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVolumeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NomadDriver createNomadDriverFromString(EDataType eDataType, String initialValue) {
		NomadDriver result = NomadDriver.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNomadDriverToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortMode createPortModeFromString(EDataType eDataType, String initialValue) {
		PortMode result = PortMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType createServiceTypeFromString(EDataType eDataType, String initialValue) {
		ServiceType result = ServiceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocolFromString(EDataType eDataType, String initialValue) {
		Protocol result = Protocol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployableComponentType createDeployableComponentTypeFromString(EDataType eDataType, String initialValue) {
		DeployableComponentType result = DeployableComponentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeployableComponentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createPropertiesFromString(EDataType eDataType, String initialValue) {
		return (Properties)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertiesToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rai4Package getRai4Package() {
		return (Rai4Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Rai4Package getPackage() {
		return Rai4Package.eINSTANCE;
	}

} //Rai4FactoryImpl
