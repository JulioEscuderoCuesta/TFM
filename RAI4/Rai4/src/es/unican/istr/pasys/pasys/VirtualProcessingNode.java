/**
 */
package es.unican.istr.pasys.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Processing Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.VirtualProcessingNode#getExternalIP <em>External IP</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getVirtualProcessingNode()
 * @model abstract="true"
 * @generated
 */
public interface VirtualProcessingNode extends ProcessingNode {
	/**
	 * Returns the value of the '<em><b>External IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External IP</em>' attribute.
	 * @see #setExternalIP(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getVirtualProcessingNode_ExternalIP()
	 * @model required="true"
	 * @generated
	 */
	String getExternalIP();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.VirtualProcessingNode#getExternalIP <em>External IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External IP</em>' attribute.
	 * @see #getExternalIP()
	 * @generated
	 */
	void setExternalIP(String value);

} // VirtualProcessingNode
