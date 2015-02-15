package at.fhj.gaar.androidapp.generator.content

import at.fhj.gaar.androidapp.appDsl.Application
import at.fhj.gaar.androidapp.appDsl.ElementLabelAttribute
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.xtext.generator.IFileSystemAccess
import at.fhj.gaar.androidapp.appDsl.ApplicationElementList
import at.fhj.gaar.androidapp.appDsl.Activity
import at.fhj.gaar.androidapp.appDsl.ActivityLayoutAttribute
import at.fhj.gaar.androidapp.appDsl.Button
import at.fhj.gaar.androidapp.appDsl.Text
import at.fhj.gaar.androidapp.appDsl.Service
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiver
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiverActionAttribute
import at.fhj.gaar.androidapp.appDsl.ActionShowToast

public class ValueResourcesGenerator extends AbstractGenerator {
	
	override generate(List<Application> applications, IFileSystemAccess filesystem) {
		for (app: applications) {
			var projectName = getProjectName(applications, app);
			
			filesystem.generateFile(String.format("%s/src/main/res/values/dimens.xml", projectName),
				generateDimensXml(app)
			);
			
			filesystem.generateFile(String.format("%s/src/main/res/values/styles.xml", projectName),
				generateStylesXml(app)
			);
			
			filesystem.generateFile(String.format("%s/src/main/res/values/strings.xml", projectName),
				generateStringsXml(app, projectName)
			);
		}
	}
	
	private def String generateDimensXml(Application application) {
		// default file
		
		return '''
		<?xml version="1.0" encoding="utf-8"?>
		<resources>
			<dimen name="activity_horizontal_margin">16dp</dimen>
		    <dimen name="activity_vertical_margin">16dp</dimen>
		</resources>
		''';
	}
	
	private def String generateStylesXml(Application application) {
		// default file
		
		return '''
		<?xml version="1.0" encoding="utf-8"?>
		<resources>

		    <style name="AppTheme" parent="Theme.AppCompat.Light.NoActionBar">
		        
		    </style>
		
		</resources>
		''';
	}
	
	private def String generateStringsXml(Application application, String projectName) {
		var Map<String, String> strings = new HashMap<String, String>();

		var appTitleField = getFieldData(application.attributes, typeof(ElementLabelAttribute));
		var appElements = getFieldData(application.attributes, typeof(ApplicationElementList));

		if (appElements != null) {
			processApplicationTreeForStrings(appElements, strings);
		}
		
		return '''
		<?xml version="1.0" encoding="utf-8"?>
		<resources>
		    <string name="app_title">«IF appTitleField != null»«appTitleField.title»«ELSE»«projectName»«ENDIF»</string>
		
			«FOR string : strings.entrySet»
			<string name="«string.key»">«string.value»</string>
			«ENDFOR»
		</resources>
		''';
	}
	
	private def processApplicationTreeForStrings(ApplicationElementList list, Map<String, String> strings) {
		// --- LIST OF POSSIBLE RESOURCES ---
		
		// activities, services, receivers
		// android:label="@string/«javaToAndroidIdentifier(activity.name)»_title"
		
		// activity layoutElement buttons: action toasts
		// R.string.«javaToAndroidIdentifier(activity.name)»_toast
		
		// receiver action: for toasts
		// R.string.«javaToAndroidIdentifier(receiver.name)»_toast
		
		// LAYOUTS: activity layoutElement buttons
		// «javaToAndroidIdentifier(activity.name)»_«javaToAndroidIdentifier(buttonName)»_title
		
		// LAYOUTS: activity layoutElement texts
		// «javaToAndroidIdentifier(activity.name)»_«javaToAndroidIdentifier(textIndex)»_text
		
		// Activities
		list.elements.filter[element | element instanceof Activity].forEach[activity |
			// Title
			var titleField = getFieldData((activity as Activity).attributes, typeof(ElementLabelAttribute));
			var title = activity.name;
			if (titleField != null) {
				title = titleField.title;
			}
			
			strings.put(javaToAndroidIdentifier(activity.name) + "_title", title);
			
			// Go through layout elements
			var layouts = getFieldData((activity as Activity).attributes, typeof(ActivityLayoutAttribute));
			if (layouts != null) {
				layouts.layoutElements.filter[layoutElement | layoutElement instanceof Button].forEach[button |
					// TODO first the button itself
					
					// TODO if the action of the button is a toast, add that as well
				];
				
				// Text elements
				layouts.layoutElements.filter[layoutElement | layoutElement instanceof Text].forEach[text, index |
					
				];
			}
		];
		
		// Services
		list.elements.filter[element | element instanceof Service].forEach[service |
			// Title
			var titleField = getFieldData((service as Service).attributes, typeof(ElementLabelAttribute));
			var title = service.name;
			if (titleField != null) {
				title = titleField.title;
			}
			
			strings.put(javaToAndroidIdentifier(service.name) + "_title", title);
		];
		
		// Receivers
		list.elements.filter[element | element instanceof BroadcastReceiver].forEach[receiver |
			// Title
			var titleField = getFieldData((receiver as BroadcastReceiver).attributes, typeof(ElementLabelAttribute));
			var title = receiver.name;
			if (titleField != null) {
				title = titleField.title;
			}
			
			strings.put(javaToAndroidIdentifier(receiver.name) + "_title", title);
			
			// Action (if: toast)
			var action = getFieldData((receiver as BroadcastReceiver).attributes, typeof(BroadcastReceiverActionAttribute));
			if (action != null && action.action instanceof ActionShowToast) {
				var toastAction = action.action as ActionShowToast;
				
				strings.put(javaToAndroidIdentifier(receiver.name) + "_toast", toastAction.toastText);
			}
		];
	}
	
}