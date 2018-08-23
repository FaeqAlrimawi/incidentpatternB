/**
 */
package cyberPhysical_Incident.impl;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import cyberPhysical_Incident.Activity;
import cyberPhysical_Incident.ActivityInitiator;
import cyberPhysical_Incident.ActivityType;
import cyberPhysical_Incident.Actor;
import cyberPhysical_Incident.Asset;
import cyberPhysical_Incident.Behaviour;
import cyberPhysical_Incident.BigraphExpression;
import cyberPhysical_Incident.Condition;
import cyberPhysical_Incident.Connection;
import cyberPhysical_Incident.Connectivity;
import cyberPhysical_Incident.CyberPhysicalIncidentFactory;
import cyberPhysical_Incident.CyberPhysicalIncidentPackage;
import cyberPhysical_Incident.Entity;
import cyberPhysical_Incident.Expression;
import cyberPhysical_Incident.Goal;
import cyberPhysical_Incident.IncidentEntity;
import cyberPhysical_Incident.Location;
import cyberPhysical_Incident.Path;
import cyberPhysical_Incident.Postcondition;
import cyberPhysical_Incident.Precondition;
import cyberPhysical_Incident.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getFacilitatingConditions <em>Facilitating Conditions</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getCertainty <em>Certainty</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getNextActivities <em>Next Activities</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getPreviousActivities <em>Previous Activities</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getPaths <em>Paths</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getAccomplices <em>Accomplices</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getVictims <em>Victims</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getTargetedAssets <em>Targeted Assets</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getExploitedAssets <em>Exploited Assets</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getType <em>Type</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getBehaviourType <em>Behaviour Type</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getSystemAction <em>System Action</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityImpl#getPostcondition <em>Postcondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
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
	 * The cached value of the '{@link #getFacilitatingConditions() <em>Facilitating Conditions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitatingConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> facilitatingConditions;

	/**
	 * The default value of the '{@link #getCertainty() <em>Certainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertainty()
	 * @generated
	 * @ordered
	 */
	protected static final double CERTAINTY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCertainty() <em>Certainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertainty()
	 * @generated
	 * @ordered
	 */
	protected double certainty = CERTAINTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date startTime = START_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNextActivities() <em>Next Activities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> nextActivities;

	/**
	 * The cached value of the '{@link #getPreviousActivities() <em>Previous Activities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> previousActivities;

	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<Path> paths;

	/**
	 * The cached value of the '{@link #getGoals() <em>Goals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goals;

	/**
	 * The cached value of the '{@link #getInitiator() <em>Initiator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiator()
	 * @generated
	 * @ordered
	 */
	protected ActivityInitiator initiator;

	/**
	 * The cached value of the '{@link #getAccomplices() <em>Accomplices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccomplices()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> accomplices;

	/**
	 * The cached value of the '{@link #getVictims() <em>Victims</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictims()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> victims;

	/**
	 * The cached value of the '{@link #getTargetedAssets() <em>Targeted Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetedAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> targetedAssets;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected Date endTime = END_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The cached value of the '{@link #getExploitedAssets() <em>Exploited Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExploitedAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> exploitedAssets;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ActivityType TYPE_EDEFAULT = ActivityType.PHYSICAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ActivityType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBehaviourType() <em>Behaviour Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviourType()
	 * @generated
	 * @ordered
	 */
	protected static final Behaviour BEHAVIOUR_TYPE_EDEFAULT = Behaviour.NORMAL;

	/**
	 * The cached value of the '{@link #getBehaviourType() <em>Behaviour Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviourType()
	 * @generated
	 * @ordered
	 */
	protected Behaviour behaviourType = BEHAVIOUR_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected Precondition precondition;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemAction() <em>System Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemAction()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemAction() <em>System Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemAction()
	 * @generated
	 * @ordered
	 */
	protected String systemAction = SYSTEM_ACTION_EDEFAULT;
	
	
	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected Postcondition postcondition;
	protected CyberPhysicalIncidentFactory instance = CyberPhysicalIncidentFactory.eINSTANCE;
	protected static int activityNumber = 12;
	protected String activityName = "act_";
	protected final long MAXIMUM_NUMBER = Long.MAX_VALUE;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	protected ActivityImpl() {
		super();
		
		String name = activityName+activityNumber;
		
		activityNumber++;
		
		if((MAXIMUM_NUMBER-activityNumber) < 100) {
			activityNumber = 1;
		}
		
		setName(name);
	}
	
	protected ActivityImpl(Activity act) {
		
		setName(act.getName());
		setDescription(act.getDescription());
		setBehaviourType(act.getBehaviourType());
		setCertainty(act.getCertainty());
		setDuration(act.getDuration());
		setEndTime(act.getEndTime());
		setInitiator(act.getInitiator());
		setLocation(act.getLocation());
		setPostcondition(act.getPostcondition());
		setPrecondition(act.getPrecondition());
		setStartTime(act.getStartTime());
		setSystemAction(act.getSystemAction());
		setType(act.getType());
		getNextActivities().addAll(act.getNextActivities());
		getPreviousActivities().addAll(act.getPreviousActivities());
		getAccomplices().addAll(act.getAccomplices());
		getExploitedAssets().addAll(act.getExploitedAssets());
		getFacilitatingConditions().addAll(act.getFacilitatingConditions());
		getGoals().addAll(act.getGoals());
		getPaths().addAll(act.getPaths());
		getResources().addAll(act.getResources());
		getTargetedAssets().addAll(act.getTargetedAssets());
		getVictims().addAll(act.getVictims());
		
	}
	
	/**
	 * This methods checks whether the given source entity contains the target entity. If so, it returns true. Otherwise, it returns false
	 */
/*	public boolean sourceEntityContainsTargetEntity(IncidentEntity sourceEntity, IncidentEntity targetEntity) {
		
		Expression exp = this.getPrecondition().getExpression();
		BigraphExpression preBigraph  = null;
		
		if(BigraphExpression.class.isAssignableFrom(exp.getClass())) {
			preBigraph = (BigraphExpression)this.getPrecondition().getExpression();	
		}
		
		return true;
	}*/
	
	
	
	/**
	 * this method determines if the activity intiator changes its contained entity from the precondition to the postcondition
	 */
	public boolean isInitiatorMoved() {
		
		//check if the contained entity of the initiator in the precondition is different from it in the postcondition
		//if so, then return true. otherwise false
		String postContainer = "";
		String preContainer = "";
		

		preContainer = getInitiatorContainer(BigraphExpression.PRECONDITION_EXPRESSION);
		postContainer = getInitiatorContainer(BigraphExpression.POSTCONDITION_EXPRESSION);
		
		//the initiator is not contained in the conditions
		if(preContainer == null || postContainer == null) {
			return false;
		}
		
		if(preContainer.equals(postContainer)) {
			return false;
		}
		
		return true;
	}
	
	public String getInitiatorContainer(int expressionType) {

		String container = null;
		Expression preExp = null; 
		BigraphExpression preBigraph  = null;
		Expression postExp = null;
		BigraphExpression postBigraph  = null;
		IncidentEntity initiator = (IncidentEntity) this.getInitiator();
		String initiatorName = null; 
		
		if(initiator == null) {
			return null;
		}
		
		initiatorName = initiator.getName();
		
		if(this.getPrecondition() == null) {
			preExp = null;
		} else {
			preExp = this.getPrecondition().getExpression();
		}
		
		if(this.getPostcondition() == null) {
			postExp = null;
		} else {
			postExp = this.getPostcondition().getExpression();
		}
		
		if(preExp != null && BigraphExpression.class.isAssignableFrom(preExp.getClass())) {
			preBigraph = (BigraphExpression)this.getPrecondition().getExpression();	
		}
		
		if(postExp != null && BigraphExpression.class.isAssignableFrom(postExp.getClass())) {
			postBigraph = (BigraphExpression)this.getPostcondition().getExpression();	
		}

		if(expressionType == BigraphExpression.PRECONDITION_EXPRESSION) {
			if(preBigraph == null) {
				return null;
			}
			container = preBigraph.getContainer(initiatorName);
			
		} else if(expressionType == BigraphExpression.POSTCONDITION_EXPRESSION) {
			if(postBigraph == null) {
				return null;
			}
			container = postBigraph.getContainer(initiatorName);
			
		}
		
		return container;
	}
	
	public List<String> getInitiatorContainedEntities(int expressionType) {
		
		List<Entity> containedEntities = null;
		List<String> containedEntitiesNames = null;
		Condition condition = null;
		String initiatorName;
		
		if(expressionType == BigraphExpression.PRECONDITION_EXPRESSION) {
			condition = this.getPrecondition();
			//System.out.println(this.getPostcondition());
		} else if(expressionType == BigraphExpression.POSTCONDITION_EXPRESSION) {
			condition = this.getPostcondition();
		}
		
		//checks if there is no condition
		if(condition == null) {
			return null;
		}
		
		//checks if there is no initiator for the activity
		if(this.getInitiator() == null) {
			
			return null;
		}
		
		initiatorName = ((IncidentEntity)this.getInitiator()).getName();
		
		if(initiatorName == null || initiatorName.isEmpty()) {
			
			return null;
		}
		
		
		containedEntities = ((BigraphExpression)condition.getExpression()).getContainedEntities(initiatorName);
		
		if(containedEntities == null) {
			
			return null;
		}
		
		
		containedEntitiesNames = new LinkedList<String>();
		
		for(Entity ent : containedEntities) {
			containedEntitiesNames.add(ent.getName());
		}
		
		return containedEntitiesNames;
	}
	
	public int getConnectionChangesBetweenEntities(String entity1, String entity2) {
	
		int result = 0; //0: no change, 1: increase from pre to post, -1: decrease from pre to post, -2: both nulls
		
		List<Connectivity> preConnections = ((BigraphExpression)getPrecondition().getExpression()).getConnections(entity1, entity2);
		List<Connectivity> postConnections = ((BigraphExpression)getPostcondition().getExpression()).getConnections(entity1, entity2);

		if(preConnections == null || postConnections == null) {
			return Connection.CONNECTIONS_NULL;
		}
		
		if(preConnections == null && postConnections != null
				|| preConnections.size() < postConnections.size()) {
			return Connection.CONNECTIONS_INCREASE;
		}
		
		if(preConnections != null && postConnections == null
				|| preConnections.size() > postConnections.size()) {
			return Connection.CONNECTIONS_DECREASE;
		}
		
		if(preConnections.size() == postConnections.size()) {
			return Connection.CONNECTIONS_SAME;
		}
		
		return Connection.CONNECTIONS_UNKNOWN;
	}
	
	public List<String> getInitiatorContainedEntities() {
		
		List<String> containedEntitiesNames = null;
		List<String> preContainedEntitiesNames = null;
		List<String> postContainedEntitiesNames = null;
		
		preContainedEntitiesNames = getInitiatorContainedEntities(BigraphExpression.PRECONDITION_EXPRESSION);
		postContainedEntitiesNames = getInitiatorContainedEntities(BigraphExpression.POSTCONDITION_EXPRESSION);
		
		containedEntitiesNames = new LinkedList<String>(preContainedEntitiesNames);

		containedEntitiesNames.retainAll(postContainedEntitiesNames);
		
		return containedEntitiesNames;
	}
	/**
	 * Determines if the connections of the given entity name change from the pre to the post condition
	 * @param entityName the entity name
	 * @return 0 if there is no change. 1 if the connections number increase from pre to post. 2 if the connections number decrease. -1 if there is an error
	 */
	public int connectionsChanged(String entityName) {
		
		Entity preEntity = ((BigraphExpression)this.getPrecondition().getExpression()).getEntity(entityName);
		Entity postEntity = ((BigraphExpression)this.getPostcondition().getExpression()).getEntity(entityName);
		
		//if both are null then they don't exist in the conditions
		if(preEntity == null && postEntity == null) {
			return Connection.CONNECTIONS_NULL;
		}
		
		//if the entity in the pre does not exist but it exists in the post and it has connections then the connections are increased
		if(preEntity == null && postEntity != null) {
			if(!postEntity.getConnectivity().isEmpty()) {
				return Connection.CONNECTIONS_INCREASE;
			}
		}
		
		//if the entity in the pre exists and it has connections but it does snot exist in the post then the connections are decreased
		if(preEntity != null && postEntity == null) {
			if(!preEntity.getConnectivity().isEmpty()) {
				return Connection.CONNECTIONS_DECREASE;
			}
		}
		
		int preSize = preEntity.getConnectivity().size();
		int postSize = postEntity.getConnectivity().size();
		
		if(preSize < postSize) {
			return Connection.CONNECTIONS_INCREASE;
		} 
		
		if(preSize > postSize) {
			return Connection.CONNECTIONS_DECREASE;
		}
		
		if(preSize == postSize) {
			return Connection.CONNECTIONS_SAME;
		}
		
		return Connection.CONNECTIONS_UNKNOWN;
	}
	
	@Override
	public boolean equals(Object obj) {
		
	    if (obj == null) {
	        return false;
	    }
	    if (!Activity.class.isAssignableFrom(obj.getClass())) {
	        return false;
	    }
	    
	    final Activity other = (Activity) obj;
	    
	    if(this == other) {
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
	

	/*protected void print(String msg) {
		
		if(!isDebug) {
			return;
		}
		
		System.out.println("IncidentDiagram: "+msg);
	}*/

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalIncidentPackage.Literals.ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFacilitatingConditions() {
		if (facilitatingConditions == null) {
			facilitatingConditions = new EDataTypeUniqueEList<String>(String.class, this, CyberPhysicalIncidentPackage.ACTIVITY__FACILITATING_CONDITIONS);
		}
		return facilitatingConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCertainty() {
		return certainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertainty(double newCertainty) {
		double oldCertainty = certainty;
		certainty = newCertainty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ACTIVITY__CERTAINTY, oldCertainty, certainty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ACTIVITY__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(Date newStartTime) {
		Date oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ACTIVITY__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getNextActivities() {
		if (nextActivities == null) {
			nextActivities = new EObjectResolvingEList<Activity>(Activity.class, this, CyberPhysicalIncidentPackage.ACTIVITY__NEXT_ACTIVITIES);
		}
		return nextActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getPreviousActivities() {
		if (previousActivities == null) {
			previousActivities = new EObjectResolvingEList<Activity>(Activity.class, this, CyberPhysicalIncidentPackage.ACTIVITY__PREVIOUS_ACTIVITIES);
		}
		return previousActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Path> getPaths() {
		if (paths == null) {
			paths = new EObjectResolvingEList<Path>(Path.class, this, CyberPhysicalIncidentPackage.ACTIVITY__PATHS);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getGoals() {
		if (goals == null) {
			goals = new EObjectResolvingEList<Goal>(Goal.class, this, CyberPhysicalIncidentPackage.ACTIVITY__GOALS);
		}
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityInitiator getInitiator() {
		if (initiator != null && initiator.eIsProxy()) {
			InternalEObject oldInitiator = (InternalEObject)initiator;
			initiator = (ActivityInitiator)eResolveProxy(oldInitiator);
			if (initiator != oldInitiator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CyberPhysicalIncidentPackage.ACTIVITY__INITIATOR, oldInitiator, initiator));
			}
		}
		return initiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityInitiator basicGetInitiator() {
		return initiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiator(ActivityInitiator newInitiator) {
		ActivityInitiator oldInitiator = initiator;
		initiator = newInitiator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ACTIVITY__INITIATOR, oldInitiator, initiator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getAccomplices() {
		if (accomplices == null) {
			accomplices = new EObjectResolvingEList<Actor>(Actor.class, this, CyberPhysicalIncidentPackage.ACTIVITY__ACCOMPLICES);
		}
		return accomplices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getVictims() {
		if (victims == null) {
			victims = new EObjectResolvingEList<Actor>(Actor.class, this, CyberPhysicalIncidentPackage.ACTIVITY__VICTIMS);
		}
		return victims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getTargetedAssets() {
		if (targetedAssets == null) {
			targetedAssets = new EObjectResolvingEList<Asset>(Asset.class, this, CyberPhysicalIncidentPackage.ACTIVITY__TARGETED_ASSETS);
		}
		return targetedAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(Date newEndTime) {
		Date oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ACTIVITY__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectResolvingEList<Resource>(Resource.class, this, CyberPhysicalIncidentPackage.ACTIVITY__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getExploitedAssets() {
		if (exploitedAssets == null) {
			exploitedAssets = new EObjectResolvingEList<Asset>(Asset.class, this, CyberPhysicalIncidentPackage.ACTIVITY__EXPLOITED_ASSETS);
		}
		return exploitedAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ActivityType newType) {
		ActivityType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ACTIVITY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behaviour getBehaviourType() {
		return behaviourType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviourType(Behaviour newBehaviourType) {
		Behaviour oldBehaviourType = behaviourType;
		behaviourType = newBehaviourType == null ? BEHAVIOUR_TYPE_EDEFAULT : newBehaviourType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ACTIVITY__BEHAVIOUR_TYPE, oldBehaviourType, behaviourType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precondition getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecondition(Precondition newPrecondition, NotificationChain msgs) {
		Precondition oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ACTIVITY__PRECONDITION, oldPrecondition, newPrecondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecondition(Precondition newPrecondition) {
		if (newPrecondition != precondition) {
			NotificationChain msgs = null;
			if (precondition != null)
				msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.ACTIVITY__PRECONDITION, null, msgs);
			if (newPrecondition != null)
				msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.ACTIVITY__PRECONDITION, null, msgs);
			msgs = basicSetPrecondition(newPrecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ACTIVITY__PRECONDITION, newPrecondition, newPrecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CyberPhysicalIncidentPackage.ACTIVITY__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ACTIVITY__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ACTIVITY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemAction() {
		return systemAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemAction(String newSystemAction) {
		String oldSystemAction = systemAction;
		systemAction = newSystemAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ACTIVITY__SYSTEM_ACTION, oldSystemAction, systemAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Postcondition getPostcondition() {
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostcondition(Postcondition newPostcondition, NotificationChain msgs) {
		Postcondition oldPostcondition = postcondition;
		postcondition = newPostcondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ACTIVITY__POSTCONDITION, oldPostcondition, newPostcondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostcondition(Postcondition newPostcondition) {
		if (newPostcondition != postcondition) {
			NotificationChain msgs = null;
			if (postcondition != null)
				msgs = ((InternalEObject)postcondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.ACTIVITY__POSTCONDITION, null, msgs);
			if (newPostcondition != null)
				msgs = ((InternalEObject)newPostcondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.ACTIVITY__POSTCONDITION, null, msgs);
			msgs = basicSetPostcondition(newPostcondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ACTIVITY__POSTCONDITION, newPostcondition, newPostcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.ACTIVITY__PRECONDITION:
				return basicSetPrecondition(null, msgs);
			case CyberPhysicalIncidentPackage.ACTIVITY__POSTCONDITION:
				return basicSetPostcondition(null, msgs);
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
			case CyberPhysicalIncidentPackage.ACTIVITY__NAME:
				return getName();
			case CyberPhysicalIncidentPackage.ACTIVITY__FACILITATING_CONDITIONS:
				return getFacilitatingConditions();
			case CyberPhysicalIncidentPackage.ACTIVITY__CERTAINTY:
				return getCertainty();
			case CyberPhysicalIncidentPackage.ACTIVITY__DURATION:
				return getDuration();
			case CyberPhysicalIncidentPackage.ACTIVITY__START_TIME:
				return getStartTime();
			case CyberPhysicalIncidentPackage.ACTIVITY__NEXT_ACTIVITIES:
				return getNextActivities();
			case CyberPhysicalIncidentPackage.ACTIVITY__PREVIOUS_ACTIVITIES:
				return getPreviousActivities();
			case CyberPhysicalIncidentPackage.ACTIVITY__PATHS:
				return getPaths();
			case CyberPhysicalIncidentPackage.ACTIVITY__GOALS:
				return getGoals();
			case CyberPhysicalIncidentPackage.ACTIVITY__INITIATOR:
				if (resolve) return getInitiator();
				return basicGetInitiator();
			case CyberPhysicalIncidentPackage.ACTIVITY__ACCOMPLICES:
				return getAccomplices();
			case CyberPhysicalIncidentPackage.ACTIVITY__VICTIMS:
				return getVictims();
			case CyberPhysicalIncidentPackage.ACTIVITY__TARGETED_ASSETS:
				return getTargetedAssets();
			case CyberPhysicalIncidentPackage.ACTIVITY__END_TIME:
				return getEndTime();
			case CyberPhysicalIncidentPackage.ACTIVITY__RESOURCES:
				return getResources();
			case CyberPhysicalIncidentPackage.ACTIVITY__EXPLOITED_ASSETS:
				return getExploitedAssets();
			case CyberPhysicalIncidentPackage.ACTIVITY__TYPE:
				return getType();
			case CyberPhysicalIncidentPackage.ACTIVITY__BEHAVIOUR_TYPE:
				return getBehaviourType();
			case CyberPhysicalIncidentPackage.ACTIVITY__PRECONDITION:
				return getPrecondition();
			case CyberPhysicalIncidentPackage.ACTIVITY__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case CyberPhysicalIncidentPackage.ACTIVITY__DESCRIPTION:
				return getDescription();
			case CyberPhysicalIncidentPackage.ACTIVITY__SYSTEM_ACTION:
				return getSystemAction();
			case CyberPhysicalIncidentPackage.ACTIVITY__POSTCONDITION:
				return getPostcondition();
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
			case CyberPhysicalIncidentPackage.ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__FACILITATING_CONDITIONS:
				getFacilitatingConditions().clear();
				getFacilitatingConditions().addAll((Collection<? extends String>)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__CERTAINTY:
				setCertainty((Double)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__DURATION:
				setDuration((Integer)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__START_TIME:
				setStartTime((Date)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__NEXT_ACTIVITIES:
				getNextActivities().clear();
				getNextActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__PREVIOUS_ACTIVITIES:
				getPreviousActivities().clear();
				getPreviousActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__PATHS:
				getPaths().clear();
				getPaths().addAll((Collection<? extends Path>)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__GOALS:
				getGoals().clear();
				getGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__INITIATOR:
				setInitiator((ActivityInitiator)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__ACCOMPLICES:
				getAccomplices().clear();
				getAccomplices().addAll((Collection<? extends Actor>)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__VICTIMS:
				getVictims().clear();
				getVictims().addAll((Collection<? extends Actor>)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__TARGETED_ASSETS:
				getTargetedAssets().clear();
				getTargetedAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__END_TIME:
				setEndTime((Date)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__EXPLOITED_ASSETS:
				getExploitedAssets().clear();
				getExploitedAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__TYPE:
				setType((ActivityType)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__BEHAVIOUR_TYPE:
				setBehaviourType((Behaviour)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__PRECONDITION:
				setPrecondition((Precondition)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__LOCATION:
				setLocation((Location)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__SYSTEM_ACTION:
				setSystemAction((String)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__POSTCONDITION:
				setPostcondition((Postcondition)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	
/*	protected void updatePreviousInNextActivities() {
		
		System.out.println("entering the update fun");
		for(Activity act: getNextActivities()) {
			EList<Activity> prevActs = act.getPreviousActivities();
			
			System.out.println("before adding to act:" + act.getName());
			if(!prevActs.contains(this)) {
				prevActs.add(this);
			}
		}
	}*/
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__FACILITATING_CONDITIONS:
				getFacilitatingConditions().clear();
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__CERTAINTY:
				setCertainty(CERTAINTY_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__NEXT_ACTIVITIES:
				getNextActivities().clear();
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__PREVIOUS_ACTIVITIES:
				getPreviousActivities().clear();
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__PATHS:
				getPaths().clear();
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__GOALS:
				getGoals().clear();
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__INITIATOR:
				setInitiator((ActivityInitiator)null);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__ACCOMPLICES:
				getAccomplices().clear();
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__VICTIMS:
				getVictims().clear();
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__TARGETED_ASSETS:
				getTargetedAssets().clear();
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__RESOURCES:
				getResources().clear();
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__EXPLOITED_ASSETS:
				getExploitedAssets().clear();
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__BEHAVIOUR_TYPE:
				setBehaviourType(BEHAVIOUR_TYPE_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__PRECONDITION:
				setPrecondition((Precondition)null);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__LOCATION:
				setLocation((Location)null);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__SYSTEM_ACTION:
				setSystemAction(SYSTEM_ACTION_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY__POSTCONDITION:
				setPostcondition((Postcondition)null);
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
			case CyberPhysicalIncidentPackage.ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CyberPhysicalIncidentPackage.ACTIVITY__FACILITATING_CONDITIONS:
				return facilitatingConditions != null && !facilitatingConditions.isEmpty();
			case CyberPhysicalIncidentPackage.ACTIVITY__CERTAINTY:
				return certainty != CERTAINTY_EDEFAULT;
			case CyberPhysicalIncidentPackage.ACTIVITY__DURATION:
				return duration != DURATION_EDEFAULT;
			case CyberPhysicalIncidentPackage.ACTIVITY__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case CyberPhysicalIncidentPackage.ACTIVITY__NEXT_ACTIVITIES:
				return nextActivities != null && !nextActivities.isEmpty();
			case CyberPhysicalIncidentPackage.ACTIVITY__PREVIOUS_ACTIVITIES:
				return previousActivities != null && !previousActivities.isEmpty();
			case CyberPhysicalIncidentPackage.ACTIVITY__PATHS:
				return paths != null && !paths.isEmpty();
			case CyberPhysicalIncidentPackage.ACTIVITY__GOALS:
				return goals != null && !goals.isEmpty();
			case CyberPhysicalIncidentPackage.ACTIVITY__INITIATOR:
				return initiator != null;
			case CyberPhysicalIncidentPackage.ACTIVITY__ACCOMPLICES:
				return accomplices != null && !accomplices.isEmpty();
			case CyberPhysicalIncidentPackage.ACTIVITY__VICTIMS:
				return victims != null && !victims.isEmpty();
			case CyberPhysicalIncidentPackage.ACTIVITY__TARGETED_ASSETS:
				return targetedAssets != null && !targetedAssets.isEmpty();
			case CyberPhysicalIncidentPackage.ACTIVITY__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case CyberPhysicalIncidentPackage.ACTIVITY__RESOURCES:
				return resources != null && !resources.isEmpty();
			case CyberPhysicalIncidentPackage.ACTIVITY__EXPLOITED_ASSETS:
				return exploitedAssets != null && !exploitedAssets.isEmpty();
			case CyberPhysicalIncidentPackage.ACTIVITY__TYPE:
				return type != TYPE_EDEFAULT;
			case CyberPhysicalIncidentPackage.ACTIVITY__BEHAVIOUR_TYPE:
				return behaviourType != BEHAVIOUR_TYPE_EDEFAULT;
			case CyberPhysicalIncidentPackage.ACTIVITY__PRECONDITION:
				return precondition != null;
			case CyberPhysicalIncidentPackage.ACTIVITY__LOCATION:
				return location != null;
			case CyberPhysicalIncidentPackage.ACTIVITY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CyberPhysicalIncidentPackage.ACTIVITY__SYSTEM_ACTION:
				return SYSTEM_ACTION_EDEFAULT == null ? systemAction != null : !SYSTEM_ACTION_EDEFAULT.equals(systemAction);
			case CyberPhysicalIncidentPackage.ACTIVITY__POSTCONDITION:
				return postcondition != null;
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
		result.append(", facilitatingConditions: ");
		result.append(facilitatingConditions);
		result.append(", certainty: ");
		result.append(certainty);
		result.append(", duration: ");
		result.append(duration);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(", type: ");
		result.append(type);
		result.append(", behaviourType: ");
		result.append(behaviourType);
		result.append(", description: ");
		result.append(description);
		result.append(", systemAction: ");
		result.append(systemAction);
		result.append(')');
		return result.toString();
	}

	@Override
	public void replaceEntityName(String oldEntityName, String newEntityName) {
		
		Precondition pre = getPrecondition();
		
		if(pre != null) {
			BigraphExpression preCon = ((BigraphExpression)pre.getExpression());	
			
			if(preCon != null) {
				preCon.replaceEntityName(oldEntityName, newEntityName);
			}
		}
		
		Postcondition post = getPostcondition();
		
		if(post != null) {
			BigraphExpression postCon = ((BigraphExpression)post.getExpression());
			
			if(postCon != null) {
				postCon.replaceEntityName(oldEntityName, newEntityName);
			}
		}
		
	}
	
	
} //ActivityImpl
