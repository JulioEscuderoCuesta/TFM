/**
 */
package es.unican.istr.pasys.pasys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cassandra Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.CassandraService#getNumTokens <em>Num Tokens</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.CassandraService#getSeeds <em>Seeds</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.CassandraService#getSeedProviderClass <em>Seed Provider Class</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.CassandraService#getEndpointSnitch <em>Endpoint Snitch</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.CassandraService#getDataFileDir <em>Data File Dir</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.CassandraService#getStoragePort <em>Storage Port</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.CassandraService#isAutoBootstrap <em>Auto Bootstrap</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.CassandraService#getCqlSchemas <em>Cql Schemas</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.CassandraService#getDataCenters <em>Data Centers</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.CassandraService#getSslStoragePort <em>Ssl Storage Port</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.CassandraService#getRpcPort <em>Rpc Port</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getCassandraService()
 * @model
 * @generated
 */
public interface CassandraService extends PersistenceService {
	/**
	 * Returns the value of the '<em><b>Num Tokens</b></em>' attribute.
	 * The default value is <code>"256"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Tokens</em>' attribute.
	 * @see #setNumTokens(int)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getCassandraService_NumTokens()
	 * @model default="256" required="true"
	 * @generated
	 */
	int getNumTokens();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.CassandraService#getNumTokens <em>Num Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Tokens</em>' attribute.
	 * @see #getNumTokens()
	 * @generated
	 */
	void setNumTokens(int value);

	/**
	 * Returns the value of the '<em><b>Seeds</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seeds</em>' reference.
	 * @see #setSeeds(ProcessingNodeCluster)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getCassandraService_Seeds()
	 * @model
	 * @generated
	 */
	ProcessingNodeCluster getSeeds();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.CassandraService#getSeeds <em>Seeds</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seeds</em>' reference.
	 * @see #getSeeds()
	 * @generated
	 */
	void setSeeds(ProcessingNodeCluster value);

	/**
	 * Returns the value of the '<em><b>Seed Provider Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seed Provider Class</em>' attribute.
	 * @see #setSeedProviderClass(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getCassandraService_SeedProviderClass()
	 * @model
	 * @generated
	 */
	String getSeedProviderClass();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.CassandraService#getSeedProviderClass <em>Seed Provider Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed Provider Class</em>' attribute.
	 * @see #getSeedProviderClass()
	 * @generated
	 */
	void setSeedProviderClass(String value);

	/**
	 * Returns the value of the '<em><b>Endpoint Snitch</b></em>' attribute.
	 * The default value is <code>"SimpleSnitch"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Snitch</em>' attribute.
	 * @see #setEndpointSnitch(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getCassandraService_EndpointSnitch()
	 * @model default="SimpleSnitch"
	 * @generated
	 */
	String getEndpointSnitch();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.CassandraService#getEndpointSnitch <em>Endpoint Snitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Snitch</em>' attribute.
	 * @see #getEndpointSnitch()
	 * @generated
	 */
	void setEndpointSnitch(String value);

	/**
	 * Returns the value of the '<em><b>Data File Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data File Dir</em>' attribute.
	 * @see #setDataFileDir(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getCassandraService_DataFileDir()
	 * @model required="true"
	 * @generated
	 */
	String getDataFileDir();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.CassandraService#getDataFileDir <em>Data File Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data File Dir</em>' attribute.
	 * @see #getDataFileDir()
	 * @generated
	 */
	void setDataFileDir(String value);

	/**
	 * Returns the value of the '<em><b>Storage Port</b></em>' attribute.
	 * The default value is <code>"7000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Port</em>' attribute.
	 * @see #setStoragePort(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getCassandraService_StoragePort()
	 * @model default="7000" required="true"
	 * @generated
	 */
	String getStoragePort();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.CassandraService#getStoragePort <em>Storage Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Port</em>' attribute.
	 * @see #getStoragePort()
	 * @generated
	 */
	void setStoragePort(String value);

	/**
	 * Returns the value of the '<em><b>Auto Bootstrap</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Bootstrap</em>' attribute.
	 * @see #setAutoBootstrap(boolean)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getCassandraService_AutoBootstrap()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isAutoBootstrap();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.CassandraService#isAutoBootstrap <em>Auto Bootstrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Bootstrap</em>' attribute.
	 * @see #isAutoBootstrap()
	 * @generated
	 */
	void setAutoBootstrap(boolean value);

	/**
	 * Returns the value of the '<em><b>Cql Schemas</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.istr.pasys.pasys.FileDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cql Schemas</em>' containment reference list.
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getCassandraService_CqlSchemas()
	 * @model containment="true"
	 * @generated
	 */
	EList<FileDescriptor> getCqlSchemas();

	/**
	 * Returns the value of the '<em><b>Data Centers</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.istr.pasys.pasys.DataCenter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Centers</em>' containment reference list.
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getCassandraService_DataCenters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DataCenter> getDataCenters();

	/**
	 * Returns the value of the '<em><b>Ssl Storage Port</b></em>' attribute.
	 * The default value is <code>"7001"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssl Storage Port</em>' attribute.
	 * @see #setSslStoragePort(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getCassandraService_SslStoragePort()
	 * @model default="7001" required="true"
	 * @generated
	 */
	String getSslStoragePort();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.CassandraService#getSslStoragePort <em>Ssl Storage Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssl Storage Port</em>' attribute.
	 * @see #getSslStoragePort()
	 * @generated
	 */
	void setSslStoragePort(String value);

	/**
	 * Returns the value of the '<em><b>Rpc Port</b></em>' attribute.
	 * The default value is <code>"9160"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpc Port</em>' attribute.
	 * @see #setRpcPort(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getCassandraService_RpcPort()
	 * @model default="9160" required="true"
	 * @generated
	 */
	String getRpcPort();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.CassandraService#getRpcPort <em>Rpc Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpc Port</em>' attribute.
	 * @see #getRpcPort()
	 * @generated
	 */
	void setRpcPort(String value);

} // CassandraService
