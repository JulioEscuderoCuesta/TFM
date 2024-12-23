/**
 */
package es.unican.istr.pasys.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.SchedulingService#getWorkflows <em>Workflows</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getSchedulingService()
 * @model abstract="true"
 * @generated
 */
public interface SchedulingService extends PlatformService {
	/**
	 * Returns the value of the '<em><b>Workflows</b></em>' reference list.
	 * The list contents are of type {@link es.unican.istr.pasys.pasys.Workflow}.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.pasys.Workflow#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflows</em>' reference list.
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getSchedulingService_Workflows()
	 * @see es.unican.istr.pasys.pasys.Workflow#getScheduler
	 * @model opposite="scheduler"
	 * @generated
	 */
	EList<Workflow> getWorkflows();

} // SchedulingService
