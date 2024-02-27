/**
 */
package es.unican.istr.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.CommunicationMeter#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.PasysPackage#getCommunicationMeter()
 * @model
 * @generated
 */
public interface CommunicationMeter extends NodeHostedMeter {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.NetworkUtilization#getMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' reference.
	 * @see #setMetric(NetworkUtilization)
	 * @see es.unican.istr.pasys.PasysPackage#getCommunicationMeter_Metric()
	 * @see es.unican.istr.pasys.NetworkUtilization#getMeter
	 * @model opposite="meter" required="true"
	 * @generated
	 */
	NetworkUtilization getMetric();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.CommunicationMeter#getMetric <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(NetworkUtilization value);

} // CommunicationMeter
