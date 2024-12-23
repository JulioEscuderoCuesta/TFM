/**
 */
package es.unican.istr.pasys.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Stream Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.FlowStreamData#getSource <em>Source</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.FlowStreamData#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.FlowStreamData#getHolder <em>Holder</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.FlowStreamData#isIsImplemented <em>Is Implemented</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getFlowStreamData()
 * @model
 * @generated
 */
public interface FlowStreamData extends WorkflowStreamData {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(StreamData)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getFlowStreamData_Source()
	 * @model required="true"
	 * @generated
	 */
	StreamData getSource();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.FlowStreamData#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(StreamData value);

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(StreamData)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getFlowStreamData_Predecessor()
	 * @model required="true"
	 * @generated
	 */
	StreamData getPredecessor();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.FlowStreamData#getPredecessor <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(StreamData value);

	/**
	 * Returns the value of the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holder</em>' reference.
	 * @see #setHolder(CommunicationService)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getFlowStreamData_Holder()
	 * @model
	 * @generated
	 */
	CommunicationService getHolder();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.FlowStreamData#getHolder <em>Holder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holder</em>' reference.
	 * @see #getHolder()
	 * @generated
	 */
	void setHolder(CommunicationService value);

	/**
	 * Returns the value of the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Implemented</em>' attribute.
	 * @see #setIsImplemented(boolean)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getFlowStreamData_IsImplemented()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsImplemented();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.FlowStreamData#isIsImplemented <em>Is Implemented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Implemented</em>' attribute.
	 * @see #isIsImplemented()
	 * @generated
	 */
	void setIsImplemented(boolean value);

} // FlowStreamData
