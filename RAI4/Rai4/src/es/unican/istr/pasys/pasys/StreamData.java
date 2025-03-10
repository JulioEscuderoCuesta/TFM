/**
 */
package es.unican.istr.pasys.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.StreamData#getRetention_ms <em>Retention ms</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.StreamData#getRetention_bytes <em>Retention bytes</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.StreamData#isCleanupPolicy <em>Cleanup Policy</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.StreamData#getNumPartitions <em>Num Partitions</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.StreamData#getNumReplication <em>Num Replication</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.StreamData#getOwnedMeters <em>Owned Meters</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.StreamData#getAssignedPartition <em>Assigned Partition</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.StreamData#getMessageSize <em>Message Size</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.StreamData#getSchemaFile <em>Schema File</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getStreamData()
 * @model abstract="true"
 * @generated
 */
public interface StreamData extends DeployableComponent {
	/**
	 * Returns the value of the '<em><b>Retention ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retention ms</em>' attribute.
	 * @see #setRetention_ms(long)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStreamData_Retention_ms()
	 * @model required="true"
	 * @generated
	 */
	long getRetention_ms();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StreamData#getRetention_ms <em>Retention ms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retention ms</em>' attribute.
	 * @see #getRetention_ms()
	 * @generated
	 */
	void setRetention_ms(long value);

	/**
	 * Returns the value of the '<em><b>Retention bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retention bytes</em>' attribute.
	 * @see #setRetention_bytes(int)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStreamData_Retention_bytes()
	 * @model required="true"
	 * @generated
	 */
	int getRetention_bytes();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StreamData#getRetention_bytes <em>Retention bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retention bytes</em>' attribute.
	 * @see #getRetention_bytes()
	 * @generated
	 */
	void setRetention_bytes(int value);

	/**
	 * Returns the value of the '<em><b>Cleanup Policy</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cleanup Policy</em>' attribute.
	 * @see #setCleanupPolicy(boolean)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStreamData_CleanupPolicy()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isCleanupPolicy();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StreamData#isCleanupPolicy <em>Cleanup Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cleanup Policy</em>' attribute.
	 * @see #isCleanupPolicy()
	 * @generated
	 */
	void setCleanupPolicy(boolean value);

	/**
	 * Returns the value of the '<em><b>Num Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Partitions</em>' attribute.
	 * @see #setNumPartitions(int)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStreamData_NumPartitions()
	 * @model required="true"
	 * @generated
	 */
	int getNumPartitions();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StreamData#getNumPartitions <em>Num Partitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Partitions</em>' attribute.
	 * @see #getNumPartitions()
	 * @generated
	 */
	void setNumPartitions(int value);

	/**
	 * Returns the value of the '<em><b>Num Replication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Replication</em>' attribute.
	 * @see #setNumReplication(int)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStreamData_NumReplication()
	 * @model required="true"
	 * @generated
	 */
	int getNumReplication();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StreamData#getNumReplication <em>Num Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Replication</em>' attribute.
	 * @see #getNumReplication()
	 * @generated
	 */
	void setNumReplication(int value);

	/**
	 * Returns the value of the '<em><b>Owned Meters</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.istr.pasys.pasys.StreamRateMeter}.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.pasys.StreamRateMeter#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Meters</em>' containment reference list.
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStreamData_OwnedMeters()
	 * @see es.unican.istr.pasys.pasys.StreamRateMeter#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<StreamRateMeter> getOwnedMeters();

	/**
	 * Returns the value of the '<em><b>Assigned Partition</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.istr.pasys.pasys.StreamDataPartition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Partition</em>' containment reference list.
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStreamData_AssignedPartition()
	 * @model containment="true"
	 * @generated
	 */
	EList<StreamDataPartition> getAssignedPartition();

	/**
	 * Returns the value of the '<em><b>Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Size</em>' attribute.
	 * @see #setMessageSize(int)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStreamData_MessageSize()
	 * @model required="true"
	 * @generated
	 */
	int getMessageSize();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StreamData#getMessageSize <em>Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Size</em>' attribute.
	 * @see #getMessageSize()
	 * @generated
	 */
	void setMessageSize(int value);

	/**
	 * Returns the value of the '<em><b>Schema File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema File</em>' attribute.
	 * @see #setSchemaFile(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStreamData_SchemaFile()
	 * @model
	 * @generated
	 */
	String getSchemaFile();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StreamData#getSchemaFile <em>Schema File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema File</em>' attribute.
	 * @see #getSchemaFile()
	 * @generated
	 */
	void setSchemaFile(String value);

} // StreamData
