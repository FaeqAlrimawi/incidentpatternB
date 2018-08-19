/**
 */
package cyberPhysical_Incident.util;

import cyberPhysical_Incident.CyberPhysical_IncidentPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CyberPhysical_IncidentXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyberPhysical_IncidentXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		CyberPhysical_IncidentPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the CyberPhysical_IncidentResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new CyberPhysical_IncidentResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new CyberPhysical_IncidentResourceFactoryImpl());
		}
		return registrations;
	}

} //CyberPhysical_IncidentXMLProcessor
