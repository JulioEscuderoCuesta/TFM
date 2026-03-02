/**
 */
package es.unican.istr.rai4.tests;

import es.unican.istr.rai4.KafkaWorkloadStreamData;
import es.unican.istr.rai4.Rai4Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Kafka Workload Stream Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KafkaWorkloadStreamDataTest extends WorkloadStreamDataTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KafkaWorkloadStreamDataTest.class);
	}

	/**
	 * Constructs a new Kafka Workload Stream Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KafkaWorkloadStreamDataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Kafka Workload Stream Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected KafkaWorkloadStreamData getFixture() {
		return (KafkaWorkloadStreamData)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Rai4Factory.eINSTANCE.createKafkaWorkloadStreamData());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //KafkaWorkloadStreamDataTest
