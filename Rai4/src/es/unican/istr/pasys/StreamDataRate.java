/**
 */
package es.unican.istr.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream Data Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.StreamDataRate#getTarget <em>Target</em>}</li>
 *   <li>{@link es.unican.istr.pasys.StreamDataRate#getMeter <em>Meter</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.PasysPackage#getStreamDataRate()
 * @model
 * @generated
 */
public interface StreamDataRate extends Metric {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(StreamData)
	 * @see es.unican.istr.pasys.PasysPackage#getStreamDataRate_Target()
	 * @model required="true"
	 * @generated
	 */
	StreamData getTarget();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.StreamDataRate#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(StreamData value);

	/**
	 * Returns the value of the '<em><b>Meter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.StreamRateMeter#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter</em>' reference.
	 * @see #setMeter(StreamRateMeter)
	 * @see es.unican.istr.pasys.PasysPackage#getStreamDataRate_Meter()
	 * @see es.unican.istr.pasys.StreamRateMeter#getMetric
	 * @model opposite="metric" required="true"
	 * @generated
	 */
	StreamRateMeter getMeter();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.StreamDataRate#getMeter <em>Meter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter</em>' reference.
	 * @see #getMeter()
	 * @generated
	 */
	void setMeter(StreamRateMeter value);

} // StreamDataRate
