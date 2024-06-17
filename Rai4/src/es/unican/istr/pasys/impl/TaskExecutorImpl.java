/**
 */
package es.unican.istr.pasys.impl;

import es.unican.istr.pasys.ConfigurationException;
import es.unican.istr.pasys.DeployableComponent;
import es.unican.istr.pasys.DeploymentConfiguration;
import es.unican.istr.pasys.PasysPackage;
import es.unican.istr.pasys.Task;
import es.unican.istr.pasys.TaskExecutor;
import es.unican.istr.pasys.TaskProcessingAmountMeter;
import es.unican.istr.pasys.Workflow;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Executor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.impl.TaskExecutorImpl#getDeploymentConfig <em>Deployment Config</em>}</li>
 *   <li>{@link es.unican.istr.pasys.impl.TaskExecutorImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link es.unican.istr.pasys.impl.TaskExecutorImpl#getExecutedTasks <em>Executed Tasks</em>}</li>
 *   <li>{@link es.unican.istr.pasys.impl.TaskExecutorImpl#getOwnedMeters <em>Owned Meters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskExecutorImpl extends NamedElementImpl implements TaskExecutor {
	/**
	 * The cached value of the '{@link #getDeploymentConfig() <em>Deployment Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentConfig()
	 * @generated
	 * @ordered
	 */
	protected DeploymentConfiguration deploymentConfig;

	/**
	 * The cached value of the '{@link #getExecutedTasks() <em>Executed Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> executedTasks;

	/**
	 * The cached value of the '{@link #getOwnedMeters() <em>Owned Meters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMeters()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskProcessingAmountMeter> ownedMeters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskExecutorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.TASK_EXECUTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentConfiguration getDeploymentConfig() {
		return deploymentConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeploymentConfig(DeploymentConfiguration newDeploymentConfig, NotificationChain msgs) {
		DeploymentConfiguration oldDeploymentConfig = deploymentConfig;
		deploymentConfig = newDeploymentConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PasysPackage.TASK_EXECUTOR__DEPLOYMENT_CONFIG, oldDeploymentConfig, newDeploymentConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeploymentConfig(DeploymentConfiguration newDeploymentConfig) {
		if (newDeploymentConfig != deploymentConfig) {
			NotificationChain msgs = null;
			if (deploymentConfig != null)
				msgs = ((InternalEObject)deploymentConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PasysPackage.TASK_EXECUTOR__DEPLOYMENT_CONFIG, null, msgs);
			if (newDeploymentConfig != null)
				msgs = ((InternalEObject)newDeploymentConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PasysPackage.TASK_EXECUTOR__DEPLOYMENT_CONFIG, null, msgs);
			msgs = basicSetDeploymentConfig(newDeploymentConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.TASK_EXECUTOR__DEPLOYMENT_CONFIG, newDeploymentConfig, newDeploymentConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workflow getOwner() {
		if (eContainerFeatureID() != PasysPackage.TASK_EXECUTOR__OWNER) return null;
		return (Workflow)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Workflow newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, PasysPackage.TASK_EXECUTOR__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(Workflow newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != PasysPackage.TASK_EXECUTOR__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, PasysPackage.WORKFLOW__OWNED_TASK_EXECUTORS, Workflow.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.TASK_EXECUTOR__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Task> getExecutedTasks() {
		if (executedTasks == null) {
			executedTasks = new EObjectResolvingEList<Task>(Task.class, this, PasysPackage.TASK_EXECUTOR__EXECUTED_TASKS);
		}
		return executedTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskProcessingAmountMeter> getOwnedMeters() {
		if (ownedMeters == null) {
			ownedMeters = new EObjectContainmentWithInverseEList<TaskProcessingAmountMeter>(TaskProcessingAmountMeter.class, this, PasysPackage.TASK_EXECUTOR__OWNED_METERS, PasysPackage.TASK_PROCESSING_AMOUNT_METER__OWNER);
		}
		return ownedMeters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void configureDeployment() throws ConfigurationException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.TASK_EXECUTOR__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((Workflow)otherEnd, msgs);
			case PasysPackage.TASK_EXECUTOR__OWNED_METERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMeters()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.TASK_EXECUTOR__DEPLOYMENT_CONFIG:
				return basicSetDeploymentConfig(null, msgs);
			case PasysPackage.TASK_EXECUTOR__OWNER:
				return basicSetOwner(null, msgs);
			case PasysPackage.TASK_EXECUTOR__OWNED_METERS:
				return ((InternalEList<?>)getOwnedMeters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PasysPackage.TASK_EXECUTOR__OWNER:
				return eInternalContainer().eInverseRemove(this, PasysPackage.WORKFLOW__OWNED_TASK_EXECUTORS, Workflow.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.TASK_EXECUTOR__DEPLOYMENT_CONFIG:
				return getDeploymentConfig();
			case PasysPackage.TASK_EXECUTOR__OWNER:
				return getOwner();
			case PasysPackage.TASK_EXECUTOR__EXECUTED_TASKS:
				return getExecutedTasks();
			case PasysPackage.TASK_EXECUTOR__OWNED_METERS:
				return getOwnedMeters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PasysPackage.TASK_EXECUTOR__DEPLOYMENT_CONFIG:
				setDeploymentConfig((DeploymentConfiguration)newValue);
				return;
			case PasysPackage.TASK_EXECUTOR__OWNER:
				setOwner((Workflow)newValue);
				return;
			case PasysPackage.TASK_EXECUTOR__EXECUTED_TASKS:
				getExecutedTasks().clear();
				getExecutedTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case PasysPackage.TASK_EXECUTOR__OWNED_METERS:
				getOwnedMeters().clear();
				getOwnedMeters().addAll((Collection<? extends TaskProcessingAmountMeter>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PasysPackage.TASK_EXECUTOR__DEPLOYMENT_CONFIG:
				setDeploymentConfig((DeploymentConfiguration)null);
				return;
			case PasysPackage.TASK_EXECUTOR__OWNER:
				setOwner((Workflow)null);
				return;
			case PasysPackage.TASK_EXECUTOR__EXECUTED_TASKS:
				getExecutedTasks().clear();
				return;
			case PasysPackage.TASK_EXECUTOR__OWNED_METERS:
				getOwnedMeters().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PasysPackage.TASK_EXECUTOR__DEPLOYMENT_CONFIG:
				return deploymentConfig != null;
			case PasysPackage.TASK_EXECUTOR__OWNER:
				return getOwner() != null;
			case PasysPackage.TASK_EXECUTOR__EXECUTED_TASKS:
				return executedTasks != null && !executedTasks.isEmpty();
			case PasysPackage.TASK_EXECUTOR__OWNED_METERS:
				return ownedMeters != null && !ownedMeters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DeployableComponent.class) {
			switch (derivedFeatureID) {
				case PasysPackage.TASK_EXECUTOR__DEPLOYMENT_CONFIG: return PasysPackage.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DeployableComponent.class) {
			switch (baseFeatureID) {
				case PasysPackage.DEPLOYABLE_COMPONENT__DEPLOYMENT_CONFIG: return PasysPackage.TASK_EXECUTOR__DEPLOYMENT_CONFIG;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == DeployableComponent.class) {
			switch (baseOperationID) {
				case PasysPackage.DEPLOYABLE_COMPONENT___CONFIGURE_DEPLOYMENT: return PasysPackage.TASK_EXECUTOR___CONFIGURE_DEPLOYMENT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PasysPackage.TASK_EXECUTOR___CONFIGURE_DEPLOYMENT:
				try {
					configureDeployment();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} //TaskExecutorImpl
