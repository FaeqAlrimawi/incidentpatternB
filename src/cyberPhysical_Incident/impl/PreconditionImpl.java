/**
 */
package cyberPhysical_Incident.impl;

import cyberPhysical_Incident.CyberPhysicalIncidentPackage;
import cyberPhysical_Incident.Precondition;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precondition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PreconditionImpl extends ConditionImpl implements Precondition {
	
	
//	protected static int condNum = 1;
//	protected static String condName = "precondition";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	protected PreconditionImpl() {
		super();
		
		/*setName(condName+"_"+condNum);
		
		condNum++;
		
		if((Long.MAX_VALUE-condNum) < 100) {
			condNum  =1;
		}*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalIncidentPackage.Literals.PRECONDITION;
	}

} //PreconditionImpl
