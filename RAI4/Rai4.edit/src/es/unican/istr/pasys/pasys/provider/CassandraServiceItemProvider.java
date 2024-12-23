/**
 */
package es.unican.istr.pasys.pasys.provider;


import es.unican.istr.pasys.pasys.CassandraService;
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
 * This is the item provider adapter for a {@link es.unican.istr.pasys.pasys.CassandraService} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CassandraServiceItemProvider extends PersistenceServiceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CassandraServiceItemProvider(AdapterFactory adapterFactory) {
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

			addNumTokensPropertyDescriptor(object);
			addSeedsPropertyDescriptor(object);
			addSeedProviderClassPropertyDescriptor(object);
			addEndpointSnitchPropertyDescriptor(object);
			addDataFileDirPropertyDescriptor(object);
			addStoragePortPropertyDescriptor(object);
			addAutoBootstrapPropertyDescriptor(object);
			addSslStoragePortPropertyDescriptor(object);
			addRpcPortPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Num Tokens feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumTokensPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CassandraService_numTokens_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CassandraService_numTokens_feature", "_UI_CassandraService_type"),
				 PasysPackage.Literals.CASSANDRA_SERVICE__NUM_TOKENS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Seeds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeedsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CassandraService_seeds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CassandraService_seeds_feature", "_UI_CassandraService_type"),
				 PasysPackage.Literals.CASSANDRA_SERVICE__SEEDS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Seed Provider Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeedProviderClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CassandraService_seedProviderClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CassandraService_seedProviderClass_feature", "_UI_CassandraService_type"),
				 PasysPackage.Literals.CASSANDRA_SERVICE__SEED_PROVIDER_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Endpoint Snitch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndpointSnitchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CassandraService_endpointSnitch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CassandraService_endpointSnitch_feature", "_UI_CassandraService_type"),
				 PasysPackage.Literals.CASSANDRA_SERVICE__ENDPOINT_SNITCH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data File Dir feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataFileDirPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CassandraService_dataFileDir_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CassandraService_dataFileDir_feature", "_UI_CassandraService_type"),
				 PasysPackage.Literals.CASSANDRA_SERVICE__DATA_FILE_DIR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Storage Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStoragePortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CassandraService_storagePort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CassandraService_storagePort_feature", "_UI_CassandraService_type"),
				 PasysPackage.Literals.CASSANDRA_SERVICE__STORAGE_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto Bootstrap feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoBootstrapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CassandraService_autoBootstrap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CassandraService_autoBootstrap_feature", "_UI_CassandraService_type"),
				 PasysPackage.Literals.CASSANDRA_SERVICE__AUTO_BOOTSTRAP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ssl Storage Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSslStoragePortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CassandraService_sslStoragePort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CassandraService_sslStoragePort_feature", "_UI_CassandraService_type"),
				 PasysPackage.Literals.CASSANDRA_SERVICE__SSL_STORAGE_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rpc Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRpcPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CassandraService_rpcPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CassandraService_rpcPort_feature", "_UI_CassandraService_type"),
				 PasysPackage.Literals.CASSANDRA_SERVICE__RPC_PORT,
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
			childrenFeatures.add(PasysPackage.Literals.CASSANDRA_SERVICE__CQL_SCHEMAS);
			childrenFeatures.add(PasysPackage.Literals.CASSANDRA_SERVICE__DATA_CENTERS);
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
	 * This returns CassandraService.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CassandraService"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CassandraService)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CassandraService_type") :
			getString("_UI_CassandraService_type") + " " + label;
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

		switch (notification.getFeatureID(CassandraService.class)) {
			case PasysPackage.CASSANDRA_SERVICE__NUM_TOKENS:
			case PasysPackage.CASSANDRA_SERVICE__SEED_PROVIDER_CLASS:
			case PasysPackage.CASSANDRA_SERVICE__ENDPOINT_SNITCH:
			case PasysPackage.CASSANDRA_SERVICE__DATA_FILE_DIR:
			case PasysPackage.CASSANDRA_SERVICE__STORAGE_PORT:
			case PasysPackage.CASSANDRA_SERVICE__AUTO_BOOTSTRAP:
			case PasysPackage.CASSANDRA_SERVICE__SSL_STORAGE_PORT:
			case PasysPackage.CASSANDRA_SERVICE__RPC_PORT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PasysPackage.CASSANDRA_SERVICE__CQL_SCHEMAS:
			case PasysPackage.CASSANDRA_SERVICE__DATA_CENTERS:
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
				(PasysPackage.Literals.CASSANDRA_SERVICE__CQL_SCHEMAS,
				 PasysFactory.eINSTANCE.createFileDescriptor()));

		newChildDescriptors.add
			(createChildParameter
				(PasysPackage.Literals.CASSANDRA_SERVICE__CQL_SCHEMAS,
				 PasysFactory.eINSTANCE.createDeploymentFileDescriptor()));

		newChildDescriptors.add
			(createChildParameter
				(PasysPackage.Literals.CASSANDRA_SERVICE__CQL_SCHEMAS,
				 PasysFactory.eINSTANCE.createArtifactDescriptor()));

		newChildDescriptors.add
			(createChildParameter
				(PasysPackage.Literals.CASSANDRA_SERVICE__DATA_CENTERS,
				 PasysFactory.eINSTANCE.createDataCenter()));
	}

}
