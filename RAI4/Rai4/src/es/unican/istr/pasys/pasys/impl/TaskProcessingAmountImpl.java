/**
 */
package es.unican.istr.pasys.pasys.impl;

import es.unican.istr.pasys.pasys.PasysPackage;
import es.unican.istr.pasys.pasys.Task;
import es.unican.istr.pasys.pasys.TaskProcessingAmount;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Processing Amount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.impl.TaskProcessingAmountImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.impl.TaskProcessingAmountImpl#getHistogramBuckectNum <em>Histogram Buckect Num</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.impl.TaskProcessingAmountImpl#getExpectedMaxTPA <em>Expected Max TPA</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.impl.TaskProcessingAmountImpl#getExpectedMinTPA <em>Expected Min TPA</em>}</li>
 *   <li>{@link es.unican.istr.pasys.pasys.impl.TaskProcessingAmountImpl#isLinearBucketDistribution <em>Linear Bucket Distribution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskProcessingAmountImpl extends MetricImpl implements TaskProcessingAmount {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Task target;

	/**
	 * The default value of the '{@link #getHistogramBuckectNum() <em>Histogram Buckect Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistogramBuckectNum()
	 * @generated
	 * @ordered
	 */
	protected static final int HISTOGRAM_BUCKECT_NUM_EDEFAULT = 11;

	/**
	 * The cached value of the '{@link #getHistogramBuckectNum() <em>Histogram Buckect Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistogramBuckectNum()
	 * @generated
	 * @ordered
	 */
	protected int histogramBuckectNum = HISTOGRAM_BUCKECT_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpectedMaxTPA() <em>Expected Max TPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedMaxTPA()
	 * @generated
	 * @ordered
	 */
	protected static final long EXPECTED_MAX_TPA_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getExpectedMaxTPA() <em>Expected Max TPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedMaxTPA()
	 * @generated
	 * @ordered
	 */
	protected long expectedMaxTPA = EXPECTED_MAX_TPA_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpectedMinTPA() <em>Expected Min TPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedMinTPA()
	 * @generated
	 * @ordered
	 */
	protected static final long EXPECTED_MIN_TPA_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getExpectedMinTPA() <em>Expected Min TPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedMinTPA()
	 * @generated
	 * @ordered
	 */
	protected long expectedMinTPA = EXPECTED_MIN_TPA_EDEFAULT;

	/**
	 * The default value of the '{@link #isLinearBucketDistribution() <em>Linear Bucket Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLinearBucketDistribution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LINEAR_BUCKET_DISTRIBUTION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLinearBucketDistribution() <em>Linear Bucket Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLinearBucketDistribution()
	 * @generated
	 * @ordered
	 */
	protected boolean linearBucketDistribution = LINEAR_BUCKET_DISTRIBUTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskProcessingAmountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PasysPackage.Literals.TASK_PROCESSING_AMOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Task)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PasysPackage.TASK_PROCESSING_AMOUNT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Task newTarget) {
		Task oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.TASK_PROCESSING_AMOUNT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHistogramBuckectNum() {
		return histogramBuckectNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHistogramBuckectNum(int newHistogramBuckectNum) {
		int oldHistogramBuckectNum = histogramBuckectNum;
		histogramBuckectNum = newHistogramBuckectNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.TASK_PROCESSING_AMOUNT__HISTOGRAM_BUCKECT_NUM, oldHistogramBuckectNum, histogramBuckectNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getExpectedMaxTPA() {
		return expectedMaxTPA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedMaxTPA(long newExpectedMaxTPA) {
		long oldExpectedMaxTPA = expectedMaxTPA;
		expectedMaxTPA = newExpectedMaxTPA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.TASK_PROCESSING_AMOUNT__EXPECTED_MAX_TPA, oldExpectedMaxTPA, expectedMaxTPA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getExpectedMinTPA() {
		return expectedMinTPA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedMinTPA(long newExpectedMinTPA) {
		long oldExpectedMinTPA = expectedMinTPA;
		expectedMinTPA = newExpectedMinTPA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.TASK_PROCESSING_AMOUNT__EXPECTED_MIN_TPA, oldExpectedMinTPA, expectedMinTPA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLinearBucketDistribution() {
		return linearBucketDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinearBucketDistribution(boolean newLinearBucketDistribution) {
		boolean oldLinearBucketDistribution = linearBucketDistribution;
		linearBucketDistribution = newLinearBucketDistribution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PasysPackage.TASK_PROCESSING_AMOUNT__LINEAR_BUCKET_DISTRIBUTION, oldLinearBucketDistribution, linearBucketDistribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PasysPackage.TASK_PROCESSING_AMOUNT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case PasysPackage.TASK_PROCESSING_AMOUNT__HISTOGRAM_BUCKECT_NUM:
				return getHistogramBuckectNum();
			case PasysPackage.TASK_PROCESSING_AMOUNT__EXPECTED_MAX_TPA:
				return getExpectedMaxTPA();
			case PasysPackage.TASK_PROCESSING_AMOUNT__EXPECTED_MIN_TPA:
				return getExpectedMinTPA();
			case PasysPackage.TASK_PROCESSING_AMOUNT__LINEAR_BUCKET_DISTRIBUTION:
				return isLinearBucketDistribution();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PasysPackage.TASK_PROCESSING_AMOUNT__TARGET:
				setTarget((Task)newValue);
				return;
			case PasysPackage.TASK_PROCESSING_AMOUNT__HISTOGRAM_BUCKECT_NUM:
				setHistogramBuckectNum((Integer)newValue);
				return;
			case PasysPackage.TASK_PROCESSING_AMOUNT__EXPECTED_MAX_TPA:
				setExpectedMaxTPA((Long)newValue);
				return;
			case PasysPackage.TASK_PROCESSING_AMOUNT__EXPECTED_MIN_TPA:
				setExpectedMinTPA((Long)newValue);
				return;
			case PasysPackage.TASK_PROCESSING_AMOUNT__LINEAR_BUCKET_DISTRIBUTION:
				setLinearBucketDistribution((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PasysPackage.TASK_PROCESSING_AMOUNT__TARGET:
				setTarget((Task)null);
				return;
			case PasysPackage.TASK_PROCESSING_AMOUNT__HISTOGRAM_BUCKECT_NUM:
				setHistogramBuckectNum(HISTOGRAM_BUCKECT_NUM_EDEFAULT);
				return;
			case PasysPackage.TASK_PROCESSING_AMOUNT__EXPECTED_MAX_TPA:
				setExpectedMaxTPA(EXPECTED_MAX_TPA_EDEFAULT);
				return;
			case PasysPackage.TASK_PROCESSING_AMOUNT__EXPECTED_MIN_TPA:
				setExpectedMinTPA(EXPECTED_MIN_TPA_EDEFAULT);
				return;
			case PasysPackage.TASK_PROCESSING_AMOUNT__LINEAR_BUCKET_DISTRIBUTION:
				setLinearBucketDistribution(LINEAR_BUCKET_DISTRIBUTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PasysPackage.TASK_PROCESSING_AMOUNT__TARGET:
				return target != null;
			case PasysPackage.TASK_PROCESSING_AMOUNT__HISTOGRAM_BUCKECT_NUM:
				return histogramBuckectNum != HISTOGRAM_BUCKECT_NUM_EDEFAULT;
			case PasysPackage.TASK_PROCESSING_AMOUNT__EXPECTED_MAX_TPA:
				return expectedMaxTPA != EXPECTED_MAX_TPA_EDEFAULT;
			case PasysPackage.TASK_PROCESSING_AMOUNT__EXPECTED_MIN_TPA:
				return expectedMinTPA != EXPECTED_MIN_TPA_EDEFAULT;
			case PasysPackage.TASK_PROCESSING_AMOUNT__LINEAR_BUCKET_DISTRIBUTION:
				return linearBucketDistribution != LINEAR_BUCKET_DISTRIBUTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (histogramBuckectNum: ");
		result.append(histogramBuckectNum);
		result.append(", expectedMaxTPA: ");
		result.append(expectedMaxTPA);
		result.append(", expectedMinTPA: ");
		result.append(expectedMinTPA);
		result.append(", linearBucketDistribution: ");
		result.append(linearBucketDistribution);
		result.append(')');
		return result.toString();
	}

} //TaskProcessingAmountImpl
