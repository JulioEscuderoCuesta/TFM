/**
 */
package es.unican.istr.pasys.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kubernetes Deployment Conf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.KubernetesDeploymentConf#getExternalIP <em>External IP</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.KubernetesDeploymentConf#getServiceType <em>Service Type</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getKubernetesDeploymentConf()
 * @model
 * @generated
 */
public interface KubernetesDeploymentConf extends OrchestratorDeploymentConf {
	/**
	 * Returns the value of the '<em><b>External IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External IP</em>' attribute.
	 * @see #setExternalIP(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getKubernetesDeploymentConf_ExternalIP()
	 * @model
	 * @generated
	 */
	String getExternalIP();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.KubernetesDeploymentConf#getExternalIP <em>External IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External IP</em>' attribute.
	 * @see #getExternalIP()
	 * @generated
	 */
	void setExternalIP(String value);

	/**
	 * Returns the value of the '<em><b>Service Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unican.istr.pasys.pasys.ServiceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Type</em>' attribute.
	 * @see es.unican.istr.pasys.pasys.ServiceType
	 * @see #setServiceType(ServiceType)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getKubernetesDeploymentConf_ServiceType()
	 * @model
	 * @generated
	 */
	ServiceType getServiceType();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.KubernetesDeploymentConf#getServiceType <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Type</em>' attribute.
	 * @see es.unican.istr.pasys.pasys.ServiceType
	 * @see #getServiceType()
	 * @generated
	 */
	void setServiceType(ServiceType value);

} // KubernetesDeploymentConf
