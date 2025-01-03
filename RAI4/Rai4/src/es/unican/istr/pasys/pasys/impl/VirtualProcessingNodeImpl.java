/**
 */
package es.unican.istr.pasys.pasys.impl;

import es.unican.istr.pasys.pasys.ConfigurationException;
import es.unican.istr.pasys.pasys.DeploymentException;
import es.unican.istr.pasys.pasys.LaunchException;
import es.unican.istr.pasys.pasys.PasysPackage;
import es.unican.istr.pasys.pasys.VirtualProcessingNode;
import es.unican.istr.pasys.pasys.deploymentTools.DeploymentToolsUtils;

import java.io.File;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Processing Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.impl.VirtualProcessingNodeImpl#getExternalIP <em>External IP</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VirtualProcessingNodeImpl extends ProcessingNodeImpl implements VirtualProcessingNode {
	/**
	 * The default value of the '{@link #getExternalIP() <em>External IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalIP()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalIP() <em>External IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalIP()
	 * @generated
	 * @ordered
	 */
	protected String externalIP = EXTERNAL_IP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualProcessingNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.VIRTUAL_PROCESSING_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalIP() {
		return externalIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalIP(String newExternalIP) {
		String oldExternalIP = externalIP;
		externalIP = newExternalIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.VIRTUAL_PROCESSING_NODE__EXTERNAL_IP, oldExternalIP, externalIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.VIRTUAL_PROCESSING_NODE__EXTERNAL_IP:
				return getExternalIP();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PasysPackage.VIRTUAL_PROCESSING_NODE__EXTERNAL_IP:
				setExternalIP((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PasysPackage.VIRTUAL_PROCESSING_NODE__EXTERNAL_IP:
				setExternalIP(EXTERNAL_IP_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PasysPackage.VIRTUAL_PROCESSING_NODE__EXTERNAL_IP:
				return EXTERNAL_IP_EDEFAULT == null ? externalIP != null : !EXTERNAL_IP_EDEFAULT.equals(externalIP);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (externalIP: ");
		result.append(externalIP);
		result.append(')');
		return result.toString();
	}

	public void deployAndLaunch() throws LaunchException, DeploymentException, ConfigurationException {
		int exitValue = 0;
		File tempDir= new File(DeploymentToolsUtils.GEN_DIR+"/"+getId());
		tempDir.mkdir();
		//System.out.println("deployAndLaunch() in "+this.id);
		
			// 1. Create <processorID>.cfg (seg�n la informaci�n almacenada en
		// this.propertyConfigData)
		// 2. Copy Properties to the file
		// Si es en forma de file o de Stream, etc. lo dejamos para cuando
		// sepamos como
		// lo vamos a enviar remotamente.
		// 3.Transfer <processorID>.cfg a this.IP
		
		 /* FileOutputStream f = null; try { f = new
		 * FileOutputStream("temp/"+"Node"+getId()+".cfg"); } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } try { getPropertyConfigData().store(f,
		 * "Node configuration properties"); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 

		// Prepara las carpetas backup del nodo
		// 4 Create the backup folder in scriptFolder
		// 5 Copy all the files in scriptFolder to scriptFolder.backup

		// 6 Create the backup folder in configFolderPath
		// 7 Copy all the files in configFolderPath to configFolderPath.backup */

		// 8 para cada file en legatedConfigFile
		// 8.1 Transfer (via SCP) the file to this.IP
		scpTransfer(getConfigFiles(), getExternalIP());

		// 9 para cada file en launchingScriptFiles
		// 9.1 Transfer (via SCP) the file to this.IP
		scpTransfer(getLaunchingScripts(), getExternalIP());

		// 10 para cada file en launchingScriptFiles
		// 10.1 Transfer (via SCP) the file to this.IP
		scpTransferArtifacts(getCodeFiles(), getExternalIP());
		// 11. para cada file en launchingScriptFiles
		// // 11.1 Invokes remotely (via SSH) the script
		//sshExecution(getLaunchingScripts()); Comentado para despliegue global
	}

	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void bringBackDeployment() {
		
		super.bringBackDeployment();
		try {
			remoteDelete(getConfigFiles(), getExternalIP());
			remoteDelete(getLaunchingScripts(), getExternalIP());
			
		} catch (LaunchException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
} //VirtualProcessingNodeImpl
