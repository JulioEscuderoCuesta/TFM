/**
 */
package es.unican.istr.rai4.impl;

import es.unican.istr.rai4.ComputationalSystem;
import es.unican.istr.rai4.Rai4Package;
import es.unican.istr.rai4.SystemElement;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computational System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.rai4.impl.ComputationalSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.unican.istr.rai4.impl.ComputationalSystemImpl#getDate <em>Date</em>}</li>
 *   <li>{@link es.unican.istr.rai4.impl.ComputationalSystemImpl#getAuthors <em>Authors</em>}</li>
 *   <li>{@link es.unican.istr.rai4.impl.ComputationalSystemImpl#getTargetPlatformName <em>Target Platform Name</em>}</li>
 *   <li>{@link es.unican.istr.rai4.impl.ComputationalSystemImpl#getDoc <em>Doc</em>}</li>
 *   <li>{@link es.unican.istr.rai4.impl.ComputationalSystemImpl#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link es.unican.istr.rai4.impl.ComputationalSystemImpl#getAuthenticationFiles <em>Authentication Files</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputationalSystemImpl extends MinimalEObjectImpl.Container implements ComputationalSystem {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthors() <em>Authors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthors() <em>Authors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected String authors = AUTHORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetPlatformName() <em>Target Platform Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPlatformName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_PLATFORM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetPlatformName() <em>Target Platform Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPlatformName()
	 * @generated
	 * @ordered
	 */
	protected String targetPlatformName = TARGET_PLATFORM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoc() <em>Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoc()
	 * @generated
	 * @ordered
	 */
	protected static final String DOC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoc() <em>Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoc()
	 * @generated
	 * @ordered
	 */
	protected String doc = DOC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedElements() <em>Owned Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemElement> ownedElements;

	/**
	 * The cached value of the '{@link #getAuthenticationFiles() <em>Authentication Files</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationFiles()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> authenticationFiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputationalSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Rai4Package.Literals.COMPUTATIONAL_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rai4Package.COMPUTATIONAL_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rai4Package.COMPUTATIONAL_SYSTEM__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthors() {
		return authors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthors(String newAuthors) {
		String oldAuthors = authors;
		authors = newAuthors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rai4Package.COMPUTATIONAL_SYSTEM__AUTHORS, oldAuthors, authors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetPlatformName() {
		return targetPlatformName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetPlatformName(String newTargetPlatformName) {
		String oldTargetPlatformName = targetPlatformName;
		targetPlatformName = newTargetPlatformName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rai4Package.COMPUTATIONAL_SYSTEM__TARGET_PLATFORM_NAME, oldTargetPlatformName, targetPlatformName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDoc() {
		return doc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoc(String newDoc) {
		String oldDoc = doc;
		doc = newDoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rai4Package.COMPUTATIONAL_SYSTEM__DOC, oldDoc, doc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemElement> getOwnedElements() {
		if (ownedElements == null) {
			ownedElements = new EObjectContainmentWithInverseEList<SystemElement>(SystemElement.class, this, Rai4Package.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS, Rai4Package.SYSTEM_ELEMENT__OWNER);
		}
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getAuthenticationFiles() {
		if (authenticationFiles == null) {
			authenticationFiles = new EcoreEMap<String,String>(Rai4Package.Literals.STRING_TO_STRING_MAP, StringToStringMapImpl.class, this, Rai4Package.COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES);
		}
		return authenticationFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void deployAndLaunch() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void cleanDeployment() {
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
			case Rai4Package.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedElements()).basicAdd(otherEnd, msgs);
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
			case Rai4Package.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS:
				return ((InternalEList<?>)getOwnedElements()).basicRemove(otherEnd, msgs);
			case Rai4Package.COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES:
				return ((InternalEList<?>)getAuthenticationFiles()).basicRemove(otherEnd, msgs);
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
			case Rai4Package.COMPUTATIONAL_SYSTEM__NAME:
				return getName();
			case Rai4Package.COMPUTATIONAL_SYSTEM__DATE:
				return getDate();
			case Rai4Package.COMPUTATIONAL_SYSTEM__AUTHORS:
				return getAuthors();
			case Rai4Package.COMPUTATIONAL_SYSTEM__TARGET_PLATFORM_NAME:
				return getTargetPlatformName();
			case Rai4Package.COMPUTATIONAL_SYSTEM__DOC:
				return getDoc();
			case Rai4Package.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS:
				return getOwnedElements();
			case Rai4Package.COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES:
				if (coreType) return getAuthenticationFiles();
				else return getAuthenticationFiles().map();
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
			case Rai4Package.COMPUTATIONAL_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case Rai4Package.COMPUTATIONAL_SYSTEM__DATE:
				setDate((String)newValue);
				return;
			case Rai4Package.COMPUTATIONAL_SYSTEM__AUTHORS:
				setAuthors((String)newValue);
				return;
			case Rai4Package.COMPUTATIONAL_SYSTEM__TARGET_PLATFORM_NAME:
				setTargetPlatformName((String)newValue);
				return;
			case Rai4Package.COMPUTATIONAL_SYSTEM__DOC:
				setDoc((String)newValue);
				return;
			case Rai4Package.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS:
				getOwnedElements().clear();
				getOwnedElements().addAll((Collection<? extends SystemElement>)newValue);
				return;
			case Rai4Package.COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES:
				((EStructuralFeature.Setting)getAuthenticationFiles()).set(newValue);
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
			case Rai4Package.COMPUTATIONAL_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Rai4Package.COMPUTATIONAL_SYSTEM__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case Rai4Package.COMPUTATIONAL_SYSTEM__AUTHORS:
				setAuthors(AUTHORS_EDEFAULT);
				return;
			case Rai4Package.COMPUTATIONAL_SYSTEM__TARGET_PLATFORM_NAME:
				setTargetPlatformName(TARGET_PLATFORM_NAME_EDEFAULT);
				return;
			case Rai4Package.COMPUTATIONAL_SYSTEM__DOC:
				setDoc(DOC_EDEFAULT);
				return;
			case Rai4Package.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS:
				getOwnedElements().clear();
				return;
			case Rai4Package.COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES:
				getAuthenticationFiles().clear();
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
			case Rai4Package.COMPUTATIONAL_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Rai4Package.COMPUTATIONAL_SYSTEM__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case Rai4Package.COMPUTATIONAL_SYSTEM__AUTHORS:
				return AUTHORS_EDEFAULT == null ? authors != null : !AUTHORS_EDEFAULT.equals(authors);
			case Rai4Package.COMPUTATIONAL_SYSTEM__TARGET_PLATFORM_NAME:
				return TARGET_PLATFORM_NAME_EDEFAULT == null ? targetPlatformName != null : !TARGET_PLATFORM_NAME_EDEFAULT.equals(targetPlatformName);
			case Rai4Package.COMPUTATIONAL_SYSTEM__DOC:
				return DOC_EDEFAULT == null ? doc != null : !DOC_EDEFAULT.equals(doc);
			case Rai4Package.COMPUTATIONAL_SYSTEM__OWNED_ELEMENTS:
				return ownedElements != null && !ownedElements.isEmpty();
			case Rai4Package.COMPUTATIONAL_SYSTEM__AUTHENTICATION_FILES:
				return authenticationFiles != null && !authenticationFiles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Rai4Package.COMPUTATIONAL_SYSTEM___DEPLOY_AND_LAUNCH:
				deployAndLaunch();
				return null;
			case Rai4Package.COMPUTATIONAL_SYSTEM___CLEAN_DEPLOYMENT:
				cleanDeployment();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", date: ");
		result.append(date);
		result.append(", authors: ");
		result.append(authors);
		result.append(", targetPlatformName: ");
		result.append(targetPlatformName);
		result.append(", doc: ");
		result.append(doc);
		result.append(')');
		return result.toString();
	}

} //ComputationalSystemImpl
