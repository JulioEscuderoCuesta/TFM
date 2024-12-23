/**
 */
package es.unican.istr.pasys.pasys.provider;


import es.unican.istr.pasys.pasys.PasysFactory;
import es.unican.istr.pasys.pasys.PasysPackage;
import es.unican.istr.pasys.pasys.WorkflowStreamData;

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
 * This is the item provider adapter for a {@link es.unican.istr.pasys.pasys.WorkflowStreamData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowStreamDataItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowStreamDataItemProvider(AdapterFactory adapterFactory) {
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

			addRetention_msPropertyDescriptor(object);
			addRetention_bytesPropertyDescriptor(object);
			addCleanupPolicyPropertyDescriptor(object);
			addNumPartitionsPropertyDescriptor(object);
			addNumReplicationPropertyDescriptor(object);
			addMessageSizePropertyDescriptor(object);
			addSchemaFilePropertyDescriptor(object);
			addIsSingleUsePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Retention ms feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRetention_msPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StreamData_retention_ms_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StreamData_retention_ms_feature", "_UI_StreamData_type"),
				 PasysPackage.Literals.STREAM_DATA__RETENTION_MS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Retention bytes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRetention_bytesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StreamData_retention_bytes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StreamData_retention_bytes_feature", "_UI_StreamData_type"),
				 PasysPackage.Literals.STREAM_DATA__RETENTION_BYTES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cleanup Policy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCleanupPolicyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StreamData_cleanupPolicy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StreamData_cleanupPolicy_feature", "_UI_StreamData_type"),
				 PasysPackage.Literals.STREAM_DATA__CLEANUP_POLICY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Num Partitions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumPartitionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StreamData_numPartitions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StreamData_numPartitions_feature", "_UI_StreamData_type"),
				 PasysPackage.Literals.STREAM_DATA__NUM_PARTITIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Num Replication feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumReplicationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StreamData_numReplication_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StreamData_numReplication_feature", "_UI_StreamData_type"),
				 PasysPackage.Literals.STREAM_DATA__NUM_REPLICATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Message Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessageSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StreamData_messageSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StreamData_messageSize_feature", "_UI_StreamData_type"),
				 PasysPackage.Literals.STREAM_DATA__MESSAGE_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schema File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchemaFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StreamData_schemaFile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StreamData_schemaFile_feature", "_UI_StreamData_type"),
				 PasysPackage.Literals.STREAM_DATA__SCHEMA_FILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Single Use feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSingleUsePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkflowStreamData_isSingleUse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkflowStreamData_isSingleUse_feature", "_UI_WorkflowStreamData_type"),
				 PasysPackage.Literals.WORKFLOW_STREAM_DATA__IS_SINGLE_USE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(PasysPackage.Literals.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG);
			childrenFeatures.add(PasysPackage.Literals.STREAM_DATA__OWNED_METERS);
			childrenFeatures.add(PasysPackage.Literals.STREAM_DATA__ASSIGNED_PARTITION);
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
		String label = ((WorkflowStreamData)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_WorkflowStreamData_type") :
			getString("_UI_WorkflowStreamData_type") + " " + label;
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

		switch (notification.getFeatureID(WorkflowStreamData.class)) {
			case PasysPackage.WORKFLOW_STREAM_DATA__RETENTION_MS:
			case PasysPackage.WORKFLOW_STREAM_DATA__RETENTION_BYTES:
			case PasysPackage.WORKFLOW_STREAM_DATA__CLEANUP_POLICY:
			case PasysPackage.WORKFLOW_STREAM_DATA__NUM_PARTITIONS:
			case PasysPackage.WORKFLOW_STREAM_DATA__NUM_REPLICATION:
			case PasysPackage.WORKFLOW_STREAM_DATA__MESSAGE_SIZE:
			case PasysPackage.WORKFLOW_STREAM_DATA__SCHEMA_FILE:
			case PasysPackage.WORKFLOW_STREAM_DATA__IS_SINGLE_USE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PasysPackage.WORKFLOW_STREAM_DATA__DEPLOYMENT_CONFIG:
			case PasysPackage.WORKFLOW_STREAM_DATA__OWNED_METERS:
			case PasysPackage.WORKFLOW_STREAM_DATA__ASSIGNED_PARTITION:
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
				(PasysPackage.Literals.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG,
				 PasysFactory.eINSTANCE.createNodeDeploymentConf()));

		newChildDescriptors.add
			(createChildParameter
				(PasysPackage.Literals.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG,
				 PasysFactory.eINSTANCE.createKubernetesDeploymentConf()));

		newChildDescriptors.add
			(createChildParameter
				(PasysPackage.Literals.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG,
				 PasysFactory.eINSTANCE.createSwarmDeploymentConf()));

		newChildDescriptors.add
			(createChildParameter
				(PasysPackage.Literals.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG,
				 PasysFactory.eINSTANCE.createNomadDeploymentConf()));

		newChildDescriptors.add
			(createChildParameter
				(PasysPackage.Literals.STREAM_DATA__OWNED_METERS,
				 PasysFactory.eINSTANCE.createStreamRateMeter()));

		newChildDescriptors.add
			(createChildParameter
				(PasysPackage.Literals.STREAM_DATA__ASSIGNED_PARTITION,
				 PasysFactory.eINSTANCE.createStreamDataPartition()));
	}

}
