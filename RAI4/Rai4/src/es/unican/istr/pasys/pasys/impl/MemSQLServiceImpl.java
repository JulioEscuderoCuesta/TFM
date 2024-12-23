/**
 */
package es.unican.istr.pasys.pasys.impl;

import es.unican.istr.pasys.pasys.ConfigurationException;
import es.unican.istr.pasys.pasys.MemSQLService;
import es.unican.istr.pasys.pasys.PasysPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mem SQL Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MemSQLServiceImpl extends PersistenceServiceImpl implements MemSQLService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemSQLServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.MEM_SQL_SERVICE;
	}

	@Override
	public void configureDeploymentOnOrchestrator() throws ConfigurationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configureDeploymentOnNode() throws ConfigurationException {
		// TODO Auto-generated method stub
		
	}

} //MemSQLServiceImpl
