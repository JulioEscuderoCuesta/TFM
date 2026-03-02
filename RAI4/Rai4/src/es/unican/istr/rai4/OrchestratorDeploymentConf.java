/**
 */
package es.unican.istr.rai4;

import java.util.Properties;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orchestrator Deployment Conf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.rai4.OrchestratorDeploymentConf#getImage <em>Image</em>}</li>
 *   <li>{@link es.unican.istr.rai4.OrchestratorDeploymentConf#getImageTag <em>Image Tag</em>}</li>
 *   <li>{@link es.unican.istr.rai4.OrchestratorDeploymentConf#getImagePullPolicy <em>Image Pull Policy</em>}</li>
 *   <li>{@link es.unican.istr.rai4.OrchestratorDeploymentConf#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link es.unican.istr.rai4.OrchestratorDeploymentConf#getCommand <em>Command</em>}</li>
 *   <li>{@link es.unican.istr.rai4.OrchestratorDeploymentConf#getArgs <em>Args</em>}</li>
 *   <li>{@link es.unican.istr.rai4.OrchestratorDeploymentConf#getRestartPolicy <em>Restart Policy</em>}</li>
 *   <li>{@link es.unican.istr.rai4.OrchestratorDeploymentConf#getEnv <em>Env</em>}</li>
 *   <li>{@link es.unican.istr.rai4.OrchestratorDeploymentConf#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link es.unican.istr.rai4.OrchestratorDeploymentConf#getPorts <em>Ports</em>}</li>
 *   <li>{@link es.unican.istr.rai4.OrchestratorDeploymentConf#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.rai4.Rai4Package#getOrchestratorDeploymentConf()
 * @model abstract="true"
 * @generated
 */
public interface OrchestratorDeploymentConf extends PlatformServiceDeploymentConf {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see es.unican.istr.rai4.Rai4Package#getOrchestratorDeploymentConf_Image()
	 * @model required="true"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.OrchestratorDeploymentConf#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Image Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Tag</em>' attribute.
	 * @see #setImageTag(String)
	 * @see es.unican.istr.rai4.Rai4Package#getOrchestratorDeploymentConf_ImageTag()
	 * @model
	 * @generated
	 */
	String getImageTag();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.OrchestratorDeploymentConf#getImageTag <em>Image Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Tag</em>' attribute.
	 * @see #getImageTag()
	 * @generated
	 */
	void setImageTag(String value);

	/**
	 * Returns the value of the '<em><b>Image Pull Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Pull Policy</em>' attribute.
	 * @see #setImagePullPolicy(String)
	 * @see es.unican.istr.rai4.Rai4Package#getOrchestratorDeploymentConf_ImagePullPolicy()
	 * @model
	 * @generated
	 */
	String getImagePullPolicy();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.OrchestratorDeploymentConf#getImagePullPolicy <em>Image Pull Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Pull Policy</em>' attribute.
	 * @see #getImagePullPolicy()
	 * @generated
	 */
	void setImagePullPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Replicas</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replicas</em>' attribute.
	 * @see #setReplicas(int)
	 * @see es.unican.istr.rai4.Rai4Package#getOrchestratorDeploymentConf_Replicas()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getReplicas();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.OrchestratorDeploymentConf#getReplicas <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replicas</em>' attribute.
	 * @see #getReplicas()
	 * @generated
	 */
	void setReplicas(int value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see es.unican.istr.rai4.Rai4Package#getOrchestratorDeploymentConf_Command()
	 * @model
	 * @generated
	 */
	String getCommand();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.OrchestratorDeploymentConf#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute.
	 * @see #setArgs(String)
	 * @see es.unican.istr.rai4.Rai4Package#getOrchestratorDeploymentConf_Args()
	 * @model
	 * @generated
	 */
	String getArgs();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.OrchestratorDeploymentConf#getArgs <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' attribute.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(String value);

	/**
	 * Returns the value of the '<em><b>Restart Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restart Policy</em>' attribute.
	 * @see #setRestartPolicy(String)
	 * @see es.unican.istr.rai4.Rai4Package#getOrchestratorDeploymentConf_RestartPolicy()
	 * @model
	 * @generated
	 */
	String getRestartPolicy();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.OrchestratorDeploymentConf#getRestartPolicy <em>Restart Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart Policy</em>' attribute.
	 * @see #getRestartPolicy()
	 * @generated
	 */
	void setRestartPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' attribute.
	 * @see #setEnv(Properties)
	 * @see es.unican.istr.rai4.Rai4Package#getOrchestratorDeploymentConf_Env()
	 * @model dataType="es.unican.istr.rai4.Properties"
	 * @generated
	 */
	Properties getEnv();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.OrchestratorDeploymentConf#getEnv <em>Env</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' attribute.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(Properties value);

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.istr.rai4.Volume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' containment reference list.
	 * @see es.unican.istr.rai4.Rai4Package#getOrchestratorDeploymentConf_Volumes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Volume> getVolumes();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.istr.rai4.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see es.unican.istr.rai4.Rai4Package#getOrchestratorDeploymentConf_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference.
	 * @see #setConstraints(DeploymentConstraints)
	 * @see es.unican.istr.rai4.Rai4Package#getOrchestratorDeploymentConf_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	DeploymentConstraints getConstraints();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.OrchestratorDeploymentConf#getConstraints <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' containment reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(DeploymentConstraints value);

} // OrchestratorDeploymentConf
