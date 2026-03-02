/**
 */
package es.unican.istr.rai4.tests;

import es.unican.istr.rai4.CommunicationMeter;
import es.unican.istr.rai4.Rai4Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Communication Meter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationMeterTest extends NodeHostedMeterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CommunicationMeterTest.class);
	}

	/**
	 * Constructs a new Communication Meter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationMeterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Communication Meter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CommunicationMeter getFixture() {
		return (CommunicationMeter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Rai4Factory.eINSTANCE.createCommunicationMeter());
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

} //CommunicationMeterTest
