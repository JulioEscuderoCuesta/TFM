/**
 */
package es.unican.istr.pasys.pasys.provider;


import es.unican.istr.pasys.pasys.PasysPackage;
import es.unican.istr.pasys.pasys.SparkService;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link es.unican.istr.pasys.pasys.SparkService} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SparkServiceItemProvider extends SchedulingServiceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SparkServiceItemProvider(AdapterFactory adapterFactory) {
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

			addLoadPropertyDescriptor(object);
			addDriverCoresPropertyDescriptor(object);
			addDriverMaxResultSizePropertyDescriptor(object);
			addDriverMemoryPropertyDescriptor(object);
			addLocalDirPropertyDescriptor(object);
			addMasterPropertyDescriptor(object);
			addWindowSizePropertyDescriptor(object);
			addExecutorMemoryPropertyDescriptor(object);
			addExtraListenerPropertyDescriptor(object);
			addLogConfPropertyDescriptor(object);
			addSubmitDeployModePropertyDescriptor(object);
			addLogCallerContextPropertyDescriptor(object);
			addDriverSuperviserPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Load feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SparkService_load_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SparkService_load_feature", "_UI_SparkService_type"),
				 PasysPackage.Literals.SPARK_SERVICE__LOAD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Driver Cores feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDriverCoresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SparkService_driverCores_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SparkService_driverCores_feature", "_UI_SparkService_type"),
				 PasysPackage.Literals.SPARK_SERVICE__DRIVER_CORES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Driver Max Result Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDriverMaxResultSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SparkService_driverMaxResultSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SparkService_driverMaxResultSize_feature", "_UI_SparkService_type"),
				 PasysPackage.Literals.SPARK_SERVICE__DRIVER_MAX_RESULT_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Driver Memory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDriverMemoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SparkService_driverMemory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SparkService_driverMemory_feature", "_UI_SparkService_type"),
				 PasysPackage.Literals.SPARK_SERVICE__DRIVER_MEMORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Dir feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalDirPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SparkService_localDir_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SparkService_localDir_feature", "_UI_SparkService_type"),
				 PasysPackage.Literals.SPARK_SERVICE__LOCAL_DIR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Master feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMasterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SparkService_master_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SparkService_master_feature", "_UI_SparkService_type"),
				 PasysPackage.Literals.SPARK_SERVICE__MASTER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Window Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWindowSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SparkService_windowSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SparkService_windowSize_feature", "_UI_SparkService_type"),
				 PasysPackage.Literals.SPARK_SERVICE__WINDOW_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Executor Memory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutorMemoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SparkService_executorMemory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SparkService_executorMemory_feature", "_UI_SparkService_type"),
				 PasysPackage.Literals.SPARK_SERVICE__EXECUTOR_MEMORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extra Listener feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtraListenerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SparkService_extraListener_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SparkService_extraListener_feature", "_UI_SparkService_type"),
				 PasysPackage.Literals.SPARK_SERVICE__EXTRA_LISTENER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Log Conf feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogConfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SparkService_logConf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SparkService_logConf_feature", "_UI_SparkService_type"),
				 PasysPackage.Literals.SPARK_SERVICE__LOG_CONF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Submit Deploy Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubmitDeployModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SparkService_submitDeployMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SparkService_submitDeployMode_feature", "_UI_SparkService_type"),
				 PasysPackage.Literals.SPARK_SERVICE__SUBMIT_DEPLOY_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Log Caller Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogCallerContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SparkService_logCallerContext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SparkService_logCallerContext_feature", "_UI_SparkService_type"),
				 PasysPackage.Literals.SPARK_SERVICE__LOG_CALLER_CONTEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Driver Superviser feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDriverSuperviserPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SparkService_driverSuperviser_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SparkService_driverSuperviser_feature", "_UI_SparkService_type"),
				 PasysPackage.Literals.SPARK_SERVICE__DRIVER_SUPERVISER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SparkService.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SparkService"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SparkService)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SparkService_type") :
			getString("_UI_SparkService_type") + " " + label;
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

		switch (notification.getFeatureID(SparkService.class)) {
			case PasysPackage.SPARK_SERVICE__DRIVER_CORES:
			case PasysPackage.SPARK_SERVICE__DRIVER_MAX_RESULT_SIZE:
			case PasysPackage.SPARK_SERVICE__DRIVER_MEMORY:
			case PasysPackage.SPARK_SERVICE__LOCAL_DIR:
			case PasysPackage.SPARK_SERVICE__WINDOW_SIZE:
			case PasysPackage.SPARK_SERVICE__EXECUTOR_MEMORY:
			case PasysPackage.SPARK_SERVICE__EXTRA_LISTENER:
			case PasysPackage.SPARK_SERVICE__LOG_CONF:
			case PasysPackage.SPARK_SERVICE__SUBMIT_DEPLOY_MODE:
			case PasysPackage.SPARK_SERVICE__LOG_CALLER_CONTEXT:
			case PasysPackage.SPARK_SERVICE__DRIVER_SUPERVISER:
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
