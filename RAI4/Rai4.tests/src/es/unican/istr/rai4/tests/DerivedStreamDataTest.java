/**
 */
package es.unican.istr.rai4.tests;

import es.unican.istr.rai4.DerivedStreamData;
import es.unican.istr.rai4.Rai4Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Derived Stream Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DerivedStreamDataTest extends WorkflowStreamDataTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DerivedStreamDataTest.class);
	}

	/**
	 * Constructs a new Derived Stream Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedStreamDataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Derived Stream Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DerivedStreamData getFixture() {
		return (DerivedStreamData)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Rai4Factory.eINSTANCE.createDerivedStreamData());
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

} //DerivedStreamDataTest
