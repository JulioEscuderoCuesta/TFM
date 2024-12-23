/**
 */
package es.unican.istr.pasys.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kubernetes Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.KubernetesCluster#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.KubernetesCluster#getKubeConfigPath <em>Kube Config Path</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getKubernetesCluster()
 * @model
 * @generated
 */
public interface KubernetesCluster extends OrchestrationCluster {
	/**
	 * Returns the value of the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Version</em>' attribute.
	 * @see #setApiVersion(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getKubernetesCluster_ApiVersion()
	 * @model
	 * @generated
	 */
	String getApiVersion();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.KubernetesCluster#getApiVersion <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Version</em>' attribute.
	 * @see #getApiVersion()
	 * @generated
	 */
	void setApiVersion(String value);

	/**
	 * Returns the value of the '<em><b>Kube Config Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kube Config Path</em>' attribute.
	 * @see #setKubeConfigPath(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getKubernetesCluster_KubeConfigPath()
	 * @model required="true"
	 * @generated
	 */
	String getKubeConfigPath();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.KubernetesCluster#getKubeConfigPath <em>Kube Config Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kube Config Path</em>' attribute.
	 * @see #getKubeConfigPath()
	 * @generated
	 */
	void setKubeConfigPath(String value);

} // KubernetesCluster
