package externalUtility;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import cyberPhysical_Incident.CyberPhysicalIncidentPackage;
import cyberPhysical_Incident.IncidentDiagram;
import cyberPhysical_Incident.impl.IncidentDiagramImpl;

public class IncidentModelHandler {

	private static final String EXTENSION = "cpi";

	/**
	 * Load an incident model from the given file name
	 * 
	 * @param fileName
	 *            the XMI file of the incident model
	 * @return an IncidentDigram object containing the model information
	 */
	public static IncidentDiagram loadIncidentFromFile(String fileName) {

		IncidentDiagram incidentDiagram = null;

		// generate EPackages from schemas
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

		ResourceSet rs = new ResourceSetImpl();
		// enable extended metadata
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(rs.getPackageRegistry());
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);

		EPackage.Registry.INSTANCE.put(CyberPhysicalIncidentPackage.eNS_URI, CyberPhysicalIncidentPackage.eINSTANCE);

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(EXTENSION, new XMLResourceFactoryImpl() {

			public Resource createResource(URI uri) {

				XMLResource xmlResource = new XMLResourceImpl(uri);

				return xmlResource;
			}
		});

		try {

			Resource r = rs.getResource(URI.createFileURI(fileName), true);

			EObject eObject = r.getContents().get(0);

			if (eObject instanceof EPackage) {
				EPackage p = (EPackage) eObject;
				rs.getPackageRegistry().put(p.getNsURI(), p);
			}

			incidentDiagram = (IncidentDiagramImpl) eObject;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return incidentDiagram;

	}

	/**
	 * Save an incident model (given by the IncidentDiagram object) to the given
	 * file name
	 * 
	 * @param incidentDiagram
	 *            the object holding the incident model information
	 * @param fileName
	 *            the target file to save the model to
	 * @return True if saving is successful. False otherwise.
	 */
	public static boolean SaveIncidentToFile(IncidentDiagram incidentDiagram, String fileName) {

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

		ResourceSet rs = new ResourceSetImpl();
		// enable extended metadata
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(rs.getPackageRegistry());
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);

		EPackage.Registry.INSTANCE.put(CyberPhysicalIncidentPackage.eNS_URI, CyberPhysicalIncidentPackage.eINSTANCE);

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(EXTENSION, new XMIResourceFactoryImpl() {

			public Resource createResource(URI uri) {

				XMLResource xmiResource = new XMLResourceImpl(uri);

				return xmiResource;
			}
		});

		try {
			Resource r = rs.createResource(URI.createFileURI(fileName));

			r.getContents().add(incidentDiagram);

			r.save(Collections.EMPTY_MAP);

			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

	}

}
