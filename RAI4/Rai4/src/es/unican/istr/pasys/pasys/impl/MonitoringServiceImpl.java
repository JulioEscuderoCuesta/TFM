/**
 */
package es.unican.istr.pasys.pasys.impl;

import es.unican.istr.pasys.pasys.Meter;
import es.unican.istr.pasys.pasys.MonitoringService;
import es.unican.istr.pasys.pasys.PasysPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitoring Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.impl.MonitoringServiceImpl#getMonitorizedMeters <em>Monitorized Meters</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MonitoringServiceImpl extends PlatformServiceImpl implements MonitoringService {
	/**
	 * The cached value of the '{@link #getMonitorizedMeters() <em>Monitorized Meters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorizedMeters()
	 * @generated
	 * @ordered
	 */
	protected EList<Meter> monitorizedMeters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitoringServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.MONITORING_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Meter> getMonitorizedMeters() {
		if (monitorizedMeters == null) {
			monitorizedMeters = new EObjectWithInverseResolvingEList<Meter>(Meter.class, this, PasysPackage.MONITORING_SERVICE__MONITORIZED_METERS, PasysPackage.METER__MONITORING_SERVER);
		}
		return monitorizedMeters;
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
			case PasysPackage.MONITORING_SERVICE__MONITORIZED_METERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMonitorizedMeters()).basicAdd(otherEnd, msgs);
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
			case PasysPackage.MONITORING_SERVICE__MONITORIZED_METERS:
				return ((InternalEList<?>)getMonitorizedMeters()).basicRemove(otherEnd, msgs);
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
			case PasysPackage.MONITORING_SERVICE__MONITORIZED_METERS:
				return getMonitorizedMeters();
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
			case PasysPackage.MONITORING_SERVICE__MONITORIZED_METERS:
				getMonitorizedMeters().clear();
				getMonitorizedMeters().addAll((Collection<? extends Meter>)newValue);
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
			case PasysPackage.MONITORING_SERVICE__MONITORIZED_METERS:
				getMonitorizedMeters().clear();
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
			case PasysPackage.MONITORING_SERVICE__MONITORIZED_METERS:
				return monitorizedMeters != null && !monitorizedMeters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MonitoringServiceImpl
