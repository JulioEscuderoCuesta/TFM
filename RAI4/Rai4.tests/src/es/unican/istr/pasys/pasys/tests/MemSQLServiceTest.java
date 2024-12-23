/**
 */
package es.unican.istr.pasys.pasys.tests;

import es.unican.istr.pasys.pasys.MemSQLService;
import es.unican.istr.pasys.pasys.PasysFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mem SQL Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MemSQLServiceTest extends PersistenceServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MemSQLServiceTest.class);
	}

	/**
	 * Constructs a new Mem SQL Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemSQLServiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mem SQL Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MemSQLService getFixture() {
		return (MemSQLService)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PasysFactory.eINSTANCE.createMemSQLService());
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

} //MemSQLServiceTest
