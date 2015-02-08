package at.fhj.gaar.androidapp.generator;

import java.util.logging.Logger;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

/**
 * The code generator.
 */
public class AppDslGenerator implements IGenerator {

	private static Logger logger = Logger.getLogger("DslGeneration");
	

	public AppDslGenerator() {
		logger.info("initializing DSL generator");

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