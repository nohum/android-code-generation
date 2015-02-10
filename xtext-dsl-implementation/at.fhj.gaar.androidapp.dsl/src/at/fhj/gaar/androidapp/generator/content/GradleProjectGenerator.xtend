package at.fhj.gaar.androidapp.generator.content

import java.util.List
import at.fhj.gaar.androidapp.appDsl.Application
import org.eclipse.xtext.generator.IFileSystemAccess

public class GradleProjectGenerator implements ContentGenerator {
	
	override generate(List<Application> applications, IFileSystemAccess filesystem) {
		filesystem.generateFile("build.gradle", retrieveRootBuildGradle(applications));
		filesystem.generateFile("settings.gradle", retrieveSettingsGradle(applications));
	}
	
	def private String retrieveRootBuildGradle(List<Application> applications) {
		
	}
	
	def private String retrieveSettingsGradle(List<Application> applications) {
		
	}
	
}