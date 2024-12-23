/**
 */
package es.unican.istr.pasys.pasys.provider;


import es.unican.istr.pasys.pasys.AWSVirtualProcessingNode;
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
 * This is the item provider adapter for a {@link es.unican.istr.pasys.pasys.AWSVirtualProcessingNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AWSVirtualProcessingNodeItemProvider extends VirtualProcessingNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AWSVirtualProcessingNodeItemProvider(AdapterFactory adapterFactory) {
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

			addVpcPropertyDescriptor(object);
			addSubNetPropertyDescriptor(object);
			addKeyPairPropertyDescriptor(object);
			addSecurityGroupPropertyDescriptor(object);
			addAMIPropertyDescriptor(object);
			addInstanceTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Vpc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVpcPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AWSVirtualProcessingNode_vpc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AWSVirtualProcessingNode_vpc_feature", "_UI_AWSVirtualProcessingNode_type"),
				 PasysPackage.Literals.AWS_VIRTUAL_PROCESSING_NODE__VPC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub Net feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubNetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AWSVirtualProcessingNode_subNet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AWSVirtualProcessingNode_subNet_feature", "_UI_AWSVirtualProcessingNode_type"),
				 PasysPackage.Literals.AWS_VIRTUAL_PROCESSING_NODE__SUB_NET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Key Pair feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyPairPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AWSVirtualProcessingNode_keyPair_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AWSVirtualProcessingNode_keyPair_feature", "_UI_AWSVirtualProcessingNode_type"),
				 PasysPackage.Literals.AWS_VIRTUAL_PROCESSING_NODE__KEY_PAIR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AWSVirtualProcessingNode_securityGroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AWSVirtualProcessingNode_securityGroup_feature", "_UI_AWSVirtualProcessingNode_type"),
				 PasysPackage.Literals.AWS_VIRTUAL_PROCESSING_NODE__SECURITY_GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the AMI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAMIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AWSVirtualProcessingNode_AMI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AWSVirtualProcessingNode_AMI_feature", "_UI_AWSVirtualProcessingNode_type"),
				 PasysPackage.Literals.AWS_VIRTUAL_PROCESSING_NODE__AMI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AWSVirtualProcessingNode_instanceType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AWSVirtualProcessingNode_instanceType_feature", "_UI_AWSVirtualProcessingNode_type"),
				 PasysPackage.Literals.AWS_VIRTUAL_PROCESSING_NODE__INSTANCE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns AWSVirtualProcessingNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AWSVirtualProcessingNode"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AWSVirtualProcessingNode)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AWSVirtualProcessingNode_type") :
			getString("_UI_AWSVirtualProcessingNode_type") + " " + label;
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

		switch (notification.getFeatureID(AWSVirtualProcessingNode.class)) {
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__VPC:
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__SUB_NET:
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__KEY_PAIR:
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__SECURITY_GROUP:
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__AMI:
			case PasysPackage.AWS_VIRTUAL_PROCESSING_NODE__INSTANCE_TYPE:
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
