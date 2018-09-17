/**
 */
package cyberPhysical_Incident.impl;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import choco.kernel.model.constraints.automaton.State;
import cyberPhysical_Incident.Activity;
import cyberPhysical_Incident.ActivityInitiator;
import cyberPhysical_Incident.ActivityType;
import cyberPhysical_Incident.Actor;
import cyberPhysical_Incident.Asset;
import cyberPhysical_Incident.BigraphExpression;
import cyberPhysical_Incident.Connection;
import cyberPhysical_Incident.Connectivity;
import cyberPhysical_Incident.CrimeScript;
import cyberPhysical_Incident.CyberPhysicalIncidentFactory;
import cyberPhysical_Incident.CyberPhysicalIncidentPackage;
import cyberPhysical_Incident.Entity;
import cyberPhysical_Incident.Goal;
import cyberPhysical_Incident.IncidentDiagram;
import cyberPhysical_Incident.IncidentEntity;
import cyberPhysical_Incident.Intent;
import cyberPhysical_Incident.Location;
import cyberPhysical_Incident.Motive;
import cyberPhysical_Incident.Path;
import cyberPhysical_Incident.Postcondition;
import cyberPhysical_Incident.Precondition;
import cyberPhysical_Incident.Resource;
import cyberPhysical_Incident.Scene;
import cyberPhysical_Incident.ScriptCategory;
import cyberPhysical_Incident.Type;
import environment.EnvironmentDiagram;
import externalUtility.BigraphNode;
import externalUtility.IncidentModelHandler;
import it.uniud.mads.jlibbig.core.std.Bigraph;
import it.uniud.mads.jlibbig.core.std.Signature;
import it.uniud.mads.jlibbig.core.std.SignatureBuilder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incident Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentDiagramImpl#getCrimeScript <em>Crime Script</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentDiagramImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentDiagramImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentDiagramImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentDiagramImpl#getMotive <em>Motive</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentDiagramImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentDiagramImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentDiagramImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentDiagramImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentDiagramImpl#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncidentDiagramImpl extends MinimalEObjectImpl.Container implements IncidentDiagram {
	
	protected static int activityNum = 1;
	protected static final int MAX_LENGTH = 1000000;
	protected static final String ACTIVITY_NAME = "abstracted-Activity";
	protected static Signature signature;
	protected int maxOuterNameNumber = 10;
	protected Map<String, Integer> activitiesSequence = null;
	
	boolean isDebug = false;
	
	/**
	 * The cached value of the '{@link #getCrimeScript() <em>Crime Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrimeScript()
	 * @generated
	 * @ordered
	 */
	protected CrimeScript crimeScript;

	/**
	 * The cached value of the '{@link #getScene() <em>Scene</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScene()
	 * @generated
	 * @ordered
	 */
	protected EList<Scene> scene;

	/**
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected Intent intent;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goal;

	/**
	 * The cached value of the '{@link #getMotive() <em>Motive</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotive()
	 * @generated
	 * @ordered
	 */
	protected EList<Motive> motive;

	/**
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> asset;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resource;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actor;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connection;

	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<Path> paths;

	protected CyberPhysicalIncidentFactory instance = CyberPhysicalIncidentFactory.eINSTANCE;
	protected environment.EnvironmentDiagram systemModel;
	protected EList<Activity> activity;
	
	//key is new activity and the list is the list of merged activities from the original incident
	protected Map<Activity, List<Activity>> mergedActivities; 
	
	//each entry has the value of the merge rule used to create the new activity (e.g., containment, connectivity)
	protected List<Integer> mergedRules; 
	
	
	public IncidentDiagram createAbstractIncident(EnvironmentDiagram system) {
	
		setSystemModel(system);
		return createAbstractIncident();
	}
	
	public IncidentDiagram createAbstractIncident() {
		
		//create a copy
		
		int tries = 5;
		int cnt = 0;
		IncidentDiagram potentialAbstractIncident = null;
		
		String tmpFileName = "tmpIncModel.cpi";
		
		//try copying [tries] times
		while (potentialAbstractIncident == null & cnt < tries) {
			
			IncidentModelHandler.SaveIncidentToFile(this, tmpFileName);
			potentialAbstractIncident = IncidentModelHandler.loadIncidentFromFile(tmpFileName);
			cnt++;	
		}
		
		//remove tmp (i.e. the copy) file
		File tmpFile = new File(tmpFileName);
		if(tmpFile.exists()) {
			tmpFile.delete();
		}
				
		if(potentialAbstractIncident == null) {
			return null;
		}
		
		//update metadata about the abstract incident
		updateMetaData(potentialAbstractIncident);
		
		//abstract activities
		 mergedActivities = potentialAbstractIncident.abstractActivities();
		 mergedRules = new LinkedList<Integer>(potentialAbstractIncident.getMergedRules());
		 //remove merged rules from abstract incident
		 potentialAbstractIncident.setMergedRules();
		 
		 if(systemModel != null) {
			 //abstract entities (assets, resources, and actors)
			 potentialAbstractIncident.abstractEntities(systemModel); 
		 } 
		 
		return potentialAbstractIncident;
	}
	
	protected void updateMetaData(IncidentDiagram abstractedIncident) {
		
		/**
		 * Update some metadata for the abstract
		 * Currently includes: 
		 * 1-Category (e.g., track, script, meta-script): For example form INSTANCE to TRACK/SCRIPT
		 * 2- (future) Higher level script name: which links the abstract to other scripts
		 */
		
		////update incident category
		int currentCategoryValue = this.getCrimeScript().getCategory().getValue();
		
		switch(currentCategoryValue) {
		
		case ScriptCategory.INSTANCE_VALUE:
			abstractedIncident.getCrimeScript().setCategory(ScriptCategory.TRACK);
			break;
		case ScriptCategory.TRACK_VALUE:
			abstractedIncident.getCrimeScript().setCategory(ScriptCategory.SCRIPT);
			break;
		case ScriptCategory.SCRIPT_VALUE:
			abstractedIncident.getCrimeScript().setCategory(ScriptCategory.PROTOSCRIPT);
			break;
		case ScriptCategory.PROTOSCRIPT_VALUE:
			abstractedIncident.getCrimeScript().setCategory(ScriptCategory.METASCRIPT);
			break;
		default:
			abstractedIncident.getCrimeScript().setCategory(ScriptCategory.SCRIPT);
		}
		
		
	}
	
	public Map<Activity, List<Activity>> abstractActivities() {
		
		//currently merging is done based on the first two activities in a given sequence
		//so I test different sequences to see of they can be merged or not. I try to test all
		
		//if there is less than 2 activities then merging is not required
		if(getActivity().size() < 2) {
			return null;
		}

		Map<Activity, List<Activity>> mergedActivities = new HashMap<Activity, List<Activity>>();
		mergedRules = new LinkedList<Integer>();
		
		//merging of activities is only limited to same scene
		for(Scene scene : getScene()) {
			
			EList<Activity> sceneActivities = scene.getActivity();
			
			Activity currentActivity = scene.getInitialActivity();
		
			Activity nextActivity = null;

			while (currentActivity.getNextActivities().size()>0) {
				
				nextActivity = currentActivity.getNextActivities().get(0); //assuming only 1 activity is next
			
				if(!sceneActivities.contains(nextActivity)) {
					break;
				}
				
			Activity mergedActivity = mergeActivities(currentActivity, nextActivity);
			
			//if there was no merging then move to the next activity
			if(mergedActivity == null) {
				currentActivity = nextActivity;
			//else use the merged activity for the next merge
			} else {
				//store merge event (new activity and the list of merged activities)
				mergedActivities.put(mergedActivity, Arrays.asList(currentActivity, nextActivity));
				
				currentActivity = mergedActivity;
				
			}
		}
		}
		
		return mergedActivities;

	}
	
	public void abstractEntities(EnvironmentDiagram system) {
		
		//1-look for assets that exist in the system model
		//2-if one found, then use the system model to find an abstraction of this entity based on the system meta-model
		//3-replace the original asset in the incident model with its abstraction from the system model
		//In case an asset is not found in the system model then it remains as is
		
		if( system == null) {
			return;
		}
		
		//assume an access to the system model is available
		systemModel = system;
		
		LinkedList<IncidentEntity> entities = new LinkedList<IncidentEntity>();
		
		environment.Asset systemAsset = null;
		
		entities.addAll(getAsset());
		entities.addAll(getResource());
		entities.addAll(getActor());
		
		String entityName = null;
		
		//look in assets
		for(IncidentEntity entity : entities) {
			
			entityName = entity.getName();
			systemAsset = getSystemAsset(entityName);
			
			if( systemAsset != null) {
				abstractEntity(entity, systemAsset);		
			}
		}
			
	}
	
	protected IncidentEntity abstractEntity(IncidentEntity entity, environment.Asset systemAsset) {
	
		if(entity == null || systemAsset == null) {
			return null;
		}
		
		environment.Asset abstractedSystemAsset = systemAsset.abstractAsset();
		
		if(abstractedSystemAsset == null) {
			return null;
		}
		
		String oldEntityName = entity.getName();
		
		//for now all changed are done directly. Need to create a copy later
		IncidentEntity abstractedEntity = entity;
		
		/*//determine the type of the entity to create (i.e. asset, resource, actor)
		if(AssetImpl.class.isInstance(entity)) {
			abstractedEntity = instance.createAsset();
		} else if(ResourceImpl.class.isInstance(entity)) {
			abstractedEntity = instance.createResource();
		} else if(ActorImpl.class.isInstance(entity)) {
			abstractedEntity = instance.createActor();
		} else {
			//create a defualt incident entity object
		}*/
		
		abstractedEntity.setName(abstractedSystemAsset.getName());
		//abstractedEntity.get
		
		////update type to be of the same type as the abstracted asset
		Type type = abstractedEntity.getType();
		 
		if(type == null) {
			type = instance.createType();
		}
		
		type.setName(abstractedSystemAsset.getClass().getSimpleName().replace("Impl", ""));
		
		abstractedEntity.setType(type);
		
		////
		//other attributes maybe (e.g., contained assets, connections)
		
		////update all the entity name in all the conditions of the incident activities
		for(Activity act : getActivity()) {
			act.replaceEntityName(oldEntityName, abstractedEntity.getName());
		}
		
		return abstractedEntity;
	}
	
	public environment.Asset getSystemAsset(String assetName) {
		
		if(systemModel == null) {
			return null;
		}
		
		for(environment.Asset ast : systemModel.getAsset()) {
			if(ast.getName().equals(assetName)) {
				return ast;
			}
		}
		
		return null;
	}
	
	public Activity getInitialActivity() {
		
		Scene initialScene = getInitialScene();
		
		if(initialScene != null) {
			return initialScene.getInitialActivity();
		}
		
		return null;
	}
	
	public boolean activityNameExists(String activityName) {
	
		Map<String, Integer> activitiesSequence = getActivitySequence();
		
		if(activitiesSequence != null) {
			if(activitiesSequence.containsKey(activityName)) {
				return true;
			}
		} else {
			for(Activity act : getActivity()) {
				if(act.getName() != null && act.getName().equals(activityName)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public Scene getInitialScene() {
		
		for(Scene scene: getScene()) {
			if(scene.getPreviousScenes() == null || scene.getPreviousScenes().size()==0){
				return scene;
			}
		
		}
		return null;
	}
	
	public Activity getInitialActivity(Scene scene) {
		
		if(scene != null) {
			return scene.getInitialActivity();	
		}
		
		return null;
	}
	
	/**
	 * Tries to merge the activity sequence between the given argument activities (them included). 
	 * Returns a new activity that replaces the sequence, or null if it cannot be repalced.
	 */
	public Activity mergeActivities(Activity startingActivity, Activity endActivity) {
		
		MessagePrinter.printMsg(this, "checking to create a list of acts:" + startingActivity.getName() +", "+endActivity.getName());
		if(startingActivity == null || endActivity == null) {
			return null;
		}
		
		if(startingActivity.equals(endActivity)) {
			return startingActivity;
		}
		
		EList<Activity> activitiesToMerge = new BasicEList<Activity>();
		
		activitiesToMerge.add(startingActivity);
		
		//assuming there's only one next activity. In future, an algorithm for finding all possible sequences between two activities can be implemented
		Activity nextActivity = null; 
		
		if(startingActivity.getNextActivities().size()>0) {
			nextActivity = startingActivity.getNextActivities().get(0);	
		}
		
		while(nextActivity != null) {
			
			activitiesToMerge.add(nextActivity);
			
			if(nextActivity.equals(endActivity)) {
				break;
			}
			
			if(nextActivity.getNextActivities().size()>0) {
				nextActivity = nextActivity.getNextActivities().get(0);	
			} else {
				nextActivity = null;
			}
			
		}
		
		//if(activitiesToMerge.get(activitiesToMerge.size()-1).equals(endActivity)) {
			return mergeActivities(activitiesToMerge);
		//}
		
	//	return null;
		
	}

	/**
	 * Tries to merge the activity sequence starting from the given argument activity (it included) until the activity that is located the last in the given number of activities. 
	 * Returns a new activity that replaces the sequence, or null if it cannot be repalced.
	 */
	public Activity mergeActivities(Activity startingActivity, int sequenceLength) {
		
		EList<Activity> activities = new BasicEList<Activity>();
		
		if(startingActivity == null) {
			return null;
		}
		
		if(sequenceLength < 1) {
			return startingActivity;
		}
		
		Activity nextActivity = startingActivity.getNextActivities().get(0);
		activities.add(startingActivity);
		
		int size = this.getActivity().size();
		
		for(int i = 0;i<sequenceLength && i<size;i++) {
			if (nextActivity != null) {
				activities.add(nextActivity);
				nextActivity = nextActivity.getNextActivities().get(0);
			}
		}
		
		return mergeActivities(activities);
		
	}
	
	/**
	 * Tries to merge the given activity sequence. Merging is done based on certain set of rules that can be matched against the given sequence.
	 * Currently, merging is done based on containment of the initiator between the first and the second activity. Please see {@link #mergeAccordingToContainment(EList)} 
	 * Returns a new activity that replaces the sequence, or null if it cannot be repalced.
	 */
	public Activity mergeActivities(List<Activity> activitySequence) {
		
		MessagePrinter.printMsg(this, "trying to merge act ["+activitySequence.get(0).getName()+"] act ["+activitySequence.get(1).getName()+"]");
		
		Activity mergedActivity = null;
		
		//Merging is done:
		//1-Checking Collect data pattern, if there's a merge then the merged activity is returned, else
		//2-Checking Containment pattern, if there's a merge then the merged activity is returned, else
		//3-Checking Connectivity pattern, if there's a merge then the merged activity is returned, else
		//default: returns null
	
		//try to merge sequence based on collect data pattern (first based on severity provided by CAPEC)
		//severity = medium (can be more severe if target asset is more critical)
		mergedActivity = mergeBasedOnCollectData(activitySequence);

		//try to merge sequence based on collect data pattern (first based on severity provided by CAPEC)
		//severity = medium
		Activity mergedActivity2 = mergeBasedOnEstablishRogueLocation(activitySequence);
		
		//if patterns have same similarity and also apply to the given activity sequence
		//then return both activities (generated from merging the sequence) and let the user decide
		//which activity to add.
		//Maybe provide different sequences for the user and let them choose
		
		if(mergedActivity != null && mergedActivity2 != null) {
			//then produce two activity sequences which a user can choose from
			//TBI (To Be Implemented)
		} else if(mergedActivity == null && mergedActivity2 != null) {
			mergedActivity = mergedActivity2;
		}
	
		if(mergedActivity != null) {
			mergedRules.add(IncidentDiagram.COLLECTDATA_MERGE_RULE);
			return mergedActivity;
		}
		
		//this is currently specific containment & connectivity 
		if(canMergeBasedOnBasics(activitySequence)) {
			
			//first try to merge based on containment
			mergedActivity = mergeBasedOnContainment(activitySequence);
			
			//if not successful, then try connectivity
			if(mergedActivity == null) {
				mergedActivity = mergeBasedOnConnectivity(activitySequence);	
			
				if(mergedActivity != null) {
					mergedRules.add(IncidentDiagram.CONNECTIVITY_MERGE_RULE);
					return mergedActivity;
				}
			} else {
				mergedRules.add(IncidentDiagram.CONTAINMENT_MERGE_RULE);
				return mergedActivity;
			}
		}
		
		//other rules for merging can be added here in the future\\
		
		return mergedActivity;	
	}
	
	public Signature createBigraphSignature() {

		SignatureBuilder sigBuilder = new SignatureBuilder();
		EList<IncidentEntity> entities = new BasicEList<IncidentEntity>();
		
		entities.addAll(getAsset());
		entities.addAll(getResource());
		entities.addAll(getActor());

		for (IncidentEntity ent : entities) {
			// create a bigraph signature out of each entity and max arity
			// number
			sigBuilder.add(ent.getName(), true, maxOuterNameNumber);

			//addChildren(node, ent.getEntity(), nodes, sigBuilder);
		}

		entities = null;
		signature = sigBuilder.makeSignature();

		return signature;

	}
	
	/*protected void addChildren(BigraphNode parent, EList<Entity> entities, Map<String, BigraphNode> nodes,
			SignatureBuilder sigBuilder, boolean isGround) {

		BigraphNode node;

		for (Entity entity : entities) {
			node = new BigraphNode();

			node.setId(entity.getName());

			if(!isGround) {
				// add site
				node.setSite(entity.getSite() != null ? true : false);	
			}
			
			// add parent
			node.setParent(parent);

			// add control (currently same as the name of the entity
			node.setControl(entity.getName());

			// add connectivity (outernames)
			for (Connectivity con : entity.getConnectivity()) {
				node.addOuterName(con.getName(), con.isIsClosed());
			}

			nodes.put(node.getId(), node);

			// create a bigraph signature out of each entity and max arity
			// number
			if(sigBuilder != null) {
				sigBuilder.add(entity.getName(), true, maxOuterNameNumber);	
			}
			

			addChildren(node, entity.getEntity(), nodes, sigBuilder, isGround);
		}
	}*/
	
	/**
	 * Checks whether the given sequence satisfies the following conditions:
	 *1- have same action (detemrmined using the attribute systemAction)
	 *2- have the same activity initiator 
	 *3- have the same activity type (e.g., physical)
	 * @param activitySequence the activity sequence to check
	 * @return True if the activity sequence satisfies all conditions. False otherwise.
	 */
	protected boolean canMergeBasedOnBasics(List<Activity> activitySequence) {
		
		//merge activities if certain conditions are met
		//conditions for merging activities:
		// 1- is valid sequence i.e. the sequence corresponds to a sequence in the incident model  
		// 2- have same action (detemrmined using the attribute systemAction)
		// 3- have the same activity initiator 
		// 4- have the same activity type (e.g., physical)

		if(activitySequence == null || activitySequence.size() < 2) {
			return false;
		}
		
		Activity initialActivity = activitySequence.get(0);
		
		//check if the sequence is a valid sequence in the incident model
		Activity currentActivity = activitySequence.get(0);
		boolean isInSequence = false;
		
		for(int i=1;i<activitySequence.size();i++) {
			for(Activity act : currentActivity.getNextActivities()) {
				if(act.equals(activitySequence.get(i))) {
					isInSequence = true;
					break;
				}
			}
			//if none of the next activities of the current activity is equal to the activity in the given sequence, then the given sequence is not a valid one
			if(!isInSequence) {
				return false;
			}
			
			isInSequence = false;
			
			currentActivity = activitySequence.get(i);
		}
		
		// check that activities have the same actions
		String initialAction = initialActivity.getSystemAction();

		for(int i=1;i<activitySequence.size();i++) {
			if(activitySequence.get(i) != null) {
				if(!initialAction.equals(activitySequence.get(i).getSystemAction())) {
					return false;
				}
			}
		}
		
		// check activity initiator
		ActivityInitiator initialInitiator = initialActivity.getInitiator();
		
		for(int i=1;i<activitySequence.size();i++) {
			if(activitySequence.get(i) != null) {
				if(!initialInitiator.equals(activitySequence.get(i).getInitiator())) {
					return false;
				}
			}
		}

		// check activity type
		ActivityType initialType = initialActivity.getType();
		
		for(int i=1;i<activitySequence.size();i++) {
			if(activitySequence.get(i) != null) {
				if(!initialType.equals(activitySequence.get(i).getType())) {
					return false;
				}
			}
		}		
		
		return true;
	}
	
	/**
	 * Checks the first two activities of the given sequence to determine if they can be merged. Criteria is:
	 * 1-Activity initiator in the first activity is contained by different entities in the precondition and postcondition
	 * 2-Container of initiator in the second activity should be different from the contianer in postcondition of the first activity
	 * 3-A connection between the containers of the postconditions in the first and second activity should exist
	 */
	public Activity mergeBasedOnContainment(List<Activity> activitySequence) {
		
		//merge activities from startingActivity to endActivity if certain conditions are met
		//conditions for merging activities:
		//based on containment and
		// the target assets in the sequence contain the initiator and have connections between each other (currently could be physical or digital) 
		// then these activities are replaced by a new activity that has the same type, same initiator, with precondition from the previous activity precondition
		// and a postcondition from the next activity postcondition
		//This method uses the first two activities of the sequence at the moment
		
//		if (activitySequence == null || activitySequence.size()<2) {
//			return null;
//		}
		
		//currently only the first two activity are checked
		
		Activity firstActivity = activitySequence.get(0);
		Activity secondActivity = activitySequence.get(1); //can be extended to include last activity
		
		if(firstActivity == null || secondActivity == null) {
			return null;
		}
		
		MessagePrinter.printMsg(this, "trying to merge according to containment of ["+firstActivity.getName()+"] & ["+secondActivity.getName()+"]");
		
		Asset targetAsset = null; 
		
		EList<Asset> firstActivitytargetedAssets = firstActivity.getTargetedAssets();
		if( firstActivitytargetedAssets != null && firstActivitytargetedAssets.size()>0) {
			targetAsset = firstActivitytargetedAssets.get(0); //only one is considered
		}
		
		String targetAssetName =null;
		
		//checks if the initiator changes contianer in the pre and post conditions
		if(!firstActivity.isInitiatorMoved()) {
			return null;
		}
		
		if(targetAsset != null) {
			targetAssetName = targetAsset.getName();	
		}
		
		String initiatorContainer = firstActivity.getInitiatorContainer(BigraphExpression.POSTCONDITION_EXPRESSION);
		String initiatorContainer2 = secondActivity.getInitiatorContainer(BigraphExpression.POSTCONDITION_EXPRESSION);
		
		//checks if the target asset contains the initiator in the postcondition. if not then there's not merge
		if(initiatorContainer == null || targetAssetName == null || !targetAssetName.equals(initiatorContainer)) {
			return null;
		}
		
		//checks if the contianer of the initiator in the second activity is the same or not to that of the container in the first activity. if the same then no merge will happen
		if(initiatorContainer2 == null || initiatorContainer.equals(initiatorContainer2)) {
			return null;
		}
		
		//check for the containers have connection of some sort between them 
		Connection con = hasConnection(initiatorContainer, initiatorContainer2);
		
		//if there is no connection between the containers of the initiator in the first and second activity then there will be no merge
		if(con == null) {
			return null;
		}
		
		
		/**create a new activity to replace the sequence (first two activities currently) **/
		EList<Activity> newSequence = new BasicEList<Activity>();
		newSequence.add(activitySequence.get(0));
		newSequence.add(activitySequence.get(1));
		
		Activity mergedActivity = createMergedActivity(newSequence);
	
		return mergedActivity;
	}
	
	/**
	 *  Merges the first two activities of the given sequence. Criteria is:
	 * 1-Check basics (same action name, same initiator, same activity type)
	 * 2-The target asset of first activity should have a connection to the target asset of the second activity
	 * 3-Activity initiator in the first activity contains an entity that has connections that increases from pre to post. These connections should be assoicated with the target asset
	 * 4-a new connection to the second activity target asset is created from the initiator's entity
	 * @param activitySequence The sequence of activities to merge
	 * @return New activity replacing the first two activities in the sequence. Or null if merging is not successful
	 */
	public Activity mergeBasedOnConnectivity(List<Activity> activitySequence) {
		
		Activity mergedActivity = null;
		
//		if (activitySequence == null || activitySequence.size()==0) {
//			return null;
//		}
		
		//currently only the first two activity are checked
		
		Activity firstActivity = activitySequence.get(0);
		Activity secondActivity = activitySequence.get(1);
		
		if(firstActivity == null || secondActivity == null) {
			return null;
		}
		
		//get connections between the initiator and the target asset in the precondition
		EList<Asset> firstTargetedAssets = firstActivity.getTargetedAssets();
				
		if(firstTargetedAssets == null || firstTargetedAssets.size()==0) {
			return null;
		}
		
		String firstTargetAssetName = firstTargetedAssets.get(0).getName(); //assuming there's only one target asset
		
		List<Asset> secondTargetedAssets = secondActivity.getTargetedAssets();
		
		if(secondTargetedAssets == null || secondTargetedAssets.size()==0) {
			return null;
		}
		
		String secondTargetAssetName = secondTargetedAssets.get(0).getName(); //assuming there's only one target asset
		
		//checks if there exists a Connection between the target assets of the 1st and 2nd activities
		if(hasConnection(firstTargetAssetName, secondTargetAssetName) == null) {
			return null;
		}
		
		/**at this point 2nd condition is met (i.e. The target asset of first activity should have a connection to the target asset of the second activity)**/
		
		List<String> initiatorsContainedEntities = firstActivity.getInitiatorContainedEntities();
		
		List<String> initiatorEntitiesConnectedToTargetAsset = new LinkedList<String>();
		
		//find all entities contained by the initiator in first activity which has connection to the target asset that increases from pre to post
		for(String entity : initiatorsContainedEntities) {
			if(firstActivity.getConnectionChangesBetweenEntities(entity, firstTargetAssetName) == Connection.CONNECTIONS_INCREASE) {
				initiatorEntitiesConnectedToTargetAsset.add(entity);
			}
		}
		
		if(initiatorEntitiesConnectedToTargetAsset.size() == 0) {
			return null;
		}

		/**at this point 3rd condition is met (i.e. Activity initiator in the first activity contains an entity that has connections that increases from pre to post. These connections should be assoicated with the target asset)**/

		String initiatorEntity = null;
		
		//check for every entity identified earlier that it exists in the 2nd activity and that it increase its connections with the target asset of the 2nd activity
		for(String entity: initiatorEntitiesConnectedToTargetAsset) {
			if(secondActivity.getInitiatorContainedEntities().contains(entity)) {
				System.out.println(entity);
				if(secondActivity.getConnectionChangesBetweenEntities(entity, secondTargetAssetName) == Connection.CONNECTIONS_INCREASE) {
					initiatorEntity = entity;
					break;
				}
			}
		}
		
		if(initiatorEntity == null || initiatorEntity.isEmpty()) {
			return null;
		}

		/** at this point 4th condition is met (i.e. a new connection to the second activity target asset is created from the initiator's entity) **/
		
		/** conditions for merging based on connectivity is satisfied. Next create merged activity**/
		EList<Activity> newSequence = new BasicEList<Activity>();
		newSequence.add(activitySequence.get(0));
		newSequence.add(activitySequence.get(1));
		
		mergedActivity = createMergedActivity(newSequence);
	
		return mergedActivity;
	}
	
	
	public Activity mergeBasedOnCollectData(List<Activity> activitySequence) {
		
		Activity mergedActivity = null;
		
		/** [basic conditions for merging does not apply to this mainly the need for having the same action in both activities]
		 * Criteria for matching:
		 * Collect data pattern is defined as:
		 * Collect [Data (sensitive), which can be used to undermine the security of the target] 
		 * from [Common Resource (or Asset), well-known locations for resources] 
		 * using a [device]
		 * 
		 * 1st activity (i.e. reach common resource): 
		 * pre: Initiator didn't reach a [Common Resource (or Asset)] (e.g., network, workstation)
		 * post: Initiator reached a [Common Resource] using a [device]
		 * 
		 * 2nd activity (i.e. identify sensitive data):
		 * pre: collect data available from [common resource]
		 * post: obtain sensitive data
		 * 
		 * (possible extension) Middle activity (i.e. collect data): 
		 * pre: currently is not relevant (but could be set to be having a resource contained by the [device])
		 * post: collect data available from [common resource]
		 * 
		 * Further criteria related to the properties of entities mentioned in 1 & 2:
		 * -Common resource: Currently used a "Network (IP or Bus)"
		 * -Sensitive data: currently used is "Digital Asset", which is mainly related to data that is moved from the [common resource] to the [device]
		 * -Device: currently used "Computing Device"
		 * Initiator: role is "offender"
		 * -Reach (as action): currently used as "Connect"
		 * -Collect (as action): 
		 * -Identify (as action): currently used as "Analyse"
		 * 
		 * generated activity can be labelled as "suspicious"
		 */
		
		/**
		 * Criteria checked:
		 * In first activity:
		 * 1-Action should be "connect" and the Target Asset should be a Network (IP or Bus)
		 * 2-Initiator should an Actor with a Role as OFFENDER
		 * 3-Device used (i.e. resource) by the Initiator should be of type ComputingDevice
		 * 4-there's a Connection in the post condition established between Device and Network
		 * 
		 * In second activity:
		 * 5-Device contains data from the Common Resource
		 * 6-Device contains sensitive data
		 */
		
		Activity firstActivity = activitySequence.get(0);
		Activity secondActivity = activitySequence.get(1);
		
		if( firstActivity == null || secondActivity == null) {
			return null;
		}
		
		//1-in the first activity look for the action to be "connect" and the target asset to be network (IP or bus)
		String firstAction =  firstActivity.getSystemAction();
		Asset firstTargetAsset = firstActivity.getTargetedAssets().get(0); //assuming there's only one
		String firstTargetAssetType = firstTargetAsset.getType()!=null?firstTargetAsset.getType().getName():"";
		
		if(firstAction == null || firstTargetAsset == null || !firstAction.equalsIgnoreCase("connect")
				|| !(environment.IPNetwork.class.getSimpleName().equalsIgnoreCase(firstTargetAssetType) 
						|| environment.BusNetwork.class.getSimpleName().equalsIgnoreCase(firstTargetAssetType))){
			return null;
		}
		
		//2-if initiator is actor then he/she should be offender

		//for now consider only actors
		if(!firstActivity.isInitiatorOffender()) {
			//can be extended to check for digital processes and tools that can collect data
			return null;
		}

		//3- device is contained by the initiator and is of type computing device
		if(firstActivity.getResources() == null || firstActivity.getResources().isEmpty()) {
			return null;
		}
		
		Resource device = firstActivity.getResources().get(0); //assuming there's one resource
		
		//if the device is not of type computingDevice then it fails to satisfy the conditions
		String deviceType = device.getType() != null?device.getType().getName():"";
		
		if(!environment.ComputingDevice.class.getSimpleName().equalsIgnoreCase(deviceType)) {
			return null;
		}
		
		//is the deivce used in the post condition at least? if no then it fails to satisfy 3 as it is not connected to the target asset
		List<String> firstcontainedEntities = firstActivity.getInitiatorContainedEntities();
		
		if(device == null || firstcontainedEntities == null) {
			return null;
		}
		
		if(!firstcontainedEntities.contains(device.getName())) {
			return null;
		}
		
		//4- check if there's a connection in the post condition established between device and network
		if(firstActivity.getConnectionChangesBetweenEntities(device.getName(), firstTargetAsset.getName()) != Connection.CONNECTIONS_INCREASE) {
			return null;
		}
		
		///till this point we can establish that the first activity is connectivity activity
		
		// 5-Device contains data from the Common Resource (precondition of 2nd activity)
		
		//currently assuming there's 1 resource available
		Resource secondDevice = secondActivity.getResources()!=null?secondActivity.getResources().get(0):null;
		
//		ActivityInitiator secondInitiator = secondActivity.getInitiator();
		
		//check if initiator is the same 
		if(!secondActivity.isSameInitiator(firstActivity)) {
			//can be extended to check for digital processes and tools that can collect data
			return null;
		}
		
		//check if the device is still the same
		if(secondDevice == null || secondDevice.getName() == null || !secondDevice.getName().equals(device.getName())) {
			return null;
		}
		
		Asset secondTargetAsset = secondActivity.getTargetedAssets() != null?secondActivity.getTargetedAssets().get(0):null;
		Asset secondExploitedAsset = secondActivity.getExploitedAssets()!=null?secondActivity.getExploitedAssets().get(0):null;
		
		//check that the exploited asset is contained in the first target asset (i.e. data from common resource)
		if(secondExploitedAsset != null ) {
			if(!firstTargetAsset.contains(secondExploitedAsset.getName())) {
				return null;
			}
		} else {
			return null;
		}
		
		//check if the target asset of the 2nd activity is contained in the exploited asset (i.e. information extracted from data)
		if(secondTargetAsset != null) {
			
			if(!secondExploitedAsset.contains(secondTargetAsset.getName())) {
				return null;
			}
			
		} else {
			return null;
		}
		
		Precondition secondPre = secondActivity.getPrecondition();
		
		BigraphExpression secondBigraph = (BigraphExpression)secondPre.getExpression();
		
		List<Entity> cotnainedEntities = secondBigraph.getContainedEntities(device.getName());
		
		boolean isCotnained = false;
		
		//if it is null then it is likely that the given deivce name does not exist in the precondition
		if(cotnainedEntities == null) {
			return null;
		}
		
		//check that the device contains the exploited asset in the precondition (if so, this satisfies 5)
		for(Entity ent : cotnainedEntities) {
			if(ent.getName().equals(secondExploitedAsset.getName())) {
				isCotnained = true;
				break;
			}
		}
	
		if(!isCotnained) {
			return null;
		}
		
		//6-device contains sensitive data
		
		//in the postcondition check if device contains targeted asset
		
		Postcondition secondPost = secondActivity.getPostcondition();
		
		BigraphExpression secondPostBigraph = (BigraphExpression)secondPost.getExpression();
		
		List<Entity> postCotnainedEntities = secondPostBigraph.getContainedEntities(device.getName());
		
		
		isCotnained = false;
		
		if(postCotnainedEntities == null) {
			return null;
		}
		
		for(Entity ent : postCotnainedEntities) {
			if(ent.getName().equals(secondTargetAsset.getName())) {
				isCotnained = true;
				break;
			}
		}
	
		if(!isCotnained) {
			return null;
		}
		
		///at this point all conditions are matched, so a merged activity is created
		EList<Activity> newSequence = new BasicEList<Activity>();
		newSequence.add(activitySequence.get(0));
		newSequence.add(activitySequence.get(1));
		
		mergedActivity = createMergedActivity(newSequence);
		
		return mergedActivity;
	}
	
	public Activity mergeBasedOnEstablishRogueLocation(List<Activity> activitySequence) {
		
		//to be implemented
		/**
		 * "Establish rogue location" pattern
		 * In this pattern [Offender] (sets up) a malicious version of an [Asset] in a some [Location]
		 * then Offender waits till a [Vicitm] (accesses) it
		 * 
		 *  1st activity:
		 *  action: not specified
		 *  Initiator: Actor with role as OFFENDER
		 *  Resource: malicious assets in this case it is of type AccessPoint
		 *  Location: Room (could be a room that is near or has connection to another room that contains a sensitive asset)
		 *  precondition: Offender in Location
		 *  postcondition: Offender places Resource in Location (i.e. Location contains Resource)
		 *  
		 *  2n activity:
		 *  action: "connect" or "access"
		 *  Initiator: Actor with role as VICITM
		 *  Target asset:
		 *  Resource: malicious Asset, in this case it is of type AccessPoint
		 *  Location: Room (could be a room that is near or has connection to another room that contains a sensitive asset)
		 *  precondition: Victim in Location
		 *  postcondition: Vicitm (accessed) Resource
		 *  
		 */
		
		Activity firstActivity = activitySequence.get(0);
		Activity secondActivity = activitySequence.get(1);
		
		if( firstActivity == null || secondActivity == null) {
			return null;
		}
	
		//check if initiator of first activity is an Offender
		if(!firstActivity.isInitiatorOffender()) {
			return null;
		}
		
		//check if resource of first activity has type "Acccess Point"
		Resource firstResource = firstActivity.getResources().isEmpty()?null:firstActivity.getResources().get(0); //assuming there's only 1 resource
		Type resourceType = firstResource!=null?firstResource.getType():null;
		String targetResourceType = "AccessPoint";
		
		if(resourceType == null ||
				resourceType.getName() == null ||
				!resourceType.getName().equalsIgnoreCase(targetResourceType)) {
			return null;
		}
		
		//check if location of first activity has type Room
		Location firstLocation = firstActivity.getLocation();
		Type locationType = firstLocation!=null?((IncidentEntity)firstLocation).getType():null;
		
		if(locationType == null ||
				locationType.getName() == null ||
				!locationType.getName().equalsIgnoreCase("Room")) {
			return null;
		}
		
		//check if precondition of first activity has the Loction containing the initiator		
		String firstInitiatorContainer = firstActivity.getInitiatorContainer(BigraphExpression.PRECONDITION_EXPRESSION);
		
		if(firstInitiatorContainer == null ||
				!firstInitiatorContainer.equals(((IncidentEntity)firstLocation).getName())){
			return null;
		}
		
		//check if in postcondition Location contains Resource
		Postcondition firstPost = firstActivity.getPostcondition();
		BigraphExpression firstPostExp = firstPost!=null?(BigraphExpression)firstPost.getExpression():null;
		
		String resourceContainer = firstPostExp.getContainer(firstResource.getName());
		
		if(resourceContainer == null ||
				!resourceContainer.equals(((IncidentEntity)firstLocation).getName())) {
			return null;
		}
		
		//till this point the given sequence satisfies the first activity in the pattern
		
		//need to check the 2nd activity
		
		return null;
	}
	
	public Activity mergeBasedOnByPassCardSystem(List<Activity> activitySequence) {
		
		//to be implemented
		
		return null;
	}
	
	/**
	 * Checks whether the two given entities have a connection
	 */
	public Connection hasConnection(String incidentEntity1, String incidentEntity2) {
			
		//look for a connection in the list of connections
		for(Connection con  : this.getConnection()) {
	
			IncidentEntity ent1 = (IncidentEntity)con.getEntity1();
			IncidentEntity ent2 = (IncidentEntity)con.getEntity2();
			
			if(ent1 == null || ent2 == null) {
				continue;
			}

			if(ent1.getName().equals(incidentEntity1) && ent2.getName().equals(incidentEntity2)) {
				return con;
			}
			
			if(ent1.getName().equals(incidentEntity2) && ent2.getName().equals(incidentEntity1)) {
				return con;
			}
		}
		
		return null;
	}
	
	/**
	 * Creates a new activity out of the given activity sequence
	 * @param activitySequence The sequence from which a new activity is created
	 * @return New <em>Activity</em> that replaces the sequence in the <em>Incident Diagram</em> 
	 */
	protected Activity createMergedActivity(EList<Activity> activitySequence) {
		
		if(activitySequence == null || activitySequence.size() == 0) {
			return null;
		}
		
		Activity initialActivity = activitySequence.get(0);
		Activity finalActivity = activitySequence.get(activitySequence.size() - 1);

		Activity mergedActivity = instance.createActivity();

		// set the new activity name

		mergedActivity.setName(ACTIVITY_NAME + activityNum++);
		if (activityNum >= MAX_LENGTH) {
			activityNum = 1;
		}

		mergedActivity.setSystemAction(initialActivity.getSystemAction());
		mergedActivity.setInitiator(initialActivity.getInitiator());
		mergedActivity.setType(initialActivity.getType());
		mergedActivity.getTargetedAssets().add(finalActivity.getTargetedAssets().get(0));
		
		//all pervious activities target assets are transferred to exploited assets
		for(int i=0;i<activitySequence.size()-1;i++) {
			EList<Asset> targetAssets = activitySequence.get(i).getTargetedAssets();
			
			if(targetAssets != null) {
				for(Asset asset : targetAssets) {
					if(!mergedActivity.getExploitedAssets().contains(asset)) {
						mergedActivity.getExploitedAssets().add(asset);
					}	
				}
			}
		}
		
		// update the next activities of the new activity to the one of the
		// final activity in the sequence
		replaceNextActivities(finalActivity, mergedActivity);
		// update the previous activities of the new activity to the one of the
		// initial activity in the sequence
		replacePreviousActivities(initialActivity, mergedActivity);


		// update conditions (pre & post)
		//get precondition of first activity. In future, check for null condition, if it is null then it can be replaced with the next precondition
		//same goes for the postcondition
		Precondition pre = initialActivity.getPrecondition();
		Postcondition post = finalActivity.getPostcondition();
		
		mergedActivity.setPrecondition(pre);
		mergedActivity.setPostcondition(post);
		
		// add merged activity to the sequence of activities at the position
		// where the starting activity in the sequence is located
		/*for (int i = 0; i < this.getActivity().size(); i++) {
			if (this.getActivity().get(i).equals(initialActivity)) {
				this.getActivity().add(i, mergedActivity);
				break;
			}
		}*/
		addNewActivityToSequence(mergedActivity, initialActivity);

			
		// remove the sequence of activities
		removeMergedActivitiesFromSequence(activitySequence);
		
		this.activity = null;
//		this.getActivity().removeAll(activitySequence);

		return mergedActivity;
	}

	/**
	 * Adds the new merged activity to the original sequence of activities. It is added in place of the
	 * given second argument 
	 * @param mergedActivity new merged activity
	 * @param originalActivity the activity in aequence where the new activity will be placed before
	 */
	protected void addNewActivityToSequence(Activity mergedActivity, Activity originalActivity){
		
		for(Scene scene:  getScene()) {
			EList<Activity> sceneActivities = scene.getActivity();
			for (int i = 0; i < sceneActivities.size(); i++) {
				if (sceneActivities.get(i).equals(originalActivity)) {
					sceneActivities.add(i, mergedActivity);
					break;
				}
			}
		}
	}
	
	protected void removeMergedActivitiesFromSequence(EList<Activity> activitySequence) {
		
//		List<Activity> activitiesToRemove = new LinkedList<Activity>();
		
		for(Scene scene:  getScene()) {
			EList<Activity> sceneActivities = scene.getActivity();
			for (int i = 0; i < sceneActivities.size(); i++) {
				if (sceneActivities.get(i).equals(activitySequence.get(0))) {
					sceneActivities.removeAll(activitySequence);
					/*for(int j=i;j<sceneActivities.size();j++) {
						
					}*/
//					sceneActivities.add(i, mergedActivity);
					break;
				}
			}
		}
	}
	
	protected void replaceNextActivities(Activity sourceActivity, Activity  targetActivity) {
		
		//set next activities, which is the next activity in the source activity
		if (sourceActivity.getNextActivities().size() > 0) {
			for (Activity nextAct : sourceActivity.getNextActivities()) {
				targetActivity.getNextActivities().add(nextAct);
				
				// set previous activity of the next activity to be the target
				// activity
				nextAct.getPreviousActivities().remove(sourceActivity);
				nextAct.getPreviousActivities().add(targetActivity);
			}
		}
	}
	
	protected void replacePreviousActivities(Activity sourceActivity,Activity  targetActivity) {
		
		if(sourceActivity.getPreviousActivities().size() >0) {
			for(Activity prevActivity : sourceActivity.getPreviousActivities()) {
				targetActivity.getPreviousActivities().add(prevActivity);
				
				//set the next activity of the previous activity to be the target activity
				prevActivity.getNextActivities().remove(sourceActivity);
				prevActivity.getNextActivities().add(targetActivity);
			}
		}
	}
	
	public Map<Activity, List<Activity>> getMergedActivities() {
		return mergedActivities;
	}
	
	public List<Integer> getMergedRules() {
		return mergedRules;
	}
	
	//can be used to clean data saved in an abstract incident so that it cannot be accessed via it
	public void setMergedRules() {
		mergedRules.clear();
	}
	
	public Scene getScene(String sceneName) {
	
		 for(Scene scene : getScene()) {
			 if(scene.getName() != null && scene.getName().equals(sceneName)) {
				 return scene;
			 }
		 }
		 
		 return null;
	 }
	 
/*	protected void print(String msg) {
		
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
	protected IncidentDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalIncidentPackage.Literals.INCIDENT_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrimeScript getCrimeScript() {
		return crimeScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrimeScript(CrimeScript newCrimeScript, NotificationChain msgs) {
		CrimeScript oldCrimeScript = crimeScript;
		crimeScript = newCrimeScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CRIME_SCRIPT, oldCrimeScript, newCrimeScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrimeScript(CrimeScript newCrimeScript) {
		if (newCrimeScript != crimeScript) {
			NotificationChain msgs = null;
			if (crimeScript != null)
				msgs = ((InternalEObject)crimeScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CRIME_SCRIPT, null, msgs);
			if (newCrimeScript != null)
				msgs = ((InternalEObject)newCrimeScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CRIME_SCRIPT, null, msgs);
			msgs = basicSetCrimeScript(newCrimeScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CRIME_SCRIPT, newCrimeScript, newCrimeScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scene> getScene() {
		if (scene == null) {
			scene = new EObjectContainmentEList<Scene>(Scene.class, this, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__SCENE);
		}
		return scene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intent getIntent() {
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntent(Intent newIntent, NotificationChain msgs) {
		Intent oldIntent = intent;
		intent = newIntent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__INTENT, oldIntent, newIntent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntent(Intent newIntent) {
		if (newIntent != intent) {
			NotificationChain msgs = null;
			if (intent != null)
				msgs = ((InternalEObject)intent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__INTENT, null, msgs);
			if (newIntent != null)
				msgs = ((InternalEObject)newIntent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__INTENT, null, msgs);
			msgs = basicSetIntent(newIntent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__INTENT, newIntent, newIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getGoal() {
		if (goal == null) {
			goal = new EObjectContainmentEList<Goal>(Goal.class, this, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__GOAL);
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Motive> getMotive() {
		if (motive == null) {
			motive = new EObjectContainmentEList<Motive>(Motive.class, this, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__MOTIVE);
		}
		return motive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getAsset() {
		if (asset == null) {
			asset = new EObjectContainmentEList<Asset>(Asset.class, this, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ASSET);
		}
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentEList<Resource>(Resource.class, this, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__RESOURCE);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActor() {
		if (actor == null) {
			actor = new EObjectContainmentEList<Actor>(Actor.class, this, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ACTOR);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<Connection>(Connection.class, this, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Path> getPaths() {
		if (paths == null) {
			paths = new EObjectContainmentEList<Path>(Path.class, this, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__PATHS);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CRIME_SCRIPT:
				return basicSetCrimeScript(null, msgs);
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__SCENE:
				return ((InternalEList<?>)getScene()).basicRemove(otherEnd, msgs);
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__INTENT:
				return basicSetIntent(null, msgs);
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__GOAL:
				return ((InternalEList<?>)getGoal()).basicRemove(otherEnd, msgs);
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__MOTIVE:
				return ((InternalEList<?>)getMotive()).basicRemove(otherEnd, msgs);
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ASSET:
				return ((InternalEList<?>)getAsset()).basicRemove(otherEnd, msgs);
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__RESOURCE:
				return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ACTOR:
				return ((InternalEList<?>)getActor()).basicRemove(otherEnd, msgs);
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__PATHS:
				return ((InternalEList<?>)getPaths()).basicRemove(otherEnd, msgs);
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
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CRIME_SCRIPT:
				return getCrimeScript();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__SCENE:
				return getScene();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__INTENT:
				return getIntent();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__GOAL:
				return getGoal();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__MOTIVE:
				return getMotive();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ASSET:
				return getAsset();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__RESOURCE:
				return getResource();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ACTOR:
				return getActor();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CONNECTION:
				return getConnection();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__PATHS:
				return getPaths();
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
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CRIME_SCRIPT:
				setCrimeScript((CrimeScript)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__SCENE:
				getScene().clear();
				getScene().addAll((Collection<? extends Scene>)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__INTENT:
				setIntent((Intent)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__GOAL:
				getGoal().clear();
				getGoal().addAll((Collection<? extends Goal>)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__MOTIVE:
				getMotive().clear();
				getMotive().addAll((Collection<? extends Motive>)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ASSET:
				getAsset().clear();
				getAsset().addAll((Collection<? extends Asset>)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__RESOURCE:
				getResource().clear();
				getResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ACTOR:
				getActor().clear();
				getActor().addAll((Collection<? extends Actor>)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connection>)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__PATHS:
				getPaths().clear();
				getPaths().addAll((Collection<? extends Path>)newValue);
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
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CRIME_SCRIPT:
				setCrimeScript((CrimeScript)null);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__SCENE:
				getScene().clear();
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__INTENT:
				setIntent((Intent)null);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__GOAL:
				getGoal().clear();
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__MOTIVE:
				getMotive().clear();
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ASSET:
				getAsset().clear();
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__RESOURCE:
				getResource().clear();
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ACTOR:
				getActor().clear();
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CONNECTION:
				getConnection().clear();
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__PATHS:
				getPaths().clear();
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
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CRIME_SCRIPT:
				return crimeScript != null;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__SCENE:
				return scene != null && !scene.isEmpty();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__INTENT:
				return intent != null;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__GOAL:
				return goal != null && !goal.isEmpty();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__MOTIVE:
				return motive != null && !motive.isEmpty();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ASSET:
				return asset != null && !asset.isEmpty();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__RESOURCE:
				return resource != null && !resource.isEmpty();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ACTOR:
				return actor != null && !actor.isEmpty();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CONNECTION:
				return connection != null && !connection.isEmpty();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__PATHS:
				return paths != null && !paths.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void setSystemModel(EnvironmentDiagram systemModel) {
		this.systemModel = systemModel;
		
	}

	public EList<Activity> getActivity() {
		
		if(activity != null) {
			return activity;
		}
		
		activity = new BasicEList<Activity>();
		
		for(Scene scene : getScene()) {
			activity.addAll(scene.getActivity());
		}
		
		return activity;
	}
	
	public Map<String, Integer> getActivitySequence()  {
		
		if(activitiesSequence == null || activitiesSequence.isEmpty()) {
			generateActivitySequence();
		}
		
		return activitiesSequence;
	}
	
	public void setActivitySequence(Map<String, Integer> actSequence)  {
		
		activitiesSequence = actSequence;
	}
	
	protected void generateActivitySequence() {	
			
		Activity initialActivity = getInitialActivity();
		Activity current = initialActivity;
		boolean isDone = false;
		activitiesSequence = new HashMap<String, Integer>();
		int index = 0;
		
		do {
			
			if(current != null) {
				activitiesSequence.put(current.getName(), index);
				index++;
				current = !current.getNextActivities().isEmpty()?current.getNextActivities().get(0):null;
			} else {
				isDone = true;
			}
			
		}  while(!isDone);
		
	}
	
	public String getActivityName(int index) {
	
		Map<String, Integer> activitiesSequence = getActivitySequence();
		
		if(activitiesSequence.containsValue(index)) {
			for(Entry<String, Integer> entry: activitiesSequence.entrySet()) {
				if(entry.getValue().equals(index)) {
					return entry.getKey();
				}
			}
		}
		return null;
	}
	
	public Activity getActivity(int index) {
		
		Map<String, Integer> activitiesSequence = getActivitySequence();
		String actName = null;
		
		if(activitiesSequence.containsValue(index)) {
			for(Entry<String, Integer> entry: activitiesSequence.entrySet()) {
				if(entry.getValue().equals(index)) {
					actName = entry.getKey();
					break;
				}
			}
		}
		
		if(actName != null) {
			for(Activity act : getActivity()) {
				if(act.getName() != null && act.getName().equals(actName)) {
					return act;
				}
			}
		}
		
		return null;
	}
	
	public LinkedList<Activity> getActivitySequence(int[] indicesSequence) {
		
		if(indicesSequence == null || indicesSequence.length == 0) {
			return null;
		}
		
	
		LinkedList<Activity> result = new LinkedList<Activity>();
		
		for(int index : indicesSequence) {
			result.add(getActivity(index));
		}
		/*Activity firstAct = getActivity(indicesSequence[0]);
		Activity lastAct = getActivity(indicesSequence[indicesSequence.length-1]);
		
		Activity next = !firstAct.getNextActivities().isEmpty()?firstAct.getNextActivities().get(0):null;
		
		result.add(firstAct);
		
		if(indicesSequence.length == 1) {
			return result;
		}
		
		while(next != null && !next.equals(lastAct)) {
			result.add(next);
			next = !firstAct.getNextActivities().isEmpty()?firstAct.getNextActivities().get(0):null;
		}
		
		result.add(lastAct);
		*/
		return result;
	}
	
	
	public int[] getActivityNumberSequence(String startActivityName, String endActivityName) {
		
		Map<String, Integer> activitiesSequence = getActivitySequence();
		

		int startIndex = activitiesSequence.get(startActivityName);
		int endIndex = activitiesSequence.get(endActivityName);
		
		if(startIndex > endIndex) {
			return null;
		}
		
		int [] sequence = new int[(endIndex-startIndex)+1];
		
		for(int i =0; i<sequence.length;i++) {
			sequence[i] = startIndex;
			startIndex++;
		}
		
		return sequence;
	}
	
} //IncidentDiagramImpl
