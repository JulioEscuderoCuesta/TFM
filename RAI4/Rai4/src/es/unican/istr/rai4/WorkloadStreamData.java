/**
 */
package es.unican.istr.rai4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workload Stream Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.rai4.WorkloadStreamData#getHolder <em>Holder</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.rai4.Rai4Package#getWorkloadStreamData()
 * @model
 * @generated
 */
public interface WorkloadStreamData extends SystemElement, StreamData {
	/**
	 * Returns the value of the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holder</em>' reference.
	 * @see #setHolder(CommunicationService)
	 * @see es.unican.istr.rai4.Rai4Package#getWorkloadStreamData_Holder()
	 * @model required="true"
	 * @generated
	 */
	CommunicationService getHolder();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.WorkloadStreamData#getHolder <em>Holder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holder</em>' reference.
	 * @see #getHolder()
	 * @generated
	 */
	void setHolder(CommunicationService value);

} // WorkloadStreamData
