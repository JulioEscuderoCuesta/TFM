/**
 */
package es.unican.istr.pasys.pasys.tests;

import es.unican.istr.pasys.pasys.PasysFactory;
import es.unican.istr.pasys.pasys.WorkflowLatencyMeter;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Workflow Latency Meter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowLatencyMeterTest extends PrometheusMeterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkflowLatencyMeterTest.class);
	}

	/**
	 * Constructs a new Workflow Latency Meter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowLatencyMeterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Workflow Latency Meter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WorkflowLatencyMeter getFixture() {
		return (WorkflowLatencyMeter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PasysFactory.eINSTANCE.createWorkflowLatencyMeter());
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

} //WorkflowLatencyMeterTest
