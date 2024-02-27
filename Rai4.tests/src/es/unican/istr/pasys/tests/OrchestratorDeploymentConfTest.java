/**
 */
package es.unican.istr.pasys.tests;

import es.unican.istr.pasys.OrchestratorDeploymentConf;
import es.unican.istr.pasys.PasysFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Orchestrator Deployment Conf</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrchestratorDeploymentConfTest extends PlatformServiceDeploymentConfTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrchestratorDeploymentConfTest.class);
	}

	/**
	 * Constructs a new Orchestrator Deployment Conf test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestratorDeploymentConfTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Orchestrator Deployment Conf test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OrchestratorDeploymentConf getFixture() {
		return (OrchestratorDeploymentConf)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PasysFactory.eINSTANCE.createOrchestratorDeploymentConf());
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

} //OrchestratorDeploymentConfTest
