/**
 */
package es.unican.istr.rai4;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.rai4.ArtifactDescriptor#getLocalPath <em>Local Path</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.rai4.Rai4Package#getArtifactDescriptor()
 * @model
 * @generated
 */
public interface ArtifactDescriptor extends FileDescriptor {
	/**
	 * Returns the value of the '<em><b>Local Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Path</em>' attribute.
	 * @see #setLocalPath(String)
	 * @see es.unican.istr.rai4.Rai4Package#getArtifactDescriptor_LocalPath()
	 * @model required="true"
	 * @generated
	 */
	String getLocalPath();

	/**
	 * Sets the value of the '{@link es.unican.istr.rai4.ArtifactDescriptor#getLocalPath <em>Local Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Path</em>' attribute.
	 * @see #getLocalPath()
	 * @generated
	 */
	void setLocalPath(String value);

} // ArtifactDescriptor
