/**
 */
package es.unican.istr.rai4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Latency Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.rai4.WorkflowLatencyMeter#getOwner <em>Owner</em>}</li>
 *   <li>{@link es.unican.istr.rai4.WorkflowLatencyMeter#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.rai4.Rai4Package#getWorkflowLatencyMeter()
 * @model
 * @generated
 */
public interface WorkflowLatencyMeter extends PrometheusMeter {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.rai4.Workflow#getOwnedMeters <em>Owned Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Workflow)
	 * @see es.unican.istr.rai4.Rai4Package#getWorkflowLatencyMeter_Owner()
	 * @see es.unican.istr.rai4.Workflow#getOwnedMeters
	 * @model opposite="ownedMeters" required="true" transient="false"
	 * @generated
	 */
	Workflow getOwner();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.WorkflowLatencyMeter#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Workflow value);

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' reference.
	 * @see #setMetric(WorkflowLatency)
	 * @see es.unican.istr.rai4.Rai4Package#getWorkflowLatencyMeter_Metric()
	 * @model
	 * @generated
	 */
	WorkflowLatency getMetric();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.WorkflowLatencyMeter#getMetric <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(WorkflowLatency value);

} // WorkflowLatencyMeter
