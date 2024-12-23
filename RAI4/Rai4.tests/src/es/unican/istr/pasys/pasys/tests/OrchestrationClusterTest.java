/**
 */
package es.unican.istr.pasys.pasys.tests;

import es.unican.istr.pasys.pasys.OrchestrationCluster;
import es.unican.istr.pasys.pasys.PasysFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Orchestration Cluster</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrchestrationClusterTest extends ProcessingResourceClusterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrchestrationClusterTest.class);
	}

	/**
	 * Constructs a new Orchestration Cluster test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestrationClusterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Orchestration Cluster test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OrchestrationCluster getFixture() {
		return (OrchestrationCluster)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PasysFactory.eINSTANCE.createOrchestrationCluster());
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

} //OrchestrationClusterTest
