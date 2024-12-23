/**
 */
package es.unican.istr.pasys.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Processing Amount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.TaskProcessingAmount#getTarget <em>Target</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.TaskProcessingAmount#getHistogramBuckectNum <em>Histogram Buckect Num</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.TaskProcessingAmount#getExpectedMaxTPA <em>Expected Max TPA</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.TaskProcessingAmount#getExpectedMinTPA <em>Expected Min TPA</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.TaskProcessingAmount#isLinearBucketDistribution <em>Linear Bucket Distribution</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getTaskProcessingAmount()
 * @model
 * @generated
 */
public interface TaskProcessingAmount extends Metric {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Task)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getTaskProcessingAmount_Target()
	 * @model required="true"
	 * @generated
	 */
	Task getTarget();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.TaskProcessingAmount#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Task value);

	/**
	 * Returns the value of the '<em><b>Histogram Buckect Num</b></em>' attribute.
	 * The default value is <code>"11"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Histogram Buckect Num</em>' attribute.
	 * @see #setHistogramBuckectNum(int)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getTaskProcessingAmount_HistogramBuckectNum()
	 * @model default="11" required="true"
	 * @generated
	 */
	int getHistogramBuckectNum();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.TaskProcessingAmount#getHistogramBuckectNum <em>Histogram Buckect Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Histogram Buckect Num</em>' attribute.
	 * @see #getHistogramBuckectNum()
	 * @generated
	 */
	void setHistogramBuckectNum(int value);

	/**
	 * Returns the value of the '<em><b>Expected Max TPA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Max TPA</em>' attribute.
	 * @see #setExpectedMaxTPA(long)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getTaskProcessingAmount_ExpectedMaxTPA()
	 * @model required="true"
	 * @generated
	 */
	long getExpectedMaxTPA();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.TaskProcessingAmount#getExpectedMaxTPA <em>Expected Max TPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Max TPA</em>' attribute.
	 * @see #getExpectedMaxTPA()
	 * @generated
	 */
	void setExpectedMaxTPA(long value);

	/**
	 * Returns the value of the '<em><b>Expected Min TPA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Min TPA</em>' attribute.
	 * @see #setExpectedMinTPA(long)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getTaskProcessingAmount_ExpectedMinTPA()
	 * @model required="true"
	 * @generated
	 */
	long getExpectedMinTPA();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.TaskProcessingAmount#getExpectedMinTPA <em>Expected Min TPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Min TPA</em>' attribute.
	 * @see #getExpectedMinTPA()
	 * @generated
	 */
	void setExpectedMinTPA(long value);

	/**
	 * Returns the value of the '<em><b>Linear Bucket Distribution</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Bucket Distribution</em>' attribute.
	 * @see #setLinearBucketDistribution(boolean)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getTaskProcessingAmount_LinearBucketDistribution()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isLinearBucketDistribution();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.TaskProcessingAmount#isLinearBucketDistribution <em>Linear Bucket Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Bucket Distribution</em>' attribute.
	 * @see #isLinearBucketDistribution()
	 * @generated
	 */
	void setLinearBucketDistribution(boolean value);

} // TaskProcessingAmount
