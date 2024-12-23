/**
 */
package es.unican.istr.pasys.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream Data Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.StreamDataRate#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getStreamDataRate()
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
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getStreamDataRate_Target()
	 * @model required="true"
	 * @generated
	 */
	StreamData getTarget();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.StreamDataRate#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(StreamData value);

} // StreamDataRate
