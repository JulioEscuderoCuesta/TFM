/**
 */
package es.unican.istr.pasys.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swarm Deployment Conf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.SwarmDeploymentConf#getNetwork <em>Network</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getSwarmDeploymentConf()
 * @model
 * @generated
 */
public interface SwarmDeploymentConf extends OrchestratorDeploymentConf {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' attribute list.
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getSwarmDeploymentConf_Network()
	 * @model
	 * @generated
	 */
	EList<String> getNetwork();

} // SwarmDeploymentConf
