/**
 */
package es.unican.istr.rai4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.rai4.Rack#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.rai4.Rai4Package#getRack()
 * @model
 * @generated
 */
public interface Rack extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference.
	 * @see #setNodes(ProcessingNodeCluster)
	 * @see es.unican.istr.rai4.Rai4Package#getRack_Nodes()
	 * @model required="true"
	 * @generated
	 */
	ProcessingNodeCluster getNodes();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.Rack#getNodes <em>Nodes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes</em>' reference.
	 * @see #getNodes()
	 * @generated
	 */
	void setNodes(ProcessingNodeCluster value);

} // Rack
