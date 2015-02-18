package at.fhj.gaar.androidapp.generator.content

import at.fhj.gaar.androidapp.appDsl.Application
import java.io.InputStream
import java.util.List
import java.util.logging.Logger
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccessExtension3

public class DrawableResourcesGenerator extends AbstractGenerator {
	
	override generate(List<Application> applications, IFileSystemAccess filesystem) {
		if (!(filesystem instanceof IFileSystemAccessExtension3)) {
			Logger.getLogger("").warning("filesystem does not support writing binary files, skipping");
			return;
		}
		
		var binaryFilesystem = filesystem as IFileSystemAccessExtension3;
		
		for (app: applications) {
			var projectName = getProjectName(applications, app);
			
			binaryFilesystem.generateFile(String.format("%s/src/main/res/drawable-hdpi/ic_launcher.png", projectName),
				getDrawableStream("ic_launcher_hdpi.png")
			);
		
			binaryFilesystem.generateFile(String.format("%s/src/main/res/drawable-xhdpi/ic_launcher.png", projectName),
				getDrawableStream("ic_launcher_xhdpi.png")
			);
			
			binaryFilesystem.generateFile(String.format("%s/src/main/res/drawable-xxhdpi/ic_launcher.png", projectName),
				getDrawableStream("ic_launcher_xxhdpi.png")
			);
		}
	}
	
	private def InputStream getDrawableStream(String filename) {
		return class.classLoader.getResourceAsStream(String.format("at/fhj/gaar/androidapp/generator/resources/%s",
			filename
		));
	}
	
	
}