/**
 */
package cyberPhysical_Incident;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.Connection#getName <em>Name</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Connection#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Connection#getEntity1 <em>Entity1</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Connection#getEntity2 <em>Entity2</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Connection#getConnectionProbability <em>Connection Probability</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Connection#getType <em>Type</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Connection#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Connection#getProperties <em>Properties</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Connection#getVulnerabilities <em>Vulnerabilities</em>}</li>
 * </ul>
 *
 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	
	public static final int CONNECTIONS_SAME = 0;
	public static final int CONNECTIONS_INCREASE = 1;
	public static final int CONNECTIONS_DECREASE = 2;
	public static final int CONNECTIONS_NULL = -1;
	public static final int CONNECTIONS_UNKNOWN = -2;
	
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
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getConnection_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Connection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getConnection_Constraints()
	 * @model
	 * @generated
	 */
	EList<String> getConstraints();

	/**
	 * Returns the value of the '<em><b>Entity1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity1</em>' reference.
	 * @see #setEntity1(Location)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getConnection_Entity1()
	 * @model
	 * @generated
	 */
	Location getEntity1();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Connection#getEntity1 <em>Entity1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity1</em>' reference.
	 * @see #getEntity1()
	 * @generated
	 */
	void setEntity1(Location value);

	/**
	 * Returns the value of the '<em><b>Entity2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity2</em>' reference.
	 * @see #setEntity2(Location)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getConnection_Entity2()
	 * @model
	 * @generated
	 */
	Location getEntity2();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Connection#getEntity2 <em>Entity2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity2</em>' reference.
	 * @see #getEntity2()
	 * @generated
	 */
	void setEntity2(Location value);

	/**
	 * Returns the value of the '<em><b>Connection Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Probability</em>' attribute.
	 * @see #setConnectionProbability(double)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getConnection_ConnectionProbability()
	 * @model
	 * @generated
	 */
	double getConnectionProbability();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Connection#getConnectionProbability <em>Connection Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Probability</em>' attribute.
	 * @see #getConnectionProbability()
	 * @generated
	 */
	void setConnectionProbability(double value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getConnection_Type()
	 * @model containment="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Connection#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bidirectional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bidirectional</em>' attribute.
	 * @see #setBidirectional(boolean)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getConnection_Bidirectional()
	 * @model
	 * @generated
	 */
	boolean isBidirectional();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Connection#isBidirectional <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bidirectional</em>' attribute.
	 * @see #isBidirectional()
	 * @generated
	 */
	void setBidirectional(boolean value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getConnection_Properties()
	 * @model
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Vulnerabilities</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Vulnerability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vulnerabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vulnerabilities</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getConnection_Vulnerabilities()
	 * @model
	 * @generated
	 */
	EList<Vulnerability> getVulnerabilities();

} // Connection
