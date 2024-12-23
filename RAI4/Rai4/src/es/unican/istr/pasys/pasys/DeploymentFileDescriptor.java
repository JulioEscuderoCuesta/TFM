/**
 */
package es.unican.istr.pasys.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment File Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.DeploymentFileDescriptor#getFileContent <em>File Content</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.DeploymentFileDescriptor#getElementType <em>Element Type</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.DeploymentFileDescriptor#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getDeploymentFileDescriptor()
 * @model
 * @generated
 */
public interface DeploymentFileDescriptor extends FileDescriptor {
	/**
	 * Returns the value of the '<em><b>File Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Content</em>' attribute.
	 * @see #setFileContent(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getDeploymentFileDescriptor_FileContent()
	 * @model required="true"
	 * @generated
	 */
	String getFileContent();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.DeploymentFileDescriptor#getFileContent <em>File Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Content</em>' attribute.
	 * @see #getFileContent()
	 * @generated
	 */
	void setFileContent(String value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unican.istr.pasys.pasys.DeployableComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' attribute.
	 * @see es.unican.istr.pasys.pasys.DeployableComponentType
	 * @see #setElementType(DeployableComponentType)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getDeploymentFileDescriptor_ElementType()
	 * @model
	 * @generated
	 */
	DeployableComponentType getElementType();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.DeploymentFileDescriptor#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' attribute.
	 * @see es.unican.istr.pasys.pasys.DeployableComponentType
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(DeployableComponentType value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(ProcessingNode)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getDeploymentFileDescriptor_Owner()
	 * @model
	 * @generated
	 */
	ProcessingNode getOwner();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.DeploymentFileDescriptor#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(ProcessingNode value);

	String createFileFromDescriptor(String directory) throws DeploymentException;

} // DeploymentFileDescriptor
