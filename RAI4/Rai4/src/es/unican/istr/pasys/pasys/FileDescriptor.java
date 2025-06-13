/**
 */
package es.unican.istr.pasys.pasys;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.FileDescriptor#getFilePath <em>File Path</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.FileDescriptor#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getFileDescriptor()
 * @model abstract="true"
 * @generated
 */
public interface FileDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path</em>' attribute.
	 * @see #setFilePath(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getFileDescriptor_FilePath()
	 * @model required="true"
	 * @generated
	 */
	String getFilePath();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.FileDescriptor#getFilePath <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path</em>' attribute.
	 * @see #getFilePath()
	 * @generated
	 */
	void setFilePath(String value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getFileDescriptor_FileName()
	 * @model required="true"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.FileDescriptor#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

} // FileDescriptor
