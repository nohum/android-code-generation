package at.fhj.gaar.androidapp.generator.content;

import at.fhj.gaar.androidapp.appDsl.Application;
import at.fhj.gaar.androidapp.generator.content.ContentGenerator;
import java.util.List;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class GradleProjectGenerator implements ContentGenerator {
  public void generate(final List<Application> applications, final IFileSystemAccess filesystem) {
    String _retrieveRootBuildGradle = this.retrieveRootBuildGradle(applications);
    filesystem.generateFile("build.gradle", _retrieveRootBuildGradle);
    String _retrieveSettingsGradle = this.retrieveSettingsGradle(applications);
    filesystem.generateFile("settings.gradle", _retrieveSettingsGradle);
  }
  
  private String retrieveRootBuildGradle(final List<Application> applications) {
    return null;
  }
  
  private String retrieveSettingsGradle(final List<Application> applications) {
    return null;
  }
}
