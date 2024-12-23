/**
 */
package es.unican.istr.pasys.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.Meter#getMonitoringServer <em>Monitoring Server</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getMeter()
 * @model abstract="true"
 * @generated
 */
public interface Meter extends NamedElement, DeployableComponent {
	/**
	 * Returns the value of the '<em><b>Monitoring Server</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.pasys.MonitoringService#getMonitorizedMeters <em>Monitorized Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring Server</em>' reference.
	 * @see #setMonitoringServer(MonitoringService)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getMeter_MonitoringServer()
	 * @see es.unican.istr.pasys.pasys.MonitoringService#getMonitorizedMeters
	 * @model opposite="monitorizedMeters"
	 * @generated
	 */
	MonitoringService getMonitoringServer();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.Meter#getMonitoringServer <em>Monitoring Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring Server</em>' reference.
	 * @see #getMonitoringServer()
	 * @generated
	 */
	void setMonitoringServer(MonitoringService value);

} // Meter
