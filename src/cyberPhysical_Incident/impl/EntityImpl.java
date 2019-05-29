/**
 */
package cyberPhysical_Incident.impl;

import cyberPhysical_Incident.Connectivity;
import cyberPhysical_Incident.CyberPhysicalIncidentPackage;
import cyberPhysical_Incident.Entity;
import cyberPhysical_Incident.Site;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.EntityImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.EntityImpl#getConnectivity <em>Connectivity</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.EntityImpl#getSite <em>Site</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.EntityImpl#isHasSite <em>Has Site</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
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
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entity;

	/**
	 * The cached value of the '{@link #getConnectivity() <em>Connectivity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Connectivity> connectivity;

	/**
	 * The cached value of the '{@link #getSite() <em>Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected Site site;
	
/**
	 * The default value of the '{@link #isHasSite() <em>Has Site</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasSite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_SITE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHasSite() <em>Has Site</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasSite()
	 * @generated
	 * @ordered
	 */
	protected boolean hasSite = HAS_SITE_EDEFAULT;

	//	protected static int siteNumber = 1;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	protected EntityImpl() {
		super();
		
		//create a default site (instead of having the user creating one). Required when matching to 
		//a system state. The common state is to have a site associated with an entity
		if(getSite() == null) {
			Site site = new SiteImpl();
//			site.setName(""+siteNumber);
			setSite(site);
//			siteNumber++;
		}
	}

	protected EntityImpl(Entity entity) {
		super();
	
		setName(entity.getName());
		
		//add sub-entities
		for(Entity ent : entity.getEntity()) {
		
			getEntity().add(new EntityImpl(ent));
		}
		
		//add connectivities
		for(Connectivity con : entity.getConnectivity()) {
			getConnectivity().add(new ConnectivityImpl(con));
		}
		
		setSite(new SiteImpl(entity.getSite()));
		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalIncidentPackage.Literals.ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentEList<Entity>(Entity.class, this, CyberPhysicalIncidentPackage.ENTITY__ENTITY);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connectivity> getConnectivity() {
		if (connectivity == null) {
			connectivity = new EObjectContainmentEList<Connectivity>(Connectivity.class, this, CyberPhysicalIncidentPackage.ENTITY__CONNECTIVITY);
		}
		return connectivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site getSite() {
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSite(Site newSite, NotificationChain msgs) {
		Site oldSite = site;
		site = newSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ENTITY__SITE, oldSite, newSite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSite(Site newSite) {
		if (newSite != site) {
			NotificationChain msgs = null;
			if (site != null)
				msgs = ((InternalEObject)site).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.ENTITY__SITE, null, msgs);
			if (newSite != null)
				msgs = ((InternalEObject)newSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.ENTITY__SITE, null, msgs);
			msgs = basicSetSite(newSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ENTITY__SITE, newSite, newSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasSite() {
		return hasSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 */
	public void setHasSite(boolean newHasSite) {
		boolean oldHasSite = hasSite;
		hasSite = newHasSite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ENTITY__HAS_SITE, oldHasSite, hasSite));
		
		//if there's change in hasSite e.g., from true to false
		if(!((oldHasSite && newHasSite) ||(!oldHasSite && !newHasSite))){
			
			//if set to true create a new site
			if(newHasSite) {
				setSite(new SiteImpl());
			} else {
				setSite(null);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.ENTITY__ENTITY:
				return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
			case CyberPhysicalIncidentPackage.ENTITY__CONNECTIVITY:
				return ((InternalEList<?>)getConnectivity()).basicRemove(otherEnd, msgs);
			case CyberPhysicalIncidentPackage.ENTITY__SITE:
				return basicSetSite(null, msgs);
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
			case CyberPhysicalIncidentPackage.ENTITY__NAME:
				return getName();
			case CyberPhysicalIncidentPackage.ENTITY__ENTITY:
				return getEntity();
			case CyberPhysicalIncidentPackage.ENTITY__CONNECTIVITY:
				return getConnectivity();
			case CyberPhysicalIncidentPackage.ENTITY__SITE:
				return getSite();
			case CyberPhysicalIncidentPackage.ENTITY__HAS_SITE:
				return isHasSite();
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
			case CyberPhysicalIncidentPackage.ENTITY__NAME:
				setName((String)newValue);
				return;
			case CyberPhysicalIncidentPackage.ENTITY__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends Entity>)newValue);
				return;
			case CyberPhysicalIncidentPackage.ENTITY__CONNECTIVITY:
				getConnectivity().clear();
				getConnectivity().addAll((Collection<? extends Connectivity>)newValue);
				return;
			case CyberPhysicalIncidentPackage.ENTITY__SITE:
				setSite((Site)newValue);
				return;
			case CyberPhysicalIncidentPackage.ENTITY__HAS_SITE:
				setHasSite((Boolean)newValue);
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
			case CyberPhysicalIncidentPackage.ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.ENTITY__ENTITY:
				getEntity().clear();
				return;
			case CyberPhysicalIncidentPackage.ENTITY__CONNECTIVITY:
				getConnectivity().clear();
				return;
			case CyberPhysicalIncidentPackage.ENTITY__SITE:
				setSite((Site)null);
				return;
			case CyberPhysicalIncidentPackage.ENTITY__HAS_SITE:
				setHasSite(HAS_SITE_EDEFAULT);
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
			case CyberPhysicalIncidentPackage.ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CyberPhysicalIncidentPackage.ENTITY__ENTITY:
				return entity != null && !entity.isEmpty();
			case CyberPhysicalIncidentPackage.ENTITY__CONNECTIVITY:
				return connectivity != null && !connectivity.isEmpty();
			case CyberPhysicalIncidentPackage.ENTITY__SITE:
				return site != null;
			case CyberPhysicalIncidentPackage.ENTITY__HAS_SITE:
				return hasSite != HAS_SITE_EDEFAULT;
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
		result.append(", hasSite: ");
		result.append(hasSite);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
