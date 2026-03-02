/**
 */
package es.unican.istr.rai4.tests;

import es.unican.istr.rai4.Rai4Factory;
import es.unican.istr.rai4.SwarmCluster;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Swarm Cluster</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwarmClusterTest extends OrchestrationClusterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SwarmClusterTest.class);
	}

	/**
	 * Constructs a new Swarm Cluster test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwarmClusterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Swarm Cluster test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SwarmCluster getFixture() {
		return (SwarmCluster)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Rai4Factory.eINSTANCE.createSwarmCluster());
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

} //SwarmClusterTest
