/**
 */
package es.unican.istr.pasys.impl;

import es.unican.istr.pasys.ExporterData;
import es.unican.istr.pasys.PasysPackage;
import es.unican.istr.pasys.PrometheusService;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prometheus Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.impl.PrometheusServiceImpl#getExportersData <em>Exporters Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrometheusServiceImpl extends MonitoringServiceImpl implements PrometheusService {
	/**
	 * The cached value of the '{@link #getExportersData() <em>Exporters Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportersData()
	 * @generated
	 * @ordered
	 */
	protected EList<ExporterData> exportersData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrometheusServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.PROMETHEUS_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExporterData> getExportersData() {
		if (exportersData == null) {
			exportersData = new EObjectContainmentEList<ExporterData>(ExporterData.class, this, PasysPackage.PROMETHEUS_SERVICE__EXPORTERS_DATA);
		}
		return exportersData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PasysPackage.PROMETHEUS_SERVICE__EXPORTERS_DATA:
				return ((InternalEList<?>)getExportersData()).basicRemove(otherEnd, msgs);
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
			case PasysPackage.PROMETHEUS_SERVICE__EXPORTERS_DATA:
				return getExportersData();
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
			case PasysPackage.PROMETHEUS_SERVICE__EXPORTERS_DATA:
				getExportersData().clear();
				getExportersData().addAll((Collection<? extends ExporterData>)newValue);
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
			case PasysPackage.PROMETHEUS_SERVICE__EXPORTERS_DATA:
				getExportersData().clear();
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
			case PasysPackage.PROMETHEUS_SERVICE__EXPORTERS_DATA:
				return exportersData != null && !exportersData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PrometheusServiceImpl
