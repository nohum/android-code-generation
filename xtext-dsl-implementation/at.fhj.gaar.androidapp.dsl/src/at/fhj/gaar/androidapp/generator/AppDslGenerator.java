package at.fhj.gaar.androidapp.generator;

import java.util.logging.Logger;

import org.apache.velocity.app.VelocityEngine;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

import com.google.inject.Inject;

/**
 * The code generator.
 */
public class AppDslGenerator implements IGenerator {

	private static Logger logger = Logger.getLogger("DslGeneration");
	

	public AppDslGenerator() {
		logger.info("initializing DSL generator");

		VelocityEngine velocity = new VelocityEngine();

		velocity.setProperty(VelocityEngine.RUNTIME_LOG_LOGSYSTEM, new VelocityLoggingAdapter(logger));
		// TODO use ClasspathResourceLoader instead?
		velocity.setProperty(VelocityEngine.FILE_RESOURCE_LOADER_PATH, "templates");
		velocity.setProperty(VelocityEngine.VM_LIBRARY, "VM_global_library.vm,macros.vm");
		velocity.init();
		

	}

	@Override
	public void doGenerate(Resource input, IFileSystemAccess filesystem) {
		
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//		resource.allContents
//			.filter(typeof(Greeting))
//			.map[name]
//			.join(', '))

//		for(e: resource.allContents.toIterable.filter(Application)) {
//			
//			filesystem.generateFile(e.name + ".java", e.compile)
//		}

	}

}