/**
 */
package es.unican.istr.pasys.impl;

import es.unican.istr.pasys.NodeResourceMeter;
import es.unican.istr.pasys.PasysPackage;
import es.unican.istr.pasys.ProcessingNode;
import es.unican.istr.pasys.ProcessingNodeMemory;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Node Memory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.impl.ProcessingNodeMemoryImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link es.unican.istr.pasys.impl.ProcessingNodeMemoryImpl#getMeter <em>Meter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessingNodeMemoryImpl extends MetricImpl implements ProcessingNodeMemory {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ProcessingNode target;

	/**
	 * The cached value of the '{@link #getMeter() <em>Meter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeter()
	 * @generated
	 * @ordered
	 */
	protected NodeResourceMeter meter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingNodeMemoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.PROCESSING_NODE_MEMORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ProcessingNode)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.PROCESSING_NODE_MEMORY__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(ProcessingNode newTarget) {
		ProcessingNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PROCESSING_NODE_MEMORY__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeResourceMeter getMeter() {
		if (meter != null && meter.eIsProxy()) {
			InternalEObject oldMeter = (InternalEObject)meter;
			meter = (NodeResourceMeter)eResolveProxy(oldMeter);
			if (meter != oldMeter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.PROCESSING_NODE_MEMORY__METER, oldMeter, meter));
			}
		}
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeResourceMeter basicGetMeter() {
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeter(NodeResourceMeter newMeter, NotificationChain msgs) {
		NodeResourceMeter oldMeter = meter;
		meter = newMeter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PasysPackage.PROCESSING_NODE_MEMORY__METER, oldMeter, newMeter);
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
	public void setMeter(NodeResourceMeter newMeter) {
		if (newMeter != meter) {
			NotificationChain msgs = null;
			if (meter != null)
				msgs = ((InternalEObject)meter).eInverseRemove(this, PasysPackage.NODE_RESOURCE_METER__MMETRIC, NodeResourceMeter.class, msgs);
			if (newMeter != null)
				msgs = ((InternalEObject)newMeter).eInverseAdd(this, PasysPackage.NODE_RESOURCE_METER__MMETRIC, NodeResourceMeter.class, msgs);
			msgs = basicSetMeter(newMeter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.PROCESSING_NODE_MEMORY__METER, newMeter, newMeter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.PROCESSING_NODE_MEMORY__METER:
				if (meter != null)
					msgs = ((InternalEObject)meter).eInverseRemove(this, PasysPackage.NODE_RESOURCE_METER__MMETRIC, NodeResourceMeter.class, msgs);
				return basicSetMeter((NodeResourceMeter)otherEnd, msgs);
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
			case PasysPackage.PROCESSING_NODE_MEMORY__METER:
				return basicSetMeter(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.PROCESSING_NODE_MEMORY__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case PasysPackage.PROCESSING_NODE_MEMORY__METER:
				if (resolve) return getMeter();
				return basicGetMeter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PasysPackage.PROCESSING_NODE_MEMORY__TARGET:
				setTarget((ProcessingNode)newValue);
				return;
			case PasysPackage.PROCESSING_NODE_MEMORY__METER:
				setMeter((NodeResourceMeter)newValue);
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
			case PasysPackage.PROCESSING_NODE_MEMORY__TARGET:
				setTarget((ProcessingNode)null);
				return;
			case PasysPackage.PROCESSING_NODE_MEMORY__METER:
				setMeter((NodeResourceMeter)null);
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
			case PasysPackage.PROCESSING_NODE_MEMORY__TARGET:
				return target != null;
			case PasysPackage.PROCESSING_NODE_MEMORY__METER:
				return meter != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessingNodeMemoryImpl
