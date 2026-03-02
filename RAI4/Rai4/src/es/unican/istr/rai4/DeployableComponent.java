/**
 */
package es.unican.istr.rai4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployable Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.rai4.DeployableComponent#getDeploymentConfig <em>Deployment Config</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.rai4.Rai4Package#getDeployableComponent()
 * @model abstract="true"
 * @generated
 */
public interface DeployableComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Config</em>' containment reference.
	 * @see #setDeploymentConfig(DeploymentConfiguration)
	 * @see es.unican.istr.rai4.Rai4Package#getDeployableComponent_DeploymentConfig()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DeploymentConfiguration getDeploymentConfig();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.DeployableComponent#getDeploymentConfig <em>Deployment Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Config</em>' containment reference.
	 * @see #getDeploymentConfig()
	 * @generated
	 */
	void setDeploymentConfig(DeploymentConfiguration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="es.unican.istr.rai4.ConfigurationException"
	 * @generated
	 */
	void configureDeployment() throws ConfigurationException;

} // DeployableComponent
