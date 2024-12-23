/**
 */
package es.unican.istr.pasys.pasys.provider;


import es.unican.istr.pasys.pasys.NodeDeploymentConf;
import es.unican.istr.pasys.pasys.PasysPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link es.unican.istr.pasys.pasys.NodeDeploymentConf} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeDeploymentConfItemProvider extends PlatformServiceDeploymentConfItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeDeploymentConfItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addArgumentsPropertyDescriptor(object);
			addArtifactLocatorPropertyDescriptor(object);
			addArtifactNamePropertyDescriptor(object);
			addConfigFolderPathPropertyDescriptor(object);
			addScriptFolderPathPropertyDescriptor(object);
			addDataFolderPathPropertyDescriptor(object);
			addLogFolderPathPropertyDescriptor(object);
			addCodeFolderPathPropertyDescriptor(object);
			addIsRunningPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Arguments feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArgumentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeDeploymentConf_arguments_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeDeploymentConf_arguments_feature", "_UI_NodeDeploymentConf_type"),
				 PasysPackage.Literals.NODE_DEPLOYMENT_CONF__ARGUMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Artifact Locator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArtifactLocatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeDeploymentConf_artifactLocator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeDeploymentConf_artifactLocator_feature", "_UI_NodeDeploymentConf_type"),
				 PasysPackage.Literals.NODE_DEPLOYMENT_CONF__ARTIFACT_LOCATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Artifact Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArtifactNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeDeploymentConf_artifactName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeDeploymentConf_artifactName_feature", "_UI_NodeDeploymentConf_type"),
				 PasysPackage.Literals.NODE_DEPLOYMENT_CONF__ARTIFACT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Config Folder Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfigFolderPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeDeploymentConf_configFolderPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeDeploymentConf_configFolderPath_feature", "_UI_NodeDeploymentConf_type"),
				 PasysPackage.Literals.NODE_DEPLOYMENT_CONF__CONFIG_FOLDER_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Script Folder Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScriptFolderPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeDeploymentConf_scriptFolderPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeDeploymentConf_scriptFolderPath_feature", "_UI_NodeDeploymentConf_type"),
				 PasysPackage.Literals.NODE_DEPLOYMENT_CONF__SCRIPT_FOLDER_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Folder Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataFolderPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeDeploymentConf_dataFolderPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeDeploymentConf_dataFolderPath_feature", "_UI_NodeDeploymentConf_type"),
				 PasysPackage.Literals.NODE_DEPLOYMENT_CONF__DATA_FOLDER_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Log Folder Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogFolderPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeDeploymentConf_logFolderPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeDeploymentConf_logFolderPath_feature", "_UI_NodeDeploymentConf_type"),
				 PasysPackage.Literals.NODE_DEPLOYMENT_CONF__LOG_FOLDER_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Code Folder Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodeFolderPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeDeploymentConf_codeFolderPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeDeploymentConf_codeFolderPath_feature", "_UI_NodeDeploymentConf_type"),
				 PasysPackage.Literals.NODE_DEPLOYMENT_CONF__CODE_FOLDER_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Running feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsRunningPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeDeploymentConf_isRunning_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeDeploymentConf_isRunning_feature", "_UI_NodeDeploymentConf_type"),
				 PasysPackage.Literals.NODE_DEPLOYMENT_CONF__IS_RUNNING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns NodeDeploymentConf.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NodeDeploymentConf"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NodeDeploymentConf)object).getArtifactName();
		return label == null || label.length() == 0 ?
			getString("_UI_NodeDeploymentConf_type") :
			getString("_UI_NodeDeploymentConf_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(NodeDeploymentConf.class)) {
			case PasysPackage.NODE_DEPLOYMENT_CONF__ARGUMENTS:
			case PasysPackage.NODE_DEPLOYMENT_CONF__ARTIFACT_LOCATOR:
			case PasysPackage.NODE_DEPLOYMENT_CONF__ARTIFACT_NAME:
			case PasysPackage.NODE_DEPLOYMENT_CONF__CONFIG_FOLDER_PATH:
			case PasysPackage.NODE_DEPLOYMENT_CONF__SCRIPT_FOLDER_PATH:
			case PasysPackage.NODE_DEPLOYMENT_CONF__DATA_FOLDER_PATH:
			case PasysPackage.NODE_DEPLOYMENT_CONF__LOG_FOLDER_PATH:
			case PasysPackage.NODE_DEPLOYMENT_CONF__CODE_FOLDER_PATH:
			case PasysPackage.NODE_DEPLOYMENT_CONF__IS_RUNNING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
