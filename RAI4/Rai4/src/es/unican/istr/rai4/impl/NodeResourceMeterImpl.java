/**
 */
package es.unican.istr.rai4.impl;

import es.unican.istr.rai4.NodeResourceMeter;
import es.unican.istr.rai4.ProcessingNodeMemory;
import es.unican.istr.rai4.ProcessingNodeUtilization;
import es.unican.istr.rai4.Rai4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Resource Meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.rai4.impl.NodeResourceMeterImpl#getUMetric <em>UMetric</em>}</li>
 *   <li>{@link es.unican.istr.rai4.impl.NodeResourceMeterImpl#getMMetric <em>MMetric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeResourceMeterImpl extends NodeHostedMeterImpl implements NodeResourceMeter {
	/**
	 * The cached value of the '{@link #getUMetric() <em>UMetric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMetric()
	 * @generated
	 * @ordered
	 */
	protected ProcessingNodeUtilization uMetric;

	/**
	 * The cached value of the '{@link #getMMetric() <em>MMetric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMetric()
	 * @generated
	 * @ordered
	 */
	protected ProcessingNodeMemory mMetric;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeResourceMeterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Rai4Package.Literals.NODE_RESOURCE_METER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingNodeUtilization getUMetric() {
		if (uMetric != null && uMetric.eIsProxy()) {
			InternalEObject oldUMetric = (InternalEObject)uMetric;
			uMetric = (ProcessingNodeUtilization)eResolveProxy(oldUMetric);
			if (uMetric != oldUMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Rai4Package.NODE_RESOURCE_METER__UMETRIC, oldUMetric, uMetric));
			}
		}
		return uMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingNodeUtilization basicGetUMetric() {
		return uMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUMetric(ProcessingNodeUtilization newUMetric) {
		ProcessingNodeUtilization oldUMetric = uMetric;
		uMetric = newUMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rai4Package.NODE_RESOURCE_METER__UMETRIC, oldUMetric, uMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingNodeMemory getMMetric() {
		if (mMetric != null && mMetric.eIsProxy()) {
			InternalEObject oldMMetric = (InternalEObject)mMetric;
			mMetric = (ProcessingNodeMemory)eResolveProxy(oldMMetric);
			if (mMetric != oldMMetric) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Rai4Package.NODE_RESOURCE_METER__MMETRIC, oldMMetric, mMetric));
			}
		}
		return mMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingNodeMemory basicGetMMetric() {
		return mMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMMetric(ProcessingNodeMemory newMMetric) {
		ProcessingNodeMemory oldMMetric = mMetric;
		mMetric = newMMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rai4Package.NODE_RESOURCE_METER__MMETRIC, oldMMetric, mMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Rai4Package.NODE_RESOURCE_METER__UMETRIC:
				if (resolve) return getUMetric();
				return basicGetUMetric();
			case Rai4Package.NODE_RESOURCE_METER__MMETRIC:
				if (resolve) return getMMetric();
				return basicGetMMetric();
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
			case Rai4Package.NODE_RESOURCE_METER__UMETRIC:
				setUMetric((ProcessingNodeUtilization)newValue);
				return;
			case Rai4Package.NODE_RESOURCE_METER__MMETRIC:
				setMMetric((ProcessingNodeMemory)newValue);
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
			case Rai4Package.NODE_RESOURCE_METER__UMETRIC:
				setUMetric((ProcessingNodeUtilization)null);
				return;
			case Rai4Package.NODE_RESOURCE_METER__MMETRIC:
				setMMetric((ProcessingNodeMemory)null);
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
			case Rai4Package.NODE_RESOURCE_METER__UMETRIC:
				return uMetric != null;
			case Rai4Package.NODE_RESOURCE_METER__MMETRIC:
				return mMetric != null;
		}
		return super.eIsSet(featureID);
	}

} //NodeResourceMeterImpl
