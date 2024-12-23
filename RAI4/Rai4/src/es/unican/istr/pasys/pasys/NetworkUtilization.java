/**
 */
package es.unican.istr.pasys.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Utilization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.NetworkUtilization#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getNetworkUtilization()
 * @model
 * @generated
 */
public interface NetworkUtilization extends Metric {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Network)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getNetworkUtilization_Target()
	 * @model required="true"
	 * @generated
	 */
	Network getTarget();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.NetworkUtilization#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Network value);

} // NetworkUtilization
