/**
 */
package cyberPhysical_Incident.impl;

import cyberPhysical_Incident.CyberPhysical_IncidentPackage;
import cyberPhysical_Incident.Postcondition;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postcondition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PostconditionImpl extends ConditionImpl implements Postcondition {

	
	protected static int condNum = 1;
	protected static String condName = "postcondition";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	protected PostconditionImpl() {
		super();
		
		setName(condName+"_"+condNum);
		
		condNum++;
		
		if((Long.MAX_VALUE-condNum) < 100) {
			condNum  =1;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysical_IncidentPackage.Literals.POSTCONDITION;
	}

} //PostconditionImpl
