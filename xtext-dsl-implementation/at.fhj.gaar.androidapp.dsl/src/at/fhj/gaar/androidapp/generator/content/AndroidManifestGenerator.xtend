package at.fhj.gaar.androidapp.generator.content

import java.util.List
import at.fhj.gaar.androidapp.appDsl.Application
import org.eclipse.xtext.generator.IFileSystemAccess
import at.fhj.gaar.androidapp.appDsl.ApplicationPermissionList
import at.fhj.gaar.androidapp.appDsl.ApplicationElementList
import at.fhj.gaar.androidapp.appDsl.Activity
import at.fhj.gaar.androidapp.appDsl.Service
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiver
import at.fhj.gaar.androidapp.appDsl.ActivityParentAttribute
import at.fhj.gaar.androidapp.appDsl.ElementEnabledAttribute
import at.fhj.gaar.androidapp.appDsl.ElementExportedAttribute
import at.fhj.gaar.androidapp.appDsl.ElementLabelAttribute
import at.fhj.gaar.androidapp.appDsl.ElementIntentList
import at.fhj.gaar.androidapp.appDsl.ApplicationMainActivity

public class AndroidManifestGenerator extends AbstractGenerator {
	
	override generate(List<Application> applications, IFileSystemAccess filesystem) {
		for (app: applications) {
			var projectName = getProjectName(applications, app);
			
			filesystem.generateFile(String.format("%s/src/main/AndroidManifest.xml", projectName),
				retrieveAndroidManifest(app)
			);
		}
	}
	
	private def String retrieveAndroidManifest(Application application) {
		// TODO maybe build xml directly
		
		var ApplicationPermissionList permissions = getFieldData(application.attributes, typeof(ApplicationPermissionList));
		var ApplicationMainActivity mainActivity = getFieldData(application.attributes, typeof(ApplicationMainActivity));
		var ApplicationElementList elements = getFieldData(application.attributes, typeof(ApplicationElementList));
		
		return '''
		<?xml version="1.0" encoding="utf-8"?>
		<manifest xmlns:android="http://schemas.android.com/apk/res/android"
		    package="«application.name»" >
		    
		    «generatePermissions(permissions)» 
		    
		    <application
		        android:allowBackup="true"
		        android:label="@string/app_title"
		        android:theme="@style/AppTheme"
		        android:icon="@drawable/ic_launcher" >
		        
		        «generateAppElements(elements, mainActivity)»
		    </application>
		
		</manifest>
		''';
	}
		
	private def String generatePermissions(ApplicationPermissionList permissions) {
		return  '''
		«FOR permission : permissions.permissions»
			<uses-permission android:name="«permission.name»" />
		«ENDFOR» 
		''';
	}
	
	private def String generateAppElements(ApplicationElementList elements, ApplicationMainActivity mainActivity) {
		var result = "";
		
		for (element : elements.elements) {
			if (element instanceof Activity) {
				result += generateActivity(element as Activity,
					mainActivity != null && element.equals(mainActivity.launcherActivity)
				);
			} else if (element instanceof Service) {
				result += generateService(element as Service);				
			} else if (element instanceof BroadcastReceiver) {
				result += generateBroadcastReceiver(element as BroadcastReceiver);
			}
		}
		
		return result;
	}

	private def String generateActivity(Activity activity, boolean launchable) {
		var ActivityParentAttribute parent = getFieldData(activity.attributes, typeof(ActivityParentAttribute));
		var ElementEnabledAttribute enabled = getFieldData(activity.attributes, typeof(ElementEnabledAttribute));
		var ElementExportedAttribute exported = getFieldData(activity.attributes, typeof(ElementExportedAttribute));
		var ElementLabelAttribute label = getFieldData(activity.attributes, typeof(ElementLabelAttribute));
		var ElementIntentList intents = getFieldData(activity.attributes, typeof(ElementIntentList));
		
		return '''
		<activity android:name=".activity.«activity.name»"
            «IF enabled != null»android:enabled="«enabled.enabled»"«ENDIF»
            «IF exported != null»android:exported="«exported.exported»"«ENDIF»
            «IF parent != null»android:parentActivityName=".activity.«parent.parent.name»"«ENDIF»
            «IF label != null»android:label="@string/«javaToAndroidIdentifier(activity.name)»_title"«ENDIF» >
            «IF launchable»<intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>«ENDIF»
            «generateIntentList(intents)»
		</activity>

		''';
	}
	
	private def String generateService(Service service) {
		var ElementEnabledAttribute enabled = getFieldData(service.attributes, typeof(ElementEnabledAttribute));
		var ElementExportedAttribute exported = getFieldData(service.attributes, typeof(ElementExportedAttribute));
		var ElementLabelAttribute label = getFieldData(service.attributes, typeof(ElementLabelAttribute));
		var ElementIntentList intents = getFieldData(service.attributes, typeof(ElementIntentList));
		
		return '''
		<service android:name=".service.«service.name»"
            «IF enabled != null»android:enabled="«enabled.enabled»"«ENDIF»
            «IF exported != null»android:exported="«exported.exported»"«ENDIF»
            «IF label != null»android:label="@string/«javaToAndroidIdentifier(service.name)»_title"«ENDIF» >
            «generateIntentList(intents)»
		</service>

		''';
	}
	
	private def String generateBroadcastReceiver(BroadcastReceiver receiver) {
		var ElementEnabledAttribute enabled = getFieldData(receiver.attributes, typeof(ElementEnabledAttribute));
		var ElementExportedAttribute exported = getFieldData(receiver.attributes, typeof(ElementExportedAttribute));
		var ElementLabelAttribute label = getFieldData(receiver.attributes, typeof(ElementLabelAttribute));
		var ElementIntentList intents = getFieldData(receiver.attributes, typeof(ElementIntentList));
		
		return '''
		<receiver android:name=".receiver.«receiver.name»"
            «IF enabled != null»android:enabled="«enabled.enabled»"«ENDIF»
            «IF exported != null»android:exported="«exported.exported»"«ENDIF»
            «IF label != null»android:label="@string/«javaToAndroidIdentifier(receiver.name)»_title"«ENDIF» >
            «generateIntentList(intents)»
		</receiver>

		''';
	}
	
	private def String generateIntentList(ElementIntentList intents) {
		if (intents == null || intents.intents.size == 0) {
			return "";
		}
		
		return  '''
			<intent-filter>
			«FOR intent : intents.intents»
				<action android:name="«intent.name»" />
			«ENDFOR» 
			</intent-filter>
		''';
	}
	
}