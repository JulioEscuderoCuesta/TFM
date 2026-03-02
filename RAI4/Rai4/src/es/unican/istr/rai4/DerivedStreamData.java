/**
 */
package es.unican.istr.rai4;

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
 *   <li>{@link es.unican.istr.rai4.DerivedStreamData#getPattern <em>Pattern</em>}</li>
 *   <li>{@link es.unican.istr.rai4.DerivedStreamData#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.rai4.Rai4Package#getDerivedStreamData()
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
	 * @see es.unican.istr.rai4.Rai4Package#getDerivedStreamData_Pattern()
	 * @model required="true"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.DerivedStreamData#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link es.unican.istr.rai4.StreamData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see es.unican.istr.rai4.Rai4Package#getDerivedStreamData_Inputs()
	 * @model required="true"
	 * @generated
	 */
	EList<StreamData> getInputs();

} // DerivedStreamData
