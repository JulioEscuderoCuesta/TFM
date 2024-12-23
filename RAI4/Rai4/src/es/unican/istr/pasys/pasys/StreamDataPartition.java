/**
 */
package es.unican.istr.pasys.pasys;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream Data Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.StreamDataPartition#getKey <em>Key</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.StreamDataPartition#getHost <em>Host</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getStreamDataPartition()
 * @model
 * @generated
 */
public interface StreamDataPartition extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStreamDataPartition_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StreamDataPartition#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' reference.
	 * @see #setHost(ProcessingNode)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStreamDataPartition_Host()
	 * @model required="true"
	 * @generated
	 */
	ProcessingNode getHost();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StreamDataPartition#getHost <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(ProcessingNode value);

} // StreamDataPartition
