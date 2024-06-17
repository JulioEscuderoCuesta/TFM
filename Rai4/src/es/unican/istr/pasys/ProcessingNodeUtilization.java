/**
 */
package es.unican.istr.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Node Utilization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.ProcessingNodeUtilization#getTarget <em>Target</em>}</li>
 *   <li>{@link es.unican.istr.pasys.ProcessingNodeUtilization#getMeter <em>Meter</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.PasysPackage#getProcessingNodeUtilization()
 * @model
 * @generated
 */
public interface ProcessingNodeUtilization extends Metric {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ProcessingNode)
	 * @see es.unican.istr.pasys.PasysPackage#getProcessingNodeUtilization_Target()
	 * @model required="true"
	 * @generated
	 */
	ProcessingNode getTarget();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.ProcessingNodeUtilization#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ProcessingNode value);

	/**
	 * Returns the value of the '<em><b>Meter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link es.unican.istr.pasys.NodeResourceMeter#getUMetric <em>UMetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter</em>' reference.
	 * @see #setMeter(NodeResourceMeter)
	 * @see es.unican.istr.pasys.PasysPackage#getProcessingNodeUtilization_Meter()
	 * @see es.unican.istr.pasys.NodeResourceMeter#getUMetric
	 * @model opposite="uMetric" required="true"
	 * @generated
	 */
	NodeResourceMeter getMeter();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.ProcessingNodeUtilization#getMeter <em>Meter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter</em>' reference.
	 * @see #getMeter()
	 * @generated
	 */
	void setMeter(NodeResourceMeter value);

} // ProcessingNodeUtilization
