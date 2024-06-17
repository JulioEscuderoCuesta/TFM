/**
 */
package es.unican.istr.pasys.util;

import es.unican.istr.pasys.AVROService;
import es.unican.istr.pasys.AWSVirtualProcessingNode;
import es.unican.istr.pasys.ArtifactDescriptor;
import es.unican.istr.pasys.CassandraService;
import es.unican.istr.pasys.CommunicationMeter;
import es.unican.istr.pasys.CommunicationService;
import es.unican.istr.pasys.ComputationalSystem;
import es.unican.istr.pasys.ConfigurationException;
import es.unican.istr.pasys.DataCenter;
import es.unican.istr.pasys.DeployableComponent;
import es.unican.istr.pasys.DeploymentConfiguration;
import es.unican.istr.pasys.DeploymentConstraints;
import es.unican.istr.pasys.DeploymentException;
import es.unican.istr.pasys.DeploymentFileDescriptor;
import es.unican.istr.pasys.DerivedStreamData;
import es.unican.istr.pasys.DistributionService;
import es.unican.istr.pasys.ExporterData;
import es.unican.istr.pasys.FileDescriptor;
import es.unican.istr.pasys.FlowStreamData;
import es.unican.istr.pasys.KafkaFlowStreamData;
import es.unican.istr.pasys.KafkaService;
import es.unican.istr.pasys.KafkaWorkloadStreamData;
import es.unican.istr.pasys.KubernetesCluster;
import es.unican.istr.pasys.KubernetesDeploymentConf;
import es.unican.istr.pasys.LaunchException;
import es.unican.istr.pasys.MemSQLService;
import es.unican.istr.pasys.Meter;
import es.unican.istr.pasys.Metric;
import es.unican.istr.pasys.MonitoringService;
import es.unican.istr.pasys.NamedElement;
import es.unican.istr.pasys.Neo4JService;
import es.unican.istr.pasys.Network;
import es.unican.istr.pasys.NetworkUtilization;
import es.unican.istr.pasys.NodeDeploymentConf;
import es.unican.istr.pasys.NodeHostedMeter;
import es.unican.istr.pasys.NodeResourceMeter;
import es.unican.istr.pasys.NodeScheduler;
import es.unican.istr.pasys.NomadCluster;
import es.unican.istr.pasys.NomadDeploymentConf;
import es.unican.istr.pasys.OrchestrationCluster;
import es.unican.istr.pasys.OrchestratorDeploymentConf;
import es.unican.istr.pasys.PasysPackage;
import es.unican.istr.pasys.PersistenceService;
import es.unican.istr.pasys.PhysicalProcessingNode;
import es.unican.istr.pasys.PlatformResource;
import es.unican.istr.pasys.PlatformService;
import es.unican.istr.pasys.PlatformServiceDeploymentConf;
import es.unican.istr.pasys.Port;
import es.unican.istr.pasys.ProcessingNode;
import es.unican.istr.pasys.ProcessingNodeCluster;
import es.unican.istr.pasys.ProcessingNodeMemory;
import es.unican.istr.pasys.ProcessingNodeUtilization;
import es.unican.istr.pasys.ProcessingResourceCluster;
import es.unican.istr.pasys.PrometheusMeter;
import es.unican.istr.pasys.PrometheusService;
import es.unican.istr.pasys.Rack;
import es.unican.istr.pasys.SchedulableSet;
import es.unican.istr.pasys.SchedulingService;
import es.unican.istr.pasys.SecurityService;
import es.unican.istr.pasys.SerializationService;
import es.unican.istr.pasys.SparkService;
import es.unican.istr.pasys.StormNimbus;
import es.unican.istr.pasys.StormService;
import es.unican.istr.pasys.StormSupervisor;
import es.unican.istr.pasys.StormUI;
import es.unican.istr.pasys.StreamData;
import es.unican.istr.pasys.StreamDataPartition;
import es.unican.istr.pasys.StreamDataRate;
import es.unican.istr.pasys.StreamRateMeter;
import es.unican.istr.pasys.SwarmCluster;
import es.unican.istr.pasys.SwarmDeploymentConf;
import es.unican.istr.pasys.SystemElement;
import es.unican.istr.pasys.Task;
import es.unican.istr.pasys.TaskExecutor;
import es.unican.istr.pasys.TaskProcessingAmount;
import es.unican.istr.pasys.TaskProcessingAmountMeter;
import es.unican.istr.pasys.VirtualProcessingNode;
import es.unican.istr.pasys.Volume;
import es.unican.istr.pasys.Workflow;
import es.unican.istr.pasys.WorkflowLatency;
import es.unican.istr.pasys.WorkflowLatencyMeter;
import es.unican.istr.pasys.WorkflowStreamData;
import es.unican.istr.pasys.WorkloadStreamData;
import es.unican.istr.pasys.ZookeeperService;

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
 * @see es.unican.istr.pasys.PasysPackage
 * @generated
 */
public class PasysAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PasysPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasysAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PasysPackage.eINSTANCE;
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
	protected PasysSwitch<Adapter> modelSwitch =
		new PasysSwitch<Adapter>() {
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
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.ComputationalSystem <em>Computational System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.ComputationalSystem
	 * @generated
	 */
	public Adapter createComputationalSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.SystemElement <em>System Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.SystemElement
	 * @generated
	 */
	public Adapter createSystemElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.PlatformResource <em>Platform Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.PlatformResource
	 * @generated
	 */
	public Adapter createPlatformResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.ProcessingNode <em>Processing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.ProcessingNode
	 * @generated
	 */
	public Adapter createProcessingNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.PhysicalProcessingNode <em>Physical Processing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.PhysicalProcessingNode
	 * @generated
	 */
	public Adapter createPhysicalProcessingNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.VirtualProcessingNode <em>Virtual Processing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.VirtualProcessingNode
	 * @generated
	 */
	public Adapter createVirtualProcessingNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.AWSVirtualProcessingNode <em>AWS Virtual Processing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.AWSVirtualProcessingNode
	 * @generated
	 */
	public Adapter createAWSVirtualProcessingNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.ProcessingResourceCluster <em>Processing Resource Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.ProcessingResourceCluster
	 * @generated
	 */
	public Adapter createProcessingResourceClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.ProcessingNodeCluster <em>Processing Node Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.ProcessingNodeCluster
	 * @generated
	 */
	public Adapter createProcessingNodeClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.OrchestrationCluster <em>Orchestration Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.OrchestrationCluster
	 * @generated
	 */
	public Adapter createOrchestrationClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.KubernetesCluster <em>Kubernetes Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.KubernetesCluster
	 * @generated
	 */
	public Adapter createKubernetesClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.SwarmCluster <em>Swarm Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.SwarmCluster
	 * @generated
	 */
	public Adapter createSwarmClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.NomadCluster <em>Nomad Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.NomadCluster
	 * @generated
	 */
	public Adapter createNomadClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.PlatformService <em>Platform Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.PlatformService
	 * @generated
	 */
	public Adapter createPlatformServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.SerializationService <em>Serialization Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.SerializationService
	 * @generated
	 */
	public Adapter createSerializationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.DistributionService <em>Distribution Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.DistributionService
	 * @generated
	 */
	public Adapter createDistributionServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.CommunicationService <em>Communication Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.CommunicationService
	 * @generated
	 */
	public Adapter createCommunicationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.SchedulingService <em>Scheduling Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.SchedulingService
	 * @generated
	 */
	public Adapter createSchedulingServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.SecurityService <em>Security Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.SecurityService
	 * @generated
	 */
	public Adapter createSecurityServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.PersistenceService <em>Persistence Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.PersistenceService
	 * @generated
	 */
	public Adapter createPersistenceServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.MonitoringService <em>Monitoring Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.MonitoringService
	 * @generated
	 */
	public Adapter createMonitoringServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.AVROService <em>AVRO Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.AVROService
	 * @generated
	 */
	public Adapter createAVROServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.ZookeeperService <em>Zookeeper Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.ZookeeperService
	 * @generated
	 */
	public Adapter createZookeeperServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.KafkaService <em>Kafka Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.KafkaService
	 * @generated
	 */
	public Adapter createKafkaServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.NodeScheduler <em>Node Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.NodeScheduler
	 * @generated
	 */
	public Adapter createNodeSchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.SparkService <em>Spark Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.SparkService
	 * @generated
	 */
	public Adapter createSparkServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.StormService <em>Storm Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.StormService
	 * @generated
	 */
	public Adapter createStormServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.StormUI <em>Storm UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.StormUI
	 * @generated
	 */
	public Adapter createStormUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.StormNimbus <em>Storm Nimbus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.StormNimbus
	 * @generated
	 */
	public Adapter createStormNimbusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.StormSupervisor <em>Storm Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.StormSupervisor
	 * @generated
	 */
	public Adapter createStormSupervisorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.Neo4JService <em>Neo4 JService</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.Neo4JService
	 * @generated
	 */
	public Adapter createNeo4JServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.MemSQLService <em>Mem SQL Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.MemSQLService
	 * @generated
	 */
	public Adapter createMemSQLServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.CassandraService <em>Cassandra Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.CassandraService
	 * @generated
	 */
	public Adapter createCassandraServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.DataCenter <em>Data Center</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.DataCenter
	 * @generated
	 */
	public Adapter createDataCenterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.Rack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.Rack
	 * @generated
	 */
	public Adapter createRackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.PrometheusService <em>Prometheus Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.PrometheusService
	 * @generated
	 */
	public Adapter createPrometheusServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.ExporterData <em>Exporter Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.ExporterData
	 * @generated
	 */
	public Adapter createExporterDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.StreamData <em>Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.StreamData
	 * @generated
	 */
	public Adapter createStreamDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.StreamDataPartition <em>Stream Data Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.StreamDataPartition
	 * @generated
	 */
	public Adapter createStreamDataPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.WorkflowStreamData <em>Workflow Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.WorkflowStreamData
	 * @generated
	 */
	public Adapter createWorkflowStreamDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.FlowStreamData <em>Flow Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.FlowStreamData
	 * @generated
	 */
	public Adapter createFlowStreamDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.KafkaFlowStreamData <em>Kafka Flow Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.KafkaFlowStreamData
	 * @generated
	 */
	public Adapter createKafkaFlowStreamDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.DerivedStreamData <em>Derived Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.DerivedStreamData
	 * @generated
	 */
	public Adapter createDerivedStreamDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.WorkloadStreamData <em>Workload Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.WorkloadStreamData
	 * @generated
	 */
	public Adapter createWorkloadStreamDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.KafkaWorkloadStreamData <em>Kafka Workload Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.KafkaWorkloadStreamData
	 * @generated
	 */
	public Adapter createKafkaWorkloadStreamDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.Workflow
	 * @generated
	 */
	public Adapter createWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.SchedulableSet <em>Schedulable Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.SchedulableSet
	 * @generated
	 */
	public Adapter createSchedulableSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.TaskExecutor <em>Task Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.TaskExecutor
	 * @generated
	 */
	public Adapter createTaskExecutorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.Metric
	 * @generated
	 */
	public Adapter createMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.ProcessingNodeUtilization <em>Processing Node Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.ProcessingNodeUtilization
	 * @generated
	 */
	public Adapter createProcessingNodeUtilizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.ProcessingNodeMemory <em>Processing Node Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.ProcessingNodeMemory
	 * @generated
	 */
	public Adapter createProcessingNodeMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.NetworkUtilization <em>Network Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.NetworkUtilization
	 * @generated
	 */
	public Adapter createNetworkUtilizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.WorkflowLatency <em>Workflow Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.WorkflowLatency
	 * @generated
	 */
	public Adapter createWorkflowLatencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.TaskProcessingAmount <em>Task Processing Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.TaskProcessingAmount
	 * @generated
	 */
	public Adapter createTaskProcessingAmountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.StreamDataRate <em>Stream Data Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.StreamDataRate
	 * @generated
	 */
	public Adapter createStreamDataRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.Meter
	 * @generated
	 */
	public Adapter createMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.PrometheusMeter <em>Prometheus Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.PrometheusMeter
	 * @generated
	 */
	public Adapter createPrometheusMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.NodeHostedMeter <em>Node Hosted Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.NodeHostedMeter
	 * @generated
	 */
	public Adapter createNodeHostedMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.NodeResourceMeter <em>Node Resource Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.NodeResourceMeter
	 * @generated
	 */
	public Adapter createNodeResourceMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.CommunicationMeter <em>Communication Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.CommunicationMeter
	 * @generated
	 */
	public Adapter createCommunicationMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.StreamRateMeter <em>Stream Rate Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.StreamRateMeter
	 * @generated
	 */
	public Adapter createStreamRateMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.WorkflowLatencyMeter <em>Workflow Latency Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.WorkflowLatencyMeter
	 * @generated
	 */
	public Adapter createWorkflowLatencyMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.TaskProcessingAmountMeter <em>Task Processing Amount Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.TaskProcessingAmountMeter
	 * @generated
	 */
	public Adapter createTaskProcessingAmountMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.DeployableComponent <em>Deployable Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.DeployableComponent
	 * @generated
	 */
	public Adapter createDeployableComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.DeploymentConfiguration <em>Deployment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.DeploymentConfiguration
	 * @generated
	 */
	public Adapter createDeploymentConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.PlatformServiceDeploymentConf <em>Platform Service Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.PlatformServiceDeploymentConf
	 * @generated
	 */
	public Adapter createPlatformServiceDeploymentConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.OrchestratorDeploymentConf <em>Orchestrator Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.OrchestratorDeploymentConf
	 * @generated
	 */
	public Adapter createOrchestratorDeploymentConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.NodeDeploymentConf <em>Node Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.NodeDeploymentConf
	 * @generated
	 */
	public Adapter createNodeDeploymentConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.KubernetesDeploymentConf <em>Kubernetes Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.KubernetesDeploymentConf
	 * @generated
	 */
	public Adapter createKubernetesDeploymentConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.SwarmDeploymentConf <em>Swarm Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.SwarmDeploymentConf
	 * @generated
	 */
	public Adapter createSwarmDeploymentConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.NomadDeploymentConf <em>Nomad Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.NomadDeploymentConf
	 * @generated
	 */
	public Adapter createNomadDeploymentConfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.Volume
	 * @generated
	 */
	public Adapter createVolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.DeploymentConstraints <em>Deployment Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.DeploymentConstraints
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
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.ConfigurationException <em>Configuration Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.ConfigurationException
	 * @generated
	 */
	public Adapter createConfigurationExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.DeploymentException <em>Deployment Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.DeploymentException
	 * @generated
	 */
	public Adapter createDeploymentExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.LaunchException <em>Launch Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.LaunchException
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
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.FileDescriptor <em>File Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.FileDescriptor
	 * @generated
	 */
	public Adapter createFileDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.DeploymentFileDescriptor <em>Deployment File Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.DeploymentFileDescriptor
	 * @generated
	 */
	public Adapter createDeploymentFileDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unican.istr.pasys.ArtifactDescriptor <em>Artifact Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unican.istr.pasys.ArtifactDescriptor
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

} //PasysAdapterFactory
