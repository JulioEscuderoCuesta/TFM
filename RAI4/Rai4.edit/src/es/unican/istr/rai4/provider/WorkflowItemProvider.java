/**
 */
package es.unican.istr.rai4.provider;


import es.unican.istr.rai4.Rai4Factory;
import es.unican.istr.rai4.Rai4Package;
import es.unican.istr.rai4.Workflow;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link es.unican.istr.rai4.Workflow} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowItemProvider extends SystemElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowItemProvider(AdapterFactory adapterFactory) {
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

			addRootTaskPropertyDescriptor(object);
			addSchedulerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Root Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Workflow_rootTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Workflow_rootTask_feature", "_UI_Workflow_type"),
				 Rai4Package.Literals.WORKFLOW__ROOT_TASK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scheduler feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchedulerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Workflow_scheduler_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Workflow_scheduler_feature", "_UI_Workflow_type"),
				 Rai4Package.Literals.WORKFLOW__SCHEDULER,
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
			childrenFeatures.add(Rai4Package.Literals.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG);
			childrenFeatures.add(Rai4Package.Literals.WORKFLOW__OWNED_STREAM_DATA);
			childrenFeatures.add(Rai4Package.Literals.WORKFLOW__OWNED_TASKS);
			childrenFeatures.add(Rai4Package.Literals.WORKFLOW__OWNED_TASK_EXECUTORS);
			childrenFeatures.add(Rai4Package.Literals.WORKFLOW__OWNED_METERS);
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
	 * This returns Workflow.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Workflow"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Workflow)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Workflow_type") :
			getString("_UI_Workflow_type") + " " + label;
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

		switch (notification.getFeatureID(Workflow.class)) {
			case Rai4Package.WORKFLOW__DEPLOYMENT_CONFIG:
			case Rai4Package.WORKFLOW__OWNED_STREAM_DATA:
			case Rai4Package.WORKFLOW__OWNED_TASKS:
			case Rai4Package.WORKFLOW__OWNED_TASK_EXECUTORS:
			case Rai4Package.WORKFLOW__OWNED_METERS:
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
				(Rai4Package.Literals.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG,
				 Rai4Factory.eINSTANCE.createNodeDeploymentConf()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG,
				 Rai4Factory.eINSTANCE.createKubernetesDeploymentConf()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG,
				 Rai4Factory.eINSTANCE.createSwarmDeploymentConf()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG,
				 Rai4Factory.eINSTANCE.createNomadDeploymentConf()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.WORKFLOW__OWNED_STREAM_DATA,
				 Rai4Factory.eINSTANCE.createFlowStreamData()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.WORKFLOW__OWNED_STREAM_DATA,
				 Rai4Factory.eINSTANCE.createKafkaFlowStreamData()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.WORKFLOW__OWNED_STREAM_DATA,
				 Rai4Factory.eINSTANCE.createDerivedStreamData()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.WORKFLOW__OWNED_TASKS,
				 Rai4Factory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.WORKFLOW__OWNED_TASK_EXECUTORS,
				 Rai4Factory.eINSTANCE.createTaskExecutor()));

		newChildDescriptors.add
			(createChildParameter
				(Rai4Package.Literals.WORKFLOW__OWNED_METERS,
				 Rai4Factory.eINSTANCE.createWorkflowLatencyMeter()));
	}

}
