/**
 */
package es.unican.istr.rai4;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Executor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.rai4.TaskExecutor#getOwner <em>Owner</em>}</li>
 *   <li>{@link es.unican.istr.rai4.TaskExecutor#getExecutedTasks <em>Executed Tasks</em>}</li>
 *   <li>{@link es.unican.istr.rai4.TaskExecutor#getOwnedMeters <em>Owned Meters</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.rai4.Rai4Package#getTaskExecutor()
 * @model
 * @generated
 */
public interface TaskExecutor extends NamedElement, DeployableComponent {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.rai4.Workflow#getOwnedTaskExecutors <em>Owned Task Executors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Workflow)
	 * @see es.unican.istr.rai4.Rai4Package#getTaskExecutor_Owner()
	 * @see es.unican.istr.rai4.Workflow#getOwnedTaskExecutors
	 * @model opposite="ownedTaskExecutors" required="true" transient="false"
	 * @generated
	 */
	Workflow getOwner();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.TaskExecutor#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Workflow value);

	/**
	 * Returns the value of the '<em><b>Executed Tasks</b></em>' reference list.
	 * The list contents are of type {@link es.unican.istr.rai4.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed Tasks</em>' reference list.
	 * @see es.unican.istr.rai4.Rai4Package#getTaskExecutor_ExecutedTasks()
	 * @model required="true"
	 * @generated
	 */
	EList<Task> getExecutedTasks();

	/**
	 * Returns the value of the '<em><b>Owned Meters</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.istr.rai4.TaskProcessingAmountMeter}.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.rai4.TaskProcessingAmountMeter#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Meters</em>' containment reference list.
	 * @see es.unican.istr.rai4.Rai4Package#getTaskExecutor_OwnedMeters()
	 * @see es.unican.istr.rai4.TaskProcessingAmountMeter#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<TaskProcessingAmountMeter> getOwnedMeters();

} // TaskExecutor
