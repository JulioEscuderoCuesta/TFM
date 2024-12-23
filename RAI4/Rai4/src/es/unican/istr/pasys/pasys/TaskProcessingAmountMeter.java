/**
 */
package es.unican.istr.pasys.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Processing Amount Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.TaskProcessingAmountMeter#getOwner <em>Owner</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.TaskProcessingAmountMeter#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getTaskProcessingAmountMeter()
 * @model
 * @generated
 */
public interface TaskProcessingAmountMeter extends PrometheusMeter {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.pasys.TaskExecutor#getOwnedMeters <em>Owned Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(TaskExecutor)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getTaskProcessingAmountMeter_Owner()
	 * @see es.unican.istr.pasys.pasys.TaskExecutor#getOwnedMeters
	 * @model opposite="ownedMeters" required="true" transient="false"
	 * @generated
	 */
	TaskExecutor getOwner();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.TaskProcessingAmountMeter#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(TaskExecutor value);

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' reference.
	 * @see #setMetric(TaskProcessingAmount)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getTaskProcessingAmountMeter_Metric()
	 * @model required="true"
	 * @generated
	 */
	TaskProcessingAmount getMetric();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.TaskProcessingAmountMeter#getMetric <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(TaskProcessingAmount value);

} // TaskProcessingAmountMeter
