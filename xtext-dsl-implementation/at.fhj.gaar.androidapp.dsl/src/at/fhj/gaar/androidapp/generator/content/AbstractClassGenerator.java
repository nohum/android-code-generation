package at.fhj.gaar.androidapp.generator.content;

import java.util.List;

import org.eclipse.xtext.generator.IFileSystemAccess;

import at.fhj.gaar.androidapp.appDsl.Application;
import at.fhj.gaar.androidapp.appDsl.ApplicationElement;
import at.fhj.gaar.androidapp.appDsl.ApplicationElementList;

/**
 * Filters out all elements of a specific type of an Application and calls a template
 * method to obtain the generated source code.
 */
public abstract class AbstractClassGenerator extends AbstractGenerator {

	@Override
	public void generate(List<Application> applications, IFileSystemAccess filesystem) {
		for (Application app: applications) {
			generateClassesForApp(filesystem, applications, app);
		}
	}
	
	private void generateClassesForApp(IFileSystemAccess filesystem, List<Application> applications,
			Application application) {
		String projectName = getProjectName(applications, application);
		ApplicationElementList elements = getFieldData(application.getAttributes(),
				ApplicationElementList.class);
			
		for (ApplicationElement element : elements.getElements()) {
			if (isAllowedElement(element)) {
				String classPath = application.getName().replace(".", "/");
			
				filesystem.generateFile(String.format("%s/src/main/java/%s/%s/%s.java", projectName,
						classPath, getSubClassPath(), element.getName()),
						retrieveElementTemplate(application, element));
			}
		}
	}
	
	protected abstract String getSubClassPath();
	
	protected abstract boolean isAllowedElement(ApplicationElement element);
	
	protected abstract String retrieveElementTemplate(Application application, ApplicationElement element);
}
