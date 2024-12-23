/**
 */
package es.unican.istr.pasys.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Resource Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.NodeResourceMeter#getUMetric <em>UMetric</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.NodeResourceMeter#getMMetric <em>MMetric</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getNodeResourceMeter()
 * @model
 * @generated
 */
public interface NodeResourceMeter extends NodeHostedMeter {
	/**
	 * Returns the value of the '<em><b>UMetric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UMetric</em>' reference.
	 * @see #setUMetric(ProcessingNodeUtilization)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getNodeResourceMeter_UMetric()
	 * @model
	 * @generated
	 */
	ProcessingNodeUtilization getUMetric();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.NodeResourceMeter#getUMetric <em>UMetric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UMetric</em>' reference.
	 * @see #getUMetric()
	 * @generated
	 */
	void setUMetric(ProcessingNodeUtilization value);

	/**
	 * Returns the value of the '<em><b>MMetric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMetric</em>' reference.
	 * @see #setMMetric(ProcessingNodeMemory)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getNodeResourceMeter_MMetric()
	 * @model
	 * @generated
	 */
	ProcessingNodeMemory getMMetric();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.NodeResourceMeter#getMMetric <em>MMetric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MMetric</em>' reference.
	 * @see #getMMetric()
	 * @generated
	 */
	void setMMetric(ProcessingNodeMemory value);

} // NodeResourceMeter
