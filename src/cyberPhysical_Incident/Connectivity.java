/**
 */
package cyberPhysical_Incident;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectivity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.Connectivity#getName <em>Name</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Connectivity#isIsClosed <em>Is Closed</em>}</li>
 * </ul>
 *
 * @see cyberPhysical_Incident.CyberPhysical_IncidentPackage#getConnectivity()
 * @model
 * @generated
 */
public interface Connectivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cyberPhysical_Incident.CyberPhysical_IncidentPackage#getConnectivity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Connectivity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Closed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Closed</em>' attribute.
	 * @see #setIsClosed(boolean)
	 * @see cyberPhysical_Incident.CyberPhysical_IncidentPackage#getConnectivity_IsClosed()
	 * @model
	 * @generated
	 */
	boolean isIsClosed();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Connectivity#isIsClosed <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Closed</em>' attribute.
	 * @see #isIsClosed()
	 * @generated
	 */
	void setIsClosed(boolean value);

} // Connectivity
