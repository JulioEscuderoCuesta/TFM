/**
 */
package es.unican.istr.pasys.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storm Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.StormService#getZookeeperConnect <em>Zookeeper Connect</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.StormService#getLocalDir <em>Local Dir</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.StormService#getNimbus <em>Nimbus</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.StormService#getSupervisor <em>Supervisor</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.StormService#getUi <em>Ui</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getStormService()
 * @model
 * @generated
 */
public interface StormService extends SchedulingService {
	/**
	 * Returns the value of the '<em><b>Zookeeper Connect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zookeeper Connect</em>' reference.
	 * @see #setZookeeperConnect(ZookeeperService)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStormService_ZookeeperConnect()
	 * @model required="true"
	 * @generated
	 */
	ZookeeperService getZookeeperConnect();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StormService#getZookeeperConnect <em>Zookeeper Connect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zookeeper Connect</em>' reference.
	 * @see #getZookeeperConnect()
	 * @generated
	 */
	void setZookeeperConnect(ZookeeperService value);

	/**
	 * Returns the value of the '<em><b>Local Dir</b></em>' attribute.
	 * The default value is <code>"storm-local"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Dir</em>' attribute.
	 * @see #setLocalDir(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStormService_LocalDir()
	 * @model default="storm-local"
	 * @generated
	 */
	String getLocalDir();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StormService#getLocalDir <em>Local Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Dir</em>' attribute.
	 * @see #getLocalDir()
	 * @generated
	 */
	void setLocalDir(String value);

	/**
	 * Returns the value of the '<em><b>Nimbus</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.pasys.StormNimbus#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nimbus</em>' containment reference.
	 * @see #setNimbus(StormNimbus)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStormService_Nimbus()
	 * @see es.unican.istr.pasys.pasys.StormNimbus#getOwner
	 * @model opposite="owner" containment="true" required="true"
	 * @generated
	 */
	StormNimbus getNimbus();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StormService#getNimbus <em>Nimbus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nimbus</em>' containment reference.
	 * @see #getNimbus()
	 * @generated
	 */
	void setNimbus(StormNimbus value);

	/**
	 * Returns the value of the '<em><b>Supervisor</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.pasys.StormSupervisor#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisor</em>' containment reference.
	 * @see #setSupervisor(StormSupervisor)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStormService_Supervisor()
	 * @see es.unican.istr.pasys.pasys.StormSupervisor#getOwner
	 * @model opposite="owner" containment="true" required="true"
	 * @generated
	 */
	StormSupervisor getSupervisor();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StormService#getSupervisor <em>Supervisor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supervisor</em>' containment reference.
	 * @see #getSupervisor()
	 * @generated
	 */
	void setSupervisor(StormSupervisor value);

	/**
	 * Returns the value of the '<em><b>Ui</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.pasys.StormUI#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui</em>' containment reference.
	 * @see #setUi(StormUI)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStormService_Ui()
	 * @see es.unican.istr.pasys.pasys.StormUI#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	StormUI getUi();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StormService#getUi <em>Ui</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ui</em>' containment reference.
	 * @see #getUi()
	 * @generated
	 */
	void setUi(StormUI value);

} // StormService
