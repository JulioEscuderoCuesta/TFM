/**
 */
package es.unican.istr.pasys.pasys.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>pasys</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class PasysTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new PasysTests("pasys Tests");
		suite.addTestSuite(ComputationalSystemTest.class);
		suite.addTestSuite(PhysicalProcessingNodeTest.class);
		suite.addTestSuite(AWSVirtualProcessingNodeTest.class);
		suite.addTestSuite(AVROServiceTest.class);
		suite.addTestSuite(ZookeeperServiceTest.class);
		suite.addTestSuite(KafkaServiceTest.class);
		suite.addTestSuite(NodeSchedulerTest.class);
		suite.addTestSuite(SparkServiceTest.class);
		suite.addTestSuite(StormServiceTest.class);
		suite.addTestSuite(StormUITest.class);
		suite.addTestSuite(StormNimbusTest.class);
		suite.addTestSuite(StormSupervisorTest.class);
		suite.addTestSuite(Neo4JServiceTest.class);
		suite.addTestSuite(MemSQLServiceTest.class);
		suite.addTestSuite(CassandraServiceTest.class);
		suite.addTestSuite(PrometheusServiceTest.class);
		suite.addTestSuite(FlowStreamDataTest.class);
		suite.addTestSuite(KafkaFlowStreamDataTest.class);
		suite.addTestSuite(DerivedStreamDataTest.class);
		suite.addTestSuite(WorkloadStreamDataTest.class);
		suite.addTestSuite(KafkaWorkloadStreamDataTest.class);
		suite.addTestSuite(WorkflowTest.class);
		suite.addTestSuite(TaskExecutorTest.class);
		suite.addTestSuite(PrometheusMeterTest.class);
		suite.addTestSuite(NodeResourceMeterTest.class);
		suite.addTestSuite(CommunicationMeterTest.class);
		suite.addTestSuite(StreamRateMeterTest.class);
		suite.addTestSuite(WorkflowLatencyMeterTest.class);
		suite.addTestSuite(TaskProcessingAmountMeterTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasysTests(String name) {
		super(name);
	}

} //PasysTests
