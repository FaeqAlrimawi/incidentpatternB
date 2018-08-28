/**
 */
package cyberPhysical_Incident;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.ActivityPattern#getName <em>Name</em>}</li>
 *   <li>{@link cyberPhysical_Incident.ActivityPattern#getSeverity <em>Severity</em>}</li>
 *   <li>{@link cyberPhysical_Incident.ActivityPattern#getAbstractactivity <em>Abstractactivity</em>}</li>
 *   <li>{@link cyberPhysical_Incident.ActivityPattern#getIncidententity <em>Incidententity</em>}</li>
 *   <li>{@link cyberPhysical_Incident.ActivityPattern#getPatternsFollow <em>Patterns Follow</em>}</li>
 *   <li>{@link cyberPhysical_Incident.ActivityPattern#getSkillsRequired <em>Skills Required</em>}</li>
 * </ul>
 *
 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivityPattern()
 * @model
 * @generated
 */
public interface ActivityPattern extends EObject {
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
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivityPattern_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.ActivityPattern#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link cyberPhysical_Incident.ActivityPatternSeverity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see cyberPhysical_Incident.ActivityPatternSeverity
	 * @see #setSeverity(ActivityPatternSeverity)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivityPattern_Severity()
	 * @model
	 * @generated
	 */
	ActivityPatternSeverity getSeverity();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.ActivityPattern#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see cyberPhysical_Incident.ActivityPatternSeverity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(ActivityPatternSeverity value);

	/**
	 * Returns the value of the '<em><b>Abstractactivity</b></em>' containment reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.AbstractActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstractactivity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstractactivity</em>' containment reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivityPattern_Abstractactivity()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractActivity> getAbstractactivity();

	/**
	 * Returns the value of the '<em><b>Incidententity</b></em>' containment reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.IncidentEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidententity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidententity</em>' containment reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivityPattern_Incidententity()
	 * @model containment="true"
	 * @generated
	 */
	EList<IncidentEntity> getIncidententity();

	/**
	 * Returns the value of the '<em><b>Patterns Follow</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.ActivityPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patterns Follow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns Follow</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivityPattern_PatternsFollow()
	 * @model
	 * @generated
	 */
	EList<ActivityPattern> getPatternsFollow();

	/**
	 * Returns the value of the '<em><b>Skills Required</b></em>' attribute.
	 * The literals are from the enumeration {@link cyberPhysical_Incident.Skill_Level}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skills Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills Required</em>' attribute.
	 * @see cyberPhysical_Incident.Skill_Level
	 * @see #setSkillsRequired(Skill_Level)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivityPattern_SkillsRequired()
	 * @model
	 * @generated
	 */
	Skill_Level getSkillsRequired();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.ActivityPattern#getSkillsRequired <em>Skills Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skills Required</em>' attribute.
	 * @see cyberPhysical_Incident.Skill_Level
	 * @see #getSkillsRequired()
	 * @generated
	 */
	void setSkillsRequired(Skill_Level value);

} // ActivityPattern
