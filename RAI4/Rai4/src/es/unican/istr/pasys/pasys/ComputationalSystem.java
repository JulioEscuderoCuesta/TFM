/**
 */
package es.unican.istr.pasys.pasys;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computational System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.ComputationalSystem#getName <em>Name</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.ComputationalSystem#getDate <em>Date</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.ComputationalSystem#getAuthors <em>Authors</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.ComputationalSystem#getTargetPlatformName <em>Target Platform Name</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.ComputationalSystem#getDoc <em>Doc</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.ComputationalSystem#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.ComputationalSystem#getAuthenticationFiles <em>Authentication Files</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getComputationalSystem()
 * @model
 * @generated
 */
public interface ComputationalSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getComputationalSystem_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.ComputationalSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getComputationalSystem_Date()
	 * @model required="true"
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.ComputationalSystem#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Authors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' attribute.
	 * @see #setAuthors(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getComputationalSystem_Authors()
	 * @model
	 * @generated
	 */
	String getAuthors();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.ComputationalSystem#getAuthors <em>Authors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authors</em>' attribute.
	 * @see #getAuthors()
	 * @generated
	 */
	void setAuthors(String value);

	/**
	 * Returns the value of the '<em><b>Target Platform Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Platform Name</em>' attribute.
	 * @see #setTargetPlatformName(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getComputationalSystem_TargetPlatformName()
	 * @model
	 * @generated
	 */
	String getTargetPlatformName();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.ComputationalSystem#getTargetPlatformName <em>Target Platform Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Platform Name</em>' attribute.
	 * @see #getTargetPlatformName()
	 * @generated
	 */
	void setTargetPlatformName(String value);

	/**
	 * Returns the value of the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' attribute.
	 * @see #setDoc(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getComputationalSystem_Doc()
	 * @model
	 * @generated
	 */
	String getDoc();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.ComputationalSystem#getDoc <em>Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc</em>' attribute.
	 * @see #getDoc()
	 * @generated
	 */
	void setDoc(String value);

	/**
	 * Returns the value of the '<em><b>Owned Elements</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.istr.pasys.pasys.SystemElement}.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.pasys.SystemElement#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Elements</em>' containment reference list.
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getComputationalSystem_OwnedElements()
	 * @see es.unican.istr.pasys.pasys.SystemElement#getOwner
	 * @model opposite="owner" containment="true" ordered="false"
	 * @generated
	 */
	EList<SystemElement> getOwnedElements();

	/**
	 * Returns the value of the '<em><b>Authentication Files</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Files</em>' map.
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getComputationalSystem_AuthenticationFiles()
	 * @model mapType="es.unican.istr.pasys.pasys.StringToStringMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getAuthenticationFiles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deployAndLaunch();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cleanDeployment();

} // ComputationalSystem
