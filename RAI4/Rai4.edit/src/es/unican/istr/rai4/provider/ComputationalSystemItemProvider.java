/**
 */
package es.unican.istr.rai4.provider;


import es.unican.istr.rai4.ComputationalSystem;
import es.unican.istr.rai4.Rai4Factory;
import es.unican.istr.rai4.Rai4Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link es.unican.istr.rai4.ComputationalSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComputationalSystemItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputationalSystemItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addDatePropertyDescriptor(object);
			addAuthorsPropertyDescriptor(object);
			addTargetPlatformNamePropertyDescriptor(object);
			addDocPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComputationalSystem_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComputationalSystem_name_feature", "_UI_ComputationalSystem_type"),
				 Rai4Package.Literals.COMPUTATIONAL_SYSTEM__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComputationalSystem_date_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComputationalSystem_date_feature", "_UI_ComputationalSystem_type"),
				 Rai4Package.Literals.COMPUTATIONAL_SYSTEM__DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Authors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComputationalSystem_authors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComputationalSystem_authors_feature", "_UI_ComputationalSystem_type"),
				 Rai4Package.Literals.COMPUTATIONAL_SYSTEM__AUTHORS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Platform Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPlatformNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComputationalSystem_targetPlatformName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComputationalSystem_targetPlatformName_feature", "_UI_ComputationalSystem_type"),
				 Rai4Package.Literals.COMPUTATIONAL_SYSTEM__TARGET_PLATFORM_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Doc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ComputationalSystem_doc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComputationalSystem_doc_feature", "_UI_ComputationalSystem_type"),
				 Rai4Package.Literals.COMPUTATIONAL_SYSTEM__DOC,
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
			childrenFeatures.add(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS);
			childrenFeatures.add(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES);
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
	 * This returns ComputationalSystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComputationalSystem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComputationalSystem)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComputationalSystem_type") :
			getString("_UI_ComputationalSystem_type") + " " + label;
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

		switch (notification.getFeatureID(ComputationalSystem.class)) {
			case Rai4Package.COMPUTATIONAL_SYSTEM__NAME:
			case Rai4Package.COMPUTATIONAL_SYSTEM__DATE:
			case Rai4Package.COMPUTATIONAL_SYSTEM__AUTHORS:
			case Rai4Package.COMPUTATIONAL_SYSTEM__TARGET_PLATFORM_NAME:
			case Rai4Package.COMPUTATIONAL_SYSTEM__DOC:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Rai4Package.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS:
			case Rai4Package.COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES:
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
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createPhysicalProcessingNode()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createAWSVirtualProcessingNode()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createProcessingNodeCluster()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createOrchestrationCluster()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createKubernetesCluster()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createSwarmCluster()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createNomadCluster()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createAVROService()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createZookeeperService()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createKafkaService()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createNodeScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createSparkService()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createStormService()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createNeo4JService()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createMemSQLService()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createCassandraService()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createPrometheusService()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createWorkloadStreamData()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createKafkaWorkloadStreamData()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createWorkflow()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createSchedulableSet()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createProcessingNodeUtilization()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createProcessingNodeMemory()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createNetworkUtilization()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createWorkflowLatency()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createTaskProcessingAmount()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS,
				 Rai4Factory.eINSTANCE.createStreamDataRate()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES,
				 Rai4Factory.eINSTANCE.create(Rai4Package.Literals.STRING_TO_STRING_MAP)));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Rai4EditPlugin.INSTANCE;
	}

}
