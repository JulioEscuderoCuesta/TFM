/**
 */
package es.unican.istr.rai4;

import java.util.Properties;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.rai4.ProcessingNode#getIp <em>Ip</em>}</li>
 *   <li>{@link es.unican.istr.rai4.ProcessingNode#getOs <em>Os</em>}</li>
 *   <li>{@link es.unican.istr.rai4.ProcessingNode#getConcurrencyLevel <em>Concurrency Level</em>}</li>
 *   <li>{@link es.unican.istr.rai4.ProcessingNode#getMemorySize <em>Memory Size</em>}</li>
 *   <li>{@link es.unican.istr.rai4.ProcessingNode#getSpeedFactor <em>Speed Factor</em>}</li>
 *   <li>{@link es.unican.istr.rai4.ProcessingNode#getConfigData <em>Config Data</em>}</li>
 *   <li>{@link es.unican.istr.rai4.ProcessingNode#getUserName <em>User Name</em>}</li>
 *   <li>{@link es.unican.istr.rai4.ProcessingNode#getConnectedTo <em>Connected To</em>}</li>
 *   <li>{@link es.unican.istr.rai4.ProcessingNode#getLaunchingScripts <em>Launching Scripts</em>}</li>
 *   <li>{@link es.unican.istr.rai4.ProcessingNode#getConfigFiles <em>Config Files</em>}</li>
 *   <li>{@link es.unican.istr.rai4.ProcessingNode#getCodeFiles <em>Code Files</em>}</li>
 *   <li>{@link es.unican.istr.rai4.ProcessingNode#getOwnedMeters <em>Owned Meters</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.rai4.Rai4Package#getProcessingNode()
 * @model abstract="true"
 * @generated
 */
public interface ProcessingNode extends PlatformResource {
	/**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see es.unican.istr.rai4.Rai4Package#getProcessingNode_Ip()
	 * @model required="true"
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.ProcessingNode#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(String)
	 * @see es.unican.istr.rai4.Rai4Package#getProcessingNode_Os()
	 * @model
	 * @generated
	 */
	String getOs();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.ProcessingNode#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(String value);

	/**
	 * Returns the value of the '<em><b>Concurrency Level</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency Level</em>' attribute.
	 * @see #setConcurrencyLevel(int)
	 * @see es.unican.istr.rai4.Rai4Package#getProcessingNode_ConcurrencyLevel()
	 * @model default="1"
	 * @generated
	 */
	int getConcurrencyLevel();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.ProcessingNode#getConcurrencyLevel <em>Concurrency Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency Level</em>' attribute.
	 * @see #getConcurrencyLevel()
	 * @generated
	 */
	void setConcurrencyLevel(int value);

	/**
	 * Returns the value of the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Size</em>' attribute.
	 * @see #setMemorySize(int)
	 * @see es.unican.istr.rai4.Rai4Package#getProcessingNode_MemorySize()
	 * @model
	 * @generated
	 */
	int getMemorySize();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.ProcessingNode#getMemorySize <em>Memory Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Size</em>' attribute.
	 * @see #getMemorySize()
	 * @generated
	 */
	void setMemorySize(int value);

	/**
	 * Returns the value of the '<em><b>Speed Factor</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Factor</em>' attribute.
	 * @see #setSpeedFactor(double)
	 * @see es.unican.istr.rai4.Rai4Package#getProcessingNode_SpeedFactor()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	double getSpeedFactor();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.ProcessingNode#getSpeedFactor <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Factor</em>' attribute.
	 * @see #getSpeedFactor()
	 * @generated
	 */
	void setSpeedFactor(double value);

	/**
	 * Returns the value of the '<em><b>Config Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Data</em>' attribute.
	 * @see #setConfigData(Properties)
	 * @see es.unican.istr.rai4.Rai4Package#getProcessingNode_ConfigData()
	 * @model dataType="es.unican.istr.rai4.Properties"
	 * @generated
	 */
	Properties getConfigData();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.ProcessingNode#getConfigData <em>Config Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Data</em>' attribute.
	 * @see #getConfigData()
	 * @generated
	 */
	void setConfigData(Properties value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see es.unican.istr.rai4.Rai4Package#getProcessingNode_UserName()
	 * @model required="true"
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.ProcessingNode#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Connected To</b></em>' reference list.
	 * The list contents are of type {@link es.unican.istr.rai4.Network}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected To</em>' reference list.
	 * @see es.unican.istr.rai4.Rai4Package#getProcessingNode_ConnectedTo()
	 * @model
	 * @generated
	 */
	EList<Network> getConnectedTo();

	/**
	 * Returns the value of the '<em><b>Launching Scripts</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.istr.rai4.DeploymentFileDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launching Scripts</em>' containment reference list.
	 * @see es.unican.istr.rai4.Rai4Package#getProcessingNode_LaunchingScripts()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeploymentFileDescriptor> getLaunchingScripts();

	/**
	 * Returns the value of the '<em><b>Config Files</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.istr.rai4.DeploymentFileDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Files</em>' containment reference list.
	 * @see es.unican.istr.rai4.Rai4Package#getProcessingNode_ConfigFiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeploymentFileDescriptor> getConfigFiles();

	/**
	 * Returns the value of the '<em><b>Code Files</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.istr.rai4.ArtifactDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Files</em>' containment reference list.
	 * @see es.unican.istr.rai4.Rai4Package#getProcessingNode_CodeFiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArtifactDescriptor> getCodeFiles();

	/**
	 * Returns the value of the '<em><b>Owned Meters</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.istr.rai4.NodeHostedMeter}.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.rai4.NodeHostedMeter#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Meters</em>' containment reference list.
	 * @see es.unican.istr.rai4.Rai4Package#getProcessingNode_OwnedMeters()
	 * @see es.unican.istr.rai4.NodeHostedMeter#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<NodeHostedMeter> getOwnedMeters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="es.unican.istr.rai4.ConfigurationException"
	 * @generated
	 */
	void prepareForDeployment() throws ConfigurationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="es.unican.istr.rai4.LaunchException es.unican.istr.rai4.DeploymentException"
	 * @generated
	 */
	void deployAndLaunch() throws LaunchException, DeploymentException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void bringBackConfiguration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void bringBackDeployment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void abortLaunching();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model scriptRequired="true"
	 * @generated
	 */
	void addLaunchingScript(DeploymentFileDescriptor script);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model configFileRequired="true"
	 * @generated
	 */
	void addConfigFile(DeploymentFileDescriptor configFile);

} // ProcessingNode
