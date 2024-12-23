/**
 */
package es.unican.istr.pasys.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zookeeper Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.ZookeeperService#getServerId <em>Server Id</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.ZookeeperService#getClientPort <em>Client Port</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.ZookeeperService#getTickTime <em>Tick Time</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.ZookeeperService#isLeaderServers <em>Leader Servers</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.ZookeeperService#getPeerPort <em>Peer Port</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.ZookeeperService#getLeaderPort <em>Leader Port</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.ZookeeperService#getInitLimit <em>Init Limit</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.ZookeeperService#getSyncLimit <em>Sync Limit</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getZookeeperService()
 * @model
 * @generated
 */
public interface ZookeeperService extends DistributionService {
	/**
	 * Returns the value of the '<em><b>Server Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Id</em>' attribute.
	 * @see #setServerId(int)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getZookeeperService_ServerId()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getServerId();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.ZookeeperService#getServerId <em>Server Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Id</em>' attribute.
	 * @see #getServerId()
	 * @generated
	 */
	void setServerId(int value);

	/**
	 * Returns the value of the '<em><b>Client Port</b></em>' attribute.
	 * The default value is <code>"2181"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Port</em>' attribute.
	 * @see #setClientPort(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getZookeeperService_ClientPort()
	 * @model default="2181" required="true"
	 * @generated
	 */
	String getClientPort();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.ZookeeperService#getClientPort <em>Client Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Port</em>' attribute.
	 * @see #getClientPort()
	 * @generated
	 */
	void setClientPort(String value);

	/**
	 * Returns the value of the '<em><b>Tick Time</b></em>' attribute.
	 * The default value is <code>"2000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tick Time</em>' attribute.
	 * @see #setTickTime(long)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getZookeeperService_TickTime()
	 * @model default="2000" required="true"
	 * @generated
	 */
	long getTickTime();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.ZookeeperService#getTickTime <em>Tick Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tick Time</em>' attribute.
	 * @see #getTickTime()
	 * @generated
	 */
	void setTickTime(long value);

	/**
	 * Returns the value of the '<em><b>Leader Servers</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader Servers</em>' attribute.
	 * @see #setLeaderServers(boolean)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getZookeeperService_LeaderServers()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isLeaderServers();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.ZookeeperService#isLeaderServers <em>Leader Servers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader Servers</em>' attribute.
	 * @see #isLeaderServers()
	 * @generated
	 */
	void setLeaderServers(boolean value);

	/**
	 * Returns the value of the '<em><b>Peer Port</b></em>' attribute.
	 * The default value is <code>"2888"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peer Port</em>' attribute.
	 * @see #setPeerPort(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getZookeeperService_PeerPort()
	 * @model default="2888" required="true"
	 * @generated
	 */
	String getPeerPort();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.ZookeeperService#getPeerPort <em>Peer Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peer Port</em>' attribute.
	 * @see #getPeerPort()
	 * @generated
	 */
	void setPeerPort(String value);

	/**
	 * Returns the value of the '<em><b>Leader Port</b></em>' attribute.
	 * The default value is <code>"3888"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader Port</em>' attribute.
	 * @see #setLeaderPort(String)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getZookeeperService_LeaderPort()
	 * @model default="3888" required="true"
	 * @generated
	 */
	String getLeaderPort();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.ZookeeperService#getLeaderPort <em>Leader Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader Port</em>' attribute.
	 * @see #getLeaderPort()
	 * @generated
	 */
	void setLeaderPort(String value);

	/**
	 * Returns the value of the '<em><b>Init Limit</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Limit</em>' attribute.
	 * @see #setInitLimit(int)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getZookeeperService_InitLimit()
	 * @model default="5" required="true"
	 * @generated
	 */
	int getInitLimit();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.ZookeeperService#getInitLimit <em>Init Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Limit</em>' attribute.
	 * @see #getInitLimit()
	 * @generated
	 */
	void setInitLimit(int value);

	/**
	 * Returns the value of the '<em><b>Sync Limit</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync Limit</em>' attribute.
	 * @see #setSyncLimit(int)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getZookeeperService_SyncLimit()
	 * @model default="3" required="true"
	 * @generated
	 */
	int getSyncLimit();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.ZookeeperService#getSyncLimit <em>Sync Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Limit</em>' attribute.
	 * @see #getSyncLimit()
	 * @generated
	 */
	void setSyncLimit(int value);

} // ZookeeperService
