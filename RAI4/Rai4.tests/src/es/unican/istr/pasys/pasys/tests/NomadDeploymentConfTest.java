/**
 */
package es.unican.istr.pasys.pasys.tests;

import es.unican.istr.pasys.pasys.NomadDeploymentConf;
import es.unican.istr.pasys.pasys.PasysFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Nomad Deployment Conf</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NomadDeploymentConfTest extends OrchestratorDeploymentConfTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NomadDeploymentConfTest.class);
	}

	/**
	 * Constructs a new Nomad Deployment Conf test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NomadDeploymentConfTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Nomad Deployment Conf test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NomadDeploymentConf getFixture() {
		return (NomadDeploymentConf)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PasysFactory.eINSTANCE.createNomadDeploymentConf());
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

} //NomadDeploymentConfTest
