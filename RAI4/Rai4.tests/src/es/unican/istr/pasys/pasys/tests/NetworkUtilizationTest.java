/**
 */
package es.unican.istr.pasys.pasys.tests;

import es.unican.istr.pasys.pasys.NetworkUtilization;
import es.unican.istr.pasys.pasys.PasysFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Network Utilization</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkUtilizationTest extends MetricTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NetworkUtilizationTest.class);
	}

	/**
	 * Constructs a new Network Utilization test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkUtilizationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Network Utilization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NetworkUtilization getFixture() {
		return (NetworkUtilization)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PasysFactory.eINSTANCE.createNetworkUtilization());
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

} //NetworkUtilizationTest
