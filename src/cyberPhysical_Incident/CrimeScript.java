/**
 */
package cyberPhysical_Incident;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crime Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class defines and describes the crime committed
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.CrimeScript#getId <em>Id</em>}</li>
 *   <li>{@link cyberPhysical_Incident.CrimeScript#getName <em>Name</em>}</li>
 *   <li>{@link cyberPhysical_Incident.CrimeScript#getDescription <em>Description</em>}</li>
 *   <li>{@link cyberPhysical_Incident.CrimeScript#getCategory <em>Category</em>}</li>
 *   <li>{@link cyberPhysical_Incident.CrimeScript#getScenes <em>Scenes</em>}</li>
 *   <li>{@link cyberPhysical_Incident.CrimeScript#getGoals <em>Goals</em>}</li>
 *   <li>{@link cyberPhysical_Incident.CrimeScript#getTargetedAssets <em>Targeted Assets</em>}</li>
 *   <li>{@link cyberPhysical_Incident.CrimeScript#getResources <em>Resources</em>}</li>
 *   <li>{@link cyberPhysical_Incident.CrimeScript#getMainLocation <em>Main Location</em>}</li>
 *   <li>{@link cyberPhysical_Incident.CrimeScript#getVictims <em>Victims</em>}</li>
 *   <li>{@link cyberPhysical_Incident.CrimeScript#getOffenders <em>Offenders</em>}</li>
 *   <li>{@link cyberPhysical_Incident.CrimeScript#getHigherLevelScriptName <em>Higher Level Script Name</em>}</li>
 *   <li>{@link cyberPhysical_Incident.CrimeScript#getIntent <em>Intent</em>}</li>
 *   <li>{@link cyberPhysical_Incident.CrimeScript#getMotive <em>Motive</em>}</li>
 * </ul>
 *
 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getCrimeScript()
 * @model
 * @generated
 */
public interface CrimeScript extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getCrimeScript_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.CrimeScript#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getCrimeScript_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.CrimeScript#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getCrimeScript_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.CrimeScript#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link cyberPhysical_Incident.ScriptCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see cyberPhysical_Incident.ScriptCategory
	 * @see #setCategory(ScriptCategory)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getCrimeScript_Category()
	 * @model
	 * @generated
	 */
	ScriptCategory getCategory();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.CrimeScript#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see cyberPhysical_Incident.ScriptCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(ScriptCategory value);

	/**
	 * Returns the value of the '<em><b>Scenes</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Scene}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenes</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getCrimeScript_Scenes()
	 * @model
	 * @generated
	 */
	EList<Scene> getScenes();

	/**
	 * Returns the value of the '<em><b>Intent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent</em>' containment reference.
	 * @see #setIntent(Intent)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getCrimeScript_Intent()
	 * @model containment="true"
	 * @generated
	 */
	Intent getIntent();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.CrimeScript#getIntent <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent</em>' containment reference.
	 * @see #getIntent()
	 * @generated
	 */
	void setIntent(Intent value);

	/**
	 * Returns the value of the '<em><b>Motive</b></em>' containment reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Motive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motive</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motive</em>' containment reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getCrimeScript_Motive()
	 * @model containment="true"
	 * @generated
	 */
	EList<Motive> getMotive();

	/**
	 * Returns the value of the '<em><b>Goals</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getCrimeScript_Goals()
	 * @model
	 * @generated
	 */
	EList<Goal> getGoals();

	/**
	 * Returns the value of the '<em><b>Targeted Assets</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targeted Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targeted Assets</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getCrimeScript_TargetedAssets()
	 * @model
	 * @generated
	 */
	EList<Asset> getTargetedAssets();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getCrimeScript_Resources()
	 * @model
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Main Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Location</em>' reference.
	 * @see #setMainLocation(Location)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getCrimeScript_MainLocation()
	 * @model
	 * @generated
	 */
	Location getMainLocation();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.CrimeScript#getMainLocation <em>Main Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Location</em>' reference.
	 * @see #getMainLocation()
	 * @generated
	 */
	void setMainLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Victims</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Victims</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Victims</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getCrimeScript_Victims()
	 * @model
	 * @generated
	 */
	EList<Actor> getVictims();

	/**
	 * Returns the value of the '<em><b>Offenders</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offenders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offenders</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getCrimeScript_Offenders()
	 * @model
	 * @generated
	 */
	EList<Actor> getOffenders();

	/**
	 * Returns the value of the '<em><b>Higher Level Script Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Higher Level Script Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Higher Level Script Name</em>' attribute.
	 * @see #setHigherLevelScriptName(String)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getCrimeScript_HigherLevelScriptName()
	 * @model
	 * @generated
	 */
	String getHigherLevelScriptName();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.CrimeScript#getHigherLevelScriptName <em>Higher Level Script Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Higher Level Script Name</em>' attribute.
	 * @see #getHigherLevelScriptName()
	 * @generated
	 */
	void setHigherLevelScriptName(String value);

} // CrimeScript
