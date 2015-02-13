package at.fhj.gaar.androidapp.generator;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import at.fhj.gaar.androidapp.appDsl.Application;

/**
 * Contains various helper methods
 */
public class GeneratorHelperUtil {

	public static String getProjectName(List<Application> applications, Application current) {
		if (applications.size() == 1 || current == null) {
			return "app";
		}
		
		int index = 1;
		for (Application application : applications) {
			if (current.equals(application)) {
				return "app" + index;
			}
			
			++ index;
		}
		
		return null; // should not happen (as never called if there are no applications)
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getFieldData(EList<?> list, Class<T> neededFieldClazz) {
		if (list == null) {
			return null;
		}
		
		Iterator<?> iterator = list.iterator();
    	
    	while (iterator.hasNext()) {
    		Object data = iterator.next();
    		if (neededFieldClazz.isAssignableFrom(data.getClass())) {
    			return (T) data;
    		}
    	}
		
		return null;
		
	}

	/**
	 * Takes e.g. "MainActivity" and turns it into "main_activity".
	 * 
	 * @param identifier
	 */
	public static String javaToAndroidIdentifier(String identifier) {
		String result = identifier.replaceAll("\\B([A-Z])", "_$1");
		
		if (result.length() > 0 && result.charAt(0) == '_') {
			result = result.substring(1, result.length());
		}
		
		return result.toLowerCase();
	}
	
}
