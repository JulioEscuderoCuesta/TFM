/**
 */
package es.unican.istr.rai4.tests;

import es.unican.istr.rai4.PrometheusService;
import es.unican.istr.rai4.Rai4Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Prometheus Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrometheusServiceTest extends MonitoringServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrometheusServiceTest.class);
	}

	/**
	 * Constructs a new Prometheus Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrometheusServiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Prometheus Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PrometheusService getFixture() {
		return (PrometheusService)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Rai4Factory.eINSTANCE.createPrometheusService());
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

} //PrometheusServiceTest
