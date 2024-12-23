/**
 */
package es.unican.istr.pasys.pasys.provider;


import es.unican.istr.pasys.pasys.KafkaService;
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
 * This is the item provider adapter for a {@link es.unican.istr.pasys.pasys.KafkaService} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KafkaServiceItemProvider extends CommunicationServiceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KafkaServiceItemProvider(AdapterFactory adapterFactory) {
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

			addCommIdPropertyDescriptor(object);
			addClientPortPropertyDescriptor(object);
			addZookeeperConnectPropertyDescriptor(object);
			addZookeeperConnectionTimeoutPropertyDescriptor(object);
			addListenersPropertyDescriptor(object);
			addAdvertisedListenersPropertyDescriptor(object);
			addAutoCreateTopicEnablePropertyDescriptor(object);
			addDeleteTopicEnablePropertyDescriptor(object);
			addNumPartitionsPropertyDescriptor(object);
			addNumRecoveryThreadsPerDataDirPropertyDescriptor(object);
			addLogFlushIntervalMessagesPropertyDescriptor(object);
			addLogFlushIntervalPropertyDescriptor(object);
			addNumNetworkThreadsPropertyDescriptor(object);
			addNumIOThreadsPropertyDescriptor(object);
			addSocketSendBufferBytesPropertyDescriptor(object);
			addSocketReceiveBufferBytesPropertyDescriptor(object);
			addSocketRequestMaxBytesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Comm Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KafkaService_commId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KafkaService_commId_feature", "_UI_KafkaService_type"),
				 PasysPackage.Literals.KAFKA_SERVICE__COMM_ID,
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
				 getString("_UI_KafkaService_clientPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KafkaService_clientPort_feature", "_UI_KafkaService_type"),
				 PasysPackage.Literals.KAFKA_SERVICE__CLIENT_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zookeeper Connect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZookeeperConnectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KafkaService_zookeeperConnect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KafkaService_zookeeperConnect_feature", "_UI_KafkaService_type"),
				 PasysPackage.Literals.KAFKA_SERVICE__ZOOKEEPER_CONNECT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zookeeper Connection Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZookeeperConnectionTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KafkaService_zookeeperConnectionTimeout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KafkaService_zookeeperConnectionTimeout_feature", "_UI_KafkaService_type"),
				 PasysPackage.Literals.KAFKA_SERVICE__ZOOKEEPER_CONNECTION_TIMEOUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Listeners feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addListenersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KafkaService_listeners_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KafkaService_listeners_feature", "_UI_KafkaService_type"),
				 PasysPackage.Literals.KAFKA_SERVICE__LISTENERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Advertised Listeners feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdvertisedListenersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KafkaService_advertisedListeners_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KafkaService_advertisedListeners_feature", "_UI_KafkaService_type"),
				 PasysPackage.Literals.KAFKA_SERVICE__ADVERTISED_LISTENERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto Create Topic Enable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoCreateTopicEnablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KafkaService_autoCreateTopicEnable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KafkaService_autoCreateTopicEnable_feature", "_UI_KafkaService_type"),
				 PasysPackage.Literals.KAFKA_SERVICE__AUTO_CREATE_TOPIC_ENABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delete Topic Enable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeleteTopicEnablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KafkaService_deleteTopicEnable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KafkaService_deleteTopicEnable_feature", "_UI_KafkaService_type"),
				 PasysPackage.Literals.KAFKA_SERVICE__DELETE_TOPIC_ENABLE,
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
				 getString("_UI_KafkaService_numPartitions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KafkaService_numPartitions_feature", "_UI_KafkaService_type"),
				 PasysPackage.Literals.KAFKA_SERVICE__NUM_PARTITIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Num Recovery Threads Per Data Dir feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumRecoveryThreadsPerDataDirPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KafkaService_numRecoveryThreadsPerDataDir_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KafkaService_numRecoveryThreadsPerDataDir_feature", "_UI_KafkaService_type"),
				 PasysPackage.Literals.KAFKA_SERVICE__NUM_RECOVERY_THREADS_PER_DATA_DIR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Log Flush Interval Messages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogFlushIntervalMessagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KafkaService_logFlushIntervalMessages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KafkaService_logFlushIntervalMessages_feature", "_UI_KafkaService_type"),
				 PasysPackage.Literals.KAFKA_SERVICE__LOG_FLUSH_INTERVAL_MESSAGES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Log Flush Interval feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogFlushIntervalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KafkaService_logFlushInterval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KafkaService_logFlushInterval_feature", "_UI_KafkaService_type"),
				 PasysPackage.Literals.KAFKA_SERVICE__LOG_FLUSH_INTERVAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Num Network Threads feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumNetworkThreadsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KafkaService_numNetworkThreads_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KafkaService_numNetworkThreads_feature", "_UI_KafkaService_type"),
				 PasysPackage.Literals.KAFKA_SERVICE__NUM_NETWORK_THREADS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Num IO Threads feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumIOThreadsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KafkaService_numIOThreads_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KafkaService_numIOThreads_feature", "_UI_KafkaService_type"),
				 PasysPackage.Literals.KAFKA_SERVICE__NUM_IO_THREADS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Socket Send Buffer Bytes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSocketSendBufferBytesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KafkaService_socketSendBufferBytes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KafkaService_socketSendBufferBytes_feature", "_UI_KafkaService_type"),
				 PasysPackage.Literals.KAFKA_SERVICE__SOCKET_SEND_BUFFER_BYTES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Socket Receive Buffer Bytes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSocketReceiveBufferBytesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KafkaService_socketReceiveBufferBytes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KafkaService_socketReceiveBufferBytes_feature", "_UI_KafkaService_type"),
				 PasysPackage.Literals.KAFKA_SERVICE__SOCKET_RECEIVE_BUFFER_BYTES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Socket Request Max Bytes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSocketRequestMaxBytesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KafkaService_socketRequestMaxBytes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KafkaService_socketRequestMaxBytes_feature", "_UI_KafkaService_type"),
				 PasysPackage.Literals.KAFKA_SERVICE__SOCKET_REQUEST_MAX_BYTES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns KafkaService.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/KafkaService"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((KafkaService)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_KafkaService_type") :
			getString("_UI_KafkaService_type") + " " + label;
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

		switch (notification.getFeatureID(KafkaService.class)) {
			case PasysPackage.KAFKA_SERVICE__COMM_ID:
			case PasysPackage.KAFKA_SERVICE__CLIENT_PORT:
			case PasysPackage.KAFKA_SERVICE__ZOOKEEPER_CONNECTION_TIMEOUT:
			case PasysPackage.KAFKA_SERVICE__LISTENERS:
			case PasysPackage.KAFKA_SERVICE__ADVERTISED_LISTENERS:
			case PasysPackage.KAFKA_SERVICE__AUTO_CREATE_TOPIC_ENABLE:
			case PasysPackage.KAFKA_SERVICE__DELETE_TOPIC_ENABLE:
			case PasysPackage.KAFKA_SERVICE__NUM_PARTITIONS:
			case PasysPackage.KAFKA_SERVICE__NUM_RECOVERY_THREADS_PER_DATA_DIR:
			case PasysPackage.KAFKA_SERVICE__LOG_FLUSH_INTERVAL_MESSAGES:
			case PasysPackage.KAFKA_SERVICE__LOG_FLUSH_INTERVAL:
			case PasysPackage.KAFKA_SERVICE__NUM_NETWORK_THREADS:
			case PasysPackage.KAFKA_SERVICE__NUM_IO_THREADS:
			case PasysPackage.KAFKA_SERVICE__SOCKET_SEND_BUFFER_BYTES:
			case PasysPackage.KAFKA_SERVICE__SOCKET_RECEIVE_BUFFER_BYTES:
			case PasysPackage.KAFKA_SERVICE__SOCKET_REQUEST_MAX_BYTES:
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
