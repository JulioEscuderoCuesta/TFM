/**
 */
package es.unican.istr.pasys.pasys.provider;


import es.unican.istr.pasys.pasys.PasysPackage;
import es.unican.istr.pasys.pasys.TaskProcessingAmount;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link es.unican.istr.pasys.pasys.TaskProcessingAmount} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskProcessingAmountItemProvider extends MetricItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskProcessingAmountItemProvider(AdapterFactory adapterFactory) {
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

			addTargetPropertyDescriptor(object);
			addHistogramBuckectNumPropertyDescriptor(object);
			addExpectedMaxTPAPropertyDescriptor(object);
			addExpectedMinTPAPropertyDescriptor(object);
			addLinearBucketDistributionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskProcessingAmount_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskProcessingAmount_target_feature", "_UI_TaskProcessingAmount_type"),
				 PasysPackage.Literals.TASK_PROCESSING_AMOUNT__TARGET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Histogram Buckect Num feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHistogramBuckectNumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskProcessingAmount_histogramBuckectNum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskProcessingAmount_histogramBuckectNum_feature", "_UI_TaskProcessingAmount_type"),
				 PasysPackage.Literals.TASK_PROCESSING_AMOUNT__HISTOGRAM_BUCKECT_NUM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expected Max TPA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpectedMaxTPAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskProcessingAmount_expectedMaxTPA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskProcessingAmount_expectedMaxTPA_feature", "_UI_TaskProcessingAmount_type"),
				 PasysPackage.Literals.TASK_PROCESSING_AMOUNT__EXPECTED_MAX_TPA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expected Min TPA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpectedMinTPAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskProcessingAmount_expectedMinTPA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskProcessingAmount_expectedMinTPA_feature", "_UI_TaskProcessingAmount_type"),
				 PasysPackage.Literals.TASK_PROCESSING_AMOUNT__EXPECTED_MIN_TPA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linear Bucket Distribution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearBucketDistributionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TaskProcessingAmount_linearBucketDistribution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TaskProcessingAmount_linearBucketDistribution_feature", "_UI_TaskProcessingAmount_type"),
				 PasysPackage.Literals.TASK_PROCESSING_AMOUNT__LINEAR_BUCKET_DISTRIBUTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TaskProcessingAmount.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TaskProcessingAmount"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TaskProcessingAmount)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TaskProcessingAmount_type") :
			getString("_UI_TaskProcessingAmount_type") + " " + label;
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

		switch (notification.getFeatureID(TaskProcessingAmount.class)) {
			case PasysPackage.TASK_PROCESSING_AMOUNT__HISTOGRAM_BUCKECT_NUM:
			case PasysPackage.TASK_PROCESSING_AMOUNT__EXPECTED_MAX_TPA:
			case PasysPackage.TASK_PROCESSING_AMOUNT__EXPECTED_MIN_TPA:
			case PasysPackage.TASK_PROCESSING_AMOUNT__LINEAR_BUCKET_DISTRIBUTION:
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
