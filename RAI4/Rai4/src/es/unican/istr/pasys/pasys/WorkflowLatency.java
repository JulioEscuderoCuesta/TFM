/**
 */
package es.unican.istr.pasys.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Latency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.WorkflowLatency#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getWorkflowLatency()
 * @model
 * @generated
 */
public interface WorkflowLatency extends Metric {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Workflow)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getWorkflowLatency_Target()
	 * @model required="true"
	 * @generated
	 */
	Workflow getTarget();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.WorkflowLatency#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Workflow value);

} // WorkflowLatency
