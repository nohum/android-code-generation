package at.fhj.gaar.androidapp.generator.content

import at.fhj.gaar.androidapp.appDsl.ActionShowToast
import at.fhj.gaar.androidapp.appDsl.ActionStartActivity
import at.fhj.gaar.androidapp.appDsl.ActionStartService
import at.fhj.gaar.androidapp.appDsl.Application
import at.fhj.gaar.androidapp.appDsl.ApplicationElement
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiver
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiverActionAttribute

public class BroadcastReceiverClassGenerator extends AbstractClassGenerator {
	
	override protected getSubClassPath() {
		return "receiver";
	}
	
	override protected isAllowedElement(ApplicationElement element) {		
		return element instanceof BroadcastReceiver;
	}
	
	override protected retrieveElementTemplate(Application application, ApplicationElement element) {
		var receiver = element as BroadcastReceiver;
		var BroadcastReceiverActionAttribute action = getFieldData(receiver.attributes, typeof(BroadcastReceiverActionAttribute));

		return '''
		package «application.name».receiver;
		
		import android.content.BroadcastReceiver;
		import android.content.Context;
		import android.content.Intent;
		import android.util.Log;
		
		«insertPackageImportsForAction(application, action)»
		
		public class «receiver.name» extends BroadcastReceiver {
			
		    public «receiver.name»() {
		    }
		
		    @Override
		    public void onReceive(Context context, Intent intent) {
		        Log.d("App", "«receiver.name»: received intent action = " + intent.getAction());
		        
		        «insertAction(receiver, action)»
		    }
		}

		''';
	}
	
	private def String insertPackageImportsForAction(Application application, BroadcastReceiverActionAttribute action) {
		if (action == null) {
			return "";
		}
		
		var concreteAction = action.action;
		if (concreteAction instanceof ActionShowToast) {
			return '''
			import android.widget.Toast;
			''';
		} else if (concreteAction instanceof ActionStartService) {
			return '''
			import «application.name».service.«concreteAction.service.name»;
			''';
		} else if (concreteAction instanceof ActionStartActivity) {
			return '''
			import «application.name».activity.«concreteAction.activity.name»;
			''';
		}
	}
	
	private def String insertAction(BroadcastReceiver receiver, BroadcastReceiverActionAttribute action) {
		if (action == null) {
			return "";
		}
		
		var concreteAction = action.action;
		if (concreteAction instanceof ActionShowToast) {
			return '''
			Toast.makeText(context, context.getString(R.string.«javaToAndroidIdentifier(receiver.name)»_toast), Toast.LENGTH_LONG).show();
			''';
		} else if (concreteAction instanceof ActionStartService) {
			return '''
			«concreteAction.service.name».startService(context);
			''';
		} else if (concreteAction instanceof ActionStartActivity) {
			return '''
			«concreteAction.activity.name».startActivity(context);
			''';
		}
	}
	
}