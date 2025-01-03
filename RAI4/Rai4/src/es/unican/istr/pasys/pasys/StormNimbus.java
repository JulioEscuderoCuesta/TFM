/**
 */
package es.unican.istr.pasys.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storm Nimbus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.StormNimbus#getOwner <em>Owner</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.StormNimbus#getHost <em>Host</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getStormNimbus()
 * @model
 * @generated
 */
public interface StormNimbus extends DeployableComponent, NamedElement {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.pasys.StormService#getNimbus <em>Nimbus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(StormService)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStormNimbus_Owner()
	 * @see es.unican.istr.pasys.pasys.StormService#getNimbus
	 * @model opposite="nimbus" required="true" transient="false"
	 * @generated
	 */
	StormService getOwner();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StormNimbus#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(StormService value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' reference.
	 * @see #setHost(ProcessingResourceCluster)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStormNimbus_Host()
	 * @model
	 * @generated
	 */
	ProcessingResourceCluster getHost();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StormNimbus#getHost <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(ProcessingResourceCluster value);

} // StormNimbus
