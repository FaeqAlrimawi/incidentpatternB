/**
 */
package cyberPhysical_Incident.impl;

import cyberPhysical_Incident.Connectivity;
import cyberPhysical_Incident.CyberPhysicalIncidentPackage;
import cyberPhysical_Incident.InnerName;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inner Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.impl.InnerNameImpl#getName <em>Name</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.InnerNameImpl#isIsClosed <em>Is Closed</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.InnerNameImpl#getOutername <em>Outername</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InnerNameImpl extends MinimalEObjectImpl.Container implements InnerName {
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
	 * The default value of the '{@link #isIsClosed() <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsClosed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CLOSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsClosed() <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsClosed()
	 * @generated
	 * @ordered
	 */
	protected boolean isClosed = IS_CLOSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutername() <em>Outername</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutername()
	 * @generated
	 * @ordered
	 */
	protected Connectivity outername;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InnerNameImpl() {
		super();
	}
	
	protected InnerNameImpl(InnerName innerName) {
		super();
		
		setName(innerName.getName());
		setIsClosed(innerName.isIsClosed());
		setOutername(new ConnectivityImpl(innerName.getOutername()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalIncidentPackage.Literals.INNER_NAME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.INNER_NAME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsClosed() {
		return isClosed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsClosed(boolean newIsClosed) {
		boolean oldIsClosed = isClosed;
		isClosed = newIsClosed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.INNER_NAME__IS_CLOSED, oldIsClosed, isClosed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connectivity getOutername() {
		if (outername != null && outername.eIsProxy()) {
			InternalEObject oldOutername = (InternalEObject)outername;
			outername = (Connectivity)eResolveProxy(oldOutername);
			if (outername != oldOutername) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CyberPhysicalIncidentPackage.INNER_NAME__OUTERNAME, oldOutername, outername));
			}
		}
		return outername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connectivity basicGetOutername() {
		return outername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutername(Connectivity newOutername) {
		Connectivity oldOutername = outername;
		outername = newOutername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.INNER_NAME__OUTERNAME, oldOutername, outername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.INNER_NAME__NAME:
				return getName();
			case CyberPhysicalIncidentPackage.INNER_NAME__IS_CLOSED:
				return isIsClosed();
			case CyberPhysicalIncidentPackage.INNER_NAME__OUTERNAME:
				if (resolve) return getOutername();
				return basicGetOutername();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.INNER_NAME__NAME:
				setName((String)newValue);
				return;
			case CyberPhysicalIncidentPackage.INNER_NAME__IS_CLOSED:
				setIsClosed((Boolean)newValue);
				return;
			case CyberPhysicalIncidentPackage.INNER_NAME__OUTERNAME:
				setOutername((Connectivity)newValue);
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
			case CyberPhysicalIncidentPackage.INNER_NAME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.INNER_NAME__IS_CLOSED:
				setIsClosed(IS_CLOSED_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.INNER_NAME__OUTERNAME:
				setOutername((Connectivity)null);
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
			case CyberPhysicalIncidentPackage.INNER_NAME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CyberPhysicalIncidentPackage.INNER_NAME__IS_CLOSED:
				return isClosed != IS_CLOSED_EDEFAULT;
			case CyberPhysicalIncidentPackage.INNER_NAME__OUTERNAME:
				return outername != null;
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
		result.append(", isClosed: ");
		result.append(isClosed);
		result.append(')');
		return result.toString();
	}

} //InnerNameImpl
