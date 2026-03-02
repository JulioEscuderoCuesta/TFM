/**
 */
package es.unican.istr.rai4;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitoring Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.rai4.MonitoringService#getMonitorizedMeters <em>Monitorized Meters</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.rai4.Rai4Package#getMonitoringService()
 * @model abstract="true"
 * @generated
 */
public interface MonitoringService extends PlatformService {
	/**
	 * Returns the value of the '<em><b>Monitorized Meters</b></em>' reference list.
	 * The list contents are of type {@link es.unican.istr.rai4.Meter}.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.rai4.Meter#getMonitoringServer <em>Monitoring Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitorized Meters</em>' reference list.
	 * @see es.unican.istr.rai4.Rai4Package#getMonitoringService_MonitorizedMeters()
	 * @see es.unican.istr.rai4.Meter#getMonitoringServer
	 * @model opposite="monitoringServer"
	 * @generated
	 */
	EList<Meter> getMonitorizedMeters();

} // MonitoringService
