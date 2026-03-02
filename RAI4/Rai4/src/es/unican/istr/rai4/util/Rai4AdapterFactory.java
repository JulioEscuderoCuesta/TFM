/**
 */
package es.unican.istr.rai4.util;

import es.unican.istr.rai4.AVROService;
import es.unican.istr.rai4.AWSVirtualProcessingNode;
import es.unican.istr.rai4.ArtifactDescriptor;
import es.unican.istr.rai4.CassandraService;
import es.unican.istr.rai4.CommunicationMeter;
import es.unican.istr.rai4.CommunicationService;
import es.unican.istr.rai4.ComputationalSystem;
import es.unican.istr.rai4.ConfigurationException;
import es.unican.istr.rai4.DataCenter;
import es.unican.istr.rai4.DeployableComponent;
import es.unican.istr.rai4.DeploymentConfiguration;
import es.unican.istr.rai4.DeploymentConstraints;
import es.unican.istr.rai4.DeploymentException;
import es.unican.istr.rai4.DeploymentFileDescriptor;
import es.unican.istr.rai4.DerivedStreamData;
import es.unican.istr.rai4.DistributionService;
import es.unican.istr.rai4.ExporterData;
import es.unican.istr.rai4.FileDescriptor;
import es.unican.istr.rai4.FlowStreamData;
import es.unican.istr.rai4.KafkaFlowStreamData;
import es.unican.istr.rai4.KafkaService;
import es.unican.istr.rai4.KafkaWorkloadStreamData;
import es.unican.istr.rai4.KubernetesCluster;
import es.unican.istr.rai4.KubernetesDeploymentConf;
import es.unican.istr.rai4.LaunchException;
import es.unican.istr.rai4.MemSQLService;
import es.unican.istr.rai4.Meter;
import es.unican.istr.rai4.Metric;
import es.unican.istr.rai4.MonitoringService;
import es.unican.istr.rai4.NamedElement;
import es.unican.istr.rai4.Neo4JService;
import es.unican.istr.rai4.Network;
import es.unican.istr.rai4.NetworkUtilization;
import es.unican.istr.rai4.NodeDeploymentConf;
import es.unican.istr.rai4.NodeHostedMeter;
import es.unican.istr.rai4.NodeResourceMeter;
import es.unican.istr.rai4.NodeScheduler;
import es.unican.istr.rai4.NomadCluster;
import es.unican.istr.rai4.NomadDeploymentConf;
import es.unican.istr.rai4.OrchestrationCluster;
import es.unican.istr.rai4.OrchestratorDeploymentConf;
import es.unican.istr.rai4.PersistenceService;
import es.unican.istr.rai4.PhysicalProcessingNode;
import es.unican.istr.rai4.PlatformResource;
import es.unican.istr.rai4.PlatformService;
import es.unican.istr.rai4.PlatformServiceDeploymentConf;
import es.unican.istr.rai4.Port;
import es.unican.istr.rai4.ProcessingNode;
import es.unican.istr.rai4.ProcessingNodeCluster;
import es.unican.istr.rai4.ProcessingNodeMemory;
import es.unican.istr.rai4.ProcessingNodeUtilization;
import es.unican.istr.rai4.ProcessingResourceCluster;
import es.unican.istr.rai4.PrometheusMeter;
import es.unican.istr.rai4.PrometheusService;
import es.unican.istr.rai4.Rack;
import es.unican.istr.rai4.Rai4Package;
import es.unican.istr.rai4.SchedulableSet;
import es.unican.istr.rai4.SchedulingService;
import es.unican.istr.rai4.SecurityService;
import es.unican.istr.rai4.SerializationService;
import es.unican.istr.rai4.SparkService;
import es.unican.istr.rai4.StormNimbus;
import es.unican.istr.rai4.StormService;
import es.unican.istr.rai4.StormSupervisor;
import es.unican.istr.rai4.StormUI;
import es.unican.istr.rai4.StreamData;
import es.unican.istr.rai4.StreamDataPartition;
import es.unican.istr.rai4.StreamDataRate;
import es.unican.istr.rai4.StreamRateMeter;
import es.unican.istr.rai4.SwarmCluster;
import es.unican.istr.rai4.SwarmDeploymentConf;
import es.unican.istr.rai4.SystemElement;
import es.unican.istr.rai4.Task;
import es.unican.istr.rai4.TaskExecutor;
import es.unican.istr.rai4.TaskProcessingAmount;
import es.unican.istr.rai4.TaskProcessingAmountMeter;
import es.unican.istr.rai4.VirtualProcessingNode;
import es.unican.istr.rai4.Volume;
import es.unican.istr.rai4.Workflow;
import es.unican.istr.rai4.WorkflowLatency;
import es.unican.istr.rai4.WorkflowLatencyMeter;
import es.unican.istr.rai4.WorkflowStreamData;
import es.unican.istr.rai4.WorkloadStreamData;
import es.unican.istr.rai4.ZookeeperService;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.unican.istr.rai4.Rai4Package
 * @generated
 */
public class Rai4AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Rai4Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rai4AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Rai4Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Rai4Switch<Adapter> modelSwitch =
		new Rai4Switch<Adapter>() {
			@Override
			public Adapter caseComputationalSystem(ComputationalSystem object) {
				return createComputationalSystemAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseSystemElement(SystemElement object) {
				return createSystemElementAdapter();
			}
			@Override
			public Adapter casePlatformResource(PlatformResource object) {
				return createPlatformResourceAdapter();
			}
			@Override
			public Adapter caseProcessingNode(ProcessingNode object) {
				return createProcessingNodeAdapter();
			}
			@Override
			public Adapter casePhysicalProcessingNode(PhysicalProcessingNode object) {
				return createPhysicalProcessingNodeAdapter();
			}
			@Override
			public Adapter caseVirtualProcessingNode(VirtualProcessingNode object) {
				return createVirtualProcessingNodeAdapter();
			}
			@Override
			public Adapter caseAWSVirtualProcessingNode(AWSVirtualProcessingNode object) {
				return createAWSVirtualProcessingNodeAdapter();
			}
			@Override
			public Adapter caseProcessingResourceCluster(ProcessingResourceCluster object) {
				return createProcessingResourceClusterAdapter();
			}
			@Override
			public Adapter caseProcessingNodeCluster(ProcessingNodeCluster object) {
				return createProcessingNodeClusterAdapter();
			}
			@Override
			public Adapter caseOrchestrationCluster(OrchestrationCluster object) {
				return createOrchestrationClusterAdapter();
			}
			@Override
			public Adapter caseKubernetesCluster(KubernetesCluster object) {
				return createKubernetesClusterAdapter();
			}
			@Override
			public Adapter caseSwarmCluster(SwarmCluster object) {
				return createSwarmClusterAdapter();
			}
			@Override
			public Adapter caseNomadCluster(NomadCluster object) {
				return createNomadClusterAdapter();
			}
			@Override
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter casePlatformService(PlatformService object) {
				return createPlatformServiceAdapter();
			}
			@Override
			public Adapter caseSerializationService(SerializationService object) {
				return createSerializationServiceAdapter();
			}
			@Override
			public Adapter caseDistributionService(DistributionService object) {
				return createDistributionServiceAdapter();
			}
			@Override
			public Adapter caseCommunicationService(CommunicationService object) {
				return createCommunicationServiceAdapter();
			}
			@Override
			public Adapter caseSchedulingService(SchedulingService object) {
				return createSchedulingServiceAdapter();
			}
			@Override
			public Adapter caseSecurityService(SecurityService object) {
				return createSecurityServiceAdapter();
			}
			@Override
			public Adapter casePersistenceService(PersistenceService object) {
				return createPersistenceServiceAdapter();
			}
			@Override
			public Adapter caseMonitoringService(MonitoringService object) {
				return createMonitoringServiceAdapter();
			}
			@Override
			public Adapter caseAVROService(AVROService object) {
				return createAVROServiceAdapter();
			}
			@Override
			public Adapter caseZookeeperService(ZookeeperService object) {
				return createZookeeperServiceAdapter();
			}
			@Override
			public Adapter caseKafkaService(KafkaService object) {
				return createKafkaServiceAdapter();
			}
			@Override
			public Adapter caseNodeScheduler(NodeScheduler object) {
				return createNodeSchedulerAdapter();
			}
			@Override
			public Adapter caseSparkService(SparkService object) {
				return createSparkServiceAdapter();
			}
			@Override
			public Adapter caseStormService(StormService object) {
				return createStormServiceAdapter();
			}
			@Override
			public Adapter caseStormUI(StormUI object) {
				return createStormUIAdapter();
			}
			@Override
			public Adapter caseStormNimbus(StormNimbus object) {
				return createStormNimbusAdapter();
			}
			@Override
			public Adapter caseStormSupervisor(StormSupervisor object) {
				return createStormSupervisorAdapter();
			}
			@Override
			public Adapter caseNeo4JService(Neo4JService object) {
				return createNeo4JServiceAdapter();
			}
			@Override
			public Adapter caseMemSQLService(MemSQLService object) {
				return createMemSQLServiceAdapter();
			}
			@Override
			public Adapter caseCassandraService(CassandraService object) {
				return createCassandraServiceAdapter();
			}
			@Override
			public Adapter caseDataCenter(DataCenter object) {
				return createDataCenterAdapter();
			}
			@Override
			public Adapter caseRack(Rack object) {
				return createRackAdapter();
			}
			@Override
			public Adapter casePrometheusService(PrometheusService object) {
				return createPrometheusServiceAdapter();
			}
			@Override
			public Adapter caseExporterData(ExporterData object) {
				return createExporterDataAdapter();
			}
			@Override
			public Adapter caseStreamData(StreamData object) {
				return createStreamDataAdapter();
			}
			@Override
			public Adapter caseStreamDataPartition(StreamDataPartition object) {
				return createStreamDataPartitionAdapter();
			}
			@Override
			public Adapter caseWorkflowStreamData(WorkflowStreamData object) {
				return createWorkflowStreamDataAdapter();
			}
			@Override
			public Adapter caseFlowStreamData(FlowStreamData object) {
				return createFlowStreamDataAdapter();
			}
			@Override
			public Adapter caseKafkaFlowStreamData(KafkaFlowStreamData object) {
				return createKafkaFlowStreamDataAdapter();
			}
			@Override
			public Adapter caseDerivedStreamData(DerivedStreamData object) {
				return createDerivedStreamDataAdapter();
			}
			@Override
			public Adapter caseWorkloadStreamData(WorkloadStreamData object) {
				return createWorkloadStreamDataAdapter();
			}
			@Override
			public Adapter caseKafkaWorkloadStreamData(KafkaWorkloadStreamData object) {
				return createKafkaWorkloadStreamDataAdapter();
			}
			@Override
			public Adapter caseWorkflow(Workflow object) {
				return createWorkflowAdapter();
			}
			@Override
			public Adapter caseSchedulableSet(SchedulableSet object) {
				return createSchedulableSetAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseTaskExecutor(TaskExecutor object) {
				return createTaskExecutorAdapter();
			}
			@Override
			public Adapter caseMetric(Metric object) {
				return createMetricAdapter();
			}
			@Override
			public Adapter caseProcessingNodeUtilization(ProcessingNodeUtilization object) {
				return createProcessingNodeUtilizationAdapter();
			}
			@Override
			public Adapter caseProcessingNodeMemory(ProcessingNodeMemory object) {
				return createProcessingNodeMemoryAdapter();
			}
			@Override
			public Adapter caseNetworkUtilization(NetworkUtilization object) {
				return createNetworkUtilizationAdapter();
			}
			@Override
			public Adapter caseWorkflowLatency(WorkflowLatency object) {
				return createWorkflowLatencyAdapter();
			}
			@Override
			public Adapter caseTaskProcessingAmount(TaskProcessingAmount object) {
				return createTaskProcessingAmountAdapter();
			}
			@Override
			public Adapter caseStreamDataRate(StreamDataRate object) {
				return createStreamDataRateAdapter();
			}
			@Override
			public Adapter caseMeter(Meter object) {
				return createMeterAdapter();
			}
			@Override
			public Adapter casePrometheusMeter(PrometheusMeter object) {
				return createPrometheusMeterAdapter();
			}
			@Override
			public Adapter caseNodeHostedMeter(NodeHostedMeter object) {
				return createNodeHostedMeterAdapter();
			}
			@Override
			public Adapter caseNodeResourceMeter(NodeResourceMeter object) {
				return createNodeResourceMeterAdapter();
			}
			@Override
			public Adapter caseCommunicationMeter(CommunicationMeter object) {
				return createCommunicationMeterAdapter();
			}
			@Override
			public Adapter caseStreamRateMeter(StreamRateMeter object) {
				return createStreamRateMeterAdapter();
			}
			@Override
			public Adapter caseWorkflowLatencyMeter(WorkflowLatencyMeter object) {
				return createWorkflowLatencyMeterAdapter();
			}
			@Override
			public Adapter caseTaskProcessingAmountMeter(TaskProcessingAmountMeter object) {
				return createTaskProcessingAmountMeterAdapter();
			}
			@Override
			public Adapter caseDeployableComponent(DeployableComponent object) {
				return createDeployableComponentAdapter();
			}
			@Override
			public Adapter caseDeploymentConfiguration(DeploymentConfiguration object) {
				return createDeploymentConfigurationAdapter();
			}
			@Override
			public Adapter casePlatformServiceDeploymentConf(PlatformServiceDeploymentConf object) {
				return createPlatformServiceDeploymentConfAdapter();
			}
			@Override
			public Adapter caseOrchestratorDeploymentConf(OrchestratorDeploymentConf object) {
				return createOrchestratorDeploymentConfAdapter();
			}
			@Override
			public Adapter caseNodeDeploymentConf(NodeDeploymentConf object) {
				return createNodeDeploymentConfAdapter();
			}
			@Override
			public Adapter caseKubernetesDeploymentConf(KubernetesDeploymentConf object) {
				return createKubernetesDeploymentConfAdapter();
			}
			@Override
			public Adapter caseSwarmDeploymentConf(SwarmDeploymentConf object) {
				return createSwarmDeploymentConfAdapter();
			}
			@Override
			public Adapter caseNomadDeploymentConf(NomadDeploymentConf object) {
				return createNomadDeploymentConfAdapter();
			}
			@Override
			public Adapter caseVolume(Volume object) {
				return createVolumeAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseDeploymentConstraints(DeploymentConstraints object) {
				return createDeploymentConstraintsAdapter();
			}
			@Override
			public Adapter caseException(Exception object) {
				return createExceptionAdapter();
			}
			@Override
			public Adapter caseConfigurationException(ConfigurationException object) {
				return createConfigurationExceptionAdapter();
			}
			@Override
			public Adapter caseDeploymentException(DeploymentException object) {
				return createDeploymentExceptionAdapter();
			}
			@Override
			public Adapter caseLaunchException(LaunchException object) {
				return createLaunchExceptionAdapter();
			}
			@Override
			public Adapter caseStringToStringMap(Map.Entry<String, String> object) {
				return createStringToStringMapAdapter();
			}
			@Override
			public Adapter caseFileDescriptor(FileDescriptor object) {
				return createFileDescriptorAdapter();
			}
			@Override
			public Adapter caseDeploymentFileDescriptor(DeploymentFileDescriptor object) {
				return createDeploymentFileDescriptorAdapter();
			}
			@Override
			public Adapter caseArtifactDescriptor(ArtifactDescriptor object) {
				return createArtifactDescriptorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.ComputationalSystem <em>Computational System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.ComputationalSystem
	 * @generated
	 */
	public Adapter createComputationalSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.SystemElement <em>System Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.SystemElement
	 * @generated
	 */
	public Adapter createSystemElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.PlatformResource <em>Platform Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.PlatformResource
	 * @generated
	 */
	public Adapter createPlatformResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.ProcessingNode <em>Processing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.ProcessingNode
	 * @generated
	 */
	public Adapter createProcessingNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.PhysicalProcessingNode <em>Physical Processing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.PhysicalProcessingNode
	 * @generated
	 */
	public Adapter createPhysicalProcessingNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.VirtualProcessingNode <em>Virtual Processing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.VirtualProcessingNode
	 * @generated
	 */
	public Adapter createVirtualProcessingNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.AWSVirtualProcessingNode <em>AWS Virtual Processing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.AWSVirtualProcessingNode
	 * @generated
	 */
	public Adapter createAWSVirtualProcessingNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.ProcessingResourceCluster <em>Processing Resource Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.ProcessingResourceCluster
	 * @generated
	 */
	public Adapter createProcessingResourceClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.ProcessingNodeCluster <em>Processing Node Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.ProcessingNodeCluster
	 * @generated
	 */
	public Adapter createProcessingNodeClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.OrchestrationCluster <em>Orchestration Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.OrchestrationCluster
	 * @generated
	 */
	public Adapter createOrchestrationClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.KubernetesCluster <em>Kubernetes Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.KubernetesCluster
	 * @generated
	 */
	public Adapter createKubernetesClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.SwarmCluster <em>Swarm Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.SwarmCluster
	 * @generated
	 */
	public Adapter createSwarmClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.NomadCluster <em>Nomad Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.NomadCluster
	 * @generated
	 */
	public Adapter createNomadClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.PlatformService <em>Platform Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.PlatformService
	 * @generated
	 */
	public Adapter createPlatformServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.SerializationService <em>Serialization Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.SerializationService
	 * @generated
	 */
	public Adapter createSerializationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.DistributionService <em>Distribution Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.DistributionService
	 * @generated
	 */
	public Adapter createDistributionServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.CommunicationService <em>Communication Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.CommunicationService
	 * @generated
	 */
	public Adapter createCommunicationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.SchedulingService <em>Scheduling Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.SchedulingService
	 * @generated
	 */
	public Adapter createSchedulingServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.SecurityService <em>Security Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.SecurityService
	 * @generated
	 */
	public Adapter createSecurityServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.PersistenceService <em>Persistence Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.PersistenceService
	 * @generated
	 */
	public Adapter createPersistenceServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.MonitoringService <em>Monitoring Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.MonitoringService
	 * @generated
	 */
	public Adapter createMonitoringServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.AVROService <em>AVRO Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.AVROService
	 * @generated
	 */
	public Adapter createAVROServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.ZookeeperService <em>Zookeeper Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.ZookeeperService
	 * @generated
	 */
	public Adapter createZookeeperServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.KafkaService <em>Kafka Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.KafkaService
	 * @generated
	 */
	public Adapter createKafkaServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.NodeScheduler <em>Node Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.NodeScheduler
	 * @generated
	 */
	public Adapter createNodeSchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.SparkService <em>Spark Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.SparkService
	 * @generated
	 */
	public Adapter createSparkServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.StormService <em>Storm Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.StormService
	 * @generated
	 */
	public Adapter createStormServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.StormUI <em>Storm UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.StormUI
	 * @generated
	 */
	public Adapter createStormUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.StormNimbus <em>Storm Nimbus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.StormNimbus
	 * @generated
	 */
	public Adapter createStormNimbusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.StormSupervisor <em>Storm Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.StormSupervisor
	 * @generated
	 */
	public Adapter createStormSupervisorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.Neo4JService <em>Neo4 JService</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.Neo4JService
	 * @generated
	 */
	public Adapter createNeo4JServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.MemSQLService <em>Mem SQL Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.MemSQLService
	 * @generated
	 */
	public Adapter createMemSQLServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.CassandraService <em>Cassandra Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.CassandraService
	 * @generated
	 */
	public Adapter createCassandraServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.DataCenter <em>Data Center</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.DataCenter
	 * @generated
	 */
	public Adapter createDataCenterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.Rack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.Rack
	 * @generated
	 */
	public Adapter createRackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.PrometheusService <em>Prometheus Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.PrometheusService
	 * @generated
	 */
	public Adapter createPrometheusServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.ExporterData <em>Exporter Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.ExporterData
	 * @generated
	 */
	public Adapter createExporterDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.StreamData <em>Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.StreamData
	 * @generated
	 */
	public Adapter createStreamDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.StreamDataPartition <em>Stream Data Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.StreamDataPartition
	 * @generated
	 */
	public Adapter createStreamDataPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.WorkflowStreamData <em>Workflow Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.WorkflowStreamData
	 * @generated
	 */
	public Adapter createWorkflowStreamDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.FlowStreamData <em>Flow Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.FlowStreamData
	 * @generated
	 */
	public Adapter createFlowStreamDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.KafkaFlowStreamData <em>Kafka Flow Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.KafkaFlowStreamData
	 * @generated
	 */
	public Adapter createKafkaFlowStreamDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.DerivedStreamData <em>Derived Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.DerivedStreamData
	 * @generated
	 */
	public Adapter createDerivedStreamDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.WorkloadStreamData <em>Workload Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.WorkloadStreamData
	 * @generated
	 */
	public Adapter createWorkloadStreamDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.KafkaWorkloadStreamData <em>Kafka Workload Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.KafkaWorkloadStreamData
	 * @generated
	 */
	public Adapter createKafkaWorkloadStreamDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.Workflow
	 * @generated
	 */
	public Adapter createWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.SchedulableSet <em>Schedulable Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.SchedulableSet
	 * @generated
	 */
	public Adapter createSchedulableSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.TaskExecutor <em>Task Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.TaskExecutor
	 * @generated
	 */
	public Adapter createTaskExecutorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.Metric
	 * @generated
	 */
	public Adapter createMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.ProcessingNodeUtilization <em>Processing Node Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.ProcessingNodeUtilization
	 * @generated
	 */
	public Adapter createProcessingNodeUtilizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.ProcessingNodeMemory <em>Processing Node Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.ProcessingNodeMemory
	 * @generated
	 */
	public Adapter createProcessingNodeMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.NetworkUtilization <em>Network Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.NetworkUtilization
	 * @generated
	 */
	public Adapter createNetworkUtilizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.WorkflowLatency <em>Workflow Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.WorkflowLatency
	 * @generated
	 */
	public Adapter createWorkflowLatencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.TaskProcessingAmount <em>Task Processing Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.TaskProcessingAmount
	 * @generated
	 */
	public Adapter createTaskProcessingAmountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.StreamDataRate <em>Stream Data Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.StreamDataRate
	 * @generated
	 */
	public Adapter createStreamDataRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.Meter
	 * @generated
	 */
	public Adapter createMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.PrometheusMeter <em>Prometheus Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.PrometheusMeter
	 * @generated
	 */
	public Adapter createPrometheusMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.NodeHostedMeter <em>Node Hosted Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.NodeHostedMeter
	 * @generated
	 */
	public Adapter createNodeHostedMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.NodeResourceMeter <em>Node Resource Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.NodeResourceMeter
	 * @generated
	 */
	public Adapter createNodeResourceMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.CommunicationMeter <em>Communication Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.CommunicationMeter
	 * @generated
	 */
	public Adapter createCommunicationMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.StreamRateMeter <em>Stream Rate Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.StreamRateMeter
	 * @generated
	 */
	public Adapter createStreamRateMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.WorkflowLatencyMeter <em>Workflow Latency Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.WorkflowLatencyMeter
	 * @generated
	 */
	public Adapter createWorkflowLatencyMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.TaskProcessingAmountMeter <em>Task Processing Amount Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.TaskProcessingAmountMeter
	 * @generated
	 */
	public Adapter createTaskProcessingAmountMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.DeployableComponent <em>Deployable Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.DeployableComponent
	 * @generated
	 */
	public Adapter createDeployableComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.DeploymentConfiguration <em>Deployment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.DeploymentConfiguration
	 * @generated
	 */
	public Adapter createDeploymentConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.PlatformServiceDeploymentConf <em>Platform Service Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.PlatformServiceDeploymentConf
	 * @generated
	 */
	public Adapter createPlatformServiceDeploymentConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.OrchestratorDeploymentConf <em>Orchestrator Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.OrchestratorDeploymentConf
	 * @generated
	 */
	public Adapter createOrchestratorDeploymentConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.NodeDeploymentConf <em>Node Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.NodeDeploymentConf
	 * @generated
	 */
	public Adapter createNodeDeploymentConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.KubernetesDeploymentConf <em>Kubernetes Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.KubernetesDeploymentConf
	 * @generated
	 */
	public Adapter createKubernetesDeploymentConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.SwarmDeploymentConf <em>Swarm Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.SwarmDeploymentConf
	 * @generated
	 */
	public Adapter createSwarmDeploymentConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.NomadDeploymentConf <em>Nomad Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.NomadDeploymentConf
	 * @generated
	 */
	public Adapter createNomadDeploymentConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.Volume
	 * @generated
	 */
	public Adapter createVolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.DeploymentConstraints <em>Deployment Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.DeploymentConstraints
	 * @generated
	 */
	public Adapter createDeploymentConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.lang.Exception
	 * @generated
	 */
	public Adapter createExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.ConfigurationException <em>Configuration Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.ConfigurationException
	 * @generated
	 */
	public Adapter createConfigurationExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.DeploymentException <em>Deployment Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.DeploymentException
	 * @generated
	 */
	public Adapter createDeploymentExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.LaunchException <em>Launch Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.LaunchException
	 * @generated
	 */
	public Adapter createLaunchExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To String Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToStringMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.FileDescriptor <em>File Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.FileDescriptor
	 * @generated
	 */
	public Adapter createFileDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.DeploymentFileDescriptor <em>Deployment File Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.DeploymentFileDescriptor
	 * @generated
	 */
	public Adapter createDeploymentFileDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.rai4.ArtifactDescriptor <em>Artifact Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.rai4.ArtifactDescriptor
	 * @generated
	 */
	public Adapter createArtifactDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Rai4AdapterFactory
