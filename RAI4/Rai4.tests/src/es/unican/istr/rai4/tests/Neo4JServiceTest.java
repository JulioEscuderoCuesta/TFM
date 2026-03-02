/**
 */
package es.unican.istr.rai4.tests;

import es.unican.istr.rai4.Neo4JService;
import es.unican.istr.rai4.Rai4Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Neo4 JService</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Neo4JServiceTest extends PersistenceServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Neo4JServiceTest.class);
	}

	/**
	 * Constructs a new Neo4 JService test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Neo4JServiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Neo4 JService test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Neo4JService getFixture() {
		return (Neo4JService)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Rai4Factory.eINSTANCE.createNeo4JService());
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

} //Neo4JServiceTest
