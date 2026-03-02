/**
 */
package es.unican.istr.rai4.tests;

import es.unican.istr.rai4.NodeResourceMeter;
import es.unican.istr.rai4.Rai4Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Node Resource Meter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeResourceMeterTest extends NodeHostedMeterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NodeResourceMeterTest.class);
	}

	/**
	 * Constructs a new Node Resource Meter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeResourceMeterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Node Resource Meter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NodeResourceMeter getFixture() {
		return (NodeResourceMeter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Rai4Factory.eINSTANCE.createNodeResourceMeter());
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

} //NodeResourceMeterTest
