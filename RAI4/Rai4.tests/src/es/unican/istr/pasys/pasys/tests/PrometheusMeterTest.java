/**
 */
package es.unican.istr.pasys.pasys.tests;

import es.unican.istr.pasys.pasys.PasysFactory;
import es.unican.istr.pasys.pasys.PrometheusMeter;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Prometheus Meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.PrometheusMeter#getPrometheusServerConfiguration() <em>Get Prometheus Server Configuration</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PrometheusMeterTest extends MeterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PrometheusMeterTest.class);
	}

	/**
	 * Constructs a new Prometheus Meter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrometheusMeterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Prometheus Meter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PrometheusMeter getFixture() {
		return (PrometheusMeter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PasysFactory.eINSTANCE.createPrometheusMeter());
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

	/**
	 * Tests the '{@link es.unican.istr.pasys.pasys.PrometheusMeter#getPrometheusServerConfiguration() <em>Get Prometheus Server Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.PrometheusMeter#getPrometheusServerConfiguration()
	 * @generated
	 */
	public void testGetPrometheusServerConfiguration() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //PrometheusMeterTest
