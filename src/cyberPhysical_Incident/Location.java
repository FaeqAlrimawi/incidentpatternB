/**
 */
package cyberPhysical_Incident;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.Location#getConnections <em>Connections</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Location#getParentEntity <em>Parent Entity</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Location#getContainedEntities <em>Contained Entities</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Location#getConnectionsKnowledge <em>Connections Knowledge</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Location#getContainedAssetsKnowledge <em>Contained Assets Knowledge</em>}</li>
 * </ul>
 *
 * @see cyberPhysical_Incident.CyberPhysical_IncidentPackage#getLocation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysical_IncidentPackage#getLocation_Connections()
	 * @model
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * Returns the value of the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Entity</em>' reference.
	 * @see #setParentEntity(Location)
	 * @see cyberPhysical_Incident.CyberPhysical_IncidentPackage#getLocation_ParentEntity()
	 * @model
	 * @generated
	 */
	Location getParentEntity();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Location#getParentEntity <em>Parent Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Entity</em>' reference.
	 * @see #getParentEntity()
	 * @generated
	 */
	void setParentEntity(Location value);

	/**
	 * Returns the value of the '<em><b>Contained Entities</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Entities</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysical_IncidentPackage#getLocation_ContainedEntities()
	 * @model
	 * @generated
	 */
	EList<Location> getContainedEntities();

	/**
	 * Returns the value of the '<em><b>Connections Knowledge</b></em>' attribute.
	 * The literals are from the enumeration {@link cyberPhysical_Incident.Knowledge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections Knowledge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections Knowledge</em>' attribute.
	 * @see cyberPhysical_Incident.Knowledge
	 * @see #setConnectionsKnowledge(Knowledge)
	 * @see cyberPhysical_Incident.CyberPhysical_IncidentPackage#getLocation_ConnectionsKnowledge()
	 * @model
	 * @generated
	 */
	Knowledge getConnectionsKnowledge();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Location#getConnectionsKnowledge <em>Connections Knowledge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connections Knowledge</em>' attribute.
	 * @see cyberPhysical_Incident.Knowledge
	 * @see #getConnectionsKnowledge()
	 * @generated
	 */
	void setConnectionsKnowledge(Knowledge value);

	/**
	 * Returns the value of the '<em><b>Contained Assets Knowledge</b></em>' attribute.
	 * The literals are from the enumeration {@link cyberPhysical_Incident.Knowledge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Assets Knowledge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Assets Knowledge</em>' attribute.
	 * @see cyberPhysical_Incident.Knowledge
	 * @see #setContainedAssetsKnowledge(Knowledge)
	 * @see cyberPhysical_Incident.CyberPhysical_IncidentPackage#getLocation_ContainedAssetsKnowledge()
	 * @model
	 * @generated
	 */
	Knowledge getContainedAssetsKnowledge();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Location#getContainedAssetsKnowledge <em>Contained Assets Knowledge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained Assets Knowledge</em>' attribute.
	 * @see cyberPhysical_Incident.Knowledge
	 * @see #getContainedAssetsKnowledge()
	 * @generated
	 */
	void setContainedAssetsKnowledge(Knowledge value);

} // Location
