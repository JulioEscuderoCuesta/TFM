/**
 */
package es.unican.istr.pasys.pasys;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.unican.istr.pasys.pasys.PasysFactory
 * @model kind="package"
 * @generated
 */
public interface PasysPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pasys";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.unican.es/istr/pasys";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pasys";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PasysPackage eINSTANCE = es.unican.istr.pasys.pasys.impl.PasysPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.ComputationalSystemImpl <em>Computational System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.ComputationalSystemImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getComputationalSystem()
	 * @generated
	 */
	int COMPUTATIONAL_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM__DATE = 1;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM__AUTHORS = 2;

	/**
	 * The feature id for the '<em><b>Target Platform Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM__TARGET_PLATFORM_NAME = 3;

	/**
	 * The feature id for the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM__DOC = 4;

	/**
	 * The feature id for the '<em><b>Owned Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS = 5;

	/**
	 * The feature id for the '<em><b>Authentication Files</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES = 6;

	/**
	 * The number of structural features of the '<em>Computational System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Deploy And Launch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM___DEPLOY_AND_LAUNCH = 0;

	/**
	 * The operation id for the '<em>Clean Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM___CLEAN_DEPLOYMENT = 1;

	/**
	 * The number of operations of the '<em>Computational System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_SYSTEM_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.NamedElementImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.SystemElementImpl <em>System Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.SystemElementImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getSystemElement()
	 * @generated
	 */
	int SYSTEM_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT__OWNER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.PlatformResourceImpl <em>Platform Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.PlatformResourceImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getPlatformResource()
	 * @generated
	 */
	int PLATFORM_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_RESOURCE__NAME = SYSTEM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_RESOURCE__ID = SYSTEM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_RESOURCE__OWNER = SYSTEM_ELEMENT__OWNER;

	/**
	 * The number of structural features of the '<em>Platform Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_RESOURCE_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Platform Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_RESOURCE_OPERATION_COUNT = SYSTEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.ProcessingNodeImpl <em>Processing Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.ProcessingNodeImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getProcessingNode()
	 * @generated
	 */
	int PROCESSING_NODE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__NAME = PLATFORM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__ID = PLATFORM_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__OWNER = PLATFORM_RESOURCE__OWNER;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__IP = PLATFORM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__OS = PLATFORM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Concurrency Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__CONCURRENCY_LEVEL = PLATFORM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__MEMORY_SIZE = PLATFORM_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__SPEED_FACTOR = PLATFORM_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Config Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__CONFIG_DATA = PLATFORM_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__USER_NAME = PLATFORM_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__CONNECTED_TO = PLATFORM_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Launching Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__LAUNCHING_SCRIPTS = PLATFORM_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Config Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__CONFIG_FILES = PLATFORM_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Code Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__CODE_FILES = PLATFORM_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE__OWNED_METERS = PLATFORM_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Processing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_FEATURE_COUNT = PLATFORM_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Prepare For Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE___PREPARE_FOR_DEPLOYMENT = PLATFORM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Deploy And Launch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE___DEPLOY_AND_LAUNCH = PLATFORM_RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Bring Back Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE___BRING_BACK_CONFIGURATION = PLATFORM_RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Bring Back Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE___BRING_BACK_DEPLOYMENT = PLATFORM_RESOURCE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Abort Launching</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE___ABORT_LAUNCHING = PLATFORM_RESOURCE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Launching Script</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE___ADD_LAUNCHING_SCRIPT__DEPLOYMENTFILEDESCRIPTOR = PLATFORM_RESOURCE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Config File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE___ADD_CONFIG_FILE__DEPLOYMENTFILEDESCRIPTOR = PLATFORM_RESOURCE_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Processing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_OPERATION_COUNT = PLATFORM_RESOURCE_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.PhysicalProcessingNodeImpl <em>Physical Processing Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.PhysicalProcessingNodeImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getPhysicalProcessingNode()
	 * @generated
	 */
	int PHYSICAL_PROCESSING_NODE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__NAME = PROCESSING_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__ID = PROCESSING_NODE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__OWNER = PROCESSING_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__IP = PROCESSING_NODE__IP;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__OS = PROCESSING_NODE__OS;

	/**
	 * The feature id for the '<em><b>Concurrency Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__CONCURRENCY_LEVEL = PROCESSING_NODE__CONCURRENCY_LEVEL;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__MEMORY_SIZE = PROCESSING_NODE__MEMORY_SIZE;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__SPEED_FACTOR = PROCESSING_NODE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Config Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__CONFIG_DATA = PROCESSING_NODE__CONFIG_DATA;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__USER_NAME = PROCESSING_NODE__USER_NAME;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__CONNECTED_TO = PROCESSING_NODE__CONNECTED_TO;

	/**
	 * The feature id for the '<em><b>Launching Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__LAUNCHING_SCRIPTS = PROCESSING_NODE__LAUNCHING_SCRIPTS;

	/**
	 * The feature id for the '<em><b>Config Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__CONFIG_FILES = PROCESSING_NODE__CONFIG_FILES;

	/**
	 * The feature id for the '<em><b>Code Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__CODE_FILES = PROCESSING_NODE__CODE_FILES;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE__OWNED_METERS = PROCESSING_NODE__OWNED_METERS;

	/**
	 * The number of structural features of the '<em>Physical Processing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE_FEATURE_COUNT = PROCESSING_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Prepare For Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE___PREPARE_FOR_DEPLOYMENT = PROCESSING_NODE___PREPARE_FOR_DEPLOYMENT;

	/**
	 * The operation id for the '<em>Deploy And Launch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE___DEPLOY_AND_LAUNCH = PROCESSING_NODE___DEPLOY_AND_LAUNCH;

	/**
	 * The operation id for the '<em>Bring Back Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE___BRING_BACK_CONFIGURATION = PROCESSING_NODE___BRING_BACK_CONFIGURATION;

	/**
	 * The operation id for the '<em>Bring Back Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE___BRING_BACK_DEPLOYMENT = PROCESSING_NODE___BRING_BACK_DEPLOYMENT;

	/**
	 * The operation id for the '<em>Abort Launching</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE___ABORT_LAUNCHING = PROCESSING_NODE___ABORT_LAUNCHING;

	/**
	 * The operation id for the '<em>Add Launching Script</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE___ADD_LAUNCHING_SCRIPT__DEPLOYMENTFILEDESCRIPTOR = PROCESSING_NODE___ADD_LAUNCHING_SCRIPT__DEPLOYMENTFILEDESCRIPTOR;

	/**
	 * The operation id for the '<em>Add Config File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE___ADD_CONFIG_FILE__DEPLOYMENTFILEDESCRIPTOR = PROCESSING_NODE___ADD_CONFIG_FILE__DEPLOYMENTFILEDESCRIPTOR;

	/**
	 * The number of operations of the '<em>Physical Processing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PROCESSING_NODE_OPERATION_COUNT = PROCESSING_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.VirtualProcessingNodeImpl <em>Virtual Processing Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.VirtualProcessingNodeImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getVirtualProcessingNode()
	 * @generated
	 */
	int VIRTUAL_PROCESSING_NODE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__NAME = PROCESSING_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__ID = PROCESSING_NODE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__OWNER = PROCESSING_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__IP = PROCESSING_NODE__IP;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__OS = PROCESSING_NODE__OS;

	/**
	 * The feature id for the '<em><b>Concurrency Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__CONCURRENCY_LEVEL = PROCESSING_NODE__CONCURRENCY_LEVEL;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__MEMORY_SIZE = PROCESSING_NODE__MEMORY_SIZE;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__SPEED_FACTOR = PROCESSING_NODE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Config Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__CONFIG_DATA = PROCESSING_NODE__CONFIG_DATA;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__USER_NAME = PROCESSING_NODE__USER_NAME;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__CONNECTED_TO = PROCESSING_NODE__CONNECTED_TO;

	/**
	 * The feature id for the '<em><b>Launching Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__LAUNCHING_SCRIPTS = PROCESSING_NODE__LAUNCHING_SCRIPTS;

	/**
	 * The feature id for the '<em><b>Config Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__CONFIG_FILES = PROCESSING_NODE__CONFIG_FILES;

	/**
	 * The feature id for the '<em><b>Code Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__CODE_FILES = PROCESSING_NODE__CODE_FILES;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__OWNED_METERS = PROCESSING_NODE__OWNED_METERS;

	/**
	 * The feature id for the '<em><b>External IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE__EXTERNAL_IP = PROCESSING_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Virtual Processing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE_FEATURE_COUNT = PROCESSING_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Prepare For Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE___PREPARE_FOR_DEPLOYMENT = PROCESSING_NODE___PREPARE_FOR_DEPLOYMENT;

	/**
	 * The operation id for the '<em>Deploy And Launch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE___DEPLOY_AND_LAUNCH = PROCESSING_NODE___DEPLOY_AND_LAUNCH;

	/**
	 * The operation id for the '<em>Bring Back Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE___BRING_BACK_CONFIGURATION = PROCESSING_NODE___BRING_BACK_CONFIGURATION;

	/**
	 * The operation id for the '<em>Bring Back Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE___BRING_BACK_DEPLOYMENT = PROCESSING_NODE___BRING_BACK_DEPLOYMENT;

	/**
	 * The operation id for the '<em>Abort Launching</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE___ABORT_LAUNCHING = PROCESSING_NODE___ABORT_LAUNCHING;

	/**
	 * The operation id for the '<em>Add Launching Script</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE___ADD_LAUNCHING_SCRIPT__DEPLOYMENTFILEDESCRIPTOR = PROCESSING_NODE___ADD_LAUNCHING_SCRIPT__DEPLOYMENTFILEDESCRIPTOR;

	/**
	 * The operation id for the '<em>Add Config File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE___ADD_CONFIG_FILE__DEPLOYMENTFILEDESCRIPTOR = PROCESSING_NODE___ADD_CONFIG_FILE__DEPLOYMENTFILEDESCRIPTOR;

	/**
	 * The number of operations of the '<em>Virtual Processing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PROCESSING_NODE_OPERATION_COUNT = PROCESSING_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.AWSVirtualProcessingNodeImpl <em>AWS Virtual Processing Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.AWSVirtualProcessingNodeImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getAWSVirtualProcessingNode()
	 * @generated
	 */
	int AWS_VIRTUAL_PROCESSING_NODE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__NAME = VIRTUAL_PROCESSING_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__ID = VIRTUAL_PROCESSING_NODE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__OWNER = VIRTUAL_PROCESSING_NODE__OWNER;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__IP = VIRTUAL_PROCESSING_NODE__IP;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__OS = VIRTUAL_PROCESSING_NODE__OS;

	/**
	 * The feature id for the '<em><b>Concurrency Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__CONCURRENCY_LEVEL = VIRTUAL_PROCESSING_NODE__CONCURRENCY_LEVEL;

	/**
	 * The feature id for the '<em><b>Memory Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__MEMORY_SIZE = VIRTUAL_PROCESSING_NODE__MEMORY_SIZE;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__SPEED_FACTOR = VIRTUAL_PROCESSING_NODE__SPEED_FACTOR;

	/**
	 * The feature id for the '<em><b>Config Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__CONFIG_DATA = VIRTUAL_PROCESSING_NODE__CONFIG_DATA;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__USER_NAME = VIRTUAL_PROCESSING_NODE__USER_NAME;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__CONNECTED_TO = VIRTUAL_PROCESSING_NODE__CONNECTED_TO;

	/**
	 * The feature id for the '<em><b>Launching Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__LAUNCHING_SCRIPTS = VIRTUAL_PROCESSING_NODE__LAUNCHING_SCRIPTS;

	/**
	 * The feature id for the '<em><b>Config Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__CONFIG_FILES = VIRTUAL_PROCESSING_NODE__CONFIG_FILES;

	/**
	 * The feature id for the '<em><b>Code Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__CODE_FILES = VIRTUAL_PROCESSING_NODE__CODE_FILES;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__OWNED_METERS = VIRTUAL_PROCESSING_NODE__OWNED_METERS;

	/**
	 * The feature id for the '<em><b>External IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__EXTERNAL_IP = VIRTUAL_PROCESSING_NODE__EXTERNAL_IP;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__VPC = VIRTUAL_PROCESSING_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Net</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__SUB_NET = VIRTUAL_PROCESSING_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key Pair</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__KEY_PAIR = VIRTUAL_PROCESSING_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Security Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__SECURITY_GROUP = VIRTUAL_PROCESSING_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>AMI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__AMI = VIRTUAL_PROCESSING_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE__INSTANCE_TYPE = VIRTUAL_PROCESSING_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>AWS Virtual Processing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE_FEATURE_COUNT = VIRTUAL_PROCESSING_NODE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Prepare For Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE___PREPARE_FOR_DEPLOYMENT = VIRTUAL_PROCESSING_NODE___PREPARE_FOR_DEPLOYMENT;

	/**
	 * The operation id for the '<em>Deploy And Launch</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE___DEPLOY_AND_LAUNCH = VIRTUAL_PROCESSING_NODE___DEPLOY_AND_LAUNCH;

	/**
	 * The operation id for the '<em>Bring Back Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE___BRING_BACK_CONFIGURATION = VIRTUAL_PROCESSING_NODE___BRING_BACK_CONFIGURATION;

	/**
	 * The operation id for the '<em>Bring Back Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE___BRING_BACK_DEPLOYMENT = VIRTUAL_PROCESSING_NODE___BRING_BACK_DEPLOYMENT;

	/**
	 * The operation id for the '<em>Abort Launching</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE___ABORT_LAUNCHING = VIRTUAL_PROCESSING_NODE___ABORT_LAUNCHING;

	/**
	 * The operation id for the '<em>Add Launching Script</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE___ADD_LAUNCHING_SCRIPT__DEPLOYMENTFILEDESCRIPTOR = VIRTUAL_PROCESSING_NODE___ADD_LAUNCHING_SCRIPT__DEPLOYMENTFILEDESCRIPTOR;

	/**
	 * The operation id for the '<em>Add Config File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE___ADD_CONFIG_FILE__DEPLOYMENTFILEDESCRIPTOR = VIRTUAL_PROCESSING_NODE___ADD_CONFIG_FILE__DEPLOYMENTFILEDESCRIPTOR;

	/**
	 * The number of operations of the '<em>AWS Virtual Processing Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_VIRTUAL_PROCESSING_NODE_OPERATION_COUNT = VIRTUAL_PROCESSING_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.ProcessingResourceClusterImpl <em>Processing Resource Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.ProcessingResourceClusterImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getProcessingResourceCluster()
	 * @generated
	 */
	int PROCESSING_RESOURCE_CLUSTER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_CLUSTER__NAME = PLATFORM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_CLUSTER__ID = PLATFORM_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_CLUSTER__OWNER = PLATFORM_RESOURCE__OWNER;

	/**
	 * The number of structural features of the '<em>Processing Resource Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_CLUSTER_FEATURE_COUNT = PLATFORM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Processing Resource Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_CLUSTER_OPERATION_COUNT = PLATFORM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.ProcessingNodeClusterImpl <em>Processing Node Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.ProcessingNodeClusterImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getProcessingNodeCluster()
	 * @generated
	 */
	int PROCESSING_NODE_CLUSTER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_CLUSTER__NAME = PROCESSING_RESOURCE_CLUSTER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_CLUSTER__ID = PROCESSING_RESOURCE_CLUSTER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_CLUSTER__OWNER = PROCESSING_RESOURCE_CLUSTER__OWNER;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_CLUSTER__NODES = PROCESSING_RESOURCE_CLUSTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Processing Node Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_CLUSTER_FEATURE_COUNT = PROCESSING_RESOURCE_CLUSTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Processing Node Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_CLUSTER_OPERATION_COUNT = PROCESSING_RESOURCE_CLUSTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.OrchestrationClusterImpl <em>Orchestration Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.OrchestrationClusterImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getOrchestrationCluster()
	 * @generated
	 */
	int ORCHESTRATION_CLUSTER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_CLUSTER__NAME = PROCESSING_RESOURCE_CLUSTER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_CLUSTER__ID = PROCESSING_RESOURCE_CLUSTER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_CLUSTER__OWNER = PROCESSING_RESOURCE_CLUSTER__OWNER;

	/**
	 * The number of structural features of the '<em>Orchestration Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_CLUSTER_FEATURE_COUNT = PROCESSING_RESOURCE_CLUSTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Orchestration Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_CLUSTER_OPERATION_COUNT = PROCESSING_RESOURCE_CLUSTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.KubernetesClusterImpl <em>Kubernetes Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.KubernetesClusterImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getKubernetesCluster()
	 * @generated
	 */
	int KUBERNETES_CLUSTER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_CLUSTER__NAME = ORCHESTRATION_CLUSTER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_CLUSTER__ID = ORCHESTRATION_CLUSTER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_CLUSTER__OWNER = ORCHESTRATION_CLUSTER__OWNER;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_CLUSTER__API_VERSION = ORCHESTRATION_CLUSTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kube Config Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_CLUSTER__KUBE_CONFIG_PATH = ORCHESTRATION_CLUSTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Kubernetes Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_CLUSTER_FEATURE_COUNT = ORCHESTRATION_CLUSTER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Kubernetes Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_CLUSTER_OPERATION_COUNT = ORCHESTRATION_CLUSTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.SwarmClusterImpl <em>Swarm Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.SwarmClusterImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getSwarmCluster()
	 * @generated
	 */
	int SWARM_CLUSTER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_CLUSTER__NAME = ORCHESTRATION_CLUSTER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_CLUSTER__ID = ORCHESTRATION_CLUSTER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_CLUSTER__OWNER = ORCHESTRATION_CLUSTER__OWNER;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_CLUSTER__IP = ORCHESTRATION_CLUSTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_CLUSTER__PORT = ORCHESTRATION_CLUSTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_CLUSTER__USER = ORCHESTRATION_CLUSTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Swarm Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_CLUSTER_FEATURE_COUNT = ORCHESTRATION_CLUSTER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Swarm Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_CLUSTER_OPERATION_COUNT = ORCHESTRATION_CLUSTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.NomadClusterImpl <em>Nomad Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.NomadClusterImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNomadCluster()
	 * @generated
	 */
	int NOMAD_CLUSTER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_CLUSTER__NAME = ORCHESTRATION_CLUSTER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_CLUSTER__ID = ORCHESTRATION_CLUSTER__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_CLUSTER__OWNER = ORCHESTRATION_CLUSTER__OWNER;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_CLUSTER__IP = ORCHESTRATION_CLUSTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_CLUSTER__PORT = ORCHESTRATION_CLUSTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Nomad Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_CLUSTER_FEATURE_COUNT = ORCHESTRATION_CLUSTER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Nomad Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_CLUSTER_OPERATION_COUNT = ORCHESTRATION_CLUSTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.NetworkImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = PLATFORM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ID = PLATFORM_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__OWNER = PLATFORM_RESOURCE__OWNER;

	/**
	 * The feature id for the '<em><b>Bandwith</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__BANDWITH = PLATFORM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = PLATFORM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = PLATFORM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.PlatformServiceImpl <em>Platform Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.PlatformServiceImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getPlatformService()
	 * @generated
	 */
	int PLATFORM_SERVICE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__NAME = PLATFORM_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__ID = PLATFORM_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__OWNER = PLATFORM_RESOURCE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__DEPLOYMENT_CONFIG = PLATFORM_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE__HOST = PLATFORM_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Platform Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE_FEATURE_COUNT = PLATFORM_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE___CONFIGURE_DEPLOYMENT = PLATFORM_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Platform Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE_OPERATION_COUNT = PLATFORM_RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.SerializationServiceImpl <em>Serialization Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.SerializationServiceImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getSerializationService()
	 * @generated
	 */
	int SERIALIZATION_SERVICE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVICE__NAME = PLATFORM_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVICE__ID = PLATFORM_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVICE__OWNER = PLATFORM_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVICE__DEPLOYMENT_CONFIG = PLATFORM_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVICE__HOST = PLATFORM_SERVICE__HOST;

	/**
	 * The number of structural features of the '<em>Serialization Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVICE_FEATURE_COUNT = PLATFORM_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVICE___CONFIGURE_DEPLOYMENT = PLATFORM_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Serialization Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZATION_SERVICE_OPERATION_COUNT = PLATFORM_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.DistributionServiceImpl <em>Distribution Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.DistributionServiceImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getDistributionService()
	 * @generated
	 */
	int DISTRIBUTION_SERVICE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVICE__NAME = PLATFORM_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVICE__ID = PLATFORM_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVICE__OWNER = PLATFORM_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVICE__DEPLOYMENT_CONFIG = PLATFORM_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVICE__HOST = PLATFORM_SERVICE__HOST;

	/**
	 * The number of structural features of the '<em>Distribution Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVICE_FEATURE_COUNT = PLATFORM_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVICE___CONFIGURE_DEPLOYMENT = PLATFORM_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Distribution Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_SERVICE_OPERATION_COUNT = PLATFORM_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.CommunicationServiceImpl <em>Communication Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.CommunicationServiceImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getCommunicationService()
	 * @generated
	 */
	int COMMUNICATION_SERVICE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE__NAME = PLATFORM_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE__ID = PLATFORM_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE__OWNER = PLATFORM_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE__DEPLOYMENT_CONFIG = PLATFORM_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE__HOST = PLATFORM_SERVICE__HOST;

	/**
	 * The number of structural features of the '<em>Communication Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE_FEATURE_COUNT = PLATFORM_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE___CONFIGURE_DEPLOYMENT = PLATFORM_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Communication Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE_OPERATION_COUNT = PLATFORM_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.SchedulingServiceImpl <em>Scheduling Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.SchedulingServiceImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getSchedulingService()
	 * @generated
	 */
	int SCHEDULING_SERVICE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVICE__NAME = PLATFORM_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVICE__ID = PLATFORM_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVICE__OWNER = PLATFORM_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVICE__DEPLOYMENT_CONFIG = PLATFORM_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVICE__HOST = PLATFORM_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVICE__WORKFLOWS = PLATFORM_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scheduling Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVICE_FEATURE_COUNT = PLATFORM_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVICE___CONFIGURE_DEPLOYMENT = PLATFORM_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Scheduling Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_SERVICE_OPERATION_COUNT = PLATFORM_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.SecurityServiceImpl <em>Security Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.SecurityServiceImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getSecurityService()
	 * @generated
	 */
	int SECURITY_SERVICE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE__NAME = PLATFORM_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE__ID = PLATFORM_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE__OWNER = PLATFORM_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE__DEPLOYMENT_CONFIG = PLATFORM_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE__HOST = PLATFORM_SERVICE__HOST;

	/**
	 * The number of structural features of the '<em>Security Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE_FEATURE_COUNT = PLATFORM_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE___CONFIGURE_DEPLOYMENT = PLATFORM_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Security Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE_OPERATION_COUNT = PLATFORM_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.PersistenceServiceImpl <em>Persistence Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.PersistenceServiceImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getPersistenceService()
	 * @generated
	 */
	int PERSISTENCE_SERVICE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE__NAME = PLATFORM_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE__ID = PLATFORM_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE__OWNER = PLATFORM_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE__DEPLOYMENT_CONFIG = PLATFORM_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE__HOST = PLATFORM_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Logging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE__LOGGING = PLATFORM_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Passwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE__PASSWD = PLATFORM_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE__PORT = PLATFORM_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Persistence Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE_FEATURE_COUNT = PLATFORM_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE___CONFIGURE_DEPLOYMENT = PLATFORM_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Persistence Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_SERVICE_OPERATION_COUNT = PLATFORM_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.MonitoringServiceImpl <em>Monitoring Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.MonitoringServiceImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getMonitoringService()
	 * @generated
	 */
	int MONITORING_SERVICE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE__NAME = PLATFORM_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE__ID = PLATFORM_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE__OWNER = PLATFORM_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE__DEPLOYMENT_CONFIG = PLATFORM_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE__HOST = PLATFORM_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Monitorized Meters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE__MONITORIZED_METERS = PLATFORM_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Monitoring Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE_FEATURE_COUNT = PLATFORM_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE___CONFIGURE_DEPLOYMENT = PLATFORM_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Monitoring Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_SERVICE_OPERATION_COUNT = PLATFORM_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.AVROServiceImpl <em>AVRO Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.AVROServiceImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getAVROService()
	 * @generated
	 */
	int AVRO_SERVICE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVICE__NAME = SERIALIZATION_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVICE__ID = SERIALIZATION_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVICE__OWNER = SERIALIZATION_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVICE__DEPLOYMENT_CONFIG = SERIALIZATION_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVICE__HOST = SERIALIZATION_SERVICE__HOST;

	/**
	 * The number of structural features of the '<em>AVRO Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVICE_FEATURE_COUNT = SERIALIZATION_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVICE___CONFIGURE_DEPLOYMENT = SERIALIZATION_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>AVRO Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVRO_SERVICE_OPERATION_COUNT = SERIALIZATION_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.ZookeeperServiceImpl <em>Zookeeper Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.ZookeeperServiceImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getZookeeperService()
	 * @generated
	 */
	int ZOOKEEPER_SERVICE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__NAME = DISTRIBUTION_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__ID = DISTRIBUTION_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__OWNER = DISTRIBUTION_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__DEPLOYMENT_CONFIG = DISTRIBUTION_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__HOST = DISTRIBUTION_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Server Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__SERVER_ID = DISTRIBUTION_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Client Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__CLIENT_PORT = DISTRIBUTION_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tick Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__TICK_TIME = DISTRIBUTION_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Leader Servers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__LEADER_SERVERS = DISTRIBUTION_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Peer Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__PEER_PORT = DISTRIBUTION_SERVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Leader Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__LEADER_PORT = DISTRIBUTION_SERVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Init Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__INIT_LIMIT = DISTRIBUTION_SERVICE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sync Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE__SYNC_LIMIT = DISTRIBUTION_SERVICE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Zookeeper Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE_FEATURE_COUNT = DISTRIBUTION_SERVICE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE___CONFIGURE_DEPLOYMENT = DISTRIBUTION_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Zookeeper Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOKEEPER_SERVICE_OPERATION_COUNT = DISTRIBUTION_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.KafkaServiceImpl <em>Kafka Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.KafkaServiceImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getKafkaService()
	 * @generated
	 */
	int KAFKA_SERVICE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__NAME = COMMUNICATION_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__ID = COMMUNICATION_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__OWNER = COMMUNICATION_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__DEPLOYMENT_CONFIG = COMMUNICATION_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__HOST = COMMUNICATION_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Comm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__COMM_ID = COMMUNICATION_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Client Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__CLIENT_PORT = COMMUNICATION_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Zookeeper Connect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__ZOOKEEPER_CONNECT = COMMUNICATION_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Zookeeper Connection Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__ZOOKEEPER_CONNECTION_TIMEOUT = COMMUNICATION_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Listeners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__LISTENERS = COMMUNICATION_SERVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Advertised Listeners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__ADVERTISED_LISTENERS = COMMUNICATION_SERVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Auto Create Topic Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__AUTO_CREATE_TOPIC_ENABLE = COMMUNICATION_SERVICE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Delete Topic Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__DELETE_TOPIC_ENABLE = COMMUNICATION_SERVICE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Num Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__NUM_PARTITIONS = COMMUNICATION_SERVICE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Num Recovery Threads Per Data Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__NUM_RECOVERY_THREADS_PER_DATA_DIR = COMMUNICATION_SERVICE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Log Flush Interval Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__LOG_FLUSH_INTERVAL_MESSAGES = COMMUNICATION_SERVICE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Log Flush Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__LOG_FLUSH_INTERVAL = COMMUNICATION_SERVICE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Num Network Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__NUM_NETWORK_THREADS = COMMUNICATION_SERVICE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Num IO Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__NUM_IO_THREADS = COMMUNICATION_SERVICE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Socket Send Buffer Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__SOCKET_SEND_BUFFER_BYTES = COMMUNICATION_SERVICE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Socket Receive Buffer Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__SOCKET_RECEIVE_BUFFER_BYTES = COMMUNICATION_SERVICE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Socket Request Max Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE__SOCKET_REQUEST_MAX_BYTES = COMMUNICATION_SERVICE_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Kafka Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE_FEATURE_COUNT = COMMUNICATION_SERVICE_FEATURE_COUNT + 17;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE___CONFIGURE_DEPLOYMENT = COMMUNICATION_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Kafka Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_SERVICE_OPERATION_COUNT = COMMUNICATION_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.NodeSchedulerImpl <em>Node Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.NodeSchedulerImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNodeScheduler()
	 * @generated
	 */
	int NODE_SCHEDULER = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__NAME = SCHEDULING_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__ID = SCHEDULING_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__OWNER = SCHEDULING_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__DEPLOYMENT_CONFIG = SCHEDULING_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__HOST = SCHEDULING_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER__WORKFLOWS = SCHEDULING_SERVICE__WORKFLOWS;

	/**
	 * The number of structural features of the '<em>Node Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER_FEATURE_COUNT = SCHEDULING_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER___CONFIGURE_DEPLOYMENT = SCHEDULING_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Node Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_SCHEDULER_OPERATION_COUNT = SCHEDULING_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.SparkServiceImpl <em>Spark Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.SparkServiceImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getSparkService()
	 * @generated
	 */
	int SPARK_SERVICE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__NAME = SCHEDULING_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__ID = SCHEDULING_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__OWNER = SCHEDULING_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__DEPLOYMENT_CONFIG = SCHEDULING_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__HOST = SCHEDULING_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__WORKFLOWS = SCHEDULING_SERVICE__WORKFLOWS;

	/**
	 * The feature id for the '<em><b>Load</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__LOAD = SCHEDULING_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Driver Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__DRIVER_CORES = SCHEDULING_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Driver Max Result Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__DRIVER_MAX_RESULT_SIZE = SCHEDULING_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Driver Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__DRIVER_MEMORY = SCHEDULING_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Local Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__LOCAL_DIR = SCHEDULING_SERVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__MASTER = SCHEDULING_SERVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Window Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__WINDOW_SIZE = SCHEDULING_SERVICE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Executor Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__EXECUTOR_MEMORY = SCHEDULING_SERVICE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Extra Listener</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__EXTRA_LISTENER = SCHEDULING_SERVICE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Log Conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__LOG_CONF = SCHEDULING_SERVICE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Submit Deploy Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__SUBMIT_DEPLOY_MODE = SCHEDULING_SERVICE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Log Caller Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__LOG_CALLER_CONTEXT = SCHEDULING_SERVICE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Driver Superviser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE__DRIVER_SUPERVISER = SCHEDULING_SERVICE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Spark Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE_FEATURE_COUNT = SCHEDULING_SERVICE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE___CONFIGURE_DEPLOYMENT = SCHEDULING_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Spark Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARK_SERVICE_OPERATION_COUNT = SCHEDULING_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.StormServiceImpl <em>Storm Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.StormServiceImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getStormService()
	 * @generated
	 */
	int STORM_SERVICE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__NAME = SCHEDULING_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__ID = SCHEDULING_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__OWNER = SCHEDULING_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__DEPLOYMENT_CONFIG = SCHEDULING_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__HOST = SCHEDULING_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__WORKFLOWS = SCHEDULING_SERVICE__WORKFLOWS;

	/**
	 * The feature id for the '<em><b>Zookeeper Connect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__ZOOKEEPER_CONNECT = SCHEDULING_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Local Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__LOCAL_DIR = SCHEDULING_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nimbus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__NIMBUS = SCHEDULING_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supervisor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__SUPERVISOR = SCHEDULING_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ui</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE__UI = SCHEDULING_SERVICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Storm Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE_FEATURE_COUNT = SCHEDULING_SERVICE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE___CONFIGURE_DEPLOYMENT = SCHEDULING_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Storm Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SERVICE_OPERATION_COUNT = SCHEDULING_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.DeployableComponentImpl <em>Deployable Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.DeployableComponentImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getDeployableComponent()
	 * @generated
	 */
	int DEPLOYABLE_COMPONENT = 66;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG = 0;

	/**
	 * The number of structural features of the '<em>Deployable Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_COMPONENT___CONFIGURE_DEPLOYMENT = 0;

	/**
	 * The number of operations of the '<em>Deployable Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_COMPONENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.StormUIImpl <em>Storm UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.StormUIImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getStormUI()
	 * @generated
	 */
	int STORM_UI = 29;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_UI__DEPLOYMENT_CONFIG = DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_UI__NAME = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_UI__ID = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ui Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_UI__UI_PORT = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_UI__OWNER = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_UI__HOST = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Storm UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_UI_FEATURE_COUNT = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_UI___CONFIGURE_DEPLOYMENT = DEPLOYABLE_COMPONENT___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Storm UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_UI_OPERATION_COUNT = DEPLOYABLE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.StormNimbusImpl <em>Storm Nimbus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.StormNimbusImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getStormNimbus()
	 * @generated
	 */
	int STORM_NIMBUS = 30;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_NIMBUS__DEPLOYMENT_CONFIG = DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_NIMBUS__NAME = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_NIMBUS__ID = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_NIMBUS__OWNER = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_NIMBUS__HOST = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Storm Nimbus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_NIMBUS_FEATURE_COUNT = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_NIMBUS___CONFIGURE_DEPLOYMENT = DEPLOYABLE_COMPONENT___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Storm Nimbus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_NIMBUS_OPERATION_COUNT = DEPLOYABLE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.StormSupervisorImpl <em>Storm Supervisor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.StormSupervisorImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getStormSupervisor()
	 * @generated
	 */
	int STORM_SUPERVISOR = 31;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR__DEPLOYMENT_CONFIG = DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR__NAME = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR__ID = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supervisor Slot Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR__SUPERVISOR_SLOT_PORTS = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR__OWNER = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR__HOST = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Storm Supervisor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR_FEATURE_COUNT = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR___CONFIGURE_DEPLOYMENT = DEPLOYABLE_COMPONENT___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Storm Supervisor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORM_SUPERVISOR_OPERATION_COUNT = DEPLOYABLE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.Neo4JServiceImpl <em>Neo4 JService</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.Neo4JServiceImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNeo4JService()
	 * @generated
	 */
	int NEO4_JSERVICE = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE__NAME = PERSISTENCE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE__ID = PERSISTENCE_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE__OWNER = PERSISTENCE_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE__DEPLOYMENT_CONFIG = PERSISTENCE_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE__HOST = PERSISTENCE_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Logging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE__LOGGING = PERSISTENCE_SERVICE__LOGGING;

	/**
	 * The feature id for the '<em><b>Passwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE__PASSWD = PERSISTENCE_SERVICE__PASSWD;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE__PORT = PERSISTENCE_SERVICE__PORT;

	/**
	 * The number of structural features of the '<em>Neo4 JService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE_FEATURE_COUNT = PERSISTENCE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE___CONFIGURE_DEPLOYMENT = PERSISTENCE_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Neo4 JService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEO4_JSERVICE_OPERATION_COUNT = PERSISTENCE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.MemSQLServiceImpl <em>Mem SQL Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.MemSQLServiceImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getMemSQLService()
	 * @generated
	 */
	int MEM_SQL_SERVICE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE__NAME = PERSISTENCE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE__ID = PERSISTENCE_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE__OWNER = PERSISTENCE_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE__DEPLOYMENT_CONFIG = PERSISTENCE_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE__HOST = PERSISTENCE_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Logging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE__LOGGING = PERSISTENCE_SERVICE__LOGGING;

	/**
	 * The feature id for the '<em><b>Passwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE__PASSWD = PERSISTENCE_SERVICE__PASSWD;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE__PORT = PERSISTENCE_SERVICE__PORT;

	/**
	 * The number of structural features of the '<em>Mem SQL Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE_FEATURE_COUNT = PERSISTENCE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE___CONFIGURE_DEPLOYMENT = PERSISTENCE_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Mem SQL Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_SQL_SERVICE_OPERATION_COUNT = PERSISTENCE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.CassandraServiceImpl <em>Cassandra Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.CassandraServiceImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getCassandraService()
	 * @generated
	 */
	int CASSANDRA_SERVICE = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__NAME = PERSISTENCE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__ID = PERSISTENCE_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__OWNER = PERSISTENCE_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__DEPLOYMENT_CONFIG = PERSISTENCE_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__HOST = PERSISTENCE_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Logging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__LOGGING = PERSISTENCE_SERVICE__LOGGING;

	/**
	 * The feature id for the '<em><b>Passwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__PASSWD = PERSISTENCE_SERVICE__PASSWD;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__PORT = PERSISTENCE_SERVICE__PORT;

	/**
	 * The feature id for the '<em><b>Num Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__NUM_TOKENS = PERSISTENCE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Seeds</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__SEEDS = PERSISTENCE_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Seed Provider Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__SEED_PROVIDER_CLASS = PERSISTENCE_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Endpoint Snitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__ENDPOINT_SNITCH = PERSISTENCE_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data File Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__DATA_FILE_DIR = PERSISTENCE_SERVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Storage Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__STORAGE_PORT = PERSISTENCE_SERVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Auto Bootstrap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__AUTO_BOOTSTRAP = PERSISTENCE_SERVICE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cql Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__CQL_SCHEMAS = PERSISTENCE_SERVICE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Data Centers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__DATA_CENTERS = PERSISTENCE_SERVICE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ssl Storage Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__SSL_STORAGE_PORT = PERSISTENCE_SERVICE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rpc Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE__RPC_PORT = PERSISTENCE_SERVICE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Cassandra Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE_FEATURE_COUNT = PERSISTENCE_SERVICE_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE___CONFIGURE_DEPLOYMENT = PERSISTENCE_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Cassandra Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSANDRA_SERVICE_OPERATION_COUNT = PERSISTENCE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.DataCenterImpl <em>Data Center</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.DataCenterImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getDataCenter()
	 * @generated
	 */
	int DATA_CENTER = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Racks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__RACKS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.RackImpl <em>Rack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.RackImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getRack()
	 * @generated
	 */
	int RACK = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK__NODES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RACK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.PrometheusServiceImpl <em>Prometheus Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.PrometheusServiceImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getPrometheusService()
	 * @generated
	 */
	int PROMETHEUS_SERVICE = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVICE__NAME = MONITORING_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVICE__ID = MONITORING_SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVICE__OWNER = MONITORING_SERVICE__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVICE__DEPLOYMENT_CONFIG = MONITORING_SERVICE__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVICE__HOST = MONITORING_SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>Monitorized Meters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVICE__MONITORIZED_METERS = MONITORING_SERVICE__MONITORIZED_METERS;

	/**
	 * The feature id for the '<em><b>Exporters Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVICE__EXPORTERS_DATA = MONITORING_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prometheus Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVICE_FEATURE_COUNT = MONITORING_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVICE___CONFIGURE_DEPLOYMENT = MONITORING_SERVICE___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Prometheus Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_SERVICE_OPERATION_COUNT = MONITORING_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.ExporterDataImpl <em>Exporter Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.ExporterDataImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getExporterData()
	 * @generated
	 */
	int EXPORTER_DATA = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTER_DATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTER_DATA__ARTIFACT = 1;

	/**
	 * The number of structural features of the '<em>Exporter Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTER_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Exporter Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTER_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.StreamDataImpl <em>Stream Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.StreamDataImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getStreamData()
	 * @generated
	 */
	int STREAM_DATA = 39;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__DEPLOYMENT_CONFIG = DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Retention ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__RETENTION_MS = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Retention bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__RETENTION_BYTES = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cleanup Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__CLEANUP_POLICY = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Num Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__NUM_PARTITIONS = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Num Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__NUM_REPLICATION = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__OWNED_METERS = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Assigned Partition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__ASSIGNED_PARTITION = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__MESSAGE_SIZE = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Schema File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA__SCHEMA_FILE = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_FEATURE_COUNT = DEPLOYABLE_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA___CONFIGURE_DEPLOYMENT = DEPLOYABLE_COMPONENT___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_OPERATION_COUNT = DEPLOYABLE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.StreamDataPartitionImpl <em>Stream Data Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.StreamDataPartitionImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getStreamDataPartition()
	 * @generated
	 */
	int STREAM_DATA_PARTITION = 40;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_PARTITION__KEY = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_PARTITION__HOST = 1;

	/**
	 * The number of structural features of the '<em>Stream Data Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_PARTITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stream Data Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_PARTITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.WorkflowStreamDataImpl <em>Workflow Stream Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.WorkflowStreamDataImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getWorkflowStreamData()
	 * @generated
	 */
	int WORKFLOW_STREAM_DATA = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__DEPLOYMENT_CONFIG = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Retention ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__RETENTION_MS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Retention bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__RETENTION_BYTES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cleanup Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__CLEANUP_POLICY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Num Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__NUM_PARTITIONS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Num Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__NUM_REPLICATION = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__OWNED_METERS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Assigned Partition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__ASSIGNED_PARTITION = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__MESSAGE_SIZE = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Schema File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__SCHEMA_FILE = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Single Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__IS_SINGLE_USE = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA__OWNER = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Workflow Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA___CONFIGURE_DEPLOYMENT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Workflow Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_STREAM_DATA_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.FlowStreamDataImpl <em>Flow Stream Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.FlowStreamDataImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getFlowStreamData()
	 * @generated
	 */
	int FLOW_STREAM_DATA = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__NAME = WORKFLOW_STREAM_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__ID = WORKFLOW_STREAM_DATA__ID;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__DEPLOYMENT_CONFIG = WORKFLOW_STREAM_DATA__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Retention ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__RETENTION_MS = WORKFLOW_STREAM_DATA__RETENTION_MS;

	/**
	 * The feature id for the '<em><b>Retention bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__RETENTION_BYTES = WORKFLOW_STREAM_DATA__RETENTION_BYTES;

	/**
	 * The feature id for the '<em><b>Cleanup Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__CLEANUP_POLICY = WORKFLOW_STREAM_DATA__CLEANUP_POLICY;

	/**
	 * The feature id for the '<em><b>Num Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__NUM_PARTITIONS = WORKFLOW_STREAM_DATA__NUM_PARTITIONS;

	/**
	 * The feature id for the '<em><b>Num Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__NUM_REPLICATION = WORKFLOW_STREAM_DATA__NUM_REPLICATION;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__OWNED_METERS = WORKFLOW_STREAM_DATA__OWNED_METERS;

	/**
	 * The feature id for the '<em><b>Assigned Partition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__ASSIGNED_PARTITION = WORKFLOW_STREAM_DATA__ASSIGNED_PARTITION;

	/**
	 * The feature id for the '<em><b>Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__MESSAGE_SIZE = WORKFLOW_STREAM_DATA__MESSAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Schema File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__SCHEMA_FILE = WORKFLOW_STREAM_DATA__SCHEMA_FILE;

	/**
	 * The feature id for the '<em><b>Is Single Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__IS_SINGLE_USE = WORKFLOW_STREAM_DATA__IS_SINGLE_USE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__OWNER = WORKFLOW_STREAM_DATA__OWNER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__SOURCE = WORKFLOW_STREAM_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__PREDECESSOR = WORKFLOW_STREAM_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__HOLDER = WORKFLOW_STREAM_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA__IS_IMPLEMENTED = WORKFLOW_STREAM_DATA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Flow Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA_FEATURE_COUNT = WORKFLOW_STREAM_DATA_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA___CONFIGURE_DEPLOYMENT = WORKFLOW_STREAM_DATA___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Flow Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STREAM_DATA_OPERATION_COUNT = WORKFLOW_STREAM_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.KafkaFlowStreamDataImpl <em>Kafka Flow Stream Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.KafkaFlowStreamDataImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getKafkaFlowStreamData()
	 * @generated
	 */
	int KAFKA_FLOW_STREAM_DATA = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__NAME = FLOW_STREAM_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__ID = FLOW_STREAM_DATA__ID;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__DEPLOYMENT_CONFIG = FLOW_STREAM_DATA__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Retention ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__RETENTION_MS = FLOW_STREAM_DATA__RETENTION_MS;

	/**
	 * The feature id for the '<em><b>Retention bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__RETENTION_BYTES = FLOW_STREAM_DATA__RETENTION_BYTES;

	/**
	 * The feature id for the '<em><b>Cleanup Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__CLEANUP_POLICY = FLOW_STREAM_DATA__CLEANUP_POLICY;

	/**
	 * The feature id for the '<em><b>Num Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__NUM_PARTITIONS = FLOW_STREAM_DATA__NUM_PARTITIONS;

	/**
	 * The feature id for the '<em><b>Num Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__NUM_REPLICATION = FLOW_STREAM_DATA__NUM_REPLICATION;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__OWNED_METERS = FLOW_STREAM_DATA__OWNED_METERS;

	/**
	 * The feature id for the '<em><b>Assigned Partition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__ASSIGNED_PARTITION = FLOW_STREAM_DATA__ASSIGNED_PARTITION;

	/**
	 * The feature id for the '<em><b>Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__MESSAGE_SIZE = FLOW_STREAM_DATA__MESSAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Schema File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__SCHEMA_FILE = FLOW_STREAM_DATA__SCHEMA_FILE;

	/**
	 * The feature id for the '<em><b>Is Single Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__IS_SINGLE_USE = FLOW_STREAM_DATA__IS_SINGLE_USE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__OWNER = FLOW_STREAM_DATA__OWNER;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__SOURCE = FLOW_STREAM_DATA__SOURCE;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__PREDECESSOR = FLOW_STREAM_DATA__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__HOLDER = FLOW_STREAM_DATA__HOLDER;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA__IS_IMPLEMENTED = FLOW_STREAM_DATA__IS_IMPLEMENTED;

	/**
	 * The number of structural features of the '<em>Kafka Flow Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA_FEATURE_COUNT = FLOW_STREAM_DATA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA___CONFIGURE_DEPLOYMENT = FLOW_STREAM_DATA___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Kafka Flow Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_FLOW_STREAM_DATA_OPERATION_COUNT = FLOW_STREAM_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.DerivedStreamDataImpl <em>Derived Stream Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.DerivedStreamDataImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getDerivedStreamData()
	 * @generated
	 */
	int DERIVED_STREAM_DATA = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__NAME = WORKFLOW_STREAM_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__ID = WORKFLOW_STREAM_DATA__ID;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__DEPLOYMENT_CONFIG = WORKFLOW_STREAM_DATA__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Retention ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__RETENTION_MS = WORKFLOW_STREAM_DATA__RETENTION_MS;

	/**
	 * The feature id for the '<em><b>Retention bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__RETENTION_BYTES = WORKFLOW_STREAM_DATA__RETENTION_BYTES;

	/**
	 * The feature id for the '<em><b>Cleanup Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__CLEANUP_POLICY = WORKFLOW_STREAM_DATA__CLEANUP_POLICY;

	/**
	 * The feature id for the '<em><b>Num Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__NUM_PARTITIONS = WORKFLOW_STREAM_DATA__NUM_PARTITIONS;

	/**
	 * The feature id for the '<em><b>Num Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__NUM_REPLICATION = WORKFLOW_STREAM_DATA__NUM_REPLICATION;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__OWNED_METERS = WORKFLOW_STREAM_DATA__OWNED_METERS;

	/**
	 * The feature id for the '<em><b>Assigned Partition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__ASSIGNED_PARTITION = WORKFLOW_STREAM_DATA__ASSIGNED_PARTITION;

	/**
	 * The feature id for the '<em><b>Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__MESSAGE_SIZE = WORKFLOW_STREAM_DATA__MESSAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Schema File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__SCHEMA_FILE = WORKFLOW_STREAM_DATA__SCHEMA_FILE;

	/**
	 * The feature id for the '<em><b>Is Single Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__IS_SINGLE_USE = WORKFLOW_STREAM_DATA__IS_SINGLE_USE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__OWNER = WORKFLOW_STREAM_DATA__OWNER;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__PATTERN = WORKFLOW_STREAM_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA__INPUTS = WORKFLOW_STREAM_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Derived Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA_FEATURE_COUNT = WORKFLOW_STREAM_DATA_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA___CONFIGURE_DEPLOYMENT = WORKFLOW_STREAM_DATA___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Derived Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_STREAM_DATA_OPERATION_COUNT = WORKFLOW_STREAM_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.WorkloadStreamDataImpl <em>Workload Stream Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.WorkloadStreamDataImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getWorkloadStreamData()
	 * @generated
	 */
	int WORKLOAD_STREAM_DATA = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__NAME = SYSTEM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__ID = SYSTEM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__OWNER = SYSTEM_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__DEPLOYMENT_CONFIG = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Retention ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__RETENTION_MS = SYSTEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Retention bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__RETENTION_BYTES = SYSTEM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cleanup Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__CLEANUP_POLICY = SYSTEM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Num Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__NUM_PARTITIONS = SYSTEM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Num Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__NUM_REPLICATION = SYSTEM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__OWNED_METERS = SYSTEM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Assigned Partition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__ASSIGNED_PARTITION = SYSTEM_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__MESSAGE_SIZE = SYSTEM_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Schema File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__SCHEMA_FILE = SYSTEM_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA__HOLDER = SYSTEM_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Workload Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA___CONFIGURE_DEPLOYMENT = SYSTEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Workload Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_STREAM_DATA_OPERATION_COUNT = SYSTEM_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.KafkaWorkloadStreamDataImpl <em>Kafka Workload Stream Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.KafkaWorkloadStreamDataImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getKafkaWorkloadStreamData()
	 * @generated
	 */
	int KAFKA_WORKLOAD_STREAM_DATA = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__NAME = WORKLOAD_STREAM_DATA__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__ID = WORKLOAD_STREAM_DATA__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__OWNER = WORKLOAD_STREAM_DATA__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__DEPLOYMENT_CONFIG = WORKLOAD_STREAM_DATA__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Retention ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__RETENTION_MS = WORKLOAD_STREAM_DATA__RETENTION_MS;

	/**
	 * The feature id for the '<em><b>Retention bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__RETENTION_BYTES = WORKLOAD_STREAM_DATA__RETENTION_BYTES;

	/**
	 * The feature id for the '<em><b>Cleanup Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__CLEANUP_POLICY = WORKLOAD_STREAM_DATA__CLEANUP_POLICY;

	/**
	 * The feature id for the '<em><b>Num Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__NUM_PARTITIONS = WORKLOAD_STREAM_DATA__NUM_PARTITIONS;

	/**
	 * The feature id for the '<em><b>Num Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__NUM_REPLICATION = WORKLOAD_STREAM_DATA__NUM_REPLICATION;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__OWNED_METERS = WORKLOAD_STREAM_DATA__OWNED_METERS;

	/**
	 * The feature id for the '<em><b>Assigned Partition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__ASSIGNED_PARTITION = WORKLOAD_STREAM_DATA__ASSIGNED_PARTITION;

	/**
	 * The feature id for the '<em><b>Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__MESSAGE_SIZE = WORKLOAD_STREAM_DATA__MESSAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Schema File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__SCHEMA_FILE = WORKLOAD_STREAM_DATA__SCHEMA_FILE;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA__HOLDER = WORKLOAD_STREAM_DATA__HOLDER;

	/**
	 * The number of structural features of the '<em>Kafka Workload Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA_FEATURE_COUNT = WORKLOAD_STREAM_DATA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA___CONFIGURE_DEPLOYMENT = WORKLOAD_STREAM_DATA___CONFIGURE_DEPLOYMENT;

	/**
	 * The number of operations of the '<em>Kafka Workload Stream Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAFKA_WORKLOAD_STREAM_DATA_OPERATION_COUNT = WORKLOAD_STREAM_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.WorkflowImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = SYSTEM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ID = SYSTEM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__OWNER = SYSTEM_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__DEPLOYMENT_CONFIG = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Stream Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__OWNED_STREAM_DATA = SYSTEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__OWNED_TASKS = SYSTEM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Root Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ROOT_TASK = SYSTEM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Task Executors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__OWNED_TASK_EXECUTORS = SYSTEM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__SCHEDULER = SYSTEM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__OWNED_METERS = SYSTEM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___CONFIGURE_DEPLOYMENT = SYSTEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = SYSTEM_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.SchedulableSetImpl <em>Schedulable Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.SchedulableSetImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getSchedulableSet()
	 * @generated
	 */
	int SCHEDULABLE_SET = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_SET__NAME = SYSTEM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_SET__ID = SYSTEM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_SET__OWNER = SYSTEM_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_SET__WORKFLOWS = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schedulable Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_SET_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Schedulable Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULABLE_SET_OPERATION_COUNT = SYSTEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.TaskImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OWNER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementing Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IMPLEMENTING_CLASS_NAME = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Returned Stream Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RETURNED_STREAM_DATA = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trigger Stream Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TRIGGER_STREAM_DATA = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Stream Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INPUT_STREAM_DATA = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.TaskExecutorImpl <em>Task Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.TaskExecutorImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getTaskExecutor()
	 * @generated
	 */
	int TASK_EXECUTOR = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__DEPLOYMENT_CONFIG = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__OWNER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Executed Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__EXECUTED_TASKS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Meters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR__OWNED_METERS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Task Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR___CONFIGURE_DEPLOYMENT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_EXECUTOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.MetricImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__NAME = SYSTEM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__ID = SYSTEM_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__OWNER = SYSTEM_ELEMENT__OWNER;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = SYSTEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.ProcessingNodeUtilizationImpl <em>Processing Node Utilization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.ProcessingNodeUtilizationImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getProcessingNodeUtilization()
	 * @generated
	 */
	int PROCESSING_NODE_UTILIZATION = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_UTILIZATION__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_UTILIZATION__ID = METRIC__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_UTILIZATION__OWNER = METRIC__OWNER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_UTILIZATION__TARGET = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Processing Node Utilization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_UTILIZATION_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Processing Node Utilization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_UTILIZATION_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.ProcessingNodeMemoryImpl <em>Processing Node Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.ProcessingNodeMemoryImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getProcessingNodeMemory()
	 * @generated
	 */
	int PROCESSING_NODE_MEMORY = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_MEMORY__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_MEMORY__ID = METRIC__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_MEMORY__OWNER = METRIC__OWNER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_MEMORY__TARGET = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Processing Node Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_MEMORY_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Processing Node Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_NODE_MEMORY_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.NetworkUtilizationImpl <em>Network Utilization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.NetworkUtilizationImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNetworkUtilization()
	 * @generated
	 */
	int NETWORK_UTILIZATION = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION__ID = METRIC__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION__OWNER = METRIC__OWNER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION__TARGET = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Network Utilization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Network Utilization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_UTILIZATION_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.WorkflowLatencyImpl <em>Workflow Latency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.WorkflowLatencyImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getWorkflowLatency()
	 * @generated
	 */
	int WORKFLOW_LATENCY = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY__ID = METRIC__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY__OWNER = METRIC__OWNER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY__TARGET = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workflow Latency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Workflow Latency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.TaskProcessingAmountImpl <em>Task Processing Amount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.TaskProcessingAmountImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getTaskProcessingAmount()
	 * @generated
	 */
	int TASK_PROCESSING_AMOUNT = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT__ID = METRIC__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT__OWNER = METRIC__OWNER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT__TARGET = METRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Histogram Buckect Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT__HISTOGRAM_BUCKECT_NUM = METRIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expected Max TPA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT__EXPECTED_MAX_TPA = METRIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expected Min TPA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT__EXPECTED_MIN_TPA = METRIC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Linear Bucket Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT__LINEAR_BUCKET_DISTRIBUTION = METRIC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Task Processing Amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_FEATURE_COUNT = METRIC_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Task Processing Amount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.StreamDataRateImpl <em>Stream Data Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.StreamDataRateImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getStreamDataRate()
	 * @generated
	 */
	int STREAM_DATA_RATE = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_RATE__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_RATE__ID = METRIC__ID;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_RATE__OWNER = METRIC__OWNER;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_RATE__TARGET = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stream Data Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_RATE_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stream Data Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_DATA_RATE_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.MeterImpl <em>Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.MeterImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getMeter()
	 * @generated
	 */
	int METER = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__DEPLOYMENT_CONFIG = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Monitoring Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__MONITORING_SERVER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER___CONFIGURE_DEPLOYMENT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.PrometheusMeterImpl <em>Prometheus Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.PrometheusMeterImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getPrometheusMeter()
	 * @generated
	 */
	int PROMETHEUS_METER = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_METER__NAME = METER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_METER__ID = METER__ID;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_METER__DEPLOYMENT_CONFIG = METER__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Monitoring Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_METER__MONITORING_SERVER = METER__MONITORING_SERVER;

	/**
	 * The feature id for the '<em><b>Monitoring Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_METER__MONITORING_PORT = METER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Monitoring Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_METER__MONITORING_TIME = METER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Prometheus Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_METER_FEATURE_COUNT = METER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_METER___CONFIGURE_DEPLOYMENT = METER___CONFIGURE_DEPLOYMENT;

	/**
	 * The operation id for the '<em>Get Prometheus Server Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_METER___GET_PROMETHEUS_SERVER_CONFIGURATION = METER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Prometheus Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMETHEUS_METER_OPERATION_COUNT = METER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.NodeHostedMeterImpl <em>Node Hosted Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.NodeHostedMeterImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNodeHostedMeter()
	 * @generated
	 */
	int NODE_HOSTED_METER = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__NAME = PROMETHEUS_METER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__ID = PROMETHEUS_METER__ID;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__DEPLOYMENT_CONFIG = PROMETHEUS_METER__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Monitoring Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__MONITORING_SERVER = PROMETHEUS_METER__MONITORING_SERVER;

	/**
	 * The feature id for the '<em><b>Monitoring Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__MONITORING_PORT = PROMETHEUS_METER__MONITORING_PORT;

	/**
	 * The feature id for the '<em><b>Monitoring Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__MONITORING_TIME = PROMETHEUS_METER__MONITORING_TIME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER__OWNER = PROMETHEUS_METER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Hosted Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER_FEATURE_COUNT = PROMETHEUS_METER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER___CONFIGURE_DEPLOYMENT = PROMETHEUS_METER___CONFIGURE_DEPLOYMENT;

	/**
	 * The operation id for the '<em>Get Prometheus Server Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER___GET_PROMETHEUS_SERVER_CONFIGURATION = PROMETHEUS_METER___GET_PROMETHEUS_SERVER_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Node Hosted Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_HOSTED_METER_OPERATION_COUNT = PROMETHEUS_METER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.NodeResourceMeterImpl <em>Node Resource Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.NodeResourceMeterImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNodeResourceMeter()
	 * @generated
	 */
	int NODE_RESOURCE_METER = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__NAME = NODE_HOSTED_METER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__ID = NODE_HOSTED_METER__ID;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__DEPLOYMENT_CONFIG = NODE_HOSTED_METER__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Monitoring Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__MONITORING_SERVER = NODE_HOSTED_METER__MONITORING_SERVER;

	/**
	 * The feature id for the '<em><b>Monitoring Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__MONITORING_PORT = NODE_HOSTED_METER__MONITORING_PORT;

	/**
	 * The feature id for the '<em><b>Monitoring Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__MONITORING_TIME = NODE_HOSTED_METER__MONITORING_TIME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__OWNER = NODE_HOSTED_METER__OWNER;

	/**
	 * The feature id for the '<em><b>UMetric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__UMETRIC = NODE_HOSTED_METER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>MMetric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER__MMETRIC = NODE_HOSTED_METER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node Resource Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER_FEATURE_COUNT = NODE_HOSTED_METER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER___CONFIGURE_DEPLOYMENT = NODE_HOSTED_METER___CONFIGURE_DEPLOYMENT;

	/**
	 * The operation id for the '<em>Get Prometheus Server Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER___GET_PROMETHEUS_SERVER_CONFIGURATION = NODE_HOSTED_METER___GET_PROMETHEUS_SERVER_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Node Resource Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_RESOURCE_METER_OPERATION_COUNT = NODE_HOSTED_METER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.CommunicationMeterImpl <em>Communication Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.CommunicationMeterImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getCommunicationMeter()
	 * @generated
	 */
	int COMMUNICATION_METER = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__NAME = NODE_HOSTED_METER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__ID = NODE_HOSTED_METER__ID;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__DEPLOYMENT_CONFIG = NODE_HOSTED_METER__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Monitoring Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__MONITORING_SERVER = NODE_HOSTED_METER__MONITORING_SERVER;

	/**
	 * The feature id for the '<em><b>Monitoring Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__MONITORING_PORT = NODE_HOSTED_METER__MONITORING_PORT;

	/**
	 * The feature id for the '<em><b>Monitoring Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__MONITORING_TIME = NODE_HOSTED_METER__MONITORING_TIME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__OWNER = NODE_HOSTED_METER__OWNER;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER__METRIC = NODE_HOSTED_METER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Communication Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER_FEATURE_COUNT = NODE_HOSTED_METER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER___CONFIGURE_DEPLOYMENT = NODE_HOSTED_METER___CONFIGURE_DEPLOYMENT;

	/**
	 * The operation id for the '<em>Get Prometheus Server Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER___GET_PROMETHEUS_SERVER_CONFIGURATION = NODE_HOSTED_METER___GET_PROMETHEUS_SERVER_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Communication Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_METER_OPERATION_COUNT = NODE_HOSTED_METER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.StreamRateMeterImpl <em>Stream Rate Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.StreamRateMeterImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getStreamRateMeter()
	 * @generated
	 */
	int STREAM_RATE_METER = 63;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER__NAME = PROMETHEUS_METER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER__ID = PROMETHEUS_METER__ID;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER__DEPLOYMENT_CONFIG = PROMETHEUS_METER__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Monitoring Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER__MONITORING_SERVER = PROMETHEUS_METER__MONITORING_SERVER;

	/**
	 * The feature id for the '<em><b>Monitoring Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER__MONITORING_PORT = PROMETHEUS_METER__MONITORING_PORT;

	/**
	 * The feature id for the '<em><b>Monitoring Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER__MONITORING_TIME = PROMETHEUS_METER__MONITORING_TIME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER__OWNER = PROMETHEUS_METER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER__METRIC = PROMETHEUS_METER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stream Rate Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER_FEATURE_COUNT = PROMETHEUS_METER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER___CONFIGURE_DEPLOYMENT = PROMETHEUS_METER___CONFIGURE_DEPLOYMENT;

	/**
	 * The operation id for the '<em>Get Prometheus Server Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER___GET_PROMETHEUS_SERVER_CONFIGURATION = PROMETHEUS_METER___GET_PROMETHEUS_SERVER_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Stream Rate Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RATE_METER_OPERATION_COUNT = PROMETHEUS_METER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.WorkflowLatencyMeterImpl <em>Workflow Latency Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.WorkflowLatencyMeterImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getWorkflowLatencyMeter()
	 * @generated
	 */
	int WORKFLOW_LATENCY_METER = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER__NAME = PROMETHEUS_METER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER__ID = PROMETHEUS_METER__ID;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER__DEPLOYMENT_CONFIG = PROMETHEUS_METER__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Monitoring Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER__MONITORING_SERVER = PROMETHEUS_METER__MONITORING_SERVER;

	/**
	 * The feature id for the '<em><b>Monitoring Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER__MONITORING_PORT = PROMETHEUS_METER__MONITORING_PORT;

	/**
	 * The feature id for the '<em><b>Monitoring Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER__MONITORING_TIME = PROMETHEUS_METER__MONITORING_TIME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER__OWNER = PROMETHEUS_METER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER__METRIC = PROMETHEUS_METER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workflow Latency Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER_FEATURE_COUNT = PROMETHEUS_METER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER___CONFIGURE_DEPLOYMENT = PROMETHEUS_METER___CONFIGURE_DEPLOYMENT;

	/**
	 * The operation id for the '<em>Get Prometheus Server Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER___GET_PROMETHEUS_SERVER_CONFIGURATION = PROMETHEUS_METER___GET_PROMETHEUS_SERVER_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Workflow Latency Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_LATENCY_METER_OPERATION_COUNT = PROMETHEUS_METER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.TaskProcessingAmountMeterImpl <em>Task Processing Amount Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.TaskProcessingAmountMeterImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getTaskProcessingAmountMeter()
	 * @generated
	 */
	int TASK_PROCESSING_AMOUNT_METER = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER__NAME = PROMETHEUS_METER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER__ID = PROMETHEUS_METER__ID;

	/**
	 * The feature id for the '<em><b>Deployment Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER__DEPLOYMENT_CONFIG = PROMETHEUS_METER__DEPLOYMENT_CONFIG;

	/**
	 * The feature id for the '<em><b>Monitoring Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER__MONITORING_SERVER = PROMETHEUS_METER__MONITORING_SERVER;

	/**
	 * The feature id for the '<em><b>Monitoring Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER__MONITORING_PORT = PROMETHEUS_METER__MONITORING_PORT;

	/**
	 * The feature id for the '<em><b>Monitoring Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER__MONITORING_TIME = PROMETHEUS_METER__MONITORING_TIME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER__OWNER = PROMETHEUS_METER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER__METRIC = PROMETHEUS_METER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Processing Amount Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER_FEATURE_COUNT = PROMETHEUS_METER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Configure Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER___CONFIGURE_DEPLOYMENT = PROMETHEUS_METER___CONFIGURE_DEPLOYMENT;

	/**
	 * The operation id for the '<em>Get Prometheus Server Configuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER___GET_PROMETHEUS_SERVER_CONFIGURATION = PROMETHEUS_METER___GET_PROMETHEUS_SERVER_CONFIGURATION;

	/**
	 * The number of operations of the '<em>Task Processing Amount Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROCESSING_AMOUNT_METER_OPERATION_COUNT = PROMETHEUS_METER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.DeploymentConfigurationImpl <em>Deployment Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.DeploymentConfigurationImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getDeploymentConfiguration()
	 * @generated
	 */
	int DEPLOYMENT_CONFIGURATION = 67;

	/**
	 * The number of structural features of the '<em>Deployment Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONFIGURATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Deployment Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.PlatformServiceDeploymentConfImpl <em>Platform Service Deployment Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.PlatformServiceDeploymentConfImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getPlatformServiceDeploymentConf()
	 * @generated
	 */
	int PLATFORM_SERVICE_DEPLOYMENT_CONF = 68;

	/**
	 * The number of structural features of the '<em>Platform Service Deployment Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT = DEPLOYMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Platform Service Deployment Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_SERVICE_DEPLOYMENT_CONF_OPERATION_COUNT = DEPLOYMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.OrchestratorDeploymentConfImpl <em>Orchestrator Deployment Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.OrchestratorDeploymentConfImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getOrchestratorDeploymentConf()
	 * @generated
	 */
	int ORCHESTRATOR_DEPLOYMENT_CONF = 69;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE_TAG = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image Pull Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE_PULL_POLICY = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_DEPLOYMENT_CONF__REPLICAS = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_DEPLOYMENT_CONF__COMMAND = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_DEPLOYMENT_CONF__ARGS = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Restart Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_DEPLOYMENT_CONF__RESTART_POLICY = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_DEPLOYMENT_CONF__ENV = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_DEPLOYMENT_CONF__VOLUMES = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_DEPLOYMENT_CONF__PORTS = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_DEPLOYMENT_CONF__CONSTRAINTS = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Orchestrator Deployment Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_DEPLOYMENT_CONF_FEATURE_COUNT = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Orchestrator Deployment Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATOR_DEPLOYMENT_CONF_OPERATION_COUNT = PLATFORM_SERVICE_DEPLOYMENT_CONF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.NodeDeploymentConfImpl <em>Node Deployment Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.NodeDeploymentConfImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNodeDeploymentConf()
	 * @generated
	 */
	int NODE_DEPLOYMENT_CONF = 70;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEPLOYMENT_CONF__ARGUMENTS = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEPLOYMENT_CONF__ARTIFACT_LOCATOR = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEPLOYMENT_CONF__ARTIFACT_NAME = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Config Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEPLOYMENT_CONF__CONFIG_FOLDER_PATH = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Script Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEPLOYMENT_CONF__SCRIPT_FOLDER_PATH = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Data Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEPLOYMENT_CONF__DATA_FOLDER_PATH = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Log Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEPLOYMENT_CONF__LOG_FOLDER_PATH = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Code Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEPLOYMENT_CONF__CODE_FOLDER_PATH = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEPLOYMENT_CONF__IS_RUNNING = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Node Deployment Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEPLOYMENT_CONF_FEATURE_COUNT = PLATFORM_SERVICE_DEPLOYMENT_CONF_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Node Deployment Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DEPLOYMENT_CONF_OPERATION_COUNT = PLATFORM_SERVICE_DEPLOYMENT_CONF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.KubernetesDeploymentConfImpl <em>Kubernetes Deployment Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.KubernetesDeploymentConfImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getKubernetesDeploymentConf()
	 * @generated
	 */
	int KUBERNETES_DEPLOYMENT_CONF = 71;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_DEPLOYMENT_CONF__IMAGE = ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE;

	/**
	 * The feature id for the '<em><b>Image Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_DEPLOYMENT_CONF__IMAGE_TAG = ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE_TAG;

	/**
	 * The feature id for the '<em><b>Image Pull Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_DEPLOYMENT_CONF__IMAGE_PULL_POLICY = ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE_PULL_POLICY;

	/**
	 * The feature id for the '<em><b>Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_DEPLOYMENT_CONF__REPLICAS = ORCHESTRATOR_DEPLOYMENT_CONF__REPLICAS;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_DEPLOYMENT_CONF__COMMAND = ORCHESTRATOR_DEPLOYMENT_CONF__COMMAND;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_DEPLOYMENT_CONF__ARGS = ORCHESTRATOR_DEPLOYMENT_CONF__ARGS;

	/**
	 * The feature id for the '<em><b>Restart Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_DEPLOYMENT_CONF__RESTART_POLICY = ORCHESTRATOR_DEPLOYMENT_CONF__RESTART_POLICY;

	/**
	 * The feature id for the '<em><b>Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_DEPLOYMENT_CONF__ENV = ORCHESTRATOR_DEPLOYMENT_CONF__ENV;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_DEPLOYMENT_CONF__VOLUMES = ORCHESTRATOR_DEPLOYMENT_CONF__VOLUMES;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_DEPLOYMENT_CONF__PORTS = ORCHESTRATOR_DEPLOYMENT_CONF__PORTS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_DEPLOYMENT_CONF__CONSTRAINTS = ORCHESTRATOR_DEPLOYMENT_CONF__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>External IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_DEPLOYMENT_CONF__EXTERNAL_IP = ORCHESTRATOR_DEPLOYMENT_CONF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_DEPLOYMENT_CONF__SERVICE_TYPE = ORCHESTRATOR_DEPLOYMENT_CONF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Kubernetes Deployment Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_DEPLOYMENT_CONF_FEATURE_COUNT = ORCHESTRATOR_DEPLOYMENT_CONF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Kubernetes Deployment Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KUBERNETES_DEPLOYMENT_CONF_OPERATION_COUNT = ORCHESTRATOR_DEPLOYMENT_CONF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.SwarmDeploymentConfImpl <em>Swarm Deployment Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.SwarmDeploymentConfImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getSwarmDeploymentConf()
	 * @generated
	 */
	int SWARM_DEPLOYMENT_CONF = 72;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_DEPLOYMENT_CONF__IMAGE = ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE;

	/**
	 * The feature id for the '<em><b>Image Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_DEPLOYMENT_CONF__IMAGE_TAG = ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE_TAG;

	/**
	 * The feature id for the '<em><b>Image Pull Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_DEPLOYMENT_CONF__IMAGE_PULL_POLICY = ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE_PULL_POLICY;

	/**
	 * The feature id for the '<em><b>Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_DEPLOYMENT_CONF__REPLICAS = ORCHESTRATOR_DEPLOYMENT_CONF__REPLICAS;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_DEPLOYMENT_CONF__COMMAND = ORCHESTRATOR_DEPLOYMENT_CONF__COMMAND;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_DEPLOYMENT_CONF__ARGS = ORCHESTRATOR_DEPLOYMENT_CONF__ARGS;

	/**
	 * The feature id for the '<em><b>Restart Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_DEPLOYMENT_CONF__RESTART_POLICY = ORCHESTRATOR_DEPLOYMENT_CONF__RESTART_POLICY;

	/**
	 * The feature id for the '<em><b>Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_DEPLOYMENT_CONF__ENV = ORCHESTRATOR_DEPLOYMENT_CONF__ENV;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_DEPLOYMENT_CONF__VOLUMES = ORCHESTRATOR_DEPLOYMENT_CONF__VOLUMES;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_DEPLOYMENT_CONF__PORTS = ORCHESTRATOR_DEPLOYMENT_CONF__PORTS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_DEPLOYMENT_CONF__CONSTRAINTS = ORCHESTRATOR_DEPLOYMENT_CONF__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Network</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_DEPLOYMENT_CONF__NETWORK = ORCHESTRATOR_DEPLOYMENT_CONF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Swarm Deployment Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_DEPLOYMENT_CONF_FEATURE_COUNT = ORCHESTRATOR_DEPLOYMENT_CONF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Swarm Deployment Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWARM_DEPLOYMENT_CONF_OPERATION_COUNT = ORCHESTRATOR_DEPLOYMENT_CONF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.NomadDeploymentConfImpl <em>Nomad Deployment Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.NomadDeploymentConfImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNomadDeploymentConf()
	 * @generated
	 */
	int NOMAD_DEPLOYMENT_CONF = 73;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_DEPLOYMENT_CONF__IMAGE = ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE;

	/**
	 * The feature id for the '<em><b>Image Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_DEPLOYMENT_CONF__IMAGE_TAG = ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE_TAG;

	/**
	 * The feature id for the '<em><b>Image Pull Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_DEPLOYMENT_CONF__IMAGE_PULL_POLICY = ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE_PULL_POLICY;

	/**
	 * The feature id for the '<em><b>Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_DEPLOYMENT_CONF__REPLICAS = ORCHESTRATOR_DEPLOYMENT_CONF__REPLICAS;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_DEPLOYMENT_CONF__COMMAND = ORCHESTRATOR_DEPLOYMENT_CONF__COMMAND;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_DEPLOYMENT_CONF__ARGS = ORCHESTRATOR_DEPLOYMENT_CONF__ARGS;

	/**
	 * The feature id for the '<em><b>Restart Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_DEPLOYMENT_CONF__RESTART_POLICY = ORCHESTRATOR_DEPLOYMENT_CONF__RESTART_POLICY;

	/**
	 * The feature id for the '<em><b>Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_DEPLOYMENT_CONF__ENV = ORCHESTRATOR_DEPLOYMENT_CONF__ENV;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_DEPLOYMENT_CONF__VOLUMES = ORCHESTRATOR_DEPLOYMENT_CONF__VOLUMES;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_DEPLOYMENT_CONF__PORTS = ORCHESTRATOR_DEPLOYMENT_CONF__PORTS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_DEPLOYMENT_CONF__CONSTRAINTS = ORCHESTRATOR_DEPLOYMENT_CONF__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_DEPLOYMENT_CONF__REGION = ORCHESTRATOR_DEPLOYMENT_CONF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_DEPLOYMENT_CONF__DATA_CENTER = ORCHESTRATOR_DEPLOYMENT_CONF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_DEPLOYMENT_CONF__PRIORITY = ORCHESTRATOR_DEPLOYMENT_CONF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_DEPLOYMENT_CONF__DRIVER = ORCHESTRATOR_DEPLOYMENT_CONF_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Nomad Deployment Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_DEPLOYMENT_CONF_FEATURE_COUNT = ORCHESTRATOR_DEPLOYMENT_CONF_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Nomad Deployment Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMAD_DEPLOYMENT_CONF_OPERATION_COUNT = ORCHESTRATOR_DEPLOYMENT_CONF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.VolumeImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 74;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Access Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__ACCESS_MODE = 3;

	/**
	 * The number of structural features of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.PortImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 75;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PUBLISHED = 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.DeploymentConstraintsImpl <em>Deployment Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.DeploymentConstraintsImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getDeploymentConstraints()
	 * @generated
	 */
	int DEPLOYMENT_CONSTRAINTS = 76;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONSTRAINTS__LABELS = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONSTRAINTS__RESOURCES = 1;

	/**
	 * The number of structural features of the '<em>Deployment Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONSTRAINTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Deployment Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.lang.Exception <em>Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 77;

	/**
	 * The number of structural features of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.ConfigurationException <em>Configuration Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.ConfigurationException
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getConfigurationException()
	 * @generated
	 */
	int CONFIGURATION_EXCEPTION = 78;

	/**
	 * The number of structural features of the '<em>Configuration Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_EXCEPTION_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Configuration Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_EXCEPTION_OPERATION_COUNT = EXCEPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.DeploymentException <em>Deployment Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.DeploymentException
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getDeploymentException()
	 * @generated
	 */
	int DEPLOYMENT_EXCEPTION = 79;

	/**
	 * The number of structural features of the '<em>Deployment Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_EXCEPTION_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Deployment Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_EXCEPTION_OPERATION_COUNT = EXCEPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.LaunchException <em>Launch Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.LaunchException
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getLaunchException()
	 * @generated
	 */
	int LAUNCH_EXCEPTION = 80;

	/**
	 * The number of structural features of the '<em>Launch Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_EXCEPTION_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Launch Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCH_EXCEPTION_OPERATION_COUNT = EXCEPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.StringToStringMapImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getStringToStringMap()
	 * @generated
	 */
	int STRING_TO_STRING_MAP = 81;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To String Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.FileDescriptorImpl <em>File Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.FileDescriptorImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getFileDescriptor()
	 * @generated
	 */
	int FILE_DESCRIPTOR = 82;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DESCRIPTOR__FILE_PATH = 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DESCRIPTOR__FILE_NAME = 1;

	/**
	 * The number of structural features of the '<em>File Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DESCRIPTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>File Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.DeploymentFileDescriptorImpl <em>Deployment File Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.DeploymentFileDescriptorImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getDeploymentFileDescriptor()
	 * @generated
	 */
	int DEPLOYMENT_FILE_DESCRIPTOR = 83;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FILE_DESCRIPTOR__FILE_PATH = FILE_DESCRIPTOR__FILE_PATH;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FILE_DESCRIPTOR__FILE_NAME = FILE_DESCRIPTOR__FILE_NAME;

	/**
	 * The feature id for the '<em><b>File Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FILE_DESCRIPTOR__FILE_CONTENT = FILE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FILE_DESCRIPTOR__ELEMENT_TYPE = FILE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FILE_DESCRIPTOR__OWNER = FILE_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Deployment File Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FILE_DESCRIPTOR_FEATURE_COUNT = FILE_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Deployment File Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FILE_DESCRIPTOR_OPERATION_COUNT = FILE_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.impl.ArtifactDescriptorImpl <em>Artifact Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.impl.ArtifactDescriptorImpl
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getArtifactDescriptor()
	 * @generated
	 */
	int ARTIFACT_DESCRIPTOR = 84;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DESCRIPTOR__FILE_PATH = FILE_DESCRIPTOR__FILE_PATH;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DESCRIPTOR__FILE_NAME = FILE_DESCRIPTOR__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Local Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DESCRIPTOR__LOCAL_PATH = FILE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Artifact Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DESCRIPTOR_FEATURE_COUNT = FILE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Artifact Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_DESCRIPTOR_OPERATION_COUNT = FILE_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.VolumeAccessMode <em>Volume Access Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.VolumeAccessMode
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getVolumeAccessMode()
	 * @generated
	 */
	int VOLUME_ACCESS_MODE = 85;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.VolumeType <em>Volume Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.VolumeType
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getVolumeType()
	 * @generated
	 */
	int VOLUME_TYPE = 86;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.NomadDriver <em>Nomad Driver</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.NomadDriver
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNomadDriver()
	 * @generated
	 */
	int NOMAD_DRIVER = 87;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.PortMode <em>Port Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.PortMode
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getPortMode()
	 * @generated
	 */
	int PORT_MODE = 88;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.ServiceType <em>Service Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.ServiceType
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 89;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.Protocol <em>Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.Protocol
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 90;

	/**
	 * The meta object id for the '{@link es.unican.istr.pasys.pasys.DeployableComponentType <em>Deployable Component Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unican.istr.pasys.pasys.DeployableComponentType
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getDeployableComponentType()
	 * @generated
	 */
	int DEPLOYABLE_COMPONENT_TYPE = 91;

	/**
	 * The meta object id for the '<em>Properties</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Properties
	 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 92;


	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.ComputationalSystem <em>Computational System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computational System</em>'.
	 * @see es.unican.istr.pasys.pasys.ComputationalSystem
	 * @generated
	 */
	EClass getComputationalSystem();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ComputationalSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.istr.pasys.pasys.ComputationalSystem#getName()
	 * @see #getComputationalSystem()
	 * @generated
	 */
	EAttribute getComputationalSystem_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ComputationalSystem#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see es.unican.istr.pasys.pasys.ComputationalSystem#getDate()
	 * @see #getComputationalSystem()
	 * @generated
	 */
	EAttribute getComputationalSystem_Date();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ComputationalSystem#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authors</em>'.
	 * @see es.unican.istr.pasys.pasys.ComputationalSystem#getAuthors()
	 * @see #getComputationalSystem()
	 * @generated
	 */
	EAttribute getComputationalSystem_Authors();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ComputationalSystem#getTargetPlatformName <em>Target Platform Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Platform Name</em>'.
	 * @see es.unican.istr.pasys.pasys.ComputationalSystem#getTargetPlatformName()
	 * @see #getComputationalSystem()
	 * @generated
	 */
	EAttribute getComputationalSystem_TargetPlatformName();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ComputationalSystem#getDoc <em>Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc</em>'.
	 * @see es.unican.istr.pasys.pasys.ComputationalSystem#getDoc()
	 * @see #getComputationalSystem()
	 * @generated
	 */
	EAttribute getComputationalSystem_Doc();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.istr.pasys.pasys.ComputationalSystem#getOwnedElements <em>Owned Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Elements</em>'.
	 * @see es.unican.istr.pasys.pasys.ComputationalSystem#getOwnedElements()
	 * @see #getComputationalSystem()
	 * @generated
	 */
	EReference getComputationalSystem_OwnedElements();

	/**
	 * Returns the meta object for the map '{@link es.unican.istr.pasys.pasys.ComputationalSystem#getAuthenticationFiles <em>Authentication Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Authentication Files</em>'.
	 * @see es.unican.istr.pasys.pasys.ComputationalSystem#getAuthenticationFiles()
	 * @see #getComputationalSystem()
	 * @generated
	 */
	EReference getComputationalSystem_AuthenticationFiles();

	/**
	 * Returns the meta object for the '{@link es.unican.istr.pasys.pasys.ComputationalSystem#deployAndLaunch() <em>Deploy And Launch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deploy And Launch</em>' operation.
	 * @see es.unican.istr.pasys.pasys.ComputationalSystem#deployAndLaunch()
	 * @generated
	 */
	EOperation getComputationalSystem__DeployAndLaunch();

	/**
	 * Returns the meta object for the '{@link es.unican.istr.pasys.pasys.ComputationalSystem#cleanDeployment() <em>Clean Deployment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clean Deployment</em>' operation.
	 * @see es.unican.istr.pasys.pasys.ComputationalSystem#cleanDeployment()
	 * @generated
	 */
	EOperation getComputationalSystem__CleanDeployment();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see es.unican.istr.pasys.pasys.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.istr.pasys.pasys.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.NamedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.unican.istr.pasys.pasys.NamedElement#getId()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Id();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.SystemElement <em>System Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Element</em>'.
	 * @see es.unican.istr.pasys.pasys.SystemElement
	 * @generated
	 */
	EClass getSystemElement();

	/**
	 * Returns the meta object for the container reference '{@link es.unican.istr.pasys.pasys.SystemElement#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see es.unican.istr.pasys.pasys.SystemElement#getOwner()
	 * @see #getSystemElement()
	 * @generated
	 */
	EReference getSystemElement_Owner();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.PlatformResource <em>Platform Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Resource</em>'.
	 * @see es.unican.istr.pasys.pasys.PlatformResource
	 * @generated
	 */
	EClass getPlatformResource();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.ProcessingNode <em>Processing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Node</em>'.
	 * @see es.unican.istr.pasys.pasys.ProcessingNode
	 * @generated
	 */
	EClass getProcessingNode();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ProcessingNode#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see es.unican.istr.pasys.pasys.ProcessingNode#getIp()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EAttribute getProcessingNode_Ip();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ProcessingNode#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see es.unican.istr.pasys.pasys.ProcessingNode#getOs()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EAttribute getProcessingNode_Os();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ProcessingNode#getConcurrencyLevel <em>Concurrency Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concurrency Level</em>'.
	 * @see es.unican.istr.pasys.pasys.ProcessingNode#getConcurrencyLevel()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EAttribute getProcessingNode_ConcurrencyLevel();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ProcessingNode#getMemorySize <em>Memory Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Size</em>'.
	 * @see es.unican.istr.pasys.pasys.ProcessingNode#getMemorySize()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EAttribute getProcessingNode_MemorySize();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ProcessingNode#getSpeedFactor <em>Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Factor</em>'.
	 * @see es.unican.istr.pasys.pasys.ProcessingNode#getSpeedFactor()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EAttribute getProcessingNode_SpeedFactor();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ProcessingNode#getConfigData <em>Config Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Data</em>'.
	 * @see es.unican.istr.pasys.pasys.ProcessingNode#getConfigData()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EAttribute getProcessingNode_ConfigData();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ProcessingNode#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see es.unican.istr.pasys.pasys.ProcessingNode#getUserName()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EAttribute getProcessingNode_UserName();

	/**
	 * Returns the meta object for the reference list '{@link es.unican.istr.pasys.pasys.ProcessingNode#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected To</em>'.
	 * @see es.unican.istr.pasys.pasys.ProcessingNode#getConnectedTo()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EReference getProcessingNode_ConnectedTo();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.istr.pasys.pasys.ProcessingNode#getLaunchingScripts <em>Launching Scripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Launching Scripts</em>'.
	 * @see es.unican.istr.pasys.pasys.ProcessingNode#getLaunchingScripts()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EReference getProcessingNode_LaunchingScripts();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.istr.pasys.pasys.ProcessingNode#getConfigFiles <em>Config Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Files</em>'.
	 * @see es.unican.istr.pasys.pasys.ProcessingNode#getConfigFiles()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EReference getProcessingNode_ConfigFiles();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.istr.pasys.pasys.ProcessingNode#getCodeFiles <em>Code Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Files</em>'.
	 * @see es.unican.istr.pasys.pasys.ProcessingNode#getCodeFiles()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EReference getProcessingNode_CodeFiles();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.istr.pasys.pasys.ProcessingNode#getOwnedMeters <em>Owned Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Meters</em>'.
	 * @see es.unican.istr.pasys.pasys.ProcessingNode#getOwnedMeters()
	 * @see #getProcessingNode()
	 * @generated
	 */
	EReference getProcessingNode_OwnedMeters();

	/**
	 * Returns the meta object for the '{@link es.unican.istr.pasys.pasys.ProcessingNode#prepareForDeployment() <em>Prepare For Deployment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Prepare For Deployment</em>' operation.
	 * @see es.unican.istr.pasys.pasys.ProcessingNode#prepareForDeployment()
	 * @generated
	 */
	EOperation getProcessingNode__PrepareForDeployment();

	/**
	 * Returns the meta object for the '{@link es.unican.istr.pasys.pasys.ProcessingNode#deployAndLaunch() <em>Deploy And Launch</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deploy And Launch</em>' operation.
	 * @see es.unican.istr.pasys.pasys.ProcessingNode#deployAndLaunch()
	 * @generated
	 */
	EOperation getProcessingNode__DeployAndLaunch();

	/**
	 * Returns the meta object for the '{@link es.unican.istr.pasys.pasys.ProcessingNode#bringBackConfiguration() <em>Bring Back Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bring Back Configuration</em>' operation.
	 * @see es.unican.istr.pasys.pasys.ProcessingNode#bringBackConfiguration()
	 * @generated
	 */
	EOperation getProcessingNode__BringBackConfiguration();

	/**
	 * Returns the meta object for the '{@link es.unican.istr.pasys.pasys.ProcessingNode#bringBackDeployment() <em>Bring Back Deployment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bring Back Deployment</em>' operation.
	 * @see es.unican.istr.pasys.pasys.ProcessingNode#bringBackDeployment()
	 * @generated
	 */
	EOperation getProcessingNode__BringBackDeployment();

	/**
	 * Returns the meta object for the '{@link es.unican.istr.pasys.pasys.ProcessingNode#abortLaunching() <em>Abort Launching</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Abort Launching</em>' operation.
	 * @see es.unican.istr.pasys.pasys.ProcessingNode#abortLaunching()
	 * @generated
	 */
	EOperation getProcessingNode__AbortLaunching();

	/**
	 * Returns the meta object for the '{@link es.unican.istr.pasys.pasys.ProcessingNode#addLaunchingScript(es.unican.istr.pasys.pasys.DeploymentFileDescriptor) <em>Add Launching Script</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Launching Script</em>' operation.
	 * @see es.unican.istr.pasys.pasys.ProcessingNode#addLaunchingScript(es.unican.istr.pasys.pasys.DeploymentFileDescriptor)
	 * @generated
	 */
	EOperation getProcessingNode__AddLaunchingScript__DeploymentFileDescriptor();

	/**
	 * Returns the meta object for the '{@link es.unican.istr.pasys.pasys.ProcessingNode#addConfigFile(es.unican.istr.pasys.pasys.DeploymentFileDescriptor) <em>Add Config File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Config File</em>' operation.
	 * @see es.unican.istr.pasys.pasys.ProcessingNode#addConfigFile(es.unican.istr.pasys.pasys.DeploymentFileDescriptor)
	 * @generated
	 */
	EOperation getProcessingNode__AddConfigFile__DeploymentFileDescriptor();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.PhysicalProcessingNode <em>Physical Processing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Processing Node</em>'.
	 * @see es.unican.istr.pasys.pasys.PhysicalProcessingNode
	 * @generated
	 */
	EClass getPhysicalProcessingNode();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.VirtualProcessingNode <em>Virtual Processing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Processing Node</em>'.
	 * @see es.unican.istr.pasys.pasys.VirtualProcessingNode
	 * @generated
	 */
	EClass getVirtualProcessingNode();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.VirtualProcessingNode#getExternalIP <em>External IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External IP</em>'.
	 * @see es.unican.istr.pasys.pasys.VirtualProcessingNode#getExternalIP()
	 * @see #getVirtualProcessingNode()
	 * @generated
	 */
	EAttribute getVirtualProcessingNode_ExternalIP();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.AWSVirtualProcessingNode <em>AWS Virtual Processing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AWS Virtual Processing Node</em>'.
	 * @see es.unican.istr.pasys.pasys.AWSVirtualProcessingNode
	 * @generated
	 */
	EClass getAWSVirtualProcessingNode();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.AWSVirtualProcessingNode#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc</em>'.
	 * @see es.unican.istr.pasys.pasys.AWSVirtualProcessingNode#getVpc()
	 * @see #getAWSVirtualProcessingNode()
	 * @generated
	 */
	EAttribute getAWSVirtualProcessingNode_Vpc();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.AWSVirtualProcessingNode#getSubNet <em>Sub Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Net</em>'.
	 * @see es.unican.istr.pasys.pasys.AWSVirtualProcessingNode#getSubNet()
	 * @see #getAWSVirtualProcessingNode()
	 * @generated
	 */
	EAttribute getAWSVirtualProcessingNode_SubNet();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.AWSVirtualProcessingNode#getKeyPair <em>Key Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Pair</em>'.
	 * @see es.unican.istr.pasys.pasys.AWSVirtualProcessingNode#getKeyPair()
	 * @see #getAWSVirtualProcessingNode()
	 * @generated
	 */
	EAttribute getAWSVirtualProcessingNode_KeyPair();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.AWSVirtualProcessingNode#getSecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Group</em>'.
	 * @see es.unican.istr.pasys.pasys.AWSVirtualProcessingNode#getSecurityGroup()
	 * @see #getAWSVirtualProcessingNode()
	 * @generated
	 */
	EAttribute getAWSVirtualProcessingNode_SecurityGroup();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.AWSVirtualProcessingNode#getAMI <em>AMI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AMI</em>'.
	 * @see es.unican.istr.pasys.pasys.AWSVirtualProcessingNode#getAMI()
	 * @see #getAWSVirtualProcessingNode()
	 * @generated
	 */
	EAttribute getAWSVirtualProcessingNode_AMI();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.AWSVirtualProcessingNode#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see es.unican.istr.pasys.pasys.AWSVirtualProcessingNode#getInstanceType()
	 * @see #getAWSVirtualProcessingNode()
	 * @generated
	 */
	EAttribute getAWSVirtualProcessingNode_InstanceType();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.ProcessingResourceCluster <em>Processing Resource Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Resource Cluster</em>'.
	 * @see es.unican.istr.pasys.pasys.ProcessingResourceCluster
	 * @generated
	 */
	EClass getProcessingResourceCluster();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.ProcessingNodeCluster <em>Processing Node Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Node Cluster</em>'.
	 * @see es.unican.istr.pasys.pasys.ProcessingNodeCluster
	 * @generated
	 */
	EClass getProcessingNodeCluster();

	/**
	 * Returns the meta object for the reference list '{@link es.unican.istr.pasys.pasys.ProcessingNodeCluster#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see es.unican.istr.pasys.pasys.ProcessingNodeCluster#getNodes()
	 * @see #getProcessingNodeCluster()
	 * @generated
	 */
	EReference getProcessingNodeCluster_Nodes();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.OrchestrationCluster <em>Orchestration Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orchestration Cluster</em>'.
	 * @see es.unican.istr.pasys.pasys.OrchestrationCluster
	 * @generated
	 */
	EClass getOrchestrationCluster();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.KubernetesCluster <em>Kubernetes Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kubernetes Cluster</em>'.
	 * @see es.unican.istr.pasys.pasys.KubernetesCluster
	 * @generated
	 */
	EClass getKubernetesCluster();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.KubernetesCluster#getApiVersion <em>Api Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Version</em>'.
	 * @see es.unican.istr.pasys.pasys.KubernetesCluster#getApiVersion()
	 * @see #getKubernetesCluster()
	 * @generated
	 */
	EAttribute getKubernetesCluster_ApiVersion();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.KubernetesCluster#getKubeConfigPath <em>Kube Config Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kube Config Path</em>'.
	 * @see es.unican.istr.pasys.pasys.KubernetesCluster#getKubeConfigPath()
	 * @see #getKubernetesCluster()
	 * @generated
	 */
	EAttribute getKubernetesCluster_KubeConfigPath();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.SwarmCluster <em>Swarm Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swarm Cluster</em>'.
	 * @see es.unican.istr.pasys.pasys.SwarmCluster
	 * @generated
	 */
	EClass getSwarmCluster();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.SwarmCluster#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see es.unican.istr.pasys.pasys.SwarmCluster#getIp()
	 * @see #getSwarmCluster()
	 * @generated
	 */
	EAttribute getSwarmCluster_Ip();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.SwarmCluster#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see es.unican.istr.pasys.pasys.SwarmCluster#getPort()
	 * @see #getSwarmCluster()
	 * @generated
	 */
	EAttribute getSwarmCluster_Port();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.SwarmCluster#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see es.unican.istr.pasys.pasys.SwarmCluster#getUser()
	 * @see #getSwarmCluster()
	 * @generated
	 */
	EAttribute getSwarmCluster_User();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.NomadCluster <em>Nomad Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nomad Cluster</em>'.
	 * @see es.unican.istr.pasys.pasys.NomadCluster
	 * @generated
	 */
	EClass getNomadCluster();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.NomadCluster#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see es.unican.istr.pasys.pasys.NomadCluster#getIp()
	 * @see #getNomadCluster()
	 * @generated
	 */
	EAttribute getNomadCluster_Ip();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.NomadCluster#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see es.unican.istr.pasys.pasys.NomadCluster#getPort()
	 * @see #getNomadCluster()
	 * @generated
	 */
	EAttribute getNomadCluster_Port();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see es.unican.istr.pasys.pasys.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.Network#getBandwith <em>Bandwith</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bandwith</em>'.
	 * @see es.unican.istr.pasys.pasys.Network#getBandwith()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Bandwith();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.PlatformService <em>Platform Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Service</em>'.
	 * @see es.unican.istr.pasys.pasys.PlatformService
	 * @generated
	 */
	EClass getPlatformService();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.PlatformService#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host</em>'.
	 * @see es.unican.istr.pasys.pasys.PlatformService#getHost()
	 * @see #getPlatformService()
	 * @generated
	 */
	EReference getPlatformService_Host();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.SerializationService <em>Serialization Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serialization Service</em>'.
	 * @see es.unican.istr.pasys.pasys.SerializationService
	 * @generated
	 */
	EClass getSerializationService();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.DistributionService <em>Distribution Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution Service</em>'.
	 * @see es.unican.istr.pasys.pasys.DistributionService
	 * @generated
	 */
	EClass getDistributionService();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.CommunicationService <em>Communication Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Service</em>'.
	 * @see es.unican.istr.pasys.pasys.CommunicationService
	 * @generated
	 */
	EClass getCommunicationService();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.SchedulingService <em>Scheduling Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Service</em>'.
	 * @see es.unican.istr.pasys.pasys.SchedulingService
	 * @generated
	 */
	EClass getSchedulingService();

	/**
	 * Returns the meta object for the reference list '{@link es.unican.istr.pasys.pasys.SchedulingService#getWorkflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Workflows</em>'.
	 * @see es.unican.istr.pasys.pasys.SchedulingService#getWorkflows()
	 * @see #getSchedulingService()
	 * @generated
	 */
	EReference getSchedulingService_Workflows();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.SecurityService <em>Security Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Service</em>'.
	 * @see es.unican.istr.pasys.pasys.SecurityService
	 * @generated
	 */
	EClass getSecurityService();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.PersistenceService <em>Persistence Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Service</em>'.
	 * @see es.unican.istr.pasys.pasys.PersistenceService
	 * @generated
	 */
	EClass getPersistenceService();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.PersistenceService#getLogging <em>Logging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logging</em>'.
	 * @see es.unican.istr.pasys.pasys.PersistenceService#getLogging()
	 * @see #getPersistenceService()
	 * @generated
	 */
	EAttribute getPersistenceService_Logging();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.PersistenceService#getPasswd <em>Passwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passwd</em>'.
	 * @see es.unican.istr.pasys.pasys.PersistenceService#getPasswd()
	 * @see #getPersistenceService()
	 * @generated
	 */
	EAttribute getPersistenceService_Passwd();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.PersistenceService#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see es.unican.istr.pasys.pasys.PersistenceService#getPort()
	 * @see #getPersistenceService()
	 * @generated
	 */
	EAttribute getPersistenceService_Port();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.MonitoringService <em>Monitoring Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitoring Service</em>'.
	 * @see es.unican.istr.pasys.pasys.MonitoringService
	 * @generated
	 */
	EClass getMonitoringService();

	/**
	 * Returns the meta object for the reference list '{@link es.unican.istr.pasys.pasys.MonitoringService#getMonitorizedMeters <em>Monitorized Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Monitorized Meters</em>'.
	 * @see es.unican.istr.pasys.pasys.MonitoringService#getMonitorizedMeters()
	 * @see #getMonitoringService()
	 * @generated
	 */
	EReference getMonitoringService_MonitorizedMeters();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.AVROService <em>AVRO Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVRO Service</em>'.
	 * @see es.unican.istr.pasys.pasys.AVROService
	 * @generated
	 */
	EClass getAVROService();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.ZookeeperService <em>Zookeeper Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zookeeper Service</em>'.
	 * @see es.unican.istr.pasys.pasys.ZookeeperService
	 * @generated
	 */
	EClass getZookeeperService();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ZookeeperService#getServerId <em>Server Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Id</em>'.
	 * @see es.unican.istr.pasys.pasys.ZookeeperService#getServerId()
	 * @see #getZookeeperService()
	 * @generated
	 */
	EAttribute getZookeeperService_ServerId();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ZookeeperService#getClientPort <em>Client Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Port</em>'.
	 * @see es.unican.istr.pasys.pasys.ZookeeperService#getClientPort()
	 * @see #getZookeeperService()
	 * @generated
	 */
	EAttribute getZookeeperService_ClientPort();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ZookeeperService#getTickTime <em>Tick Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tick Time</em>'.
	 * @see es.unican.istr.pasys.pasys.ZookeeperService#getTickTime()
	 * @see #getZookeeperService()
	 * @generated
	 */
	EAttribute getZookeeperService_TickTime();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ZookeeperService#isLeaderServers <em>Leader Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leader Servers</em>'.
	 * @see es.unican.istr.pasys.pasys.ZookeeperService#isLeaderServers()
	 * @see #getZookeeperService()
	 * @generated
	 */
	EAttribute getZookeeperService_LeaderServers();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ZookeeperService#getPeerPort <em>Peer Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peer Port</em>'.
	 * @see es.unican.istr.pasys.pasys.ZookeeperService#getPeerPort()
	 * @see #getZookeeperService()
	 * @generated
	 */
	EAttribute getZookeeperService_PeerPort();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ZookeeperService#getLeaderPort <em>Leader Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leader Port</em>'.
	 * @see es.unican.istr.pasys.pasys.ZookeeperService#getLeaderPort()
	 * @see #getZookeeperService()
	 * @generated
	 */
	EAttribute getZookeeperService_LeaderPort();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ZookeeperService#getInitLimit <em>Init Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Limit</em>'.
	 * @see es.unican.istr.pasys.pasys.ZookeeperService#getInitLimit()
	 * @see #getZookeeperService()
	 * @generated
	 */
	EAttribute getZookeeperService_InitLimit();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ZookeeperService#getSyncLimit <em>Sync Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync Limit</em>'.
	 * @see es.unican.istr.pasys.pasys.ZookeeperService#getSyncLimit()
	 * @see #getZookeeperService()
	 * @generated
	 */
	EAttribute getZookeeperService_SyncLimit();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.KafkaService <em>Kafka Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kafka Service</em>'.
	 * @see es.unican.istr.pasys.pasys.KafkaService
	 * @generated
	 */
	EClass getKafkaService();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.KafkaService#getCommId <em>Comm Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comm Id</em>'.
	 * @see es.unican.istr.pasys.pasys.KafkaService#getCommId()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_CommId();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.KafkaService#getClientPort <em>Client Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Port</em>'.
	 * @see es.unican.istr.pasys.pasys.KafkaService#getClientPort()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_ClientPort();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.KafkaService#getZookeeperConnect <em>Zookeeper Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zookeeper Connect</em>'.
	 * @see es.unican.istr.pasys.pasys.KafkaService#getZookeeperConnect()
	 * @see #getKafkaService()
	 * @generated
	 */
	EReference getKafkaService_ZookeeperConnect();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.KafkaService#getZookeeperConnectionTimeout <em>Zookeeper Connection Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zookeeper Connection Timeout</em>'.
	 * @see es.unican.istr.pasys.pasys.KafkaService#getZookeeperConnectionTimeout()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_ZookeeperConnectionTimeout();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.KafkaService#getListeners <em>Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listeners</em>'.
	 * @see es.unican.istr.pasys.pasys.KafkaService#getListeners()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_Listeners();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.KafkaService#getAdvertisedListeners <em>Advertised Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Advertised Listeners</em>'.
	 * @see es.unican.istr.pasys.pasys.KafkaService#getAdvertisedListeners()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_AdvertisedListeners();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.KafkaService#isAutoCreateTopicEnable <em>Auto Create Topic Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Create Topic Enable</em>'.
	 * @see es.unican.istr.pasys.pasys.KafkaService#isAutoCreateTopicEnable()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_AutoCreateTopicEnable();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.KafkaService#isDeleteTopicEnable <em>Delete Topic Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete Topic Enable</em>'.
	 * @see es.unican.istr.pasys.pasys.KafkaService#isDeleteTopicEnable()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_DeleteTopicEnable();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.KafkaService#getNumPartitions <em>Num Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Partitions</em>'.
	 * @see es.unican.istr.pasys.pasys.KafkaService#getNumPartitions()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_NumPartitions();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.KafkaService#getNumRecoveryThreadsPerDataDir <em>Num Recovery Threads Per Data Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Recovery Threads Per Data Dir</em>'.
	 * @see es.unican.istr.pasys.pasys.KafkaService#getNumRecoveryThreadsPerDataDir()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_NumRecoveryThreadsPerDataDir();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.KafkaService#getLogFlushIntervalMessages <em>Log Flush Interval Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Flush Interval Messages</em>'.
	 * @see es.unican.istr.pasys.pasys.KafkaService#getLogFlushIntervalMessages()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_LogFlushIntervalMessages();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.KafkaService#getLogFlushInterval <em>Log Flush Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Flush Interval</em>'.
	 * @see es.unican.istr.pasys.pasys.KafkaService#getLogFlushInterval()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_LogFlushInterval();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.KafkaService#getNumNetworkThreads <em>Num Network Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Network Threads</em>'.
	 * @see es.unican.istr.pasys.pasys.KafkaService#getNumNetworkThreads()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_NumNetworkThreads();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.KafkaService#getNumIOThreads <em>Num IO Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num IO Threads</em>'.
	 * @see es.unican.istr.pasys.pasys.KafkaService#getNumIOThreads()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_NumIOThreads();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.KafkaService#getSocketSendBufferBytes <em>Socket Send Buffer Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Socket Send Buffer Bytes</em>'.
	 * @see es.unican.istr.pasys.pasys.KafkaService#getSocketSendBufferBytes()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_SocketSendBufferBytes();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.KafkaService#getSocketReceiveBufferBytes <em>Socket Receive Buffer Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Socket Receive Buffer Bytes</em>'.
	 * @see es.unican.istr.pasys.pasys.KafkaService#getSocketReceiveBufferBytes()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_SocketReceiveBufferBytes();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.KafkaService#getSocketRequestMaxBytes <em>Socket Request Max Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Socket Request Max Bytes</em>'.
	 * @see es.unican.istr.pasys.pasys.KafkaService#getSocketRequestMaxBytes()
	 * @see #getKafkaService()
	 * @generated
	 */
	EAttribute getKafkaService_SocketRequestMaxBytes();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.NodeScheduler <em>Node Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Scheduler</em>'.
	 * @see es.unican.istr.pasys.pasys.NodeScheduler
	 * @generated
	 */
	EClass getNodeScheduler();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.SparkService <em>Spark Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spark Service</em>'.
	 * @see es.unican.istr.pasys.pasys.SparkService
	 * @generated
	 */
	EClass getSparkService();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.SparkService#getLoad <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load</em>'.
	 * @see es.unican.istr.pasys.pasys.SparkService#getLoad()
	 * @see #getSparkService()
	 * @generated
	 */
	EReference getSparkService_Load();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.SparkService#getDriverCores <em>Driver Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Cores</em>'.
	 * @see es.unican.istr.pasys.pasys.SparkService#getDriverCores()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_DriverCores();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.SparkService#getDriverMaxResultSize <em>Driver Max Result Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Max Result Size</em>'.
	 * @see es.unican.istr.pasys.pasys.SparkService#getDriverMaxResultSize()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_DriverMaxResultSize();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.SparkService#getDriverMemory <em>Driver Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Memory</em>'.
	 * @see es.unican.istr.pasys.pasys.SparkService#getDriverMemory()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_DriverMemory();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.SparkService#getLocalDir <em>Local Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Dir</em>'.
	 * @see es.unican.istr.pasys.pasys.SparkService#getLocalDir()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_LocalDir();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.SparkService#getMaster <em>Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Master</em>'.
	 * @see es.unican.istr.pasys.pasys.SparkService#getMaster()
	 * @see #getSparkService()
	 * @generated
	 */
	EReference getSparkService_Master();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.SparkService#getWindowSize <em>Window Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Window Size</em>'.
	 * @see es.unican.istr.pasys.pasys.SparkService#getWindowSize()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_WindowSize();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.SparkService#getExecutorMemory <em>Executor Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executor Memory</em>'.
	 * @see es.unican.istr.pasys.pasys.SparkService#getExecutorMemory()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_ExecutorMemory();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.SparkService#getExtraListener <em>Extra Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Listener</em>'.
	 * @see es.unican.istr.pasys.pasys.SparkService#getExtraListener()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_ExtraListener();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.SparkService#isLogConf <em>Log Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Conf</em>'.
	 * @see es.unican.istr.pasys.pasys.SparkService#isLogConf()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_LogConf();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.SparkService#getSubmitDeployMode <em>Submit Deploy Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Submit Deploy Mode</em>'.
	 * @see es.unican.istr.pasys.pasys.SparkService#getSubmitDeployMode()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_SubmitDeployMode();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.SparkService#getLogCallerContext <em>Log Caller Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Caller Context</em>'.
	 * @see es.unican.istr.pasys.pasys.SparkService#getLogCallerContext()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_LogCallerContext();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.SparkService#isDriverSuperviser <em>Driver Superviser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver Superviser</em>'.
	 * @see es.unican.istr.pasys.pasys.SparkService#isDriverSuperviser()
	 * @see #getSparkService()
	 * @generated
	 */
	EAttribute getSparkService_DriverSuperviser();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.StormService <em>Storm Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storm Service</em>'.
	 * @see es.unican.istr.pasys.pasys.StormService
	 * @generated
	 */
	EClass getStormService();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.StormService#getZookeeperConnect <em>Zookeeper Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zookeeper Connect</em>'.
	 * @see es.unican.istr.pasys.pasys.StormService#getZookeeperConnect()
	 * @see #getStormService()
	 * @generated
	 */
	EReference getStormService_ZookeeperConnect();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.StormService#getLocalDir <em>Local Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Dir</em>'.
	 * @see es.unican.istr.pasys.pasys.StormService#getLocalDir()
	 * @see #getStormService()
	 * @generated
	 */
	EAttribute getStormService_LocalDir();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.istr.pasys.pasys.StormService#getNimbus <em>Nimbus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nimbus</em>'.
	 * @see es.unican.istr.pasys.pasys.StormService#getNimbus()
	 * @see #getStormService()
	 * @generated
	 */
	EReference getStormService_Nimbus();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.istr.pasys.pasys.StormService#getSupervisor <em>Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supervisor</em>'.
	 * @see es.unican.istr.pasys.pasys.StormService#getSupervisor()
	 * @see #getStormService()
	 * @generated
	 */
	EReference getStormService_Supervisor();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.istr.pasys.pasys.StormService#getUi <em>Ui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ui</em>'.
	 * @see es.unican.istr.pasys.pasys.StormService#getUi()
	 * @see #getStormService()
	 * @generated
	 */
	EReference getStormService_Ui();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.StormUI <em>Storm UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storm UI</em>'.
	 * @see es.unican.istr.pasys.pasys.StormUI
	 * @generated
	 */
	EClass getStormUI();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.StormUI#getUiPort <em>Ui Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ui Port</em>'.
	 * @see es.unican.istr.pasys.pasys.StormUI#getUiPort()
	 * @see #getStormUI()
	 * @generated
	 */
	EAttribute getStormUI_UiPort();

	/**
	 * Returns the meta object for the container reference '{@link es.unican.istr.pasys.pasys.StormUI#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see es.unican.istr.pasys.pasys.StormUI#getOwner()
	 * @see #getStormUI()
	 * @generated
	 */
	EReference getStormUI_Owner();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.StormUI#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host</em>'.
	 * @see es.unican.istr.pasys.pasys.StormUI#getHost()
	 * @see #getStormUI()
	 * @generated
	 */
	EReference getStormUI_Host();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.StormNimbus <em>Storm Nimbus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storm Nimbus</em>'.
	 * @see es.unican.istr.pasys.pasys.StormNimbus
	 * @generated
	 */
	EClass getStormNimbus();

	/**
	 * Returns the meta object for the container reference '{@link es.unican.istr.pasys.pasys.StormNimbus#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see es.unican.istr.pasys.pasys.StormNimbus#getOwner()
	 * @see #getStormNimbus()
	 * @generated
	 */
	EReference getStormNimbus_Owner();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.StormNimbus#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host</em>'.
	 * @see es.unican.istr.pasys.pasys.StormNimbus#getHost()
	 * @see #getStormNimbus()
	 * @generated
	 */
	EReference getStormNimbus_Host();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.StormSupervisor <em>Storm Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storm Supervisor</em>'.
	 * @see es.unican.istr.pasys.pasys.StormSupervisor
	 * @generated
	 */
	EClass getStormSupervisor();

	/**
	 * Returns the meta object for the attribute list '{@link es.unican.istr.pasys.pasys.StormSupervisor#getSupervisorSlotPorts <em>Supervisor Slot Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supervisor Slot Ports</em>'.
	 * @see es.unican.istr.pasys.pasys.StormSupervisor#getSupervisorSlotPorts()
	 * @see #getStormSupervisor()
	 * @generated
	 */
	EAttribute getStormSupervisor_SupervisorSlotPorts();

	/**
	 * Returns the meta object for the container reference '{@link es.unican.istr.pasys.pasys.StormSupervisor#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see es.unican.istr.pasys.pasys.StormSupervisor#getOwner()
	 * @see #getStormSupervisor()
	 * @generated
	 */
	EReference getStormSupervisor_Owner();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.StormSupervisor#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host</em>'.
	 * @see es.unican.istr.pasys.pasys.StormSupervisor#getHost()
	 * @see #getStormSupervisor()
	 * @generated
	 */
	EReference getStormSupervisor_Host();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.Neo4JService <em>Neo4 JService</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neo4 JService</em>'.
	 * @see es.unican.istr.pasys.pasys.Neo4JService
	 * @generated
	 */
	EClass getNeo4JService();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.MemSQLService <em>Mem SQL Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mem SQL Service</em>'.
	 * @see es.unican.istr.pasys.pasys.MemSQLService
	 * @generated
	 */
	EClass getMemSQLService();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.CassandraService <em>Cassandra Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cassandra Service</em>'.
	 * @see es.unican.istr.pasys.pasys.CassandraService
	 * @generated
	 */
	EClass getCassandraService();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.CassandraService#getNumTokens <em>Num Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Tokens</em>'.
	 * @see es.unican.istr.pasys.pasys.CassandraService#getNumTokens()
	 * @see #getCassandraService()
	 * @generated
	 */
	EAttribute getCassandraService_NumTokens();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.CassandraService#getSeeds <em>Seeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seeds</em>'.
	 * @see es.unican.istr.pasys.pasys.CassandraService#getSeeds()
	 * @see #getCassandraService()
	 * @generated
	 */
	EReference getCassandraService_Seeds();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.CassandraService#getSeedProviderClass <em>Seed Provider Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seed Provider Class</em>'.
	 * @see es.unican.istr.pasys.pasys.CassandraService#getSeedProviderClass()
	 * @see #getCassandraService()
	 * @generated
	 */
	EAttribute getCassandraService_SeedProviderClass();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.CassandraService#getEndpointSnitch <em>Endpoint Snitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint Snitch</em>'.
	 * @see es.unican.istr.pasys.pasys.CassandraService#getEndpointSnitch()
	 * @see #getCassandraService()
	 * @generated
	 */
	EAttribute getCassandraService_EndpointSnitch();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.CassandraService#getDataFileDir <em>Data File Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data File Dir</em>'.
	 * @see es.unican.istr.pasys.pasys.CassandraService#getDataFileDir()
	 * @see #getCassandraService()
	 * @generated
	 */
	EAttribute getCassandraService_DataFileDir();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.CassandraService#getStoragePort <em>Storage Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Port</em>'.
	 * @see es.unican.istr.pasys.pasys.CassandraService#getStoragePort()
	 * @see #getCassandraService()
	 * @generated
	 */
	EAttribute getCassandraService_StoragePort();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.CassandraService#isAutoBootstrap <em>Auto Bootstrap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Bootstrap</em>'.
	 * @see es.unican.istr.pasys.pasys.CassandraService#isAutoBootstrap()
	 * @see #getCassandraService()
	 * @generated
	 */
	EAttribute getCassandraService_AutoBootstrap();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.istr.pasys.pasys.CassandraService#getCqlSchemas <em>Cql Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cql Schemas</em>'.
	 * @see es.unican.istr.pasys.pasys.CassandraService#getCqlSchemas()
	 * @see #getCassandraService()
	 * @generated
	 */
	EReference getCassandraService_CqlSchemas();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.istr.pasys.pasys.CassandraService#getDataCenters <em>Data Centers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Centers</em>'.
	 * @see es.unican.istr.pasys.pasys.CassandraService#getDataCenters()
	 * @see #getCassandraService()
	 * @generated
	 */
	EReference getCassandraService_DataCenters();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.CassandraService#getSslStoragePort <em>Ssl Storage Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssl Storage Port</em>'.
	 * @see es.unican.istr.pasys.pasys.CassandraService#getSslStoragePort()
	 * @see #getCassandraService()
	 * @generated
	 */
	EAttribute getCassandraService_SslStoragePort();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.CassandraService#getRpcPort <em>Rpc Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rpc Port</em>'.
	 * @see es.unican.istr.pasys.pasys.CassandraService#getRpcPort()
	 * @see #getCassandraService()
	 * @generated
	 */
	EAttribute getCassandraService_RpcPort();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.DataCenter <em>Data Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Center</em>'.
	 * @see es.unican.istr.pasys.pasys.DataCenter
	 * @generated
	 */
	EClass getDataCenter();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.istr.pasys.pasys.DataCenter#getRacks <em>Racks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Racks</em>'.
	 * @see es.unican.istr.pasys.pasys.DataCenter#getRacks()
	 * @see #getDataCenter()
	 * @generated
	 */
	EReference getDataCenter_Racks();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.Rack <em>Rack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rack</em>'.
	 * @see es.unican.istr.pasys.pasys.Rack
	 * @generated
	 */
	EClass getRack();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.Rack#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nodes</em>'.
	 * @see es.unican.istr.pasys.pasys.Rack#getNodes()
	 * @see #getRack()
	 * @generated
	 */
	EReference getRack_Nodes();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.PrometheusService <em>Prometheus Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prometheus Service</em>'.
	 * @see es.unican.istr.pasys.pasys.PrometheusService
	 * @generated
	 */
	EClass getPrometheusService();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.istr.pasys.pasys.PrometheusService#getExportersData <em>Exporters Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exporters Data</em>'.
	 * @see es.unican.istr.pasys.pasys.PrometheusService#getExportersData()
	 * @see #getPrometheusService()
	 * @generated
	 */
	EReference getPrometheusService_ExportersData();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.ExporterData <em>Exporter Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exporter Data</em>'.
	 * @see es.unican.istr.pasys.pasys.ExporterData
	 * @generated
	 */
	EClass getExporterData();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ExporterData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.unican.istr.pasys.pasys.ExporterData#getName()
	 * @see #getExporterData()
	 * @generated
	 */
	EAttribute getExporterData_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ExporterData#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact</em>'.
	 * @see es.unican.istr.pasys.pasys.ExporterData#getArtifact()
	 * @see #getExporterData()
	 * @generated
	 */
	EAttribute getExporterData_Artifact();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.StreamData <em>Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream Data</em>'.
	 * @see es.unican.istr.pasys.pasys.StreamData
	 * @generated
	 */
	EClass getStreamData();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.StreamData#getRetention_ms <em>Retention ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retention ms</em>'.
	 * @see es.unican.istr.pasys.pasys.StreamData#getRetention_ms()
	 * @see #getStreamData()
	 * @generated
	 */
	EAttribute getStreamData_Retention_ms();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.StreamData#getRetention_bytes <em>Retention bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retention bytes</em>'.
	 * @see es.unican.istr.pasys.pasys.StreamData#getRetention_bytes()
	 * @see #getStreamData()
	 * @generated
	 */
	EAttribute getStreamData_Retention_bytes();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.StreamData#isCleanupPolicy <em>Cleanup Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cleanup Policy</em>'.
	 * @see es.unican.istr.pasys.pasys.StreamData#isCleanupPolicy()
	 * @see #getStreamData()
	 * @generated
	 */
	EAttribute getStreamData_CleanupPolicy();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.StreamData#getNumPartitions <em>Num Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Partitions</em>'.
	 * @see es.unican.istr.pasys.pasys.StreamData#getNumPartitions()
	 * @see #getStreamData()
	 * @generated
	 */
	EAttribute getStreamData_NumPartitions();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.StreamData#getNumReplication <em>Num Replication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Replication</em>'.
	 * @see es.unican.istr.pasys.pasys.StreamData#getNumReplication()
	 * @see #getStreamData()
	 * @generated
	 */
	EAttribute getStreamData_NumReplication();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.istr.pasys.pasys.StreamData#getOwnedMeters <em>Owned Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Meters</em>'.
	 * @see es.unican.istr.pasys.pasys.StreamData#getOwnedMeters()
	 * @see #getStreamData()
	 * @generated
	 */
	EReference getStreamData_OwnedMeters();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.istr.pasys.pasys.StreamData#getAssignedPartition <em>Assigned Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assigned Partition</em>'.
	 * @see es.unican.istr.pasys.pasys.StreamData#getAssignedPartition()
	 * @see #getStreamData()
	 * @generated
	 */
	EReference getStreamData_AssignedPartition();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.StreamData#getMessageSize <em>Message Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Size</em>'.
	 * @see es.unican.istr.pasys.pasys.StreamData#getMessageSize()
	 * @see #getStreamData()
	 * @generated
	 */
	EAttribute getStreamData_MessageSize();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.StreamData#getSchemaFile <em>Schema File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema File</em>'.
	 * @see es.unican.istr.pasys.pasys.StreamData#getSchemaFile()
	 * @see #getStreamData()
	 * @generated
	 */
	EAttribute getStreamData_SchemaFile();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.StreamDataPartition <em>Stream Data Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream Data Partition</em>'.
	 * @see es.unican.istr.pasys.pasys.StreamDataPartition
	 * @generated
	 */
	EClass getStreamDataPartition();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.StreamDataPartition#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see es.unican.istr.pasys.pasys.StreamDataPartition#getKey()
	 * @see #getStreamDataPartition()
	 * @generated
	 */
	EAttribute getStreamDataPartition_Key();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.StreamDataPartition#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host</em>'.
	 * @see es.unican.istr.pasys.pasys.StreamDataPartition#getHost()
	 * @see #getStreamDataPartition()
	 * @generated
	 */
	EReference getStreamDataPartition_Host();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.WorkflowStreamData <em>Workflow Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Stream Data</em>'.
	 * @see es.unican.istr.pasys.pasys.WorkflowStreamData
	 * @generated
	 */
	EClass getWorkflowStreamData();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.WorkflowStreamData#isIsSingleUse <em>Is Single Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Single Use</em>'.
	 * @see es.unican.istr.pasys.pasys.WorkflowStreamData#isIsSingleUse()
	 * @see #getWorkflowStreamData()
	 * @generated
	 */
	EAttribute getWorkflowStreamData_IsSingleUse();

	/**
	 * Returns the meta object for the container reference '{@link es.unican.istr.pasys.pasys.WorkflowStreamData#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see es.unican.istr.pasys.pasys.WorkflowStreamData#getOwner()
	 * @see #getWorkflowStreamData()
	 * @generated
	 */
	EReference getWorkflowStreamData_Owner();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.FlowStreamData <em>Flow Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Stream Data</em>'.
	 * @see es.unican.istr.pasys.pasys.FlowStreamData
	 * @generated
	 */
	EClass getFlowStreamData();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.FlowStreamData#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see es.unican.istr.pasys.pasys.FlowStreamData#getSource()
	 * @see #getFlowStreamData()
	 * @generated
	 */
	EReference getFlowStreamData_Source();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.FlowStreamData#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecessor</em>'.
	 * @see es.unican.istr.pasys.pasys.FlowStreamData#getPredecessor()
	 * @see #getFlowStreamData()
	 * @generated
	 */
	EReference getFlowStreamData_Predecessor();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.FlowStreamData#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Holder</em>'.
	 * @see es.unican.istr.pasys.pasys.FlowStreamData#getHolder()
	 * @see #getFlowStreamData()
	 * @generated
	 */
	EReference getFlowStreamData_Holder();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.FlowStreamData#isIsImplemented <em>Is Implemented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Implemented</em>'.
	 * @see es.unican.istr.pasys.pasys.FlowStreamData#isIsImplemented()
	 * @see #getFlowStreamData()
	 * @generated
	 */
	EAttribute getFlowStreamData_IsImplemented();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.KafkaFlowStreamData <em>Kafka Flow Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kafka Flow Stream Data</em>'.
	 * @see es.unican.istr.pasys.pasys.KafkaFlowStreamData
	 * @generated
	 */
	EClass getKafkaFlowStreamData();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.DerivedStreamData <em>Derived Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Stream Data</em>'.
	 * @see es.unican.istr.pasys.pasys.DerivedStreamData
	 * @generated
	 */
	EClass getDerivedStreamData();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.DerivedStreamData#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see es.unican.istr.pasys.pasys.DerivedStreamData#getPattern()
	 * @see #getDerivedStreamData()
	 * @generated
	 */
	EAttribute getDerivedStreamData_Pattern();

	/**
	 * Returns the meta object for the reference list '{@link es.unican.istr.pasys.pasys.DerivedStreamData#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see es.unican.istr.pasys.pasys.DerivedStreamData#getInputs()
	 * @see #getDerivedStreamData()
	 * @generated
	 */
	EReference getDerivedStreamData_Inputs();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.WorkloadStreamData <em>Workload Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workload Stream Data</em>'.
	 * @see es.unican.istr.pasys.pasys.WorkloadStreamData
	 * @generated
	 */
	EClass getWorkloadStreamData();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.WorkloadStreamData#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Holder</em>'.
	 * @see es.unican.istr.pasys.pasys.WorkloadStreamData#getHolder()
	 * @see #getWorkloadStreamData()
	 * @generated
	 */
	EReference getWorkloadStreamData_Holder();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.KafkaWorkloadStreamData <em>Kafka Workload Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kafka Workload Stream Data</em>'.
	 * @see es.unican.istr.pasys.pasys.KafkaWorkloadStreamData
	 * @generated
	 */
	EClass getKafkaWorkloadStreamData();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see es.unican.istr.pasys.pasys.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.istr.pasys.pasys.Workflow#getOwnedStreamData <em>Owned Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Stream Data</em>'.
	 * @see es.unican.istr.pasys.pasys.Workflow#getOwnedStreamData()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_OwnedStreamData();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.istr.pasys.pasys.Workflow#getOwnedTasks <em>Owned Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Tasks</em>'.
	 * @see es.unican.istr.pasys.pasys.Workflow#getOwnedTasks()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_OwnedTasks();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.Workflow#getRootTask <em>Root Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Task</em>'.
	 * @see es.unican.istr.pasys.pasys.Workflow#getRootTask()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_RootTask();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.istr.pasys.pasys.Workflow#getOwnedTaskExecutors <em>Owned Task Executors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Task Executors</em>'.
	 * @see es.unican.istr.pasys.pasys.Workflow#getOwnedTaskExecutors()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_OwnedTaskExecutors();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.Workflow#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduler</em>'.
	 * @see es.unican.istr.pasys.pasys.Workflow#getScheduler()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Scheduler();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.istr.pasys.pasys.Workflow#getOwnedMeters <em>Owned Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Meters</em>'.
	 * @see es.unican.istr.pasys.pasys.Workflow#getOwnedMeters()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_OwnedMeters();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.SchedulableSet <em>Schedulable Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedulable Set</em>'.
	 * @see es.unican.istr.pasys.pasys.SchedulableSet
	 * @generated
	 */
	EClass getSchedulableSet();

	/**
	 * Returns the meta object for the reference list '{@link es.unican.istr.pasys.pasys.SchedulableSet#getWorkflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Workflows</em>'.
	 * @see es.unican.istr.pasys.pasys.SchedulableSet#getWorkflows()
	 * @see #getSchedulableSet()
	 * @generated
	 */
	EReference getSchedulableSet_Workflows();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see es.unican.istr.pasys.pasys.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the container reference '{@link es.unican.istr.pasys.pasys.Task#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see es.unican.istr.pasys.pasys.Task#getOwner()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Owner();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.Task#getImplementingClassName <em>Implementing Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementing Class Name</em>'.
	 * @see es.unican.istr.pasys.pasys.Task#getImplementingClassName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ImplementingClassName();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.Task#getReturnedStreamData <em>Returned Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Returned Stream Data</em>'.
	 * @see es.unican.istr.pasys.pasys.Task#getReturnedStreamData()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_ReturnedStreamData();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.Task#getTriggerStreamData <em>Trigger Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger Stream Data</em>'.
	 * @see es.unican.istr.pasys.pasys.Task#getTriggerStreamData()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_TriggerStreamData();

	/**
	 * Returns the meta object for the reference list '{@link es.unican.istr.pasys.pasys.Task#getInputStreamData <em>Input Stream Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Stream Data</em>'.
	 * @see es.unican.istr.pasys.pasys.Task#getInputStreamData()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_InputStreamData();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.TaskExecutor <em>Task Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Executor</em>'.
	 * @see es.unican.istr.pasys.pasys.TaskExecutor
	 * @generated
	 */
	EClass getTaskExecutor();

	/**
	 * Returns the meta object for the container reference '{@link es.unican.istr.pasys.pasys.TaskExecutor#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see es.unican.istr.pasys.pasys.TaskExecutor#getOwner()
	 * @see #getTaskExecutor()
	 * @generated
	 */
	EReference getTaskExecutor_Owner();

	/**
	 * Returns the meta object for the reference list '{@link es.unican.istr.pasys.pasys.TaskExecutor#getExecutedTasks <em>Executed Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executed Tasks</em>'.
	 * @see es.unican.istr.pasys.pasys.TaskExecutor#getExecutedTasks()
	 * @see #getTaskExecutor()
	 * @generated
	 */
	EReference getTaskExecutor_ExecutedTasks();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.istr.pasys.pasys.TaskExecutor#getOwnedMeters <em>Owned Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Meters</em>'.
	 * @see es.unican.istr.pasys.pasys.TaskExecutor#getOwnedMeters()
	 * @see #getTaskExecutor()
	 * @generated
	 */
	EReference getTaskExecutor_OwnedMeters();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see es.unican.istr.pasys.pasys.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.ProcessingNodeUtilization <em>Processing Node Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Node Utilization</em>'.
	 * @see es.unican.istr.pasys.pasys.ProcessingNodeUtilization
	 * @generated
	 */
	EClass getProcessingNodeUtilization();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.ProcessingNodeUtilization#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see es.unican.istr.pasys.pasys.ProcessingNodeUtilization#getTarget()
	 * @see #getProcessingNodeUtilization()
	 * @generated
	 */
	EReference getProcessingNodeUtilization_Target();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.ProcessingNodeMemory <em>Processing Node Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Node Memory</em>'.
	 * @see es.unican.istr.pasys.pasys.ProcessingNodeMemory
	 * @generated
	 */
	EClass getProcessingNodeMemory();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.ProcessingNodeMemory#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see es.unican.istr.pasys.pasys.ProcessingNodeMemory#getTarget()
	 * @see #getProcessingNodeMemory()
	 * @generated
	 */
	EReference getProcessingNodeMemory_Target();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.NetworkUtilization <em>Network Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Utilization</em>'.
	 * @see es.unican.istr.pasys.pasys.NetworkUtilization
	 * @generated
	 */
	EClass getNetworkUtilization();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.NetworkUtilization#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see es.unican.istr.pasys.pasys.NetworkUtilization#getTarget()
	 * @see #getNetworkUtilization()
	 * @generated
	 */
	EReference getNetworkUtilization_Target();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.WorkflowLatency <em>Workflow Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Latency</em>'.
	 * @see es.unican.istr.pasys.pasys.WorkflowLatency
	 * @generated
	 */
	EClass getWorkflowLatency();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.WorkflowLatency#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see es.unican.istr.pasys.pasys.WorkflowLatency#getTarget()
	 * @see #getWorkflowLatency()
	 * @generated
	 */
	EReference getWorkflowLatency_Target();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.TaskProcessingAmount <em>Task Processing Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Processing Amount</em>'.
	 * @see es.unican.istr.pasys.pasys.TaskProcessingAmount
	 * @generated
	 */
	EClass getTaskProcessingAmount();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.TaskProcessingAmount#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see es.unican.istr.pasys.pasys.TaskProcessingAmount#getTarget()
	 * @see #getTaskProcessingAmount()
	 * @generated
	 */
	EReference getTaskProcessingAmount_Target();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.TaskProcessingAmount#getHistogramBuckectNum <em>Histogram Buckect Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Histogram Buckect Num</em>'.
	 * @see es.unican.istr.pasys.pasys.TaskProcessingAmount#getHistogramBuckectNum()
	 * @see #getTaskProcessingAmount()
	 * @generated
	 */
	EAttribute getTaskProcessingAmount_HistogramBuckectNum();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.TaskProcessingAmount#getExpectedMaxTPA <em>Expected Max TPA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Max TPA</em>'.
	 * @see es.unican.istr.pasys.pasys.TaskProcessingAmount#getExpectedMaxTPA()
	 * @see #getTaskProcessingAmount()
	 * @generated
	 */
	EAttribute getTaskProcessingAmount_ExpectedMaxTPA();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.TaskProcessingAmount#getExpectedMinTPA <em>Expected Min TPA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Min TPA</em>'.
	 * @see es.unican.istr.pasys.pasys.TaskProcessingAmount#getExpectedMinTPA()
	 * @see #getTaskProcessingAmount()
	 * @generated
	 */
	EAttribute getTaskProcessingAmount_ExpectedMinTPA();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.TaskProcessingAmount#isLinearBucketDistribution <em>Linear Bucket Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linear Bucket Distribution</em>'.
	 * @see es.unican.istr.pasys.pasys.TaskProcessingAmount#isLinearBucketDistribution()
	 * @see #getTaskProcessingAmount()
	 * @generated
	 */
	EAttribute getTaskProcessingAmount_LinearBucketDistribution();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.StreamDataRate <em>Stream Data Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream Data Rate</em>'.
	 * @see es.unican.istr.pasys.pasys.StreamDataRate
	 * @generated
	 */
	EClass getStreamDataRate();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.StreamDataRate#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see es.unican.istr.pasys.pasys.StreamDataRate#getTarget()
	 * @see #getStreamDataRate()
	 * @generated
	 */
	EReference getStreamDataRate_Target();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter</em>'.
	 * @see es.unican.istr.pasys.pasys.Meter
	 * @generated
	 */
	EClass getMeter();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.Meter#getMonitoringServer <em>Monitoring Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Monitoring Server</em>'.
	 * @see es.unican.istr.pasys.pasys.Meter#getMonitoringServer()
	 * @see #getMeter()
	 * @generated
	 */
	EReference getMeter_MonitoringServer();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.PrometheusMeter <em>Prometheus Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prometheus Meter</em>'.
	 * @see es.unican.istr.pasys.pasys.PrometheusMeter
	 * @generated
	 */
	EClass getPrometheusMeter();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.PrometheusMeter#getMonitoringPort <em>Monitoring Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitoring Port</em>'.
	 * @see es.unican.istr.pasys.pasys.PrometheusMeter#getMonitoringPort()
	 * @see #getPrometheusMeter()
	 * @generated
	 */
	EAttribute getPrometheusMeter_MonitoringPort();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.PrometheusMeter#getMonitoringTime <em>Monitoring Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitoring Time</em>'.
	 * @see es.unican.istr.pasys.pasys.PrometheusMeter#getMonitoringTime()
	 * @see #getPrometheusMeter()
	 * @generated
	 */
	EAttribute getPrometheusMeter_MonitoringTime();

	/**
	 * Returns the meta object for the '{@link es.unican.istr.pasys.pasys.PrometheusMeter#getPrometheusServerConfiguration() <em>Get Prometheus Server Configuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Prometheus Server Configuration</em>' operation.
	 * @see es.unican.istr.pasys.pasys.PrometheusMeter#getPrometheusServerConfiguration()
	 * @generated
	 */
	EOperation getPrometheusMeter__GetPrometheusServerConfiguration();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.NodeHostedMeter <em>Node Hosted Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Hosted Meter</em>'.
	 * @see es.unican.istr.pasys.pasys.NodeHostedMeter
	 * @generated
	 */
	EClass getNodeHostedMeter();

	/**
	 * Returns the meta object for the container reference '{@link es.unican.istr.pasys.pasys.NodeHostedMeter#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see es.unican.istr.pasys.pasys.NodeHostedMeter#getOwner()
	 * @see #getNodeHostedMeter()
	 * @generated
	 */
	EReference getNodeHostedMeter_Owner();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.NodeResourceMeter <em>Node Resource Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Resource Meter</em>'.
	 * @see es.unican.istr.pasys.pasys.NodeResourceMeter
	 * @generated
	 */
	EClass getNodeResourceMeter();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.NodeResourceMeter#getUMetric <em>UMetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>UMetric</em>'.
	 * @see es.unican.istr.pasys.pasys.NodeResourceMeter#getUMetric()
	 * @see #getNodeResourceMeter()
	 * @generated
	 */
	EReference getNodeResourceMeter_UMetric();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.NodeResourceMeter#getMMetric <em>MMetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>MMetric</em>'.
	 * @see es.unican.istr.pasys.pasys.NodeResourceMeter#getMMetric()
	 * @see #getNodeResourceMeter()
	 * @generated
	 */
	EReference getNodeResourceMeter_MMetric();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.CommunicationMeter <em>Communication Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Meter</em>'.
	 * @see es.unican.istr.pasys.pasys.CommunicationMeter
	 * @generated
	 */
	EClass getCommunicationMeter();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.CommunicationMeter#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric</em>'.
	 * @see es.unican.istr.pasys.pasys.CommunicationMeter#getMetric()
	 * @see #getCommunicationMeter()
	 * @generated
	 */
	EReference getCommunicationMeter_Metric();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.StreamRateMeter <em>Stream Rate Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream Rate Meter</em>'.
	 * @see es.unican.istr.pasys.pasys.StreamRateMeter
	 * @generated
	 */
	EClass getStreamRateMeter();

	/**
	 * Returns the meta object for the container reference '{@link es.unican.istr.pasys.pasys.StreamRateMeter#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see es.unican.istr.pasys.pasys.StreamRateMeter#getOwner()
	 * @see #getStreamRateMeter()
	 * @generated
	 */
	EReference getStreamRateMeter_Owner();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.StreamRateMeter#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric</em>'.
	 * @see es.unican.istr.pasys.pasys.StreamRateMeter#getMetric()
	 * @see #getStreamRateMeter()
	 * @generated
	 */
	EReference getStreamRateMeter_Metric();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.WorkflowLatencyMeter <em>Workflow Latency Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Latency Meter</em>'.
	 * @see es.unican.istr.pasys.pasys.WorkflowLatencyMeter
	 * @generated
	 */
	EClass getWorkflowLatencyMeter();

	/**
	 * Returns the meta object for the container reference '{@link es.unican.istr.pasys.pasys.WorkflowLatencyMeter#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see es.unican.istr.pasys.pasys.WorkflowLatencyMeter#getOwner()
	 * @see #getWorkflowLatencyMeter()
	 * @generated
	 */
	EReference getWorkflowLatencyMeter_Owner();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.WorkflowLatencyMeter#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric</em>'.
	 * @see es.unican.istr.pasys.pasys.WorkflowLatencyMeter#getMetric()
	 * @see #getWorkflowLatencyMeter()
	 * @generated
	 */
	EReference getWorkflowLatencyMeter_Metric();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.TaskProcessingAmountMeter <em>Task Processing Amount Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Processing Amount Meter</em>'.
	 * @see es.unican.istr.pasys.pasys.TaskProcessingAmountMeter
	 * @generated
	 */
	EClass getTaskProcessingAmountMeter();

	/**
	 * Returns the meta object for the container reference '{@link es.unican.istr.pasys.pasys.TaskProcessingAmountMeter#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see es.unican.istr.pasys.pasys.TaskProcessingAmountMeter#getOwner()
	 * @see #getTaskProcessingAmountMeter()
	 * @generated
	 */
	EReference getTaskProcessingAmountMeter_Owner();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.TaskProcessingAmountMeter#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric</em>'.
	 * @see es.unican.istr.pasys.pasys.TaskProcessingAmountMeter#getMetric()
	 * @see #getTaskProcessingAmountMeter()
	 * @generated
	 */
	EReference getTaskProcessingAmountMeter_Metric();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.DeployableComponent <em>Deployable Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployable Component</em>'.
	 * @see es.unican.istr.pasys.pasys.DeployableComponent
	 * @generated
	 */
	EClass getDeployableComponent();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.istr.pasys.pasys.DeployableComponent#getDeploymentConfig <em>Deployment Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deployment Config</em>'.
	 * @see es.unican.istr.pasys.pasys.DeployableComponent#getDeploymentConfig()
	 * @see #getDeployableComponent()
	 * @generated
	 */
	EReference getDeployableComponent_DeploymentConfig();

	/**
	 * Returns the meta object for the '{@link es.unican.istr.pasys.pasys.DeployableComponent#configureDeployment() <em>Configure Deployment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Configure Deployment</em>' operation.
	 * @see es.unican.istr.pasys.pasys.DeployableComponent#configureDeployment()
	 * @generated
	 */
	EOperation getDeployableComponent__ConfigureDeployment();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.DeploymentConfiguration <em>Deployment Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Configuration</em>'.
	 * @see es.unican.istr.pasys.pasys.DeploymentConfiguration
	 * @generated
	 */
	EClass getDeploymentConfiguration();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.PlatformServiceDeploymentConf <em>Platform Service Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Service Deployment Conf</em>'.
	 * @see es.unican.istr.pasys.pasys.PlatformServiceDeploymentConf
	 * @generated
	 */
	EClass getPlatformServiceDeploymentConf();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.OrchestratorDeploymentConf <em>Orchestrator Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orchestrator Deployment Conf</em>'.
	 * @see es.unican.istr.pasys.pasys.OrchestratorDeploymentConf
	 * @generated
	 */
	EClass getOrchestratorDeploymentConf();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getImage()
	 * @see #getOrchestratorDeploymentConf()
	 * @generated
	 */
	EAttribute getOrchestratorDeploymentConf_Image();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getImageTag <em>Image Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Tag</em>'.
	 * @see es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getImageTag()
	 * @see #getOrchestratorDeploymentConf()
	 * @generated
	 */
	EAttribute getOrchestratorDeploymentConf_ImageTag();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getImagePullPolicy <em>Image Pull Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Pull Policy</em>'.
	 * @see es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getImagePullPolicy()
	 * @see #getOrchestratorDeploymentConf()
	 * @generated
	 */
	EAttribute getOrchestratorDeploymentConf_ImagePullPolicy();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getReplicas <em>Replicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replicas</em>'.
	 * @see es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getReplicas()
	 * @see #getOrchestratorDeploymentConf()
	 * @generated
	 */
	EAttribute getOrchestratorDeploymentConf_Replicas();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getCommand()
	 * @see #getOrchestratorDeploymentConf()
	 * @generated
	 */
	EAttribute getOrchestratorDeploymentConf_Command();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Args</em>'.
	 * @see es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getArgs()
	 * @see #getOrchestratorDeploymentConf()
	 * @generated
	 */
	EAttribute getOrchestratorDeploymentConf_Args();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getRestartPolicy <em>Restart Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart Policy</em>'.
	 * @see es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getRestartPolicy()
	 * @see #getOrchestratorDeploymentConf()
	 * @generated
	 */
	EAttribute getOrchestratorDeploymentConf_RestartPolicy();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Env</em>'.
	 * @see es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getEnv()
	 * @see #getOrchestratorDeploymentConf()
	 * @generated
	 */
	EAttribute getOrchestratorDeploymentConf_Env();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volumes</em>'.
	 * @see es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getVolumes()
	 * @see #getOrchestratorDeploymentConf()
	 * @generated
	 */
	EReference getOrchestratorDeploymentConf_Volumes();

	/**
	 * Returns the meta object for the containment reference list '{@link es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getPorts()
	 * @see #getOrchestratorDeploymentConf()
	 * @generated
	 */
	EReference getOrchestratorDeploymentConf_Ports();

	/**
	 * Returns the meta object for the containment reference '{@link es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see es.unican.istr.pasys.pasys.OrchestratorDeploymentConf#getConstraints()
	 * @see #getOrchestratorDeploymentConf()
	 * @generated
	 */
	EReference getOrchestratorDeploymentConf_Constraints();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.NodeDeploymentConf <em>Node Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Deployment Conf</em>'.
	 * @see es.unican.istr.pasys.pasys.NodeDeploymentConf
	 * @generated
	 */
	EClass getNodeDeploymentConf();

	/**
	 * Returns the meta object for the attribute list '{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Arguments</em>'.
	 * @see es.unican.istr.pasys.pasys.NodeDeploymentConf#getArguments()
	 * @see #getNodeDeploymentConf()
	 * @generated
	 */
	EAttribute getNodeDeploymentConf_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getArtifactLocator <em>Artifact Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Locator</em>'.
	 * @see es.unican.istr.pasys.pasys.NodeDeploymentConf#getArtifactLocator()
	 * @see #getNodeDeploymentConf()
	 * @generated
	 */
	EAttribute getNodeDeploymentConf_ArtifactLocator();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getArtifactName <em>Artifact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Name</em>'.
	 * @see es.unican.istr.pasys.pasys.NodeDeploymentConf#getArtifactName()
	 * @see #getNodeDeploymentConf()
	 * @generated
	 */
	EAttribute getNodeDeploymentConf_ArtifactName();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getConfigFolderPath <em>Config Folder Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Folder Path</em>'.
	 * @see es.unican.istr.pasys.pasys.NodeDeploymentConf#getConfigFolderPath()
	 * @see #getNodeDeploymentConf()
	 * @generated
	 */
	EAttribute getNodeDeploymentConf_ConfigFolderPath();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getScriptFolderPath <em>Script Folder Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Folder Path</em>'.
	 * @see es.unican.istr.pasys.pasys.NodeDeploymentConf#getScriptFolderPath()
	 * @see #getNodeDeploymentConf()
	 * @generated
	 */
	EAttribute getNodeDeploymentConf_ScriptFolderPath();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getDataFolderPath <em>Data Folder Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Folder Path</em>'.
	 * @see es.unican.istr.pasys.pasys.NodeDeploymentConf#getDataFolderPath()
	 * @see #getNodeDeploymentConf()
	 * @generated
	 */
	EAttribute getNodeDeploymentConf_DataFolderPath();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getLogFolderPath <em>Log Folder Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Folder Path</em>'.
	 * @see es.unican.istr.pasys.pasys.NodeDeploymentConf#getLogFolderPath()
	 * @see #getNodeDeploymentConf()
	 * @generated
	 */
	EAttribute getNodeDeploymentConf_LogFolderPath();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#getCodeFolderPath <em>Code Folder Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Folder Path</em>'.
	 * @see es.unican.istr.pasys.pasys.NodeDeploymentConf#getCodeFolderPath()
	 * @see #getNodeDeploymentConf()
	 * @generated
	 */
	EAttribute getNodeDeploymentConf_CodeFolderPath();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.NodeDeploymentConf#isIsRunning <em>Is Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Running</em>'.
	 * @see es.unican.istr.pasys.pasys.NodeDeploymentConf#isIsRunning()
	 * @see #getNodeDeploymentConf()
	 * @generated
	 */
	EAttribute getNodeDeploymentConf_IsRunning();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.KubernetesDeploymentConf <em>Kubernetes Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kubernetes Deployment Conf</em>'.
	 * @see es.unican.istr.pasys.pasys.KubernetesDeploymentConf
	 * @generated
	 */
	EClass getKubernetesDeploymentConf();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.KubernetesDeploymentConf#getExternalIP <em>External IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External IP</em>'.
	 * @see es.unican.istr.pasys.pasys.KubernetesDeploymentConf#getExternalIP()
	 * @see #getKubernetesDeploymentConf()
	 * @generated
	 */
	EAttribute getKubernetesDeploymentConf_ExternalIP();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.KubernetesDeploymentConf#getServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Type</em>'.
	 * @see es.unican.istr.pasys.pasys.KubernetesDeploymentConf#getServiceType()
	 * @see #getKubernetesDeploymentConf()
	 * @generated
	 */
	EAttribute getKubernetesDeploymentConf_ServiceType();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.SwarmDeploymentConf <em>Swarm Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swarm Deployment Conf</em>'.
	 * @see es.unican.istr.pasys.pasys.SwarmDeploymentConf
	 * @generated
	 */
	EClass getSwarmDeploymentConf();

	/**
	 * Returns the meta object for the attribute list '{@link es.unican.istr.pasys.pasys.SwarmDeploymentConf#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Network</em>'.
	 * @see es.unican.istr.pasys.pasys.SwarmDeploymentConf#getNetwork()
	 * @see #getSwarmDeploymentConf()
	 * @generated
	 */
	EAttribute getSwarmDeploymentConf_Network();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.NomadDeploymentConf <em>Nomad Deployment Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nomad Deployment Conf</em>'.
	 * @see es.unican.istr.pasys.pasys.NomadDeploymentConf
	 * @generated
	 */
	EClass getNomadDeploymentConf();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.NomadDeploymentConf#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see es.unican.istr.pasys.pasys.NomadDeploymentConf#getRegion()
	 * @see #getNomadDeploymentConf()
	 * @generated
	 */
	EAttribute getNomadDeploymentConf_Region();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.NomadDeploymentConf#getDataCenter <em>Data Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Center</em>'.
	 * @see es.unican.istr.pasys.pasys.NomadDeploymentConf#getDataCenter()
	 * @see #getNomadDeploymentConf()
	 * @generated
	 */
	EAttribute getNomadDeploymentConf_DataCenter();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.NomadDeploymentConf#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see es.unican.istr.pasys.pasys.NomadDeploymentConf#getPriority()
	 * @see #getNomadDeploymentConf()
	 * @generated
	 */
	EAttribute getNomadDeploymentConf_Priority();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.NomadDeploymentConf#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver</em>'.
	 * @see es.unican.istr.pasys.pasys.NomadDeploymentConf#getDriver()
	 * @see #getNomadDeploymentConf()
	 * @generated
	 */
	EAttribute getNomadDeploymentConf_Driver();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume</em>'.
	 * @see es.unican.istr.pasys.pasys.Volume
	 * @generated
	 */
	EClass getVolume();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.Volume#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see es.unican.istr.pasys.pasys.Volume#getSource()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Source();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.Volume#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see es.unican.istr.pasys.pasys.Volume#getTarget()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Target();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.Volume#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.unican.istr.pasys.pasys.Volume#getType()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.Volume#getAccessMode <em>Access Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Mode</em>'.
	 * @see es.unican.istr.pasys.pasys.Volume#getAccessMode()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_AccessMode();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see es.unican.istr.pasys.pasys.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.Port#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see es.unican.istr.pasys.pasys.Port#getTarget()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Target();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.Port#getPublished <em>Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Published</em>'.
	 * @see es.unican.istr.pasys.pasys.Port#getPublished()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Published();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.DeploymentConstraints <em>Deployment Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Constraints</em>'.
	 * @see es.unican.istr.pasys.pasys.DeploymentConstraints
	 * @generated
	 */
	EClass getDeploymentConstraints();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.DeploymentConstraints#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labels</em>'.
	 * @see es.unican.istr.pasys.pasys.DeploymentConstraints#getLabels()
	 * @see #getDeploymentConstraints()
	 * @generated
	 */
	EAttribute getDeploymentConstraints_Labels();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.DeploymentConstraints#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resources</em>'.
	 * @see es.unican.istr.pasys.pasys.DeploymentConstraints#getResources()
	 * @see #getDeploymentConstraints()
	 * @generated
	 */
	EAttribute getDeploymentConstraints_Resources();

	/**
	 * Returns the meta object for class '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EClass getException();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.ConfigurationException <em>Configuration Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Exception</em>'.
	 * @see es.unican.istr.pasys.pasys.ConfigurationException
	 * @generated
	 */
	EClass getConfigurationException();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.DeploymentException <em>Deployment Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Exception</em>'.
	 * @see es.unican.istr.pasys.pasys.DeploymentException
	 * @generated
	 */
	EClass getDeploymentException();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.LaunchException <em>Launch Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Launch Exception</em>'.
	 * @see es.unican.istr.pasys.pasys.LaunchException
	 * @generated
	 */
	EClass getLaunchException();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 *        valueDataType="org.eclipse.emf.ecore.EString" valueRequired="true"
	 * @generated
	 */
	EClass getStringToStringMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Value();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.FileDescriptor <em>File Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Descriptor</em>'.
	 * @see es.unican.istr.pasys.pasys.FileDescriptor
	 * @generated
	 */
	EClass getFileDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.FileDescriptor#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see es.unican.istr.pasys.pasys.FileDescriptor#getFilePath()
	 * @see #getFileDescriptor()
	 * @generated
	 */
	EAttribute getFileDescriptor_FilePath();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.FileDescriptor#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see es.unican.istr.pasys.pasys.FileDescriptor#getFileName()
	 * @see #getFileDescriptor()
	 * @generated
	 */
	EAttribute getFileDescriptor_FileName();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.DeploymentFileDescriptor <em>Deployment File Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment File Descriptor</em>'.
	 * @see es.unican.istr.pasys.pasys.DeploymentFileDescriptor
	 * @generated
	 */
	EClass getDeploymentFileDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.DeploymentFileDescriptor#getFileContent <em>File Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Content</em>'.
	 * @see es.unican.istr.pasys.pasys.DeploymentFileDescriptor#getFileContent()
	 * @see #getDeploymentFileDescriptor()
	 * @generated
	 */
	EAttribute getDeploymentFileDescriptor_FileContent();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.DeploymentFileDescriptor#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Type</em>'.
	 * @see es.unican.istr.pasys.pasys.DeploymentFileDescriptor#getElementType()
	 * @see #getDeploymentFileDescriptor()
	 * @generated
	 */
	EAttribute getDeploymentFileDescriptor_ElementType();

	/**
	 * Returns the meta object for the reference '{@link es.unican.istr.pasys.pasys.DeploymentFileDescriptor#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see es.unican.istr.pasys.pasys.DeploymentFileDescriptor#getOwner()
	 * @see #getDeploymentFileDescriptor()
	 * @generated
	 */
	EReference getDeploymentFileDescriptor_Owner();

	/**
	 * Returns the meta object for class '{@link es.unican.istr.pasys.pasys.ArtifactDescriptor <em>Artifact Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Descriptor</em>'.
	 * @see es.unican.istr.pasys.pasys.ArtifactDescriptor
	 * @generated
	 */
	EClass getArtifactDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link es.unican.istr.pasys.pasys.ArtifactDescriptor#getLocalPath <em>Local Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Path</em>'.
	 * @see es.unican.istr.pasys.pasys.ArtifactDescriptor#getLocalPath()
	 * @see #getArtifactDescriptor()
	 * @generated
	 */
	EAttribute getArtifactDescriptor_LocalPath();

	/**
	 * Returns the meta object for enum '{@link es.unican.istr.pasys.pasys.VolumeAccessMode <em>Volume Access Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Volume Access Mode</em>'.
	 * @see es.unican.istr.pasys.pasys.VolumeAccessMode
	 * @generated
	 */
	EEnum getVolumeAccessMode();

	/**
	 * Returns the meta object for enum '{@link es.unican.istr.pasys.pasys.VolumeType <em>Volume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Volume Type</em>'.
	 * @see es.unican.istr.pasys.pasys.VolumeType
	 * @generated
	 */
	EEnum getVolumeType();

	/**
	 * Returns the meta object for enum '{@link es.unican.istr.pasys.pasys.NomadDriver <em>Nomad Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nomad Driver</em>'.
	 * @see es.unican.istr.pasys.pasys.NomadDriver
	 * @generated
	 */
	EEnum getNomadDriver();

	/**
	 * Returns the meta object for enum '{@link es.unican.istr.pasys.pasys.PortMode <em>Port Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Mode</em>'.
	 * @see es.unican.istr.pasys.pasys.PortMode
	 * @generated
	 */
	EEnum getPortMode();

	/**
	 * Returns the meta object for enum '{@link es.unican.istr.pasys.pasys.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Type</em>'.
	 * @see es.unican.istr.pasys.pasys.ServiceType
	 * @generated
	 */
	EEnum getServiceType();

	/**
	 * Returns the meta object for enum '{@link es.unican.istr.pasys.pasys.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol</em>'.
	 * @see es.unican.istr.pasys.pasys.Protocol
	 * @generated
	 */
	EEnum getProtocol();

	/**
	 * Returns the meta object for enum '{@link es.unican.istr.pasys.pasys.DeployableComponentType <em>Deployable Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Deployable Component Type</em>'.
	 * @see es.unican.istr.pasys.pasys.DeployableComponentType
	 * @generated
	 */
	EEnum getDeployableComponentType();

	/**
	 * Returns the meta object for data type '{@link java.util.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Properties</em>'.
	 * @see java.util.Properties
	 * @model instanceClass="java.util.Properties"
	 * @generated
	 */
	EDataType getProperties();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PasysFactory getPasysFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.ComputationalSystemImpl <em>Computational System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.ComputationalSystemImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getComputationalSystem()
		 * @generated
		 */
		EClass COMPUTATIONAL_SYSTEM = eINSTANCE.getComputationalSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTATIONAL_SYSTEM__NAME = eINSTANCE.getComputationalSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTATIONAL_SYSTEM__DATE = eINSTANCE.getComputationalSystem_Date();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTATIONAL_SYSTEM__AUTHORS = eINSTANCE.getComputationalSystem_Authors();

		/**
		 * The meta object literal for the '<em><b>Target Platform Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTATIONAL_SYSTEM__TARGET_PLATFORM_NAME = eINSTANCE.getComputationalSystem_TargetPlatformName();

		/**
		 * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTATIONAL_SYSTEM__DOC = eINSTANCE.getComputationalSystem_Doc();

		/**
		 * The meta object literal for the '<em><b>Owned Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS = eINSTANCE.getComputationalSystem_OwnedElements();

		/**
		 * The meta object literal for the '<em><b>Authentication Files</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES = eINSTANCE.getComputationalSystem_AuthenticationFiles();

		/**
		 * The meta object literal for the '<em><b>Deploy And Launch</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTATIONAL_SYSTEM___DEPLOY_AND_LAUNCH = eINSTANCE.getComputationalSystem__DeployAndLaunch();

		/**
		 * The meta object literal for the '<em><b>Clean Deployment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPUTATIONAL_SYSTEM___CLEAN_DEPLOYMENT = eINSTANCE.getComputationalSystem__CleanDeployment();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.NamedElementImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__ID = eINSTANCE.getNamedElement_Id();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.SystemElementImpl <em>System Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.SystemElementImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getSystemElement()
		 * @generated
		 */
		EClass SYSTEM_ELEMENT = eINSTANCE.getSystemElement();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ELEMENT__OWNER = eINSTANCE.getSystemElement_Owner();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.PlatformResourceImpl <em>Platform Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.PlatformResourceImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getPlatformResource()
		 * @generated
		 */
		EClass PLATFORM_RESOURCE = eINSTANCE.getPlatformResource();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.ProcessingNodeImpl <em>Processing Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.ProcessingNodeImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getProcessingNode()
		 * @generated
		 */
		EClass PROCESSING_NODE = eINSTANCE.getProcessingNode();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_NODE__IP = eINSTANCE.getProcessingNode_Ip();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_NODE__OS = eINSTANCE.getProcessingNode_Os();

		/**
		 * The meta object literal for the '<em><b>Concurrency Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_NODE__CONCURRENCY_LEVEL = eINSTANCE.getProcessingNode_ConcurrencyLevel();

		/**
		 * The meta object literal for the '<em><b>Memory Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_NODE__MEMORY_SIZE = eINSTANCE.getProcessingNode_MemorySize();

		/**
		 * The meta object literal for the '<em><b>Speed Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_NODE__SPEED_FACTOR = eINSTANCE.getProcessingNode_SpeedFactor();

		/**
		 * The meta object literal for the '<em><b>Config Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_NODE__CONFIG_DATA = eINSTANCE.getProcessingNode_ConfigData();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_NODE__USER_NAME = eINSTANCE.getProcessingNode_UserName();

		/**
		 * The meta object literal for the '<em><b>Connected To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_NODE__CONNECTED_TO = eINSTANCE.getProcessingNode_ConnectedTo();

		/**
		 * The meta object literal for the '<em><b>Launching Scripts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_NODE__LAUNCHING_SCRIPTS = eINSTANCE.getProcessingNode_LaunchingScripts();

		/**
		 * The meta object literal for the '<em><b>Config Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_NODE__CONFIG_FILES = eINSTANCE.getProcessingNode_ConfigFiles();

		/**
		 * The meta object literal for the '<em><b>Code Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_NODE__CODE_FILES = eINSTANCE.getProcessingNode_CodeFiles();

		/**
		 * The meta object literal for the '<em><b>Owned Meters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_NODE__OWNED_METERS = eINSTANCE.getProcessingNode_OwnedMeters();

		/**
		 * The meta object literal for the '<em><b>Prepare For Deployment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESSING_NODE___PREPARE_FOR_DEPLOYMENT = eINSTANCE.getProcessingNode__PrepareForDeployment();

		/**
		 * The meta object literal for the '<em><b>Deploy And Launch</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESSING_NODE___DEPLOY_AND_LAUNCH = eINSTANCE.getProcessingNode__DeployAndLaunch();

		/**
		 * The meta object literal for the '<em><b>Bring Back Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESSING_NODE___BRING_BACK_CONFIGURATION = eINSTANCE.getProcessingNode__BringBackConfiguration();

		/**
		 * The meta object literal for the '<em><b>Bring Back Deployment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESSING_NODE___BRING_BACK_DEPLOYMENT = eINSTANCE.getProcessingNode__BringBackDeployment();

		/**
		 * The meta object literal for the '<em><b>Abort Launching</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESSING_NODE___ABORT_LAUNCHING = eINSTANCE.getProcessingNode__AbortLaunching();

		/**
		 * The meta object literal for the '<em><b>Add Launching Script</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESSING_NODE___ADD_LAUNCHING_SCRIPT__DEPLOYMENTFILEDESCRIPTOR = eINSTANCE.getProcessingNode__AddLaunchingScript__DeploymentFileDescriptor();

		/**
		 * The meta object literal for the '<em><b>Add Config File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESSING_NODE___ADD_CONFIG_FILE__DEPLOYMENTFILEDESCRIPTOR = eINSTANCE.getProcessingNode__AddConfigFile__DeploymentFileDescriptor();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.PhysicalProcessingNodeImpl <em>Physical Processing Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.PhysicalProcessingNodeImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getPhysicalProcessingNode()
		 * @generated
		 */
		EClass PHYSICAL_PROCESSING_NODE = eINSTANCE.getPhysicalProcessingNode();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.VirtualProcessingNodeImpl <em>Virtual Processing Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.VirtualProcessingNodeImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getVirtualProcessingNode()
		 * @generated
		 */
		EClass VIRTUAL_PROCESSING_NODE = eINSTANCE.getVirtualProcessingNode();

		/**
		 * The meta object literal for the '<em><b>External IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_PROCESSING_NODE__EXTERNAL_IP = eINSTANCE.getVirtualProcessingNode_ExternalIP();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.AWSVirtualProcessingNodeImpl <em>AWS Virtual Processing Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.AWSVirtualProcessingNodeImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getAWSVirtualProcessingNode()
		 * @generated
		 */
		EClass AWS_VIRTUAL_PROCESSING_NODE = eINSTANCE.getAWSVirtualProcessingNode();

		/**
		 * The meta object literal for the '<em><b>Vpc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_VIRTUAL_PROCESSING_NODE__VPC = eINSTANCE.getAWSVirtualProcessingNode_Vpc();

		/**
		 * The meta object literal for the '<em><b>Sub Net</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_VIRTUAL_PROCESSING_NODE__SUB_NET = eINSTANCE.getAWSVirtualProcessingNode_SubNet();

		/**
		 * The meta object literal for the '<em><b>Key Pair</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_VIRTUAL_PROCESSING_NODE__KEY_PAIR = eINSTANCE.getAWSVirtualProcessingNode_KeyPair();

		/**
		 * The meta object literal for the '<em><b>Security Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_VIRTUAL_PROCESSING_NODE__SECURITY_GROUP = eINSTANCE.getAWSVirtualProcessingNode_SecurityGroup();

		/**
		 * The meta object literal for the '<em><b>AMI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_VIRTUAL_PROCESSING_NODE__AMI = eINSTANCE.getAWSVirtualProcessingNode_AMI();

		/**
		 * The meta object literal for the '<em><b>Instance Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_VIRTUAL_PROCESSING_NODE__INSTANCE_TYPE = eINSTANCE.getAWSVirtualProcessingNode_InstanceType();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.ProcessingResourceClusterImpl <em>Processing Resource Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.ProcessingResourceClusterImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getProcessingResourceCluster()
		 * @generated
		 */
		EClass PROCESSING_RESOURCE_CLUSTER = eINSTANCE.getProcessingResourceCluster();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.ProcessingNodeClusterImpl <em>Processing Node Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.ProcessingNodeClusterImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getProcessingNodeCluster()
		 * @generated
		 */
		EClass PROCESSING_NODE_CLUSTER = eINSTANCE.getProcessingNodeCluster();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_NODE_CLUSTER__NODES = eINSTANCE.getProcessingNodeCluster_Nodes();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.OrchestrationClusterImpl <em>Orchestration Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.OrchestrationClusterImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getOrchestrationCluster()
		 * @generated
		 */
		EClass ORCHESTRATION_CLUSTER = eINSTANCE.getOrchestrationCluster();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.KubernetesClusterImpl <em>Kubernetes Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.KubernetesClusterImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getKubernetesCluster()
		 * @generated
		 */
		EClass KUBERNETES_CLUSTER = eINSTANCE.getKubernetesCluster();

		/**
		 * The meta object literal for the '<em><b>Api Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KUBERNETES_CLUSTER__API_VERSION = eINSTANCE.getKubernetesCluster_ApiVersion();

		/**
		 * The meta object literal for the '<em><b>Kube Config Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KUBERNETES_CLUSTER__KUBE_CONFIG_PATH = eINSTANCE.getKubernetesCluster_KubeConfigPath();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.SwarmClusterImpl <em>Swarm Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.SwarmClusterImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getSwarmCluster()
		 * @generated
		 */
		EClass SWARM_CLUSTER = eINSTANCE.getSwarmCluster();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWARM_CLUSTER__IP = eINSTANCE.getSwarmCluster_Ip();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWARM_CLUSTER__PORT = eINSTANCE.getSwarmCluster_Port();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWARM_CLUSTER__USER = eINSTANCE.getSwarmCluster_User();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.NomadClusterImpl <em>Nomad Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.NomadClusterImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNomadCluster()
		 * @generated
		 */
		EClass NOMAD_CLUSTER = eINSTANCE.getNomadCluster();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOMAD_CLUSTER__IP = eINSTANCE.getNomadCluster_Ip();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOMAD_CLUSTER__PORT = eINSTANCE.getNomadCluster_Port();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.NetworkImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Bandwith</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__BANDWITH = eINSTANCE.getNetwork_Bandwith();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.PlatformServiceImpl <em>Platform Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.PlatformServiceImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getPlatformService()
		 * @generated
		 */
		EClass PLATFORM_SERVICE = eINSTANCE.getPlatformService();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM_SERVICE__HOST = eINSTANCE.getPlatformService_Host();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.SerializationServiceImpl <em>Serialization Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.SerializationServiceImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getSerializationService()
		 * @generated
		 */
		EClass SERIALIZATION_SERVICE = eINSTANCE.getSerializationService();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.DistributionServiceImpl <em>Distribution Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.DistributionServiceImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getDistributionService()
		 * @generated
		 */
		EClass DISTRIBUTION_SERVICE = eINSTANCE.getDistributionService();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.CommunicationServiceImpl <em>Communication Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.CommunicationServiceImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getCommunicationService()
		 * @generated
		 */
		EClass COMMUNICATION_SERVICE = eINSTANCE.getCommunicationService();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.SchedulingServiceImpl <em>Scheduling Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.SchedulingServiceImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getSchedulingService()
		 * @generated
		 */
		EClass SCHEDULING_SERVICE = eINSTANCE.getSchedulingService();

		/**
		 * The meta object literal for the '<em><b>Workflows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULING_SERVICE__WORKFLOWS = eINSTANCE.getSchedulingService_Workflows();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.SecurityServiceImpl <em>Security Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.SecurityServiceImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getSecurityService()
		 * @generated
		 */
		EClass SECURITY_SERVICE = eINSTANCE.getSecurityService();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.PersistenceServiceImpl <em>Persistence Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.PersistenceServiceImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getPersistenceService()
		 * @generated
		 */
		EClass PERSISTENCE_SERVICE = eINSTANCE.getPersistenceService();

		/**
		 * The meta object literal for the '<em><b>Logging</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_SERVICE__LOGGING = eINSTANCE.getPersistenceService_Logging();

		/**
		 * The meta object literal for the '<em><b>Passwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_SERVICE__PASSWD = eINSTANCE.getPersistenceService_Passwd();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_SERVICE__PORT = eINSTANCE.getPersistenceService_Port();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.MonitoringServiceImpl <em>Monitoring Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.MonitoringServiceImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getMonitoringService()
		 * @generated
		 */
		EClass MONITORING_SERVICE = eINSTANCE.getMonitoringService();

		/**
		 * The meta object literal for the '<em><b>Monitorized Meters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORING_SERVICE__MONITORIZED_METERS = eINSTANCE.getMonitoringService_MonitorizedMeters();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.AVROServiceImpl <em>AVRO Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.AVROServiceImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getAVROService()
		 * @generated
		 */
		EClass AVRO_SERVICE = eINSTANCE.getAVROService();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.ZookeeperServiceImpl <em>Zookeeper Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.ZookeeperServiceImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getZookeeperService()
		 * @generated
		 */
		EClass ZOOKEEPER_SERVICE = eINSTANCE.getZookeeperService();

		/**
		 * The meta object literal for the '<em><b>Server Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVICE__SERVER_ID = eINSTANCE.getZookeeperService_ServerId();

		/**
		 * The meta object literal for the '<em><b>Client Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVICE__CLIENT_PORT = eINSTANCE.getZookeeperService_ClientPort();

		/**
		 * The meta object literal for the '<em><b>Tick Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVICE__TICK_TIME = eINSTANCE.getZookeeperService_TickTime();

		/**
		 * The meta object literal for the '<em><b>Leader Servers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVICE__LEADER_SERVERS = eINSTANCE.getZookeeperService_LeaderServers();

		/**
		 * The meta object literal for the '<em><b>Peer Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVICE__PEER_PORT = eINSTANCE.getZookeeperService_PeerPort();

		/**
		 * The meta object literal for the '<em><b>Leader Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVICE__LEADER_PORT = eINSTANCE.getZookeeperService_LeaderPort();

		/**
		 * The meta object literal for the '<em><b>Init Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVICE__INIT_LIMIT = eINSTANCE.getZookeeperService_InitLimit();

		/**
		 * The meta object literal for the '<em><b>Sync Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOKEEPER_SERVICE__SYNC_LIMIT = eINSTANCE.getZookeeperService_SyncLimit();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.KafkaServiceImpl <em>Kafka Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.KafkaServiceImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getKafkaService()
		 * @generated
		 */
		EClass KAFKA_SERVICE = eINSTANCE.getKafkaService();

		/**
		 * The meta object literal for the '<em><b>Comm Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__COMM_ID = eINSTANCE.getKafkaService_CommId();

		/**
		 * The meta object literal for the '<em><b>Client Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__CLIENT_PORT = eINSTANCE.getKafkaService_ClientPort();

		/**
		 * The meta object literal for the '<em><b>Zookeeper Connect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KAFKA_SERVICE__ZOOKEEPER_CONNECT = eINSTANCE.getKafkaService_ZookeeperConnect();

		/**
		 * The meta object literal for the '<em><b>Zookeeper Connection Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__ZOOKEEPER_CONNECTION_TIMEOUT = eINSTANCE.getKafkaService_ZookeeperConnectionTimeout();

		/**
		 * The meta object literal for the '<em><b>Listeners</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__LISTENERS = eINSTANCE.getKafkaService_Listeners();

		/**
		 * The meta object literal for the '<em><b>Advertised Listeners</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__ADVERTISED_LISTENERS = eINSTANCE.getKafkaService_AdvertisedListeners();

		/**
		 * The meta object literal for the '<em><b>Auto Create Topic Enable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__AUTO_CREATE_TOPIC_ENABLE = eINSTANCE.getKafkaService_AutoCreateTopicEnable();

		/**
		 * The meta object literal for the '<em><b>Delete Topic Enable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__DELETE_TOPIC_ENABLE = eINSTANCE.getKafkaService_DeleteTopicEnable();

		/**
		 * The meta object literal for the '<em><b>Num Partitions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__NUM_PARTITIONS = eINSTANCE.getKafkaService_NumPartitions();

		/**
		 * The meta object literal for the '<em><b>Num Recovery Threads Per Data Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__NUM_RECOVERY_THREADS_PER_DATA_DIR = eINSTANCE.getKafkaService_NumRecoveryThreadsPerDataDir();

		/**
		 * The meta object literal for the '<em><b>Log Flush Interval Messages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__LOG_FLUSH_INTERVAL_MESSAGES = eINSTANCE.getKafkaService_LogFlushIntervalMessages();

		/**
		 * The meta object literal for the '<em><b>Log Flush Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__LOG_FLUSH_INTERVAL = eINSTANCE.getKafkaService_LogFlushInterval();

		/**
		 * The meta object literal for the '<em><b>Num Network Threads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__NUM_NETWORK_THREADS = eINSTANCE.getKafkaService_NumNetworkThreads();

		/**
		 * The meta object literal for the '<em><b>Num IO Threads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__NUM_IO_THREADS = eINSTANCE.getKafkaService_NumIOThreads();

		/**
		 * The meta object literal for the '<em><b>Socket Send Buffer Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__SOCKET_SEND_BUFFER_BYTES = eINSTANCE.getKafkaService_SocketSendBufferBytes();

		/**
		 * The meta object literal for the '<em><b>Socket Receive Buffer Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__SOCKET_RECEIVE_BUFFER_BYTES = eINSTANCE.getKafkaService_SocketReceiveBufferBytes();

		/**
		 * The meta object literal for the '<em><b>Socket Request Max Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAFKA_SERVICE__SOCKET_REQUEST_MAX_BYTES = eINSTANCE.getKafkaService_SocketRequestMaxBytes();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.NodeSchedulerImpl <em>Node Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.NodeSchedulerImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNodeScheduler()
		 * @generated
		 */
		EClass NODE_SCHEDULER = eINSTANCE.getNodeScheduler();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.SparkServiceImpl <em>Spark Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.SparkServiceImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getSparkService()
		 * @generated
		 */
		EClass SPARK_SERVICE = eINSTANCE.getSparkService();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPARK_SERVICE__LOAD = eINSTANCE.getSparkService_Load();

		/**
		 * The meta object literal for the '<em><b>Driver Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__DRIVER_CORES = eINSTANCE.getSparkService_DriverCores();

		/**
		 * The meta object literal for the '<em><b>Driver Max Result Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__DRIVER_MAX_RESULT_SIZE = eINSTANCE.getSparkService_DriverMaxResultSize();

		/**
		 * The meta object literal for the '<em><b>Driver Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__DRIVER_MEMORY = eINSTANCE.getSparkService_DriverMemory();

		/**
		 * The meta object literal for the '<em><b>Local Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__LOCAL_DIR = eINSTANCE.getSparkService_LocalDir();

		/**
		 * The meta object literal for the '<em><b>Master</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPARK_SERVICE__MASTER = eINSTANCE.getSparkService_Master();

		/**
		 * The meta object literal for the '<em><b>Window Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__WINDOW_SIZE = eINSTANCE.getSparkService_WindowSize();

		/**
		 * The meta object literal for the '<em><b>Executor Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__EXECUTOR_MEMORY = eINSTANCE.getSparkService_ExecutorMemory();

		/**
		 * The meta object literal for the '<em><b>Extra Listener</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__EXTRA_LISTENER = eINSTANCE.getSparkService_ExtraListener();

		/**
		 * The meta object literal for the '<em><b>Log Conf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__LOG_CONF = eINSTANCE.getSparkService_LogConf();

		/**
		 * The meta object literal for the '<em><b>Submit Deploy Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__SUBMIT_DEPLOY_MODE = eINSTANCE.getSparkService_SubmitDeployMode();

		/**
		 * The meta object literal for the '<em><b>Log Caller Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__LOG_CALLER_CONTEXT = eINSTANCE.getSparkService_LogCallerContext();

		/**
		 * The meta object literal for the '<em><b>Driver Superviser</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARK_SERVICE__DRIVER_SUPERVISER = eINSTANCE.getSparkService_DriverSuperviser();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.StormServiceImpl <em>Storm Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.StormServiceImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getStormService()
		 * @generated
		 */
		EClass STORM_SERVICE = eINSTANCE.getStormService();

		/**
		 * The meta object literal for the '<em><b>Zookeeper Connect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_SERVICE__ZOOKEEPER_CONNECT = eINSTANCE.getStormService_ZookeeperConnect();

		/**
		 * The meta object literal for the '<em><b>Local Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_SERVICE__LOCAL_DIR = eINSTANCE.getStormService_LocalDir();

		/**
		 * The meta object literal for the '<em><b>Nimbus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_SERVICE__NIMBUS = eINSTANCE.getStormService_Nimbus();

		/**
		 * The meta object literal for the '<em><b>Supervisor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_SERVICE__SUPERVISOR = eINSTANCE.getStormService_Supervisor();

		/**
		 * The meta object literal for the '<em><b>Ui</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_SERVICE__UI = eINSTANCE.getStormService_Ui();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.StormUIImpl <em>Storm UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.StormUIImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getStormUI()
		 * @generated
		 */
		EClass STORM_UI = eINSTANCE.getStormUI();

		/**
		 * The meta object literal for the '<em><b>Ui Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_UI__UI_PORT = eINSTANCE.getStormUI_UiPort();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_UI__OWNER = eINSTANCE.getStormUI_Owner();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_UI__HOST = eINSTANCE.getStormUI_Host();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.StormNimbusImpl <em>Storm Nimbus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.StormNimbusImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getStormNimbus()
		 * @generated
		 */
		EClass STORM_NIMBUS = eINSTANCE.getStormNimbus();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_NIMBUS__OWNER = eINSTANCE.getStormNimbus_Owner();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_NIMBUS__HOST = eINSTANCE.getStormNimbus_Host();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.StormSupervisorImpl <em>Storm Supervisor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.StormSupervisorImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getStormSupervisor()
		 * @generated
		 */
		EClass STORM_SUPERVISOR = eINSTANCE.getStormSupervisor();

		/**
		 * The meta object literal for the '<em><b>Supervisor Slot Ports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORM_SUPERVISOR__SUPERVISOR_SLOT_PORTS = eINSTANCE.getStormSupervisor_SupervisorSlotPorts();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_SUPERVISOR__OWNER = eINSTANCE.getStormSupervisor_Owner();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORM_SUPERVISOR__HOST = eINSTANCE.getStormSupervisor_Host();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.Neo4JServiceImpl <em>Neo4 JService</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.Neo4JServiceImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNeo4JService()
		 * @generated
		 */
		EClass NEO4_JSERVICE = eINSTANCE.getNeo4JService();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.MemSQLServiceImpl <em>Mem SQL Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.MemSQLServiceImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getMemSQLService()
		 * @generated
		 */
		EClass MEM_SQL_SERVICE = eINSTANCE.getMemSQLService();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.CassandraServiceImpl <em>Cassandra Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.CassandraServiceImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getCassandraService()
		 * @generated
		 */
		EClass CASSANDRA_SERVICE = eINSTANCE.getCassandraService();

		/**
		 * The meta object literal for the '<em><b>Num Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVICE__NUM_TOKENS = eINSTANCE.getCassandraService_NumTokens();

		/**
		 * The meta object literal for the '<em><b>Seeds</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASSANDRA_SERVICE__SEEDS = eINSTANCE.getCassandraService_Seeds();

		/**
		 * The meta object literal for the '<em><b>Seed Provider Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVICE__SEED_PROVIDER_CLASS = eINSTANCE.getCassandraService_SeedProviderClass();

		/**
		 * The meta object literal for the '<em><b>Endpoint Snitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVICE__ENDPOINT_SNITCH = eINSTANCE.getCassandraService_EndpointSnitch();

		/**
		 * The meta object literal for the '<em><b>Data File Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVICE__DATA_FILE_DIR = eINSTANCE.getCassandraService_DataFileDir();

		/**
		 * The meta object literal for the '<em><b>Storage Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVICE__STORAGE_PORT = eINSTANCE.getCassandraService_StoragePort();

		/**
		 * The meta object literal for the '<em><b>Auto Bootstrap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVICE__AUTO_BOOTSTRAP = eINSTANCE.getCassandraService_AutoBootstrap();

		/**
		 * The meta object literal for the '<em><b>Cql Schemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASSANDRA_SERVICE__CQL_SCHEMAS = eINSTANCE.getCassandraService_CqlSchemas();

		/**
		 * The meta object literal for the '<em><b>Data Centers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASSANDRA_SERVICE__DATA_CENTERS = eINSTANCE.getCassandraService_DataCenters();

		/**
		 * The meta object literal for the '<em><b>Ssl Storage Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVICE__SSL_STORAGE_PORT = eINSTANCE.getCassandraService_SslStoragePort();

		/**
		 * The meta object literal for the '<em><b>Rpc Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSANDRA_SERVICE__RPC_PORT = eINSTANCE.getCassandraService_RpcPort();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.DataCenterImpl <em>Data Center</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.DataCenterImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getDataCenter()
		 * @generated
		 */
		EClass DATA_CENTER = eINSTANCE.getDataCenter();

		/**
		 * The meta object literal for the '<em><b>Racks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CENTER__RACKS = eINSTANCE.getDataCenter_Racks();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.RackImpl <em>Rack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.RackImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getRack()
		 * @generated
		 */
		EClass RACK = eINSTANCE.getRack();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RACK__NODES = eINSTANCE.getRack_Nodes();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.PrometheusServiceImpl <em>Prometheus Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.PrometheusServiceImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getPrometheusService()
		 * @generated
		 */
		EClass PROMETHEUS_SERVICE = eINSTANCE.getPrometheusService();

		/**
		 * The meta object literal for the '<em><b>Exporters Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROMETHEUS_SERVICE__EXPORTERS_DATA = eINSTANCE.getPrometheusService_ExportersData();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.ExporterDataImpl <em>Exporter Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.ExporterDataImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getExporterData()
		 * @generated
		 */
		EClass EXPORTER_DATA = eINSTANCE.getExporterData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORTER_DATA__NAME = eINSTANCE.getExporterData_Name();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORTER_DATA__ARTIFACT = eINSTANCE.getExporterData_Artifact();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.StreamDataImpl <em>Stream Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.StreamDataImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getStreamData()
		 * @generated
		 */
		EClass STREAM_DATA = eINSTANCE.getStreamData();

		/**
		 * The meta object literal for the '<em><b>Retention ms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DATA__RETENTION_MS = eINSTANCE.getStreamData_Retention_ms();

		/**
		 * The meta object literal for the '<em><b>Retention bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DATA__RETENTION_BYTES = eINSTANCE.getStreamData_Retention_bytes();

		/**
		 * The meta object literal for the '<em><b>Cleanup Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DATA__CLEANUP_POLICY = eINSTANCE.getStreamData_CleanupPolicy();

		/**
		 * The meta object literal for the '<em><b>Num Partitions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DATA__NUM_PARTITIONS = eINSTANCE.getStreamData_NumPartitions();

		/**
		 * The meta object literal for the '<em><b>Num Replication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DATA__NUM_REPLICATION = eINSTANCE.getStreamData_NumReplication();

		/**
		 * The meta object literal for the '<em><b>Owned Meters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAM_DATA__OWNED_METERS = eINSTANCE.getStreamData_OwnedMeters();

		/**
		 * The meta object literal for the '<em><b>Assigned Partition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAM_DATA__ASSIGNED_PARTITION = eINSTANCE.getStreamData_AssignedPartition();

		/**
		 * The meta object literal for the '<em><b>Message Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DATA__MESSAGE_SIZE = eINSTANCE.getStreamData_MessageSize();

		/**
		 * The meta object literal for the '<em><b>Schema File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DATA__SCHEMA_FILE = eINSTANCE.getStreamData_SchemaFile();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.StreamDataPartitionImpl <em>Stream Data Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.StreamDataPartitionImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getStreamDataPartition()
		 * @generated
		 */
		EClass STREAM_DATA_PARTITION = eINSTANCE.getStreamDataPartition();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM_DATA_PARTITION__KEY = eINSTANCE.getStreamDataPartition_Key();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAM_DATA_PARTITION__HOST = eINSTANCE.getStreamDataPartition_Host();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.WorkflowStreamDataImpl <em>Workflow Stream Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.WorkflowStreamDataImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getWorkflowStreamData()
		 * @generated
		 */
		EClass WORKFLOW_STREAM_DATA = eINSTANCE.getWorkflowStreamData();

		/**
		 * The meta object literal for the '<em><b>Is Single Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_STREAM_DATA__IS_SINGLE_USE = eINSTANCE.getWorkflowStreamData_IsSingleUse();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_STREAM_DATA__OWNER = eINSTANCE.getWorkflowStreamData_Owner();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.FlowStreamDataImpl <em>Flow Stream Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.FlowStreamDataImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getFlowStreamData()
		 * @generated
		 */
		EClass FLOW_STREAM_DATA = eINSTANCE.getFlowStreamData();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_STREAM_DATA__SOURCE = eINSTANCE.getFlowStreamData_Source();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_STREAM_DATA__PREDECESSOR = eINSTANCE.getFlowStreamData_Predecessor();

		/**
		 * The meta object literal for the '<em><b>Holder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_STREAM_DATA__HOLDER = eINSTANCE.getFlowStreamData_Holder();

		/**
		 * The meta object literal for the '<em><b>Is Implemented</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_STREAM_DATA__IS_IMPLEMENTED = eINSTANCE.getFlowStreamData_IsImplemented();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.KafkaFlowStreamDataImpl <em>Kafka Flow Stream Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.KafkaFlowStreamDataImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getKafkaFlowStreamData()
		 * @generated
		 */
		EClass KAFKA_FLOW_STREAM_DATA = eINSTANCE.getKafkaFlowStreamData();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.DerivedStreamDataImpl <em>Derived Stream Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.DerivedStreamDataImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getDerivedStreamData()
		 * @generated
		 */
		EClass DERIVED_STREAM_DATA = eINSTANCE.getDerivedStreamData();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVED_STREAM_DATA__PATTERN = eINSTANCE.getDerivedStreamData_Pattern();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_STREAM_DATA__INPUTS = eINSTANCE.getDerivedStreamData_Inputs();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.WorkloadStreamDataImpl <em>Workload Stream Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.WorkloadStreamDataImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getWorkloadStreamData()
		 * @generated
		 */
		EClass WORKLOAD_STREAM_DATA = eINSTANCE.getWorkloadStreamData();

		/**
		 * The meta object literal for the '<em><b>Holder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD_STREAM_DATA__HOLDER = eINSTANCE.getWorkloadStreamData_Holder();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.KafkaWorkloadStreamDataImpl <em>Kafka Workload Stream Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.KafkaWorkloadStreamDataImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getKafkaWorkloadStreamData()
		 * @generated
		 */
		EClass KAFKA_WORKLOAD_STREAM_DATA = eINSTANCE.getKafkaWorkloadStreamData();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.WorkflowImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Owned Stream Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__OWNED_STREAM_DATA = eINSTANCE.getWorkflow_OwnedStreamData();

		/**
		 * The meta object literal for the '<em><b>Owned Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__OWNED_TASKS = eINSTANCE.getWorkflow_OwnedTasks();

		/**
		 * The meta object literal for the '<em><b>Root Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__ROOT_TASK = eINSTANCE.getWorkflow_RootTask();

		/**
		 * The meta object literal for the '<em><b>Owned Task Executors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__OWNED_TASK_EXECUTORS = eINSTANCE.getWorkflow_OwnedTaskExecutors();

		/**
		 * The meta object literal for the '<em><b>Scheduler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__SCHEDULER = eINSTANCE.getWorkflow_Scheduler();

		/**
		 * The meta object literal for the '<em><b>Owned Meters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__OWNED_METERS = eINSTANCE.getWorkflow_OwnedMeters();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.SchedulableSetImpl <em>Schedulable Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.SchedulableSetImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getSchedulableSet()
		 * @generated
		 */
		EClass SCHEDULABLE_SET = eINSTANCE.getSchedulableSet();

		/**
		 * The meta object literal for the '<em><b>Workflows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULABLE_SET__WORKFLOWS = eINSTANCE.getSchedulableSet_Workflows();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.TaskImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OWNER = eINSTANCE.getTask_Owner();

		/**
		 * The meta object literal for the '<em><b>Implementing Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__IMPLEMENTING_CLASS_NAME = eINSTANCE.getTask_ImplementingClassName();

		/**
		 * The meta object literal for the '<em><b>Returned Stream Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__RETURNED_STREAM_DATA = eINSTANCE.getTask_ReturnedStreamData();

		/**
		 * The meta object literal for the '<em><b>Trigger Stream Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TRIGGER_STREAM_DATA = eINSTANCE.getTask_TriggerStreamData();

		/**
		 * The meta object literal for the '<em><b>Input Stream Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INPUT_STREAM_DATA = eINSTANCE.getTask_InputStreamData();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.TaskExecutorImpl <em>Task Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.TaskExecutorImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getTaskExecutor()
		 * @generated
		 */
		EClass TASK_EXECUTOR = eINSTANCE.getTaskExecutor();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_EXECUTOR__OWNER = eINSTANCE.getTaskExecutor_Owner();

		/**
		 * The meta object literal for the '<em><b>Executed Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_EXECUTOR__EXECUTED_TASKS = eINSTANCE.getTaskExecutor_ExecutedTasks();

		/**
		 * The meta object literal for the '<em><b>Owned Meters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_EXECUTOR__OWNED_METERS = eINSTANCE.getTaskExecutor_OwnedMeters();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.MetricImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.ProcessingNodeUtilizationImpl <em>Processing Node Utilization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.ProcessingNodeUtilizationImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getProcessingNodeUtilization()
		 * @generated
		 */
		EClass PROCESSING_NODE_UTILIZATION = eINSTANCE.getProcessingNodeUtilization();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_NODE_UTILIZATION__TARGET = eINSTANCE.getProcessingNodeUtilization_Target();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.ProcessingNodeMemoryImpl <em>Processing Node Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.ProcessingNodeMemoryImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getProcessingNodeMemory()
		 * @generated
		 */
		EClass PROCESSING_NODE_MEMORY = eINSTANCE.getProcessingNodeMemory();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_NODE_MEMORY__TARGET = eINSTANCE.getProcessingNodeMemory_Target();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.NetworkUtilizationImpl <em>Network Utilization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.NetworkUtilizationImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNetworkUtilization()
		 * @generated
		 */
		EClass NETWORK_UTILIZATION = eINSTANCE.getNetworkUtilization();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_UTILIZATION__TARGET = eINSTANCE.getNetworkUtilization_Target();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.WorkflowLatencyImpl <em>Workflow Latency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.WorkflowLatencyImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getWorkflowLatency()
		 * @generated
		 */
		EClass WORKFLOW_LATENCY = eINSTANCE.getWorkflowLatency();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_LATENCY__TARGET = eINSTANCE.getWorkflowLatency_Target();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.TaskProcessingAmountImpl <em>Task Processing Amount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.TaskProcessingAmountImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getTaskProcessingAmount()
		 * @generated
		 */
		EClass TASK_PROCESSING_AMOUNT = eINSTANCE.getTaskProcessingAmount();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_PROCESSING_AMOUNT__TARGET = eINSTANCE.getTaskProcessingAmount_Target();

		/**
		 * The meta object literal for the '<em><b>Histogram Buckect Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_PROCESSING_AMOUNT__HISTOGRAM_BUCKECT_NUM = eINSTANCE.getTaskProcessingAmount_HistogramBuckectNum();

		/**
		 * The meta object literal for the '<em><b>Expected Max TPA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_PROCESSING_AMOUNT__EXPECTED_MAX_TPA = eINSTANCE.getTaskProcessingAmount_ExpectedMaxTPA();

		/**
		 * The meta object literal for the '<em><b>Expected Min TPA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_PROCESSING_AMOUNT__EXPECTED_MIN_TPA = eINSTANCE.getTaskProcessingAmount_ExpectedMinTPA();

		/**
		 * The meta object literal for the '<em><b>Linear Bucket Distribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_PROCESSING_AMOUNT__LINEAR_BUCKET_DISTRIBUTION = eINSTANCE.getTaskProcessingAmount_LinearBucketDistribution();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.StreamDataRateImpl <em>Stream Data Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.StreamDataRateImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getStreamDataRate()
		 * @generated
		 */
		EClass STREAM_DATA_RATE = eINSTANCE.getStreamDataRate();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAM_DATA_RATE__TARGET = eINSTANCE.getStreamDataRate_Target();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.MeterImpl <em>Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.MeterImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getMeter()
		 * @generated
		 */
		EClass METER = eINSTANCE.getMeter();

		/**
		 * The meta object literal for the '<em><b>Monitoring Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METER__MONITORING_SERVER = eINSTANCE.getMeter_MonitoringServer();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.PrometheusMeterImpl <em>Prometheus Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.PrometheusMeterImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getPrometheusMeter()
		 * @generated
		 */
		EClass PROMETHEUS_METER = eINSTANCE.getPrometheusMeter();

		/**
		 * The meta object literal for the '<em><b>Monitoring Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMETHEUS_METER__MONITORING_PORT = eINSTANCE.getPrometheusMeter_MonitoringPort();

		/**
		 * The meta object literal for the '<em><b>Monitoring Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMETHEUS_METER__MONITORING_TIME = eINSTANCE.getPrometheusMeter_MonitoringTime();

		/**
		 * The meta object literal for the '<em><b>Get Prometheus Server Configuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROMETHEUS_METER___GET_PROMETHEUS_SERVER_CONFIGURATION = eINSTANCE.getPrometheusMeter__GetPrometheusServerConfiguration();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.NodeHostedMeterImpl <em>Node Hosted Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.NodeHostedMeterImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNodeHostedMeter()
		 * @generated
		 */
		EClass NODE_HOSTED_METER = eINSTANCE.getNodeHostedMeter();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_HOSTED_METER__OWNER = eINSTANCE.getNodeHostedMeter_Owner();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.NodeResourceMeterImpl <em>Node Resource Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.NodeResourceMeterImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNodeResourceMeter()
		 * @generated
		 */
		EClass NODE_RESOURCE_METER = eINSTANCE.getNodeResourceMeter();

		/**
		 * The meta object literal for the '<em><b>UMetric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_RESOURCE_METER__UMETRIC = eINSTANCE.getNodeResourceMeter_UMetric();

		/**
		 * The meta object literal for the '<em><b>MMetric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_RESOURCE_METER__MMETRIC = eINSTANCE.getNodeResourceMeter_MMetric();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.CommunicationMeterImpl <em>Communication Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.CommunicationMeterImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getCommunicationMeter()
		 * @generated
		 */
		EClass COMMUNICATION_METER = eINSTANCE.getCommunicationMeter();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_METER__METRIC = eINSTANCE.getCommunicationMeter_Metric();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.StreamRateMeterImpl <em>Stream Rate Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.StreamRateMeterImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getStreamRateMeter()
		 * @generated
		 */
		EClass STREAM_RATE_METER = eINSTANCE.getStreamRateMeter();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAM_RATE_METER__OWNER = eINSTANCE.getStreamRateMeter_Owner();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAM_RATE_METER__METRIC = eINSTANCE.getStreamRateMeter_Metric();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.WorkflowLatencyMeterImpl <em>Workflow Latency Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.WorkflowLatencyMeterImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getWorkflowLatencyMeter()
		 * @generated
		 */
		EClass WORKFLOW_LATENCY_METER = eINSTANCE.getWorkflowLatencyMeter();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_LATENCY_METER__OWNER = eINSTANCE.getWorkflowLatencyMeter_Owner();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_LATENCY_METER__METRIC = eINSTANCE.getWorkflowLatencyMeter_Metric();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.TaskProcessingAmountMeterImpl <em>Task Processing Amount Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.TaskProcessingAmountMeterImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getTaskProcessingAmountMeter()
		 * @generated
		 */
		EClass TASK_PROCESSING_AMOUNT_METER = eINSTANCE.getTaskProcessingAmountMeter();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_PROCESSING_AMOUNT_METER__OWNER = eINSTANCE.getTaskProcessingAmountMeter_Owner();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_PROCESSING_AMOUNT_METER__METRIC = eINSTANCE.getTaskProcessingAmountMeter_Metric();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.DeployableComponentImpl <em>Deployable Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.DeployableComponentImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getDeployableComponent()
		 * @generated
		 */
		EClass DEPLOYABLE_COMPONENT = eINSTANCE.getDeployableComponent();

		/**
		 * The meta object literal for the '<em><b>Deployment Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG = eINSTANCE.getDeployableComponent_DeploymentConfig();

		/**
		 * The meta object literal for the '<em><b>Configure Deployment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPLOYABLE_COMPONENT___CONFIGURE_DEPLOYMENT = eINSTANCE.getDeployableComponent__ConfigureDeployment();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.DeploymentConfigurationImpl <em>Deployment Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.DeploymentConfigurationImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getDeploymentConfiguration()
		 * @generated
		 */
		EClass DEPLOYMENT_CONFIGURATION = eINSTANCE.getDeploymentConfiguration();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.PlatformServiceDeploymentConfImpl <em>Platform Service Deployment Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.PlatformServiceDeploymentConfImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getPlatformServiceDeploymentConf()
		 * @generated
		 */
		EClass PLATFORM_SERVICE_DEPLOYMENT_CONF = eINSTANCE.getPlatformServiceDeploymentConf();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.OrchestratorDeploymentConfImpl <em>Orchestrator Deployment Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.OrchestratorDeploymentConfImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getOrchestratorDeploymentConf()
		 * @generated
		 */
		EClass ORCHESTRATOR_DEPLOYMENT_CONF = eINSTANCE.getOrchestratorDeploymentConf();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE = eINSTANCE.getOrchestratorDeploymentConf_Image();

		/**
		 * The meta object literal for the '<em><b>Image Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE_TAG = eINSTANCE.getOrchestratorDeploymentConf_ImageTag();

		/**
		 * The meta object literal for the '<em><b>Image Pull Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE_PULL_POLICY = eINSTANCE.getOrchestratorDeploymentConf_ImagePullPolicy();

		/**
		 * The meta object literal for the '<em><b>Replicas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORCHESTRATOR_DEPLOYMENT_CONF__REPLICAS = eINSTANCE.getOrchestratorDeploymentConf_Replicas();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORCHESTRATOR_DEPLOYMENT_CONF__COMMAND = eINSTANCE.getOrchestratorDeploymentConf_Command();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORCHESTRATOR_DEPLOYMENT_CONF__ARGS = eINSTANCE.getOrchestratorDeploymentConf_Args();

		/**
		 * The meta object literal for the '<em><b>Restart Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORCHESTRATOR_DEPLOYMENT_CONF__RESTART_POLICY = eINSTANCE.getOrchestratorDeploymentConf_RestartPolicy();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORCHESTRATOR_DEPLOYMENT_CONF__ENV = eINSTANCE.getOrchestratorDeploymentConf_Env();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTRATOR_DEPLOYMENT_CONF__VOLUMES = eINSTANCE.getOrchestratorDeploymentConf_Volumes();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTRATOR_DEPLOYMENT_CONF__PORTS = eINSTANCE.getOrchestratorDeploymentConf_Ports();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTRATOR_DEPLOYMENT_CONF__CONSTRAINTS = eINSTANCE.getOrchestratorDeploymentConf_Constraints();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.NodeDeploymentConfImpl <em>Node Deployment Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.NodeDeploymentConfImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNodeDeploymentConf()
		 * @generated
		 */
		EClass NODE_DEPLOYMENT_CONF = eINSTANCE.getNodeDeploymentConf();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_DEPLOYMENT_CONF__ARGUMENTS = eINSTANCE.getNodeDeploymentConf_Arguments();

		/**
		 * The meta object literal for the '<em><b>Artifact Locator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_DEPLOYMENT_CONF__ARTIFACT_LOCATOR = eINSTANCE.getNodeDeploymentConf_ArtifactLocator();

		/**
		 * The meta object literal for the '<em><b>Artifact Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_DEPLOYMENT_CONF__ARTIFACT_NAME = eINSTANCE.getNodeDeploymentConf_ArtifactName();

		/**
		 * The meta object literal for the '<em><b>Config Folder Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_DEPLOYMENT_CONF__CONFIG_FOLDER_PATH = eINSTANCE.getNodeDeploymentConf_ConfigFolderPath();

		/**
		 * The meta object literal for the '<em><b>Script Folder Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_DEPLOYMENT_CONF__SCRIPT_FOLDER_PATH = eINSTANCE.getNodeDeploymentConf_ScriptFolderPath();

		/**
		 * The meta object literal for the '<em><b>Data Folder Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_DEPLOYMENT_CONF__DATA_FOLDER_PATH = eINSTANCE.getNodeDeploymentConf_DataFolderPath();

		/**
		 * The meta object literal for the '<em><b>Log Folder Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_DEPLOYMENT_CONF__LOG_FOLDER_PATH = eINSTANCE.getNodeDeploymentConf_LogFolderPath();

		/**
		 * The meta object literal for the '<em><b>Code Folder Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_DEPLOYMENT_CONF__CODE_FOLDER_PATH = eINSTANCE.getNodeDeploymentConf_CodeFolderPath();

		/**
		 * The meta object literal for the '<em><b>Is Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_DEPLOYMENT_CONF__IS_RUNNING = eINSTANCE.getNodeDeploymentConf_IsRunning();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.KubernetesDeploymentConfImpl <em>Kubernetes Deployment Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.KubernetesDeploymentConfImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getKubernetesDeploymentConf()
		 * @generated
		 */
		EClass KUBERNETES_DEPLOYMENT_CONF = eINSTANCE.getKubernetesDeploymentConf();

		/**
		 * The meta object literal for the '<em><b>External IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KUBERNETES_DEPLOYMENT_CONF__EXTERNAL_IP = eINSTANCE.getKubernetesDeploymentConf_ExternalIP();

		/**
		 * The meta object literal for the '<em><b>Service Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KUBERNETES_DEPLOYMENT_CONF__SERVICE_TYPE = eINSTANCE.getKubernetesDeploymentConf_ServiceType();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.SwarmDeploymentConfImpl <em>Swarm Deployment Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.SwarmDeploymentConfImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getSwarmDeploymentConf()
		 * @generated
		 */
		EClass SWARM_DEPLOYMENT_CONF = eINSTANCE.getSwarmDeploymentConf();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWARM_DEPLOYMENT_CONF__NETWORK = eINSTANCE.getSwarmDeploymentConf_Network();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.NomadDeploymentConfImpl <em>Nomad Deployment Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.NomadDeploymentConfImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNomadDeploymentConf()
		 * @generated
		 */
		EClass NOMAD_DEPLOYMENT_CONF = eINSTANCE.getNomadDeploymentConf();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOMAD_DEPLOYMENT_CONF__REGION = eINSTANCE.getNomadDeploymentConf_Region();

		/**
		 * The meta object literal for the '<em><b>Data Center</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOMAD_DEPLOYMENT_CONF__DATA_CENTER = eINSTANCE.getNomadDeploymentConf_DataCenter();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOMAD_DEPLOYMENT_CONF__PRIORITY = eINSTANCE.getNomadDeploymentConf_Priority();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOMAD_DEPLOYMENT_CONF__DRIVER = eINSTANCE.getNomadDeploymentConf_Driver();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.VolumeImpl <em>Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.VolumeImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getVolume()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__SOURCE = eINSTANCE.getVolume_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__TARGET = eINSTANCE.getVolume_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__TYPE = eINSTANCE.getVolume_Type();

		/**
		 * The meta object literal for the '<em><b>Access Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__ACCESS_MODE = eINSTANCE.getVolume_AccessMode();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.PortImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__TARGET = eINSTANCE.getPort_Target();

		/**
		 * The meta object literal for the '<em><b>Published</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__PUBLISHED = eINSTANCE.getPort_Published();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.DeploymentConstraintsImpl <em>Deployment Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.DeploymentConstraintsImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getDeploymentConstraints()
		 * @generated
		 */
		EClass DEPLOYMENT_CONSTRAINTS = eINSTANCE.getDeploymentConstraints();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_CONSTRAINTS__LABELS = eINSTANCE.getDeploymentConstraints_Labels();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_CONSTRAINTS__RESOURCES = eINSTANCE.getDeploymentConstraints_Resources();

		/**
		 * The meta object literal for the '{@link java.lang.Exception <em>Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getException()
		 * @generated
		 */
		EClass EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.ConfigurationException <em>Configuration Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.ConfigurationException
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getConfigurationException()
		 * @generated
		 */
		EClass CONFIGURATION_EXCEPTION = eINSTANCE.getConfigurationException();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.DeploymentException <em>Deployment Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.DeploymentException
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getDeploymentException()
		 * @generated
		 */
		EClass DEPLOYMENT_EXCEPTION = eINSTANCE.getDeploymentException();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.LaunchException <em>Launch Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.LaunchException
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getLaunchException()
		 * @generated
		 */
		EClass LAUNCH_EXCEPTION = eINSTANCE.getLaunchException();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.StringToStringMapImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getStringToStringMap()
		 * @generated
		 */
		EClass STRING_TO_STRING_MAP = eINSTANCE.getStringToStringMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__KEY = eINSTANCE.getStringToStringMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__VALUE = eINSTANCE.getStringToStringMap_Value();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.FileDescriptorImpl <em>File Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.FileDescriptorImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getFileDescriptor()
		 * @generated
		 */
		EClass FILE_DESCRIPTOR = eINSTANCE.getFileDescriptor();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_DESCRIPTOR__FILE_PATH = eINSTANCE.getFileDescriptor_FilePath();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_DESCRIPTOR__FILE_NAME = eINSTANCE.getFileDescriptor_FileName();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.DeploymentFileDescriptorImpl <em>Deployment File Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.DeploymentFileDescriptorImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getDeploymentFileDescriptor()
		 * @generated
		 */
		EClass DEPLOYMENT_FILE_DESCRIPTOR = eINSTANCE.getDeploymentFileDescriptor();

		/**
		 * The meta object literal for the '<em><b>File Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_FILE_DESCRIPTOR__FILE_CONTENT = eINSTANCE.getDeploymentFileDescriptor_FileContent();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_FILE_DESCRIPTOR__ELEMENT_TYPE = eINSTANCE.getDeploymentFileDescriptor_ElementType();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_FILE_DESCRIPTOR__OWNER = eINSTANCE.getDeploymentFileDescriptor_Owner();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.impl.ArtifactDescriptorImpl <em>Artifact Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.impl.ArtifactDescriptorImpl
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getArtifactDescriptor()
		 * @generated
		 */
		EClass ARTIFACT_DESCRIPTOR = eINSTANCE.getArtifactDescriptor();

		/**
		 * The meta object literal for the '<em><b>Local Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT_DESCRIPTOR__LOCAL_PATH = eINSTANCE.getArtifactDescriptor_LocalPath();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.VolumeAccessMode <em>Volume Access Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.VolumeAccessMode
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getVolumeAccessMode()
		 * @generated
		 */
		EEnum VOLUME_ACCESS_MODE = eINSTANCE.getVolumeAccessMode();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.VolumeType <em>Volume Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.VolumeType
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getVolumeType()
		 * @generated
		 */
		EEnum VOLUME_TYPE = eINSTANCE.getVolumeType();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.NomadDriver <em>Nomad Driver</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.NomadDriver
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getNomadDriver()
		 * @generated
		 */
		EEnum NOMAD_DRIVER = eINSTANCE.getNomadDriver();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.PortMode <em>Port Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.PortMode
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getPortMode()
		 * @generated
		 */
		EEnum PORT_MODE = eINSTANCE.getPortMode();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.ServiceType <em>Service Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.ServiceType
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getServiceType()
		 * @generated
		 */
		EEnum SERVICE_TYPE = eINSTANCE.getServiceType();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.Protocol <em>Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.Protocol
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getProtocol()
		 * @generated
		 */
		EEnum PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '{@link es.unican.istr.pasys.pasys.DeployableComponentType <em>Deployable Component Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unican.istr.pasys.pasys.DeployableComponentType
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getDeployableComponentType()
		 * @generated
		 */
		EEnum DEPLOYABLE_COMPONENT_TYPE = eINSTANCE.getDeployableComponentType();

		/**
		 * The meta object literal for the '<em>Properties</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Properties
		 * @see es.unican.istr.pasys.pasys.impl.PasysPackageImpl#getProperties()
		 * @generated
		 */
		EDataType PROPERTIES = eINSTANCE.getProperties();

	}

} //PasysPackage
