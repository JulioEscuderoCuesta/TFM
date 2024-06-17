/**
 */
package es.unican.istr.pasys.impl;

import es.unican.istr.pasys.PasysPackage;
import es.unican.istr.pasys.VirtualProcessingNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Processing Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.impl.VirtualProcessingNodeImpl#getExternalIP <em>External IP</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VirtualProcessingNodeImpl extends ProcessingNodeImpl implements VirtualProcessingNode {
	/**
	 * The default value of the '{@link #getExternalIP() <em>External IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalIP()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalIP() <em>External IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalIP()
	 * @generated
	 * @ordered
	 */
	protected String externalIP = EXTERNAL_IP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualProcessingNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.VIRTUAL_PROCESSING_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalIP() {
		return externalIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalIP(String newExternalIP) {
		String oldExternalIP = externalIP;
		externalIP = newExternalIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.VIRTUAL_PROCESSING_NODE__EXTERNAL_IP, oldExternalIP, externalIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.VIRTUAL_PROCESSING_NODE__EXTERNAL_IP:
				return getExternalIP();
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
			case PasysPackage.VIRTUAL_PROCESSING_NODE__EXTERNAL_IP:
				setExternalIP((String)newValue);
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
			case PasysPackage.VIRTUAL_PROCESSING_NODE__EXTERNAL_IP:
				setExternalIP(EXTERNAL_IP_EDEFAULT);
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
			case PasysPackage.VIRTUAL_PROCESSING_NODE__EXTERNAL_IP:
				return EXTERNAL_IP_EDEFAULT == null ? externalIP != null : !EXTERNAL_IP_EDEFAULT.equals(externalIP);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (externalIP: ");
		result.append(externalIP);
		result.append(')');
		return result.toString();
	}

} //VirtualProcessingNodeImpl
