/**
 */
package es.unican.istr.rai4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.rai4.SystemElement#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.rai4.Rai4Package#getSystemElement()
 * @model abstract="true"
 * @generated
 */
public interface SystemElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.rai4.ComputationalSystem#getOwnedElements <em>Owned Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(ComputationalSystem)
	 * @see es.unican.istr.rai4.Rai4Package#getSystemElement_Owner()
	 * @see es.unican.istr.rai4.ComputationalSystem#getOwnedElements
	 * @model opposite="ownedElements" required="true" transient="false"
	 * @generated
	 */
	ComputationalSystem getOwner();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.SystemElement#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ComputationalSystem value);

} // SystemElement
