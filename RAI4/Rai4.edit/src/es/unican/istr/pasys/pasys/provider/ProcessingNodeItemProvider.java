/**
 */
package es.unican.istr.pasys.pasys.provider;


import es.unican.istr.pasys.pasys.PasysFactory;
import es.unican.istr.pasys.pasys.PasysPackage;
import es.unican.istr.pasys.pasys.ProcessingNode;

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
 * This is the item provider adapter for a {@link es.unican.istr.pasys.pasys.ProcessingNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessingNodeItemProvider extends PlatformResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingNodeItemProvider(AdapterFactory adapterFactory) {
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

			addIpPropertyDescriptor(object);
			addOsPropertyDescriptor(object);
			addConcurrencyLevelPropertyDescriptor(object);
			addMemorySizePropertyDescriptor(object);
			addSpeedFactorPropertyDescriptor(object);
			addConfigDataPropertyDescriptor(object);
			addUserNamePropertyDescriptor(object);
			addConnectedToPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessingNode_ip_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessingNode_ip_feature", "_UI_ProcessingNode_type"),
				 PasysPackage.Literals.PROCESSING_NODE__IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Os feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessingNode_os_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessingNode_os_feature", "_UI_ProcessingNode_type"),
				 PasysPackage.Literals.PROCESSING_NODE__OS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Concurrency Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConcurrencyLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessingNode_concurrencyLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessingNode_concurrencyLevel_feature", "_UI_ProcessingNode_type"),
				 PasysPackage.Literals.PROCESSING_NODE__CONCURRENCY_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Memory Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemorySizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessingNode_memorySize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessingNode_memorySize_feature", "_UI_ProcessingNode_type"),
				 PasysPackage.Literals.PROCESSING_NODE__MEMORY_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Speed Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpeedFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessingNode_speedFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessingNode_speedFactor_feature", "_UI_ProcessingNode_type"),
				 PasysPackage.Literals.PROCESSING_NODE__SPEED_FACTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Config Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfigDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessingNode_configData_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessingNode_configData_feature", "_UI_ProcessingNode_type"),
				 PasysPackage.Literals.PROCESSING_NODE__CONFIG_DATA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessingNode_userName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessingNode_userName_feature", "_UI_ProcessingNode_type"),
				 PasysPackage.Literals.PROCESSING_NODE__USER_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connected To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectedToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessingNode_connectedTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessingNode_connectedTo_feature", "_UI_ProcessingNode_type"),
				 PasysPackage.Literals.PROCESSING_NODE__CONNECTED_TO,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(PasysPackage.Literals.PROCESSING_NODE__LAUNCHING_SCRIPTS);
			childrenFeatures.add(PasysPackage.Literals.PROCESSING_NODE__CONFIG_FILES);
			childrenFeatures.add(PasysPackage.Literals.PROCESSING_NODE__CODE_FILES);
			childrenFeatures.add(PasysPackage.Literals.PROCESSING_NODE__OWNED_METERS);
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
		String label = ((ProcessingNode)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ProcessingNode_type") :
			getString("_UI_ProcessingNode_type") + " " + label;
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

		switch (notification.getFeatureID(ProcessingNode.class)) {
			case PasysPackage.PROCESSING_NODE__IP:
			case PasysPackage.PROCESSING_NODE__OS:
			case PasysPackage.PROCESSING_NODE__CONCURRENCY_LEVEL:
			case PasysPackage.PROCESSING_NODE__MEMORY_SIZE:
			case PasysPackage.PROCESSING_NODE__SPEED_FACTOR:
			case PasysPackage.PROCESSING_NODE__CONFIG_DATA:
			case PasysPackage.PROCESSING_NODE__USER_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PasysPackage.PROCESSING_NODE__LAUNCHING_SCRIPTS:
			case PasysPackage.PROCESSING_NODE__CONFIG_FILES:
			case PasysPackage.PROCESSING_NODE__CODE_FILES:
			case PasysPackage.PROCESSING_NODE__OWNED_METERS:
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
				(PasysPackage.Literals.PROCESSING_NODE__LAUNCHING_SCRIPTS,
				 PasysFactory.eINSTANCE.createDeploymentFileDescriptor()));

		newChildDescriptors.add
			(createChildParameter
				(PasysPackage.Literals.PROCESSING_NODE__CONFIG_FILES,
				 PasysFactory.eINSTANCE.createDeploymentFileDescriptor()));

		newChildDescriptors.add
			(createChildParameter
				(PasysPackage.Literals.PROCESSING_NODE__CODE_FILES,
				 PasysFactory.eINSTANCE.createArtifactDescriptor()));

		newChildDescriptors.add
			(createChildParameter
				(PasysPackage.Literals.PROCESSING_NODE__OWNED_METERS,
				 PasysFactory.eINSTANCE.createNodeResourceMeter()));

		newChildDescriptors.add
			(createChildParameter
				(PasysPackage.Literals.PROCESSING_NODE__OWNED_METERS,
				 PasysFactory.eINSTANCE.createCommunicationMeter()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == PasysPackage.Literals.PROCESSING_NODE__LAUNCHING_SCRIPTS ||
			childFeature == PasysPackage.Literals.PROCESSING_NODE__CONFIG_FILES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
