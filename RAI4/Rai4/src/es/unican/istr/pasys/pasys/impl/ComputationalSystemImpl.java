/**
 */
package es.unican.istr.pasys.pasys.impl;

import es.unican.istr.pasys.pasys.*;
import es.unican.istr.pasys.pasys.deploymentTools.DeploymentToolsUtils;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computational System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.impl.ComputationalSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.impl.ComputationalSystemImpl#getDate <em>Date</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.impl.ComputationalSystemImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.impl.ComputationalSystemImpl#getTargetPlatformName <em>Target Platform Name</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.impl.ComputationalSystemImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.impl.ComputationalSystemImpl#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.impl.ComputationalSystemImpl#getAuthenticationFiles <em>Authentication Files</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputationalSystemImpl extends MinimalEObjectImpl.Container implements ComputationalSystem {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthors() <em>Authors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthors() <em>Authors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected String authors = AUTHORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetPlatformName() <em>Target Platform Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPlatformName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_PLATFORM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetPlatformName() <em>Target Platform Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPlatformName()
	 * @generated
	 * @ordered
	 */
	protected String targetPlatformName = TARGET_PLATFORM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoc() <em>Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoc()
	 * @generated
	 * @ordered
	 */
	protected static final String DOC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoc() <em>Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoc()
	 * @generated
	 * @ordered
	 */
	protected String doc = DOC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedElements() <em>Owned Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemElement> ownedElements;

	/**
	 * The cached value of the '{@link #getAuthenticationFiles() <em>Authentication Files</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationFiles()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> authenticationFiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputationalSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.COMPUTATIONAL_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.COMPUTATIONAL_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.COMPUTATIONAL_SYSTEM__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthors() {
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthors(String newAuthors) {
		String oldAuthors = authors;
		authors = newAuthors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.COMPUTATIONAL_SYSTEM__AUTHORS, oldAuthors, authors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetPlatformName() {
		return targetPlatformName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetPlatformName(String newTargetPlatformName) {
		String oldTargetPlatformName = targetPlatformName;
		targetPlatformName = newTargetPlatformName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.COMPUTATIONAL_SYSTEM__TARGET_PLATFORM_NAME, oldTargetPlatformName, targetPlatformName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDoc() {
		return doc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoc(String newDoc) {
		String oldDoc = doc;
		doc = newDoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.COMPUTATIONAL_SYSTEM__DOC, oldDoc, doc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemElement> getOwnedElements() {
		if (ownedElements == null) {
			ownedElements = new EObjectContainmentWithInverseEList<SystemElement>(SystemElement.class, this, PasysPackage.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS, PasysPackage.SYSTEM_ELEMENT__OWNER);
		}
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getAuthenticationFiles() {
		if (authenticationFiles == null) {
			authenticationFiles = new EcoreEMap<String,String>(PasysPackage.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, PasysPackage.COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES);
		}
		return authenticationFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedElements()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS:
				return ((InternalEList<?>)getOwnedElements()).basicRemove(otherEnd, msgs);
			case PasysPackage.COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES:
				return ((InternalEList<?>)getAuthenticationFiles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.COMPUTATIONAL_SYSTEM__NAME:
				return getName();
			case PasysPackage.COMPUTATIONAL_SYSTEM__DATE:
				return getDate();
			case PasysPackage.COMPUTATIONAL_SYSTEM__AUTHORS:
				return getAuthors();
			case PasysPackage.COMPUTATIONAL_SYSTEM__TARGET_PLATFORM_NAME:
				return getTargetPlatformName();
			case PasysPackage.COMPUTATIONAL_SYSTEM__DOC:
				return getDoc();
			case PasysPackage.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS:
				return getOwnedElements();
			case PasysPackage.COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES:
				if (coreType) return getAuthenticationFiles();
				else return getAuthenticationFiles().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PasysPackage.COMPUTATIONAL_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case PasysPackage.COMPUTATIONAL_SYSTEM__DATE:
				setDate((String)newValue);
				return;
			case PasysPackage.COMPUTATIONAL_SYSTEM__AUTHORS:
				setAuthors((String)newValue);
				return;
			case PasysPackage.COMPUTATIONAL_SYSTEM__TARGET_PLATFORM_NAME:
				setTargetPlatformName((String)newValue);
				return;
			case PasysPackage.COMPUTATIONAL_SYSTEM__DOC:
				setDoc((String)newValue);
				return;
			case PasysPackage.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS:
				getOwnedElements().clear();
				getOwnedElements().addAll((Collection<? extends SystemElement>)newValue);
				return;
			case PasysPackage.COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES:
				((EStructuralFeature.Setting)getAuthenticationFiles()).set(newValue);
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
			case PasysPackage.COMPUTATIONAL_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PasysPackage.COMPUTATIONAL_SYSTEM__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case PasysPackage.COMPUTATIONAL_SYSTEM__AUTHORS:
				setAuthors(AUTHORS_EDEFAULT);
				return;
			case PasysPackage.COMPUTATIONAL_SYSTEM__TARGET_PLATFORM_NAME:
				setTargetPlatformName(TARGET_PLATFORM_NAME_EDEFAULT);
				return;
			case PasysPackage.COMPUTATIONAL_SYSTEM__DOC:
				setDoc(DOC_EDEFAULT);
				return;
			case PasysPackage.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS:
				getOwnedElements().clear();
				return;
			case PasysPackage.COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES:
				getAuthenticationFiles().clear();
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
			case PasysPackage.COMPUTATIONAL_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PasysPackage.COMPUTATIONAL_SYSTEM__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case PasysPackage.COMPUTATIONAL_SYSTEM__AUTHORS:
				return AUTHORS_EDEFAULT == null ? authors != null : !AUTHORS_EDEFAULT.equals(authors);
			case PasysPackage.COMPUTATIONAL_SYSTEM__TARGET_PLATFORM_NAME:
				return TARGET_PLATFORM_NAME_EDEFAULT == null ? targetPlatformName != null : !TARGET_PLATFORM_NAME_EDEFAULT.equals(targetPlatformName);
			case PasysPackage.COMPUTATIONAL_SYSTEM__DOC:
				return DOC_EDEFAULT == null ? doc != null : !DOC_EDEFAULT.equals(doc);
			case PasysPackage.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS:
				return ownedElements != null && !ownedElements.isEmpty();
			case PasysPackage.COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES:
				return authenticationFiles != null && !authenticationFiles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PasysPackage.COMPUTATIONAL_SYSTEM___DEPLOY_AND_LAUNCH:
				deployAndLaunch();
				return null;
			case PasysPackage.COMPUTATIONAL_SYSTEM___CLEAN_DEPLOYMENT:
				cleanDeployment();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", date: ");
		result.append(date);
		result.append(", authors: ");
		result.append(authors);
		result.append(", targetPlatformName: ");
		result.append(targetPlatformName);
		result.append(", doc: ");
		result.append(doc);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void deployAndLaunch() {

		List<ProcessingNode> processingNodes = 
				new LinkedList<ProcessingNode>();
		List<DeployableComponent> components = 
				new LinkedList<DeployableComponent>();

		// Get the required elements (processingNodes and components)
		for (SystemElement elem : getOwnedElements()) {
			if (elem instanceof ProcessingNode)
				processingNodes.add((ProcessingNode) elem);
			else if (elem instanceof DeployableComponent)
				components.add((DeployableComponent) elem);
		}

		// Order Processing Nodes
		// Required for recovering if there is a DeploymentException
		Collections.sort(processingNodes,new ProcessingNodeComparator());
		
		ProcessingNode currentNode = null;
		try {

			// Prepare nodes for deployment
			for (ProcessingNode node : processingNodes)
				node.prepareForDeployment();
			
			// Generate deployment files 
			for (DeployableComponent comp : components)
				comp.configureDeployment();
			
			// Deploy files and generate the global list of scripts
			List<DeploymentFileDescriptor> globalScriptsList = new LinkedList<DeploymentFileDescriptor>();
			for (ProcessingNode node : processingNodes) {
				currentNode=node;
				node.deployAndLaunch();
				globalScriptsList.addAll(node.getLaunchingScripts());
			}
			
			
			// NEW for kubernetes 21/12/2023
			File tempDir= new File(DeploymentToolsUtils.GEN_DIR+"/"+getLocalNode().getId());
			tempDir.mkdir();
			for (DeploymentFileDescriptor fd: getLocalNode().getConfigFiles()) {
				
				//DeploymentToolsUtils.createFile(fd.getFileContent(), fd.getFilePath()+"\\"+fd.getFileName());
				fd.createFileFromDescriptor(DeploymentToolsUtils.GEN_DIR+"\\"+getLocalNode().getId());
			}
			
			for (DeploymentFileDescriptor fd: getLocalNode().getLaunchingScripts()) {
				//DeploymentToolsUtils.createFile(fd.getFileContent(), fd.getFilePath()+"\\"+fd.getFileName());
				fd.createFileFromDescriptor(DeploymentToolsUtils.GEN_DIR+"\\"+getLocalNode().getId());
			}
			globalScriptsList.addAll(getLocalNode().getLaunchingScripts());
						
			// Execute the global list of scripts		
			sshExecution(globalScriptsList);		

		} catch (ConfigurationException e) {
			for (es.unican.istr.pasys.pasys.ProcessingNode node : processingNodes)
				node.bringBackConfiguration();
			System.out.println("Process Aborted: Configuration Error");
			System.out.println(e.getMessage());

		}catch (DeploymentException e) {
			// Ordenar los nodos de manera que si sabemos en cual se ha 
			// producido el problema, solo invoquemos el bringBack en el.
			Iterator<ProcessingNode> iter = processingNodes.iterator();
			boolean goOn=true;
			while (iter.hasNext() && goOn) {
				ProcessingNode node= iter.next();
				goOn = !(node.getId().equals(currentNode.getId()));
				node.bringBackDeployment();
				
			}
			System.out.println("Process Aborted: Deployment Error");
			System.out.println(e.getMessage());
		} 
		catch (LaunchException e) {
			// TODO No sabemos que hacer aqu�
			for (es.unican.istr.pasys.pasys.ProcessingNode node2 : processingNodes)
				node2.abortLaunching();
			System.out.println("Process Aborted: Launching Error");
			System.out.println(e.getMessage());
		}

	}
	
	private void sshExecution(List<DeploymentFileDescriptor> fileDescriptors) throws LaunchException {
		int exitValue = 0;
		// Order files per type of component
		Collections.sort(fileDescriptors, new DeploymentFileDescriptorImpl.LaunchingFileComparator());
		for (DeploymentFileDescriptor fd : fileDescriptors) {	
			String command = "ssh";
			
			ProcessingNode node = fd.getOwner();
			String ip = null;
			if (node instanceof PhysicalProcessingNode)
				ip = node.getIp();
			else if (node instanceof VirtualProcessingNode)
				ip = ((VirtualProcessingNode) node).getExternalIP();
			
			if (getAuthenticationFiles().containsKey(ip)) {
				String authFile = getAuthenticationFiles().get(ip);
				command+=" -i "+authFile;	
			}
			command += " "+node.getUserName()+"@"+ip+" "+fd.getFilePath()+"/"+fd.getFileName();
			System.out.println("SSH Command: "+command);
			
			/*try {	
				Process process = Runtime
						.getRuntime()
						.exec(command);	
				exitValue = process.waitFor();
			
				if (exitValue!=0) 
					throw new LaunchException("Error launching script in node "+ip);
				
			} catch (IOException | InterruptedException e) {
				throw new LaunchException("Error launching script in node "+ip);
			}*/
		}
	}
	
	
	public class ProcessingNodeComparator implements Comparator<ProcessingNode> {

		@Override
		public int compare(ProcessingNode o1, ProcessingNode o2) {
			return o1.getId().compareTo(o2.getId());
		}

	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void cleanDeployment() {
		List<ProcessingNode> processingNodes = 
				new LinkedList<ProcessingNode>();
		List<DeployableComponent> components = 
				new LinkedList<DeployableComponent>();

		// Get the required elements (processingNodes and components)
		for (SystemElement elem : getOwnedElements()) {
			if (elem instanceof ProcessingNode)
				processingNodes.add((ProcessingNode) elem);
			else if (elem instanceof DeployableComponent)
				components.add((DeployableComponent) elem);
		}
		
		
		try {

			// Prepare nodes for deployment
			for (ProcessingNode node : processingNodes)
				node.prepareForDeployment();
			// Prepare components for deployment
			for (DeployableComponent comp : components)
				comp.configureDeployment();
			
			for (ProcessingNode node: processingNodes) 
				node.bringBackDeployment();

		} catch (ConfigurationException e) {
			for (es.unican.istr.pasys.pasys.ProcessingNode node : processingNodes)
				node.bringBackConfiguration();
			System.out.println(e.getMessage());
			System.out.println("Process Aborted: Configuration Error");
			System.out.println(e.getMessage());

		}
	}

	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	
	private static PhysicalProcessingNode localNode;
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static PhysicalProcessingNode getLocalNode() {
		if (localNode==null) {
			localNode = new PhysicalProcessingNodeImpl();
			localNode.setId("LocalNode");
			localNode.setName("LocalNode");
			localNode.setUserName("");
			try {
				localNode.setIp(InetAddress.getLocalHost().getHostAddress());
			} catch (UnknownHostException e) {
				// TODO Hacer algo 
				
			}
		}
		return localNode;	
	}

} //ComputationalSystemImpl
