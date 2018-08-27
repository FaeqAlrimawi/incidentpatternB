/**
 */
package cyberPhysical_Incident.impl;

import cyberPhysical_Incident.AbstractActivity;
import cyberPhysical_Incident.ActivityPattern;
import cyberPhysical_Incident.ActivityPatternSeverity;
import cyberPhysical_Incident.CyberPhysicalIncidentPackage;
import cyberPhysical_Incident.IncidentEntity;
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
 * An implementation of the model object '<em><b>Activity Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityPatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityPatternImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityPatternImpl#getAbstractactivity <em>Abstractactivity</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityPatternImpl#getIncidententity <em>Incidententity</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.ActivityPatternImpl#getPatternsFollow <em>Patterns Follow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityPatternImpl extends MinimalEObjectImpl.Container implements ActivityPattern {
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
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final ActivityPatternSeverity SEVERITY_EDEFAULT = ActivityPatternSeverity.LOW;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected ActivityPatternSeverity severity = SEVERITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAbstractactivity() <em>Abstractactivity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractactivity()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractActivity> abstractactivity;

	/**
	 * The cached value of the '{@link #getIncidententity() <em>Incidententity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidententity()
	 * @generated
	 * @ordered
	 */
	protected EList<IncidentEntity> incidententity;

	/**
	 * The cached value of the '{@link #getPatternsFollow() <em>Patterns Follow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternsFollow()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityPattern> patternsFollow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalIncidentPackage.Literals.ACTIVITY_PATTERN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPatternSeverity getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(ActivityPatternSeverity newSeverity) {
		ActivityPatternSeverity oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractActivity> getAbstractactivity() {
		if (abstractactivity == null) {
			abstractactivity = new EObjectContainmentEList<AbstractActivity>(AbstractActivity.class, this, CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__ABSTRACTACTIVITY);
		}
		return abstractactivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncidentEntity> getIncidententity() {
		if (incidententity == null) {
			incidententity = new EObjectContainmentEList<IncidentEntity>(IncidentEntity.class, this, CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__INCIDENTENTITY);
		}
		return incidententity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityPattern> getPatternsFollow() {
		if (patternsFollow == null) {
			patternsFollow = new EObjectResolvingEList<ActivityPattern>(ActivityPattern.class, this, CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__PATTERNS_FOLLOW);
		}
		return patternsFollow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__ABSTRACTACTIVITY:
				return ((InternalEList<?>)getAbstractactivity()).basicRemove(otherEnd, msgs);
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__INCIDENTENTITY:
				return ((InternalEList<?>)getIncidententity()).basicRemove(otherEnd, msgs);
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
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__NAME:
				return getName();
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__SEVERITY:
				return getSeverity();
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__ABSTRACTACTIVITY:
				return getAbstractactivity();
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__INCIDENTENTITY:
				return getIncidententity();
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__PATTERNS_FOLLOW:
				return getPatternsFollow();
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
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__NAME:
				setName((String)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__SEVERITY:
				setSeverity((ActivityPatternSeverity)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__ABSTRACTACTIVITY:
				getAbstractactivity().clear();
				getAbstractactivity().addAll((Collection<? extends AbstractActivity>)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__INCIDENTENTITY:
				getIncidententity().clear();
				getIncidententity().addAll((Collection<? extends IncidentEntity>)newValue);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__PATTERNS_FOLLOW:
				getPatternsFollow().clear();
				getPatternsFollow().addAll((Collection<? extends ActivityPattern>)newValue);
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
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__ABSTRACTACTIVITY:
				getAbstractactivity().clear();
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__INCIDENTENTITY:
				getIncidententity().clear();
				return;
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__PATTERNS_FOLLOW:
				getPatternsFollow().clear();
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
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__ABSTRACTACTIVITY:
				return abstractactivity != null && !abstractactivity.isEmpty();
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__INCIDENTENTITY:
				return incidententity != null && !incidententity.isEmpty();
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__PATTERNS_FOLLOW:
				return patternsFollow != null && !patternsFollow.isEmpty();
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
		result.append(", Severity: ");
		result.append(severity);
		result.append(')');
		return result.toString();
	}

} //ActivityPatternImpl
