/**
 */
package es.unican.istr.rai4.tests;

import es.unican.istr.rai4.KubernetesDeploymentConf;
import es.unican.istr.rai4.Rai4Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Kubernetes Deployment Conf</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KubernetesDeploymentConfTest extends OrchestratorDeploymentConfTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KubernetesDeploymentConfTest.class);
	}

	/**
	 * Constructs a new Kubernetes Deployment Conf test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KubernetesDeploymentConfTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Kubernetes Deployment Conf test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected KubernetesDeploymentConf getFixture() {
		return (KubernetesDeploymentConf)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Rai4Factory.eINSTANCE.createKubernetesDeploymentConf());
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

} //KubernetesDeploymentConfTest
