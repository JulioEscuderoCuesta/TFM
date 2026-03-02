/**
 */
package es.unican.istr.rai4.impl;

import es.unican.istr.rai4.Rai4Package;
import es.unican.istr.rai4.ZookeeperService;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zookeeper Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.rai4.impl.ZookeeperServiceImpl#getServerId <em>Server Id</em>}</li>
 *   <li>{@link es.unican.istr.rai4.impl.ZookeeperServiceImpl#getClientPort <em>Client Port</em>}</li>
 *   <li>{@link es.unican.istr.rai4.impl.ZookeeperServiceImpl#getTickTime <em>Tick Time</em>}</li>
 *   <li>{@link es.unican.istr.rai4.impl.ZookeeperServiceImpl#isLeaderServers <em>Leader Servers</em>}</li>
 *   <li>{@link es.unican.istr.rai4.impl.ZookeeperServiceImpl#getPeerPort <em>Peer Port</em>}</li>
 *   <li>{@link es.unican.istr.rai4.impl.ZookeeperServiceImpl#getLeaderPort <em>Leader Port</em>}</li>
 *   <li>{@link es.unican.istr.rai4.impl.ZookeeperServiceImpl#getInitLimit <em>Init Limit</em>}</li>
 *   <li>{@link es.unican.istr.rai4.impl.ZookeeperServiceImpl#getSyncLimit <em>Sync Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZookeeperServiceImpl extends DistributionServiceImpl implements ZookeeperService {
	/**
	 * The default value of the '{@link #getServerId() <em>Server Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerId()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getServerId() <em>Server Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerId()
	 * @generated
	 * @ordered
	 */
	protected int serverId = SERVER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientPort() <em>Client Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientPort()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_PORT_EDEFAULT = "2181";

	/**
	 * The cached value of the '{@link #getClientPort() <em>Client Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientPort()
	 * @generated
	 * @ordered
	 */
	protected String clientPort = CLIENT_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTickTime() <em>Tick Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickTime()
	 * @generated
	 * @ordered
	 */
	protected static final long TICK_TIME_EDEFAULT = 2000L;

	/**
	 * The cached value of the '{@link #getTickTime() <em>Tick Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTickTime()
	 * @generated
	 * @ordered
	 */
	protected long tickTime = TICK_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #isLeaderServers() <em>Leader Servers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeaderServers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEADER_SERVERS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLeaderServers() <em>Leader Servers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeaderServers()
	 * @generated
	 * @ordered
	 */
	protected boolean leaderServers = LEADER_SERVERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeerPort() <em>Peer Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeerPort()
	 * @generated
	 * @ordered
	 */
	protected static final String PEER_PORT_EDEFAULT = "2888";

	/**
	 * The cached value of the '{@link #getPeerPort() <em>Peer Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeerPort()
	 * @generated
	 * @ordered
	 */
	protected String peerPort = PEER_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeaderPort() <em>Leader Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderPort()
	 * @generated
	 * @ordered
	 */
	protected static final String LEADER_PORT_EDEFAULT = "3888";

	/**
	 * The cached value of the '{@link #getLeaderPort() <em>Leader Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderPort()
	 * @generated
	 * @ordered
	 */
	protected String leaderPort = LEADER_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitLimit() <em>Init Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int INIT_LIMIT_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getInitLimit() <em>Init Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitLimit()
	 * @generated
	 * @ordered
	 */
	protected int initLimit = INIT_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSyncLimit() <em>Sync Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int SYNC_LIMIT_EDEFAULT = 3;

	/**
	 * The cached value of the '{@link #getSyncLimit() <em>Sync Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncLimit()
	 * @generated
	 * @ordered
	 */
	protected int syncLimit = SYNC_LIMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZookeeperServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Rai4Package.Literals.ZOOKEEPER_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getServerId() {
		return serverId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerId(int newServerId) {
		int oldServerId = serverId;
		serverId = newServerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rai4Package.ZOOKEEPER_SERVICE__SERVER_ID, oldServerId, serverId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientPort() {
		return clientPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientPort(String newClientPort) {
		String oldClientPort = clientPort;
		clientPort = newClientPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rai4Package.ZOOKEEPER_SERVICE__CLIENT_PORT, oldClientPort, clientPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTickTime() {
		return tickTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTickTime(long newTickTime) {
		long oldTickTime = tickTime;
		tickTime = newTickTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rai4Package.ZOOKEEPER_SERVICE__TICK_TIME, oldTickTime, tickTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLeaderServers() {
		return leaderServers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeaderServers(boolean newLeaderServers) {
		boolean oldLeaderServers = leaderServers;
		leaderServers = newLeaderServers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rai4Package.ZOOKEEPER_SERVICE__LEADER_SERVERS, oldLeaderServers, leaderServers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPeerPort() {
		return peerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeerPort(String newPeerPort) {
		String oldPeerPort = peerPort;
		peerPort = newPeerPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rai4Package.ZOOKEEPER_SERVICE__PEER_PORT, oldPeerPort, peerPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLeaderPort() {
		return leaderPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeaderPort(String newLeaderPort) {
		String oldLeaderPort = leaderPort;
		leaderPort = newLeaderPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rai4Package.ZOOKEEPER_SERVICE__LEADER_PORT, oldLeaderPort, leaderPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getInitLimit() {
		return initLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitLimit(int newInitLimit) {
		int oldInitLimit = initLimit;
		initLimit = newInitLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rai4Package.ZOOKEEPER_SERVICE__INIT_LIMIT, oldInitLimit, initLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSyncLimit() {
		return syncLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyncLimit(int newSyncLimit) {
		int oldSyncLimit = syncLimit;
		syncLimit = newSyncLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rai4Package.ZOOKEEPER_SERVICE__SYNC_LIMIT, oldSyncLimit, syncLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Rai4Package.ZOOKEEPER_SERVICE__SERVER_ID:
				return getServerId();
			case Rai4Package.ZOOKEEPER_SERVICE__CLIENT_PORT:
				return getClientPort();
			case Rai4Package.ZOOKEEPER_SERVICE__TICK_TIME:
				return getTickTime();
			case Rai4Package.ZOOKEEPER_SERVICE__LEADER_SERVERS:
				return isLeaderServers();
			case Rai4Package.ZOOKEEPER_SERVICE__PEER_PORT:
				return getPeerPort();
			case Rai4Package.ZOOKEEPER_SERVICE__LEADER_PORT:
				return getLeaderPort();
			case Rai4Package.ZOOKEEPER_SERVICE__INIT_LIMIT:
				return getInitLimit();
			case Rai4Package.ZOOKEEPER_SERVICE__SYNC_LIMIT:
				return getSyncLimit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Rai4Package.ZOOKEEPER_SERVICE__SERVER_ID:
				setServerId((Integer)newValue);
				return;
			case Rai4Package.ZOOKEEPER_SERVICE__CLIENT_PORT:
				setClientPort((String)newValue);
				return;
			case Rai4Package.ZOOKEEPER_SERVICE__TICK_TIME:
				setTickTime((Long)newValue);
				return;
			case Rai4Package.ZOOKEEPER_SERVICE__LEADER_SERVERS:
				setLeaderServers((Boolean)newValue);
				return;
			case Rai4Package.ZOOKEEPER_SERVICE__PEER_PORT:
				setPeerPort((String)newValue);
				return;
			case Rai4Package.ZOOKEEPER_SERVICE__LEADER_PORT:
				setLeaderPort((String)newValue);
				return;
			case Rai4Package.ZOOKEEPER_SERVICE__INIT_LIMIT:
				setInitLimit((Integer)newValue);
				return;
			case Rai4Package.ZOOKEEPER_SERVICE__SYNC_LIMIT:
				setSyncLimit((Integer)newValue);
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
			case Rai4Package.ZOOKEEPER_SERVICE__SERVER_ID:
				setServerId(SERVER_ID_EDEFAULT);
				return;
			case Rai4Package.ZOOKEEPER_SERVICE__CLIENT_PORT:
				setClientPort(CLIENT_PORT_EDEFAULT);
				return;
			case Rai4Package.ZOOKEEPER_SERVICE__TICK_TIME:
				setTickTime(TICK_TIME_EDEFAULT);
				return;
			case Rai4Package.ZOOKEEPER_SERVICE__LEADER_SERVERS:
				setLeaderServers(LEADER_SERVERS_EDEFAULT);
				return;
			case Rai4Package.ZOOKEEPER_SERVICE__PEER_PORT:
				setPeerPort(PEER_PORT_EDEFAULT);
				return;
			case Rai4Package.ZOOKEEPER_SERVICE__LEADER_PORT:
				setLeaderPort(LEADER_PORT_EDEFAULT);
				return;
			case Rai4Package.ZOOKEEPER_SERVICE__INIT_LIMIT:
				setInitLimit(INIT_LIMIT_EDEFAULT);
				return;
			case Rai4Package.ZOOKEEPER_SERVICE__SYNC_LIMIT:
				setSyncLimit(SYNC_LIMIT_EDEFAULT);
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
			case Rai4Package.ZOOKEEPER_SERVICE__SERVER_ID:
				return serverId != SERVER_ID_EDEFAULT;
			case Rai4Package.ZOOKEEPER_SERVICE__CLIENT_PORT:
				return CLIENT_PORT_EDEFAULT == null ? clientPort != null : !CLIENT_PORT_EDEFAULT.equals(clientPort);
			case Rai4Package.ZOOKEEPER_SERVICE__TICK_TIME:
				return tickTime != TICK_TIME_EDEFAULT;
			case Rai4Package.ZOOKEEPER_SERVICE__LEADER_SERVERS:
				return leaderServers != LEADER_SERVERS_EDEFAULT;
			case Rai4Package.ZOOKEEPER_SERVICE__PEER_PORT:
				return PEER_PORT_EDEFAULT == null ? peerPort != null : !PEER_PORT_EDEFAULT.equals(peerPort);
			case Rai4Package.ZOOKEEPER_SERVICE__LEADER_PORT:
				return LEADER_PORT_EDEFAULT == null ? leaderPort != null : !LEADER_PORT_EDEFAULT.equals(leaderPort);
			case Rai4Package.ZOOKEEPER_SERVICE__INIT_LIMIT:
				return initLimit != INIT_LIMIT_EDEFAULT;
			case Rai4Package.ZOOKEEPER_SERVICE__SYNC_LIMIT:
				return syncLimit != SYNC_LIMIT_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (serverId: ");
		result.append(serverId);
		result.append(", clientPort: ");
		result.append(clientPort);
		result.append(", tickTime: ");
		result.append(tickTime);
		result.append(", leaderServers: ");
		result.append(leaderServers);
		result.append(", peerPort: ");
		result.append(peerPort);
		result.append(", leaderPort: ");
		result.append(leaderPort);
		result.append(", initLimit: ");
		result.append(initLimit);
		result.append(", syncLimit: ");
		result.append(syncLimit);
		result.append(')');
		return result.toString();
	}

} //ZookeeperServiceImpl
