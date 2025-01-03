/**
 */
package es.unican.istr.pasys.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.Workflow#getOwnedStreamData <em>Owned Stream Data</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.Workflow#getOwnedTasks <em>Owned Tasks</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.Workflow#getRootTask <em>Root Task</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.Workflow#getOwnedTaskExecutors <em>Owned Task Executors</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.Workflow#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.Workflow#getOwnedMeters <em>Owned Meters</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends SystemElement, DeployableComponent {
	/**
	 * Returns the value of the '<em><b>Owned Stream Data</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.istr.pasys.pasys.WorkflowStreamData}.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.pasys.WorkflowStreamData#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Stream Data</em>' containment reference list.
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getWorkflow_OwnedStreamData()
	 * @see es.unican.istr.pasys.pasys.WorkflowStreamData#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<WorkflowStreamData> getOwnedStreamData();

	/**
	 * Returns the value of the '<em><b>Owned Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.istr.pasys.pasys.Task}.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.pasys.Task#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tasks</em>' containment reference list.
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getWorkflow_OwnedTasks()
	 * @see es.unican.istr.pasys.pasys.Task#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Task> getOwnedTasks();

	/**
	 * Returns the value of the '<em><b>Root Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Task</em>' reference.
	 * @see #setRootTask(Task)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getWorkflow_RootTask()
	 * @model required="true"
	 * @generated
	 */
	Task getRootTask();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.Workflow#getRootTask <em>Root Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Task</em>' reference.
	 * @see #getRootTask()
	 * @generated
	 */
	void setRootTask(Task value);

	/**
	 * Returns the value of the '<em><b>Owned Task Executors</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.istr.pasys.pasys.TaskExecutor}.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.pasys.TaskExecutor#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Task Executors</em>' containment reference list.
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getWorkflow_OwnedTaskExecutors()
	 * @see es.unican.istr.pasys.pasys.TaskExecutor#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<TaskExecutor> getOwnedTaskExecutors();

	/**
	 * Returns the value of the '<em><b>Scheduler</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.pasys.SchedulingService#getWorkflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler</em>' reference.
	 * @see #setScheduler(SchedulingService)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getWorkflow_Scheduler()
	 * @see es.unican.istr.pasys.pasys.SchedulingService#getWorkflows
	 * @model opposite="workflows" required="true"
	 * @generated
	 */
	SchedulingService getScheduler();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.Workflow#getScheduler <em>Scheduler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler</em>' reference.
	 * @see #getScheduler()
	 * @generated
	 */
	void setScheduler(SchedulingService value);

	/**
	 * Returns the value of the '<em><b>Owned Meters</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.istr.pasys.pasys.WorkflowLatencyMeter}.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.pasys.WorkflowLatencyMeter#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Meters</em>' containment reference list.
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getWorkflow_OwnedMeters()
	 * @see es.unican.istr.pasys.pasys.WorkflowLatencyMeter#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<WorkflowLatencyMeter> getOwnedMeters();

} // Workflow
