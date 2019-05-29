/**
 */
package cyberPhysical_Incident.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import cyberPhysical_Incident.Connection;
import cyberPhysical_Incident.CyberPhysicalIncidentPackage;
import cyberPhysical_Incident.IncidentEntity;
import cyberPhysical_Incident.Knowledge;
import cyberPhysical_Incident.Location;
import cyberPhysical_Incident.Mobility;
import cyberPhysical_Incident.Property;
import cyberPhysical_Incident.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incident Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentEntityImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentEntityImpl#getParentEntity <em>Parent Entity</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentEntityImpl#getContainedEntities <em>Contained Entities</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentEntityImpl#getConnectionsKnowledge <em>Connections Knowledge</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentEntityImpl#getContainedAssetsKnowledge <em>Contained Assets Knowledge</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentEntityImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentEntityImpl#getType <em>Type</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentEntityImpl#getMobility <em>Mobility</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncidentEntityImpl extends MinimalEObjectImpl.Container implements IncidentEntity {
	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * The cached value of the '{@link #getParentEntity() <em>Parent Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentEntity()
	 * @generated
	 * @ordered
	 */
	protected Location parentEntity;

	/**
	 * The cached value of the '{@link #getContainedEntities() <em>Contained Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> containedEntities;

	/**
	 * The default value of the '{@link #getConnectionsKnowledge() <em>Connections Knowledge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionsKnowledge()
	 * @generated
	 * @ordered
	 */
	protected static final Knowledge CONNECTIONS_KNOWLEDGE_EDEFAULT = Knowledge.PARTIAL;

	/**
	 * The cached value of the '{@link #getConnectionsKnowledge() <em>Connections Knowledge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionsKnowledge()
	 * @generated
	 * @ordered
	 */
	protected Knowledge connectionsKnowledge = CONNECTIONS_KNOWLEDGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainedAssetsKnowledge() <em>Contained Assets Knowledge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedAssetsKnowledge()
	 * @generated
	 * @ordered
	 */
	protected static final Knowledge CONTAINED_ASSETS_KNOWLEDGE_EDEFAULT = Knowledge.PARTIAL;

	/**
	 * The cached value of the '{@link #getContainedAssetsKnowledge() <em>Contained Assets Knowledge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedAssetsKnowledge()
	 * @generated
	 * @ordered
	 */
	protected Knowledge containedAssetsKnowledge = CONTAINED_ASSETS_KNOWLEDGE_EDEFAULT;

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
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

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
	 * The default value of the '{@link #getMobility() <em>Mobility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobility()
	 * @generated
	 * @ordered
	 */
	protected static final Mobility MOBILITY_EDEFAULT = Mobility.MOVABLE;

	/**
	 * The cached value of the '{@link #getMobility() <em>Mobility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobility()
	 * @generated
	 * @ordered
	 */
	protected Mobility mobility = MOBILITY_EDEFAULT;

	protected static int entityNumber = 1;
	protected static final long ENTITY_NUMBER_LIMIT = Long.MAX_VALUE;
	protected static String entityName = "asset";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected IncidentEntityImpl() {
		super();
		
		String className = this.getClass().getName();
		String [] names = className.split("\\.");
		String cName = names[names.length-1].replace("Impl", "");
		
		//give default name to the entity if there's no name
		String currentName = getName();
		
		//create an empty type
		Type typeLocal = new TypeImpl();
		
		setType(typeLocal);
		
		if(currentName == null || currentName.isEmpty()) {
				String name = cName+ entityNumber++;
				char c[] = name.toCharArray();
				c[0] = Character.toLowerCase(c[0]);
				name = new String(c);
				setName(name);
			}
		
		
	}

	@Override
	public boolean equals(Object obj) {
		
	    if (obj == null) {
	        return false;
	    }
	    if (!IncidentEntity.class.isAssignableFrom(obj.getClass())) {
	        return false;
	    }
	    
	    final IncidentEntity other = (IncidentEntity) obj;
	    
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
	 *
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalIncidentPackage.Literals.INCIDENT_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectResolvingEList<Connection>(Connection.class, this, CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getParentEntity() {
		if (parentEntity != null && parentEntity.eIsProxy()) {
			InternalEObject oldParentEntity = (InternalEObject)parentEntity;
			parentEntity = (Location)eResolveProxy(oldParentEntity);
			if (parentEntity != oldParentEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CyberPhysicalIncidentPackage.INCIDENT_ENTITY__PARENT_ENTITY, oldParentEntity, parentEntity));
			}
		}
		return parentEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetParentEntity() {
		return parentEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setParentEntity(Location newParentEntity) {
		Location oldParentEntity = parentEntity;
		parentEntity = newParentEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.INCIDENT_ENTITY__PARENT_ENTITY, oldParentEntity, parentEntity));
	
	/*	//add this object as a child to the parent as well and remove from old parent if any
		if(newParentEntity != null) {
			newParentEntity.getContainedEntities().add(this);
//			removeDuplicates(newParentEntity.getContainedEntities());
		}
	
		//remove this from old parent
		if(oldParentEntity != null) {
			oldParentEntity.getContainedEntities().remove(this);
			//removeDuplicates(oldParentEntity.getContainedEntities());
		}
		*/
	}

	/*private void removeDuplicates(Collection<Location> entities) {

		System.out.println("remove duplicate\nbefore:"+getEntityNames(entities));
		Set<Location> hs = new HashSet<Location>();
		hs.addAll(entities);
		entities.clear();
		entities.addAll(hs);
		
		System.out.println("after:"+getEntityNames(entities));
	}
	
	private String getEntityNames(Collection<Location> entities) {
		
		StringBuilder str = new StringBuilder();
		str.append("[");
		for(Location  entity : entities) {
			IncidentEntity ent = (IncidentEntity) entity;
			str.append(ent.getName()).append(", ");
		}
		str.append("]");
		
		return str.toString();
	}*/
	
	public boolean contains(String entityName) {
		
		if(entityName == null) {
			return false;
		}
		
		for(Location loc : getContainedEntities()) {
			IncidentEntity entity = (IncidentEntity)loc;
			String name = entity.getName();
			if(name != null && name.equals(entityName)) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 */
	public EList<Location> getContainedEntities() {
		if (containedEntities == null) {
			
			containedEntities = new EObjectResolvingEList<Location>(Location.class, this, CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONTAINED_ENTITIES);
		}
		
//		removeDuplicates(containedEntities);
		return containedEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knowledge getConnectionsKnowledge() {
		return connectionsKnowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionsKnowledge(Knowledge newConnectionsKnowledge) {
		Knowledge oldConnectionsKnowledge = connectionsKnowledge;
		connectionsKnowledge = newConnectionsKnowledge == null ? CONNECTIONS_KNOWLEDGE_EDEFAULT : newConnectionsKnowledge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONNECTIONS_KNOWLEDGE, oldConnectionsKnowledge, connectionsKnowledge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knowledge getContainedAssetsKnowledge() {
		return containedAssetsKnowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainedAssetsKnowledge(Knowledge newContainedAssetsKnowledge) {
		Knowledge oldContainedAssetsKnowledge = containedAssetsKnowledge;
		containedAssetsKnowledge = newContainedAssetsKnowledge == null ? CONTAINED_ASSETS_KNOWLEDGE_EDEFAULT : newContainedAssetsKnowledge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONTAINED_ASSETS_KNOWLEDGE, oldContainedAssetsKnowledge, containedAssetsKnowledge));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.INCIDENT_ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, CyberPhysicalIncidentPackage.INCIDENT_ENTITY__PROPERTIES);
		}
		return properties;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.INCIDENT_ENTITY__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.INCIDENT_ENTITY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.INCIDENT_ENTITY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.INCIDENT_ENTITY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mobility getMobility() {
		return mobility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobility(Mobility newMobility) {
		Mobility oldMobility = mobility;
		mobility = newMobility == null ? MOBILITY_EDEFAULT : newMobility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.INCIDENT_ENTITY__MOBILITY, oldMobility, mobility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__TYPE:
				return basicSetType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}
	
	/*private void removeConnectionDuplicates(Collection<Connection> connections) {

		Set<Connection> hs = new HashSet<Connection>();
		hs.addAll(connections);
		
		eSet(CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONNECTIONS, connections);		
	}*/

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONNECTIONS:
				return getConnections();
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__PARENT_ENTITY:
				if (resolve) return getParentEntity();
				return basicGetParentEntity();
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONTAINED_ENTITIES:
				return getContainedEntities();
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONNECTIONS_KNOWLEDGE:
				return getConnectionsKnowledge();
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONTAINED_ASSETS_KNOWLEDGE:
				return getContainedAssetsKnowledge();
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__NAME:
				return getName();
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__PROPERTIES:
				return getProperties();
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__TYPE:
				return getType();
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__MOBILITY:
				return getMobility();
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
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__PARENT_ENTITY:
				setParentEntity((Location)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONTAINED_ENTITIES:
				getContainedEntities().clear();
				getContainedEntities().addAll((Collection<? extends Location>)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONNECTIONS_KNOWLEDGE:
				setConnectionsKnowledge((Knowledge)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONTAINED_ASSETS_KNOWLEDGE:
				setContainedAssetsKnowledge((Knowledge)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__NAME:
				setName((String)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__TYPE:
				setType((Type)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__MOBILITY:
				setMobility((Mobility)newValue);
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
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONNECTIONS:
				getConnections().clear();
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__PARENT_ENTITY:
				setParentEntity((Location)null);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONTAINED_ENTITIES:
				getContainedEntities().clear();
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONNECTIONS_KNOWLEDGE:
				setConnectionsKnowledge(CONNECTIONS_KNOWLEDGE_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONTAINED_ASSETS_KNOWLEDGE:
				setContainedAssetsKnowledge(CONTAINED_ASSETS_KNOWLEDGE_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__PROPERTIES:
				getProperties().clear();
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__TYPE:
				setType((Type)null);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__MOBILITY:
				setMobility(MOBILITY_EDEFAULT);
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
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__PARENT_ENTITY:
				return parentEntity != null;
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONTAINED_ENTITIES:
				return containedEntities != null && !containedEntities.isEmpty();
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONNECTIONS_KNOWLEDGE:
				return connectionsKnowledge != CONNECTIONS_KNOWLEDGE_EDEFAULT;
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONTAINED_ASSETS_KNOWLEDGE:
				return containedAssetsKnowledge != CONTAINED_ASSETS_KNOWLEDGE_EDEFAULT;
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__TYPE:
				return type != null;
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__MOBILITY:
				return mobility != MOBILITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Location.class) {
			switch (derivedFeatureID) {
				case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONNECTIONS: return CyberPhysicalIncidentPackage.LOCATION__CONNECTIONS;
				case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__PARENT_ENTITY: return CyberPhysicalIncidentPackage.LOCATION__PARENT_ENTITY;
				case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONTAINED_ENTITIES: return CyberPhysicalIncidentPackage.LOCATION__CONTAINED_ENTITIES;
				case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONNECTIONS_KNOWLEDGE: return CyberPhysicalIncidentPackage.LOCATION__CONNECTIONS_KNOWLEDGE;
				case CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONTAINED_ASSETS_KNOWLEDGE: return CyberPhysicalIncidentPackage.LOCATION__CONTAINED_ASSETS_KNOWLEDGE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Location.class) {
			switch (baseFeatureID) {
				case CyberPhysicalIncidentPackage.LOCATION__CONNECTIONS: return CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONNECTIONS;
				case CyberPhysicalIncidentPackage.LOCATION__PARENT_ENTITY: return CyberPhysicalIncidentPackage.INCIDENT_ENTITY__PARENT_ENTITY;
				case CyberPhysicalIncidentPackage.LOCATION__CONTAINED_ENTITIES: return CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONTAINED_ENTITIES;
				case CyberPhysicalIncidentPackage.LOCATION__CONNECTIONS_KNOWLEDGE: return CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONNECTIONS_KNOWLEDGE;
				case CyberPhysicalIncidentPackage.LOCATION__CONTAINED_ASSETS_KNOWLEDGE: return CyberPhysicalIncidentPackage.INCIDENT_ENTITY__CONTAINED_ASSETS_KNOWLEDGE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (connectionsKnowledge: ");
		result.append(connectionsKnowledge);
		result.append(", containedAssetsKnowledge: ");
		result.append(containedAssetsKnowledge);
		result.append(", name: ");
		result.append(name);
		result.append(", mobility: ");
		result.append(mobility);
		result.append(')');
		return result.toString();
	}

} //IncidentEntityImpl
