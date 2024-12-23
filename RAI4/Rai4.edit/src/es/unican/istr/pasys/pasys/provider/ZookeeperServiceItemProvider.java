/**
 */
package es.unican.istr.pasys.pasys.provider;


import es.unican.istr.pasys.pasys.PasysPackage;
import es.unican.istr.pasys.pasys.ZookeeperService;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link es.unican.istr.pasys.pasys.ZookeeperService} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ZookeeperServiceItemProvider extends DistributionServiceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZookeeperServiceItemProvider(AdapterFactory adapterFactory) {
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

			addServerIdPropertyDescriptor(object);
			addClientPortPropertyDescriptor(object);
			addTickTimePropertyDescriptor(object);
			addLeaderServersPropertyDescriptor(object);
			addPeerPortPropertyDescriptor(object);
			addLeaderPortPropertyDescriptor(object);
			addInitLimitPropertyDescriptor(object);
			addSyncLimitPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Server Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ZookeeperService_serverId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ZookeeperService_serverId_feature", "_UI_ZookeeperService_type"),
				 PasysPackage.Literals.ZOOKEEPER_SERVICE__SERVER_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClientPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ZookeeperService_clientPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ZookeeperService_clientPort_feature", "_UI_ZookeeperService_type"),
				 PasysPackage.Literals.ZOOKEEPER_SERVICE__CLIENT_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tick Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTickTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ZookeeperService_tickTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ZookeeperService_tickTime_feature", "_UI_ZookeeperService_type"),
				 PasysPackage.Literals.ZOOKEEPER_SERVICE__TICK_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Leader Servers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeaderServersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ZookeeperService_leaderServers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ZookeeperService_leaderServers_feature", "_UI_ZookeeperService_type"),
				 PasysPackage.Literals.ZOOKEEPER_SERVICE__LEADER_SERVERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Peer Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeerPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ZookeeperService_peerPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ZookeeperService_peerPort_feature", "_UI_ZookeeperService_type"),
				 PasysPackage.Literals.ZOOKEEPER_SERVICE__PEER_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Leader Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeaderPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ZookeeperService_leaderPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ZookeeperService_leaderPort_feature", "_UI_ZookeeperService_type"),
				 PasysPackage.Literals.ZOOKEEPER_SERVICE__LEADER_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Init Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ZookeeperService_initLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ZookeeperService_initLimit_feature", "_UI_ZookeeperService_type"),
				 PasysPackage.Literals.ZOOKEEPER_SERVICE__INIT_LIMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sync Limit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSyncLimitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ZookeeperService_syncLimit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ZookeeperService_syncLimit_feature", "_UI_ZookeeperService_type"),
				 PasysPackage.Literals.ZOOKEEPER_SERVICE__SYNC_LIMIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ZookeeperService.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ZookeeperService"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ZookeeperService)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ZookeeperService_type") :
			getString("_UI_ZookeeperService_type") + " " + label;
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

		switch (notification.getFeatureID(ZookeeperService.class)) {
			case PasysPackage.ZOOKEEPER_SERVICE__SERVER_ID:
			case PasysPackage.ZOOKEEPER_SERVICE__CLIENT_PORT:
			case PasysPackage.ZOOKEEPER_SERVICE__TICK_TIME:
			case PasysPackage.ZOOKEEPER_SERVICE__LEADER_SERVERS:
			case PasysPackage.ZOOKEEPER_SERVICE__PEER_PORT:
			case PasysPackage.ZOOKEEPER_SERVICE__LEADER_PORT:
			case PasysPackage.ZOOKEEPER_SERVICE__INIT_LIMIT:
			case PasysPackage.ZOOKEEPER_SERVICE__SYNC_LIMIT:
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
