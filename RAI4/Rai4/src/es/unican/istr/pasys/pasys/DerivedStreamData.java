/**
 */
package es.unican.istr.pasys.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Stream Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.DerivedStreamData#getPattern <em>Pattern</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.DerivedStreamData#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getDerivedStreamData()
 * @model
 * @generated
 */
public interface DerivedStreamData extends WorkflowStreamData {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getDerivedStreamData_Pattern()
	 * @model required="true"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.DerivedStreamData#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link es.unican.istr.pasys.pasys.StreamData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getDerivedStreamData_Inputs()
	 * @model required="true"
	 * @generated
	 */
	EList<StreamData> getInputs();

} // DerivedStreamData
