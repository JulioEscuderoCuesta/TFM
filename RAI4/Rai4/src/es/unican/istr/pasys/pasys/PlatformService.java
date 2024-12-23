/**
 */
package es.unican.istr.pasys.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.PlatformService#getHost <em>Host</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getPlatformService()
 * @model abstract="true"
 * @generated
 */
public interface PlatformService extends PlatformResource, DeployableComponent {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' reference.
	 * @see #setHost(ProcessingResourceCluster)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getPlatformService_Host()
	 * @model required="true"
	 * @generated
	 */
	ProcessingResourceCluster getHost();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.PlatformService#getHost <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(ProcessingResourceCluster value);

} // PlatformService
