/**
 */
package es.unican.istr.pasys.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storm UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.StormUI#getUiPort <em>Ui Port</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.StormUI#getOwner <em>Owner</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.StormUI#getHost <em>Host</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getStormUI()
 * @model
 * @generated
 */
public interface StormUI extends DeployableComponent, NamedElement {
	/**
	 * Returns the value of the '<em><b>Ui Port</b></em>' attribute.
	 * The default value is <code>"8080"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui Port</em>' attribute.
	 * @see #setUiPort(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStormUI_UiPort()
	 * @model default="8080" required="true"
	 * @generated
	 */
	String getUiPort();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StormUI#getUiPort <em>Ui Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ui Port</em>' attribute.
	 * @see #getUiPort()
	 * @generated
	 */
	void setUiPort(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.pasys.StormService#getUi <em>Ui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(StormService)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStormUI_Owner()
	 * @see es.unican.istr.pasys.pasys.StormService#getUi
	 * @model opposite="ui" required="true" transient="false"
	 * @generated
	 */
	StormService getOwner();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StormUI#getOwner <em>Owner</em>}' container reference.
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
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStormUI_Host()
	 * @model
	 * @generated
	 */
	ProcessingResourceCluster getHost();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StormUI#getHost <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(ProcessingResourceCluster value);

} // StormUI
