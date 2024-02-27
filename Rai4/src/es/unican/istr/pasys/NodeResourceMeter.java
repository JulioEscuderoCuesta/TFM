/**
 */
package es.unican.istr.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Resource Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.NodeResourceMeter#getUMetric <em>UMetric</em>}</li>
 *   <li>{@link es.unican.istr.pasys.NodeResourceMeter#getMMetric <em>MMetric</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.PasysPackage#getNodeResourceMeter()
 * @model
 * @generated
 */
public interface NodeResourceMeter extends NodeHostedMeter {
	/**
	 * Returns the value of the '<em><b>UMetric</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.ProcessingNodeUtilization#getMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UMetric</em>' reference.
	 * @see #setUMetric(ProcessingNodeUtilization)
	 * @see es.unican.istr.pasys.PasysPackage#getNodeResourceMeter_UMetric()
	 * @see es.unican.istr.pasys.ProcessingNodeUtilization#getMeter
	 * @model opposite="meter"
	 * @generated
	 */
	ProcessingNodeUtilization getUMetric();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.NodeResourceMeter#getUMetric <em>UMetric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UMetric</em>' reference.
	 * @see #getUMetric()
	 * @generated
	 */
	void setUMetric(ProcessingNodeUtilization value);

	/**
	 * Returns the value of the '<em><b>MMetric</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.ProcessingNodeMemory#getMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMetric</em>' reference.
	 * @see #setMMetric(ProcessingNodeMemory)
	 * @see es.unican.istr.pasys.PasysPackage#getNodeResourceMeter_MMetric()
	 * @see es.unican.istr.pasys.ProcessingNodeMemory#getMeter
	 * @model opposite="meter"
	 * @generated
	 */
	ProcessingNodeMemory getMMetric();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.NodeResourceMeter#getMMetric <em>MMetric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MMetric</em>' reference.
	 * @see #getMMetric()
	 * @generated
	 */
	void setMMetric(ProcessingNodeMemory value);

} // NodeResourceMeter
