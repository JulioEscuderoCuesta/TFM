/**
 */
package es.unican.istr.pasys.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedulable Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.SchedulableSet#getWorkflows <em>Workflows</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getSchedulableSet()
 * @model
 * @generated
 */
public interface SchedulableSet extends SystemElement {
	/**
	 * Returns the value of the '<em><b>Workflows</b></em>' reference list.
	 * The list contents are of type {@link es.unican.istr.pasys.pasys.Workflow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflows</em>' reference list.
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getSchedulableSet_Workflows()
	 * @model required="true"
	 * @generated
	 */
	EList<Workflow> getWorkflows();

} // SchedulableSet
