/**
 */
package es.unican.istr.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kubernetes Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.KubernetesPort#getName <em>Name</em>}</li>
 *   <li>{@link es.unican.istr.pasys.KubernetesPort#isInternal <em>Internal</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.PasysPackage#getKubernetesPort()
 * @model
 * @generated
 */
public interface KubernetesPort extends Port {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.unican.istr.pasys.PasysPackage#getKubernetesPort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.KubernetesPort#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Internal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal</em>' attribute.
	 * @see #setInternal(boolean)
	 * @see es.unican.istr.pasys.PasysPackage#getKubernetesPort_Internal()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isInternal();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.KubernetesPort#isInternal <em>Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal</em>' attribute.
	 * @see #isInternal()
	 * @generated
	 */
	void setInternal(boolean value);

} // KubernetesPort
