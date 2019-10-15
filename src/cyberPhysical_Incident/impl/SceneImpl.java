/**
 */
package cyberPhysical_Incident.impl;

import cyberPhysical_Incident.Activity;
import cyberPhysical_Incident.CyberPhysicalIncidentPackage;
import cyberPhysical_Incident.Scene;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scene</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.impl.SceneImpl#getName <em>Name</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.SceneImpl#getNextScenes <em>Next Scenes</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.SceneImpl#getPreviousScenes <em>Previous Scenes</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.SceneImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.SceneImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SceneImpl extends MinimalEObjectImpl.Container implements Scene {
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
	 * The cached value of the '{@link #getNextScenes() <em>Next Scenes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextScenes()
	 * @generated
	 * @ordered
	 */
	protected EList<Scene> nextScenes;

	/**
	 * The cached value of the '{@link #getPreviousScenes() <em>Previous Scenes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousScenes()
	 * @generated
	 * @ordered
	 */
	protected EList<Scene> previousScenes;

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
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SceneImpl() {
		super();
	}

	public Activity getInitialActivity() {
		
		Activity initialActivity = null;
		EList<Activity> activities = getActivity();
		
		for(Activity act : activities) {
			
			EList<Activity> preActivities = act.getPreviousActivities();
			
			//if it does not have previous activites (i.e. activity is the first activity in the first scene)
			if(preActivities == null || preActivities.size() == 0) {
				return act;
			}
			
			if(!activities.containsAll(preActivities)) {
				return act;
			}
			
			/*for(Activity prev : preActivities) {
				//if it has previous activities to activities of different scene
				if(!activities.contains(prev)) {
					return act;
				}
			}*/
		}
		return initialActivity;
	}
	
	public Activity getActivity(String activityName) {
		
		if(activityName == null || activityName.isEmpty()) {
			return null;
		}
		
		for(Activity act : getActivity()) {
			if(act.getName().equals(activityName)) {
				return act;
			}
		}
		
		return null;
	}
	
	public Activity getFinalActivity() {
		
		Activity finalActivity = null;
		EList<Activity> activities = getActivity();
		
		for(Activity act : activities) {
			
			EList<Activity> nextctivities = act.getNextActivities();
			
			//if it does not have previous activites (i.e. activity is the first activity in the first scene)
			if(nextctivities == null || nextctivities.size() == 0) {
				return act;
			}
			
			if(!activities.containsAll(nextctivities)) {
				return act;
			}
			
			/*for(Activity prev : preActivities) {
				//if it has previous activities to activities of different scene
				if(!activities.contains(prev)) {
					return act;
				}
			}*/
		}
		return finalActivity;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalIncidentPackage.Literals.SCENE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.SCENE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scene> getNextScenes() {
		if (nextScenes == null) {
			nextScenes = new EObjectResolvingEList<Scene>(Scene.class, this, CyberPhysicalIncidentPackage.SCENE__NEXT_SCENES);
		}
		return nextScenes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scene> getPreviousScenes() {
		if (previousScenes == null) {
			previousScenes = new EObjectResolvingEList<Scene>(Scene.class, this, CyberPhysicalIncidentPackage.SCENE__PREVIOUS_SCENES);
		}
		return previousScenes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.SCENE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Activity> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<Activity>(Activity.class, this, CyberPhysicalIncidentPackage.SCENE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.SCENE__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
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
			case CyberPhysicalIncidentPackage.SCENE__NAME:
				return getName();
			case CyberPhysicalIncidentPackage.SCENE__NEXT_SCENES:
				return getNextScenes();
			case CyberPhysicalIncidentPackage.SCENE__PREVIOUS_SCENES:
				return getPreviousScenes();
			case CyberPhysicalIncidentPackage.SCENE__DESCRIPTION:
				return getDescription();
			case CyberPhysicalIncidentPackage.SCENE__ACTIVITY:
				return getActivity();
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
			case CyberPhysicalIncidentPackage.SCENE__NAME:
				setName((String)newValue);
				return;
			case CyberPhysicalIncidentPackage.SCENE__NEXT_SCENES:
				getNextScenes().clear();
				getNextScenes().addAll((Collection<? extends Scene>)newValue);
				return;
			case CyberPhysicalIncidentPackage.SCENE__PREVIOUS_SCENES:
				getPreviousScenes().clear();
				getPreviousScenes().addAll((Collection<? extends Scene>)newValue);
				return;
			case CyberPhysicalIncidentPackage.SCENE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CyberPhysicalIncidentPackage.SCENE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends Activity>)newValue);
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
			case CyberPhysicalIncidentPackage.SCENE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.SCENE__NEXT_SCENES:
				getNextScenes().clear();
				return;
			case CyberPhysicalIncidentPackage.SCENE__PREVIOUS_SCENES:
				getPreviousScenes().clear();
				return;
			case CyberPhysicalIncidentPackage.SCENE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.SCENE__ACTIVITY:
				getActivity().clear();
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
			case CyberPhysicalIncidentPackage.SCENE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CyberPhysicalIncidentPackage.SCENE__NEXT_SCENES:
				return nextScenes != null && !nextScenes.isEmpty();
			case CyberPhysicalIncidentPackage.SCENE__PREVIOUS_SCENES:
				return previousScenes != null && !previousScenes.isEmpty();
			case CyberPhysicalIncidentPackage.SCENE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CyberPhysicalIncidentPackage.SCENE__ACTIVITY:
				return activity != null && !activity.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SceneImpl
