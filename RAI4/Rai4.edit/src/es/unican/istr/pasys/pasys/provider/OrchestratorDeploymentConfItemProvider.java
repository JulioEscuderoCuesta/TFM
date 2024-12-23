/**
 */
package es.unican.istr.pasys.pasys.provider;


import es.unican.istr.pasys.pasys.OrchestratorDeploymentConf;
import es.unican.istr.pasys.pasys.PasysFactory;
import es.unican.istr.pasys.pasys.PasysPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link es.unican.istr.pasys.pasys.OrchestratorDeploymentConf} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrchestratorDeploymentConfItemProvider extends PlatformServiceDeploymentConfItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestratorDeploymentConfItemProvider(AdapterFactory adapterFactory) {
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

			addImagePropertyDescriptor(object);
			addImageTagPropertyDescriptor(object);
			addImagePullPolicyPropertyDescriptor(object);
			addReplicasPropertyDescriptor(object);
			addCommandPropertyDescriptor(object);
			addArgsPropertyDescriptor(object);
			addRestartPolicyPropertyDescriptor(object);
			addEnvPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Image feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrchestratorDeploymentConf_image_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrchestratorDeploymentConf_image_feature", "_UI_OrchestratorDeploymentConf_type"),
				 PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Image Tag feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageTagPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrchestratorDeploymentConf_imageTag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrchestratorDeploymentConf_imageTag_feature", "_UI_OrchestratorDeploymentConf_type"),
				 PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE_TAG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Image Pull Policy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImagePullPolicyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrchestratorDeploymentConf_imagePullPolicy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrchestratorDeploymentConf_imagePullPolicy_feature", "_UI_OrchestratorDeploymentConf_type"),
				 PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE_PULL_POLICY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Replicas feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReplicasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrchestratorDeploymentConf_replicas_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrchestratorDeploymentConf_replicas_feature", "_UI_OrchestratorDeploymentConf_type"),
				 PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__REPLICAS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrchestratorDeploymentConf_command_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrchestratorDeploymentConf_command_feature", "_UI_OrchestratorDeploymentConf_type"),
				 PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__COMMAND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Args feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArgsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrchestratorDeploymentConf_args_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrchestratorDeploymentConf_args_feature", "_UI_OrchestratorDeploymentConf_type"),
				 PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__ARGS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Restart Policy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRestartPolicyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrchestratorDeploymentConf_restartPolicy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrchestratorDeploymentConf_restartPolicy_feature", "_UI_OrchestratorDeploymentConf_type"),
				 PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__RESTART_POLICY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Env feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnvPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrchestratorDeploymentConf_env_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrchestratorDeploymentConf_env_feature", "_UI_OrchestratorDeploymentConf_type"),
				 PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__ENV,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__VOLUMES);
			childrenFeatures.add(PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__PORTS);
			childrenFeatures.add(PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__CONSTRAINTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OrchestratorDeploymentConf)object).getImage();
		return label == null || label.length() == 0 ?
			getString("_UI_OrchestratorDeploymentConf_type") :
			getString("_UI_OrchestratorDeploymentConf_type") + " " + label;
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

		switch (notification.getFeatureID(OrchestratorDeploymentConf.class)) {
			case PasysPackage.ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE:
			case PasysPackage.ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE_TAG:
			case PasysPackage.ORCHESTRATOR_DEPLOYMENT_CONF__IMAGE_PULL_POLICY:
			case PasysPackage.ORCHESTRATOR_DEPLOYMENT_CONF__REPLICAS:
			case PasysPackage.ORCHESTRATOR_DEPLOYMENT_CONF__COMMAND:
			case PasysPackage.ORCHESTRATOR_DEPLOYMENT_CONF__ARGS:
			case PasysPackage.ORCHESTRATOR_DEPLOYMENT_CONF__RESTART_POLICY:
			case PasysPackage.ORCHESTRATOR_DEPLOYMENT_CONF__ENV:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PasysPackage.ORCHESTRATOR_DEPLOYMENT_CONF__VOLUMES:
			case PasysPackage.ORCHESTRATOR_DEPLOYMENT_CONF__PORTS:
			case PasysPackage.ORCHESTRATOR_DEPLOYMENT_CONF__CONSTRAINTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__VOLUMES,
				 PasysFactory.eINSTANCE.createVolume()));

		newChildDescriptors.add
			(createChildParameter
				(PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__PORTS,
				 PasysFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(PasysPackage.Literals.ORCHESTRATOR_DEPLOYMENT_CONF__CONSTRAINTS,
				 PasysFactory.eINSTANCE.createDeploymentConstraints()));
	}

}
