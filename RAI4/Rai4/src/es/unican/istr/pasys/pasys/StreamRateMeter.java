/**
 */
package es.unican.istr.pasys.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream Rate Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.StreamRateMeter#getOwner <em>Owner</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.StreamRateMeter#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getStreamRateMeter()
 * @model
 * @generated
 */
public interface StreamRateMeter extends PrometheusMeter {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.pasys.StreamData#getOwnedMeters <em>Owned Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(StreamData)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStreamRateMeter_Owner()
	 * @see es.unican.istr.pasys.pasys.StreamData#getOwnedMeters
	 * @model opposite="ownedMeters" required="true" transient="false"
	 * @generated
	 */
	StreamData getOwner();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StreamRateMeter#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(StreamData value);

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' reference.
	 * @see #setMetric(StreamDataRate)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStreamRateMeter_Metric()
	 * @model required="true"
	 * @generated
	 */
	StreamDataRate getMetric();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StreamRateMeter#getMetric <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(StreamDataRate value);

} // StreamRateMeter
