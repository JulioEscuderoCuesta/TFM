/**
 */
package es.unican.istr.pasys.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.SystemElement#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getSystemElement()
 * @model abstract="true"
 * @generated
 */
public interface SystemElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.pasys.ComputationalSystem#getOwnedElements <em>Owned Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(ComputationalSystem)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getSystemElement_Owner()
	 * @see es.unican.istr.pasys.pasys.ComputationalSystem#getOwnedElements
	 * @model opposite="ownedElements" required="true" transient="false"
	 * @generated
	 */
	ComputationalSystem getOwner();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.SystemElement#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ComputationalSystem value);

} // SystemElement
