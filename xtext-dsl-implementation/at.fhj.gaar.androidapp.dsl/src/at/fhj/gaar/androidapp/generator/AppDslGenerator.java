package at.fhj.gaar.androidapp.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

import at.fhj.gaar.androidapp.appDsl.Application;
import at.fhj.gaar.androidapp.generator.content.AndroidManifestGenerator;
import at.fhj.gaar.androidapp.generator.content.ContentGenerator;
import at.fhj.gaar.androidapp.generator.content.GradleProjectGenerator;
import at.fhj.gaar.androidapp.generator.content.ServiceClassGenerator;

/**
 * The code generator.
 */
public class AppDslGenerator implements IGenerator {

	private static Logger logger = Logger.getLogger("DslGeneration");
	
	private List<ContentGenerator> generators;

	public AppDslGenerator() {
		logger.info("initializing DSL generator");

		generators = new ArrayList<>();
		generators.add(new GradleProjectGenerator());
		generators.add(new AndroidManifestGenerator());
		generators.add(new ServiceClassGenerator());
		
		logger.info(String.format("added %d DSL sub-generators", generators.size()));
	}

	@Override
	public void doGenerate(Resource input, IFileSystemAccess filesystem) {
		logger.info("START generating source-code from DSL");
		List<Application> applications = retrieveApplications(input);
		
		for (ContentGenerator generator : generators) {
			generator.generate(applications, filesystem);
		}
		
		logger.info("FINISHED generating source-code from DSL");
	}

	private List<Application> retrieveApplications(Resource input) {
		// .get(0) returns the root node, an AndroidAppProject, which in turn contain possibly
		// multiple Application objects
		List<EObject> objects = input.getContents().get(0).eContents();
		List<Application> applications = new ArrayList<Application>(objects.size());
		
		for (EObject object : objects) {
			applications.add((Application) object);
		}
		
		return applications;
	}
	


}