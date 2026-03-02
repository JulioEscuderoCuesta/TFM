/**
 */
package es.unican.istr.rai4;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.rai4.Volume#getSource <em>Source</em>}</li>
 *   <li>{@link es.unican.istr.rai4.Volume#getTarget <em>Target</em>}</li>
 *   <li>{@link es.unican.istr.rai4.Volume#getType <em>Type</em>}</li>
 *   <li>{@link es.unican.istr.rai4.Volume#getAccessMode <em>Access Mode</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.rai4.Rai4Package#getVolume()
 * @model
 * @generated
 */
public interface Volume extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see es.unican.istr.rai4.Rai4Package#getVolume_Source()
	 * @model required="true"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.Volume#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see es.unican.istr.rai4.Rai4Package#getVolume_Target()
	 * @model required="true"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.Volume#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unican.istr.rai4.VolumeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.unican.istr.rai4.VolumeType
	 * @see #setType(VolumeType)
	 * @see es.unican.istr.rai4.Rai4Package#getVolume_Type()
	 * @model
	 * @generated
	 */
	VolumeType getType();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.Volume#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.unican.istr.rai4.VolumeType
	 * @see #getType()
	 * @generated
	 */
	void setType(VolumeType value);

	/**
	 * Returns the value of the '<em><b>Access Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unican.istr.rai4.VolumeAccessMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Mode</em>' attribute.
	 * @see es.unican.istr.rai4.VolumeAccessMode
	 * @see #setAccessMode(VolumeAccessMode)
	 * @see es.unican.istr.rai4.Rai4Package#getVolume_AccessMode()
	 * @model
	 * @generated
	 */
	VolumeAccessMode getAccessMode();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.Volume#getAccessMode <em>Access Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Mode</em>' attribute.
	 * @see es.unican.istr.rai4.VolumeAccessMode
	 * @see #getAccessMode()
	 * @generated
	 */
	void setAccessMode(VolumeAccessMode value);

} // Volume
