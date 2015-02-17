package at.fhj.gaar.androidapp.generator.content

import at.fhj.gaar.androidapp.appDsl.Activity
import at.fhj.gaar.androidapp.appDsl.ActivityLayoutAttribute
import at.fhj.gaar.androidapp.appDsl.Application
import at.fhj.gaar.androidapp.appDsl.ApplicationElement
import at.fhj.gaar.androidapp.appDsl.Button
import at.fhj.gaar.androidapp.appDsl.ButtonActionAttribute
import at.fhj.gaar.androidapp.appDsl.ActionShowToast
import at.fhj.gaar.androidapp.appDsl.ActionStartService
import at.fhj.gaar.androidapp.appDsl.ActionStartActivity

public class ActivityClassGenerator extends AbstractClassGenerator {
	
	override protected getSubClassPath() {
		return "activity";
	}
	
	override protected isAllowedElement(ApplicationElement element) {		
		return element instanceof Activity;
	}
	
	override protected retrieveElementTemplate(Application application, ApplicationElement element) {
		var activity = element as Activity;
		var ActivityLayoutAttribute layout = getFieldData(activity.attributes, typeof(ActivityLayoutAttribute));
		
		return '''
		package «application.name».activity;

		import android.content.Intent;
		import android.support.v7.app.ActionBarActivity;
		import android.os.Bundle;
		import android.support.v7.widget.Toolbar;
		import android.view.View;
		
		import «application.name».R;
		
		«insertPackageImports(application, layout)»
		
		
		public class «activity.name» extends ActionBarActivity implements View.OnClickListener {
			
			«insertLayoutFields(layout)»
		
		    @Override
		    protected void onCreate(Bundle savedInstanceState) {
		        super.onCreate(savedInstanceState);
		        setContentView(R.layout.«javaToAndroidIdentifier(activity.name)»);
		
		//        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
		//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		        
		        «insertLayoutFieldInit(layout)»
		    }
		    
		    public static void openActivity(Context context) {
		    	Intent intent = new Intent(context, «activity.name».class);
		    	intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				context.startActivity(intent);
		    }
		
		    @Override
		    public void onClick(View v) {
		        «insertLayoutClickActions(activity, layout)»
		    }
		}

		''';
	}
	
	private def String insertPackageImports(Application application, ActivityLayoutAttribute layout) {
		if (layout == null) {
			return "";
		}
		
		var data = '''
		''';
		
		var hasButton = layout.layoutElements.filter[ element | element instanceof Button].size > 0;
		if (hasButton) {
			data += '''
			import android.widget.Button;
			''';
		}
		
		for (element: layout.layoutElements) {
			if (element instanceof Button) {
				var action = getFieldData(element.attributes, typeof(ButtonActionAttribute));
				
				if (action != null) {
					var concreteAction = action.action;
					
					if (concreteAction instanceof ActionShowToast) {
						data += '''
						import android.widget.Toast;
						''';
					} else if (concreteAction instanceof ActionStartService) {
						data += '''
						import «application.name».service.«concreteAction.service.name»;
						''';
					} else if (concreteAction instanceof ActionStartActivity) {
						data += '''
						import «application.name».activity.«concreteAction.activity.name»;
						''';
					}
				}
			}
		}
		
		return data;
	}
	
	private def String insertLayoutFields(ActivityLayoutAttribute attribute) {
		if (attribute == null) {
			return "";
		}
		
		var data = '''
		''';
		
		for (element: attribute.layoutElements) {
			if (element instanceof Button) {
				data += '''
					private Button «element.name»;
				''';
			}
		}
		
		return data;
	}
	
	private def String insertLayoutFieldInit(ActivityLayoutAttribute attribute) {
		if (attribute == null) {
			return "";
		}
		
		var data = '''
		''';
		
		for (element: attribute.layoutElements) {
			if (element instanceof Button) {
				data += '''
					«element.name» = (Button) findViewById(R.id.«javaToAndroidIdentifier(element.name)»);
				''';
			}
		}
		
		return data;
	}
	
	private def String insertLayoutClickActions(Activity activity, ActivityLayoutAttribute attribute) {
		if (attribute == null) {
			return "";
		}
		
		var data = '''
		''';
		
		for (element: attribute.layoutElements) {
			if (element instanceof Button) {
				var action = getFieldData(element.attributes, typeof(ButtonActionAttribute));
				
				data += '''
				if (v.equals(«element.name»)) {
					«insertActionCode(activity, action)»
					
					return;
				}
				''';
			}
		}
		
		return data;
	}
	
	private def String insertActionCode(Activity activity, ButtonActionAttribute action) {
		if (action == null) {
			return '''
			// insert your code here
			''';
		}
		
		var concreteAction = action.action;
		if (concreteAction instanceof ActionShowToast) {
			return '''
			Toast.makeText(this, getString(R.string.«javaToAndroidIdentifier(activity.name)»_toast), Toast.LENGTH_LONG).show();
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