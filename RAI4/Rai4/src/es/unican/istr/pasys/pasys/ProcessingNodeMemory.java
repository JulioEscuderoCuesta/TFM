/**
 */
package es.unican.istr.pasys.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Node Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.ProcessingNodeMemory#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getProcessingNodeMemory()
 * @model
 * @generated
 */
public interface ProcessingNodeMemory extends Metric {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ProcessingNode)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getProcessingNodeMemory_Target()
	 * @model
	 * @generated
	 */
	ProcessingNode getTarget();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.ProcessingNodeMemory#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ProcessingNode value);

} // ProcessingNodeMemory
