/**
 */
package es.unican.istr.rai4.tests;

import es.unican.istr.rai4.ProcessingNodeCluster;
import es.unican.istr.rai4.Rai4Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Processing Node Cluster</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessingNodeClusterTest extends ProcessingResourceClusterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessingNodeClusterTest.class);
	}

	/**
	 * Constructs a new Processing Node Cluster test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingNodeClusterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Processing Node Cluster test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProcessingNodeCluster getFixture() {
		return (ProcessingNodeCluster)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Rai4Factory.eINSTANCE.createProcessingNodeCluster());
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

} //ProcessingNodeClusterTest
