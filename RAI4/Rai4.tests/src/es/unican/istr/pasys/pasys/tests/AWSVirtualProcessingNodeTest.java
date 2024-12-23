/**
 */
package es.unican.istr.pasys.pasys.tests;

import es.unican.istr.pasys.pasys.AWSVirtualProcessingNode;
import es.unican.istr.pasys.pasys.PasysFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>AWS Virtual Processing Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AWSVirtualProcessingNodeTest extends VirtualProcessingNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AWSVirtualProcessingNodeTest.class);
	}

	/**
	 * Constructs a new AWS Virtual Processing Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AWSVirtualProcessingNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this AWS Virtual Processing Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AWSVirtualProcessingNode getFixture() {
		return (AWSVirtualProcessingNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PasysFactory.eINSTANCE.createAWSVirtualProcessingNode());
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

} //AWSVirtualProcessingNodeTest
