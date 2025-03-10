/**
 */
package es.unican.istr.pasys.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Deployment Conf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getArguments <em>Arguments</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getArtifactLocator <em>Artifact Locator</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getArtifactName <em>Artifact Name</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getConfigFolderPath <em>Config Folder Path</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getScriptFolderPath <em>Script Folder Path</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getDataFolderPath <em>Data Folder Path</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getLogFolderPath <em>Log Folder Path</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getCodeFolderPath <em>Code Folder Path</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#isIsRunning <em>Is Running</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getNodeDeploymentConf()
 * @model
 * @generated
 */
public interface NodeDeploymentConf extends PlatformServiceDeploymentConf {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' attribute list.
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getNodeDeploymentConf_Arguments()
	 * @model
	 * @generated
	 */
	EList<String> getArguments();

	/**
	 * Returns the value of the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Locator</em>' attribute.
	 * @see #setArtifactLocator(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getNodeDeploymentConf_ArtifactLocator()
	 * @model
	 * @generated
	 */
	String getArtifactLocator();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getArtifactLocator <em>Artifact Locator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Locator</em>' attribute.
	 * @see #getArtifactLocator()
	 * @generated
	 */
	void setArtifactLocator(String value);

	/**
	 * Returns the value of the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Name</em>' attribute.
	 * @see #setArtifactName(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getNodeDeploymentConf_ArtifactName()
	 * @model
	 * @generated
	 */
	String getArtifactName();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getArtifactName <em>Artifact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Name</em>' attribute.
	 * @see #getArtifactName()
	 * @generated
	 */
	void setArtifactName(String value);

	/**
	 * Returns the value of the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Folder Path</em>' attribute.
	 * @see #setConfigFolderPath(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getNodeDeploymentConf_ConfigFolderPath()
	 * @model
	 * @generated
	 */
	String getConfigFolderPath();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getConfigFolderPath <em>Config Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Folder Path</em>' attribute.
	 * @see #getConfigFolderPath()
	 * @generated
	 */
	void setConfigFolderPath(String value);

	/**
	 * Returns the value of the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Folder Path</em>' attribute.
	 * @see #setScriptFolderPath(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getNodeDeploymentConf_ScriptFolderPath()
	 * @model
	 * @generated
	 */
	String getScriptFolderPath();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getScriptFolderPath <em>Script Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Folder Path</em>' attribute.
	 * @see #getScriptFolderPath()
	 * @generated
	 */
	void setScriptFolderPath(String value);

	/**
	 * Returns the value of the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Folder Path</em>' attribute.
	 * @see #setDataFolderPath(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getNodeDeploymentConf_DataFolderPath()
	 * @model
	 * @generated
	 */
	String getDataFolderPath();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getDataFolderPath <em>Data Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Folder Path</em>' attribute.
	 * @see #getDataFolderPath()
	 * @generated
	 */
	void setDataFolderPath(String value);

	/**
	 * Returns the value of the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Folder Path</em>' attribute.
	 * @see #setLogFolderPath(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getNodeDeploymentConf_LogFolderPath()
	 * @model
	 * @generated
	 */
	String getLogFolderPath();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getLogFolderPath <em>Log Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Folder Path</em>' attribute.
	 * @see #getLogFolderPath()
	 * @generated
	 */
	void setLogFolderPath(String value);

	/**
	 * Returns the value of the '<em><b>Code Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Folder Path</em>' attribute.
	 * @see #setCodeFolderPath(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getNodeDeploymentConf_CodeFolderPath()
	 * @model
	 * @generated
	 */
	String getCodeFolderPath();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getCodeFolderPath <em>Code Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Folder Path</em>' attribute.
	 * @see #getCodeFolderPath()
	 * @generated
	 */
	void setCodeFolderPath(String value);

	/**
	 * Returns the value of the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Running</em>' attribute.
	 * @see #setIsRunning(boolean)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getNodeDeploymentConf_IsRunning()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsRunning();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#isIsRunning <em>Is Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Running</em>' attribute.
	 * @see #isIsRunning()
	 * @generated
	 */
	void setIsRunning(boolean value);

} // NodeDeploymentConf
