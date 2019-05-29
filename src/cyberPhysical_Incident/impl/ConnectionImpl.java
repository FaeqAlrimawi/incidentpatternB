/**
 */
package cyberPhysical_Incident.impl;

import cyberPhysical_Incident.CyberPhysicalIncidentPackage;
import cyberPhysical_Incident.Connection;
import cyberPhysical_Incident.ConnectionState;
import cyberPhysical_Incident.Location;
import cyberPhysical_Incident.Property;
import cyberPhysical_Incident.Type;

import cyberPhysical_Incident.Vulnerability;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.impl.ConnectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ConnectionImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ConnectionImpl#getEntity1 <em>Entity1</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ConnectionImpl#getEntity2 <em>Entity2</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ConnectionImpl#getConnectionProbability <em>Connection Probability</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ConnectionImpl#getType <em>Type</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ConnectionImpl#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ConnectionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ConnectionImpl#getVulnerabilities <em>Vulnerabilities</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ConnectionImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> constraints;

	/**
	 * The cached value of the '{@link #getEntity1() <em>Entity1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity1()
	 * @generated
	 * @ordered
	 */
	protected Location entity1;

	/**
	 * The cached value of the '{@link #getEntity2() <em>Entity2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity2()
	 * @generated
	 * @ordered
	 */
	protected Location entity2;

	/**
	 * The default value of the '{@link #getConnectionProbability() <em>Connection Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double CONNECTION_PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getConnectionProbability() <em>Connection Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionProbability()
	 * @generated
	 * @ordered
	 */
	protected double connectionProbability = CONNECTION_PROBABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIDIRECTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected boolean bidirectional = BIDIRECTIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getVulnerabilities() <em>Vulnerabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVulnerabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Vulnerability> vulnerabilities;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectionState STATE_EDEFAULT = ConnectionState.TEMPORARY;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected ConnectionState state = STATE_EDEFAULT;

	protected static int connectionNumber = 1;
	protected static final long CONNECTION_NUMBER_LIMIT = Long.MAX_VALUE;
	protected static final long PORT_NUMBER_LIMIT = Long.MAX_VALUE;
	protected static String connectionName = "connection";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ConnectionImpl() {
		super();

		//set name to random if there's no name
		String currentName = getName();
		if(currentName == null || currentName.isEmpty()) {	
				String className = this.getClass().getName();
				String [] names = className.split("\\.");
				String cName = names[names.length-1].replace("Impl", "");
				String name = cName + connectionNumber++;
				char c[] = name.toCharArray();
				c[0] = Character.toLowerCase(c[0]);
				name = new String(c);
				setName(name);
		}
		
		//create empty type
		Type tp = new TypeImpl();
		
		setType(tp);
		
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalIncidentPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.CONNECTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConstraints() {
		if (constraints == null) {
			constraints = new EDataTypeUniqueEList<String>(String.class, this, CyberPhysicalIncidentPackage.CONNECTION__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getEntity1() {
		if (entity1 != null && entity1.eIsProxy()) {
			InternalEObject oldEntity1 = (InternalEObject)entity1;
			entity1 = (Location)eResolveProxy(oldEntity1);
			if (entity1 != oldEntity1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CyberPhysicalIncidentPackage.CONNECTION__ENTITY1, oldEntity1, entity1));
			}
		}
		return entity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetEntity1() {
		return entity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setEntity1(Location newEntity1) {
		Location oldEntity1 = entity1;
		entity1 = newEntity1;
	
/*		//update asset1 with the connection
				if(entity1 != null) {
					EList<Connection> connections = entity1.getConnections();
//					
//					if(!isContainedIn((Collection<Connection>)connections)) {
						connections.add(this);
				//		removeConnectionDuplicates(connections);
//					}
				}
				
				
				//remove connection from old asset
				if(oldEntity1 != null) {
					oldEntity1.getConnections().remove(this);
				}*/
				
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.CONNECTION__ENTITY1, oldEntity1, entity1));
			
	}
/*
	private void removeConnectionDuplicates(Collection<Connection> connections) {

		
		HashMap<String, Connection> newConnections = new HashMap<String, Connection>();
		
		for(Connection con : connections) {
			System.out.println(con.getName());
			newConnections.put(con.getName(), con);
		}
		
		System.out.println("end");
		
		connections.clear();
		
		for(Connection con : newConnections.values()) {
			connections.add(con);
		}
	}*/
	
	/*private boolean isContainedIn(Collection<Connection> connections) {
		
		for(Connection con : connections) {
			if(this.getName() != null) {
				if(this.getName().equalsIgnoreCase(con.getName())) {
					return true;
				}
			}
			
		}
		
		return false;
	}
*/
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getEntity2() {
		if (entity2 != null && entity2.eIsProxy()) {
			InternalEObject oldEntity2 = (InternalEObject)entity2;
			entity2 = (Location)eResolveProxy(oldEntity2);
			if (entity2 != oldEntity2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CyberPhysicalIncidentPackage.CONNECTION__ENTITY2, oldEntity2, entity2));
			}
		}
		return entity2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetEntity2() {
		return entity2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->

	 */
	public void setEntity2(Location newEntity2) {
		Location oldEntity2 = entity2;
		entity2 = newEntity2;
		
	/*	//update asset1 with the connection
		if(entity2 != null) {
			EList<Connection> connections = entity2.getConnections();
			
//			if(!isContainedIn((Collection<Connection>)connections)) {
				connections.add(this);
			//	removeConnectionDuplicates(connections);
//			}
		}

		//remove connection from old asset
		if(oldEntity2 != null) {
			oldEntity2.getConnections().remove(this);
		}*/
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.CONNECTION__ENTITY2, oldEntity2, entity2));
	
	}

	@Override
	public boolean equals(Object obj) {
		
	    if (obj == null) {
	        return false;
	    }
	    if (!Connection.class.isAssignableFrom(obj.getClass())) {
	        return false;
	    }
	    
	    final Connection other = (Connection) obj;
	    
	    if(this == obj) {
	    	return true;
	    }
	    
	    if(this.getName() == null) {
	    	return false;
	    }
	    
	    if(this.getName().equals(other.getName())) {
	    	return true;
	    }
	    
	    return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getConnectionProbability() {
		return connectionProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionProbability(double newConnectionProbability) {
		double oldConnectionProbability = connectionProbability;
		connectionProbability = newConnectionProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.CONNECTION__CONNECTION_PROBABILITY, oldConnectionProbability, connectionProbability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.CONNECTION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.CONNECTION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.CONNECTION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.CONNECTION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBidirectional() {
		return bidirectional;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBidirectional(boolean newBidirectional) {
		boolean oldBidirectional = bidirectional;
		bidirectional = newBidirectional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.CONNECTION__BIDIRECTIONAL, oldBidirectional, bidirectional));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectResolvingEList<Property>(Property.class, this, CyberPhysicalIncidentPackage.CONNECTION__PROPERTIES);
		}
		return properties;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vulnerability> getVulnerabilities() {
		if (vulnerabilities == null) {
			vulnerabilities = new EObjectResolvingEList<Vulnerability>(Vulnerability.class, this, CyberPhysicalIncidentPackage.CONNECTION__VULNERABILITIES);
		}
		return vulnerabilities;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionState getState() {
		return state;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(ConnectionState newState) {
		ConnectionState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.CONNECTION__STATE, oldState, state));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.CONNECTION__TYPE:
				return basicSetType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.CONNECTION__NAME:
				return getName();
			case CyberPhysicalIncidentPackage.CONNECTION__CONSTRAINTS:
				return getConstraints();
			case CyberPhysicalIncidentPackage.CONNECTION__ENTITY1:
				if (resolve) return getEntity1();
				return basicGetEntity1();
			case CyberPhysicalIncidentPackage.CONNECTION__ENTITY2:
				if (resolve) return getEntity2();
				return basicGetEntity2();
			case CyberPhysicalIncidentPackage.CONNECTION__CONNECTION_PROBABILITY:
				return getConnectionProbability();
			case CyberPhysicalIncidentPackage.CONNECTION__TYPE:
				return getType();
			case CyberPhysicalIncidentPackage.CONNECTION__BIDIRECTIONAL:
				return isBidirectional();
			case CyberPhysicalIncidentPackage.CONNECTION__PROPERTIES:
				return getProperties();
			case CyberPhysicalIncidentPackage.CONNECTION__VULNERABILITIES:
				return getVulnerabilities();
			case CyberPhysicalIncidentPackage.CONNECTION__STATE:
				return getState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.CONNECTION__NAME:
				setName((String)newValue);
				return;
			case CyberPhysicalIncidentPackage.CONNECTION__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends String>)newValue);
				return;
			case CyberPhysicalIncidentPackage.CONNECTION__ENTITY1:
				setEntity1((Location)newValue);
				return;
			case CyberPhysicalIncidentPackage.CONNECTION__ENTITY2:
				setEntity2((Location)newValue);
				return;
			case CyberPhysicalIncidentPackage.CONNECTION__CONNECTION_PROBABILITY:
				setConnectionProbability((Double)newValue);
				return;
			case CyberPhysicalIncidentPackage.CONNECTION__TYPE:
				setType((Type)newValue);
				return;
			case CyberPhysicalIncidentPackage.CONNECTION__BIDIRECTIONAL:
				setBidirectional((Boolean)newValue);
				return;
			case CyberPhysicalIncidentPackage.CONNECTION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case CyberPhysicalIncidentPackage.CONNECTION__VULNERABILITIES:
				getVulnerabilities().clear();
				getVulnerabilities().addAll((Collection<? extends Vulnerability>)newValue);
				return;
			case CyberPhysicalIncidentPackage.CONNECTION__STATE:
				setState((ConnectionState)newValue);
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
			case CyberPhysicalIncidentPackage.CONNECTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.CONNECTION__CONSTRAINTS:
				getConstraints().clear();
				return;
			case CyberPhysicalIncidentPackage.CONNECTION__ENTITY1:
				setEntity1((Location)null);
				return;
			case CyberPhysicalIncidentPackage.CONNECTION__ENTITY2:
				setEntity2((Location)null);
				return;
			case CyberPhysicalIncidentPackage.CONNECTION__CONNECTION_PROBABILITY:
				setConnectionProbability(CONNECTION_PROBABILITY_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.CONNECTION__TYPE:
				setType((Type)null);
				return;
			case CyberPhysicalIncidentPackage.CONNECTION__BIDIRECTIONAL:
				setBidirectional(BIDIRECTIONAL_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.CONNECTION__PROPERTIES:
				getProperties().clear();
				return;
			case CyberPhysicalIncidentPackage.CONNECTION__VULNERABILITIES:
				getVulnerabilities().clear();
				return;
			case CyberPhysicalIncidentPackage.CONNECTION__STATE:
				setState(STATE_EDEFAULT);
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
			case CyberPhysicalIncidentPackage.CONNECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CyberPhysicalIncidentPackage.CONNECTION__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case CyberPhysicalIncidentPackage.CONNECTION__ENTITY1:
				return entity1 != null;
			case CyberPhysicalIncidentPackage.CONNECTION__ENTITY2:
				return entity2 != null;
			case CyberPhysicalIncidentPackage.CONNECTION__CONNECTION_PROBABILITY:
				return connectionProbability != CONNECTION_PROBABILITY_EDEFAULT;
			case CyberPhysicalIncidentPackage.CONNECTION__TYPE:
				return type != null;
			case CyberPhysicalIncidentPackage.CONNECTION__BIDIRECTIONAL:
				return bidirectional != BIDIRECTIONAL_EDEFAULT;
			case CyberPhysicalIncidentPackage.CONNECTION__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case CyberPhysicalIncidentPackage.CONNECTION__VULNERABILITIES:
				return vulnerabilities != null && !vulnerabilities.isEmpty();
			case CyberPhysicalIncidentPackage.CONNECTION__STATE:
				return state != STATE_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", constraints: ");
		result.append(constraints);
		result.append(", connectionProbability: ");
		result.append(connectionProbability);
		result.append(", bidirectional: ");
		result.append(bidirectional);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
