/**
 */
package es.unican.istr.pasys.pasys;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unican.istr.pasys.pasys.Network#getBandwith <em>Bandwith</em>}</li>
 * </ul>
 *
 * @see es.unican.istr.pasys.pasys.PasysPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends PlatformResource {
	/**
	 * Returns the value of the '<em><b>Bandwith</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bandwith</em>' attribute.
	 * @see #setBandwith(double)
	 * @see es.unican.istr.pasys.pasys.PasysPackage#getNetwork_Bandwith()
	 * @model required="true"
	 * @generated
	 */
	double getBandwith();

	/**
	 * Sets the value of the '{@link es.unican.istr.pasys.pasys.Network#getBandwith <em>Bandwith</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwith</em>' attribute.
	 * @see #getBandwith()
	 * @generated
	 */
	void setBandwith(double value);

} // Network
