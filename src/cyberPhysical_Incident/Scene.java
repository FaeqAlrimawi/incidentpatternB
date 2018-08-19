/**
 */
package cyberPhysical_Incident;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scene</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.Scene#getName <em>Name</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Scene#getNextScenes <em>Next Scenes</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Scene#getPreviousScenes <em>Previous Scenes</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Scene#getDescription <em>Description</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Scene#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see cyberPhysical_Incident.CyberPhysical_IncidentPackage#getScene()
 * @model
 * @generated
 */
public interface Scene extends EObject {
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
	 * @see cyberPhysical_Incident.CyberPhysical_IncidentPackage#getScene_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Scene#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Next Scenes</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Scene}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Scenes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Scenes</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysical_IncidentPackage#getScene_NextScenes()
	 * @model
	 * @generated
	 */
	EList<Scene> getNextScenes();

	/**
	 * Returns the value of the '<em><b>Previous Scenes</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Scene}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Scenes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Scenes</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysical_IncidentPackage#getScene_PreviousScenes()
	 * @model
	 * @generated
	 */
	EList<Scene> getPreviousScenes();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see cyberPhysical_Incident.CyberPhysical_IncidentPackage#getScene_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Scene#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see cyberPhysical_Incident.CyberPhysical_IncidentPackage#getScene_Activity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivity();

} // Scene
