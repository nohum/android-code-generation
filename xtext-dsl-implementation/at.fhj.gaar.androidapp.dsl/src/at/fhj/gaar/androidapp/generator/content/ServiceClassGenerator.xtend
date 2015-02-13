package at.fhj.gaar.androidapp.generator.content

import at.fhj.gaar.androidapp.appDsl.Application
import at.fhj.gaar.androidapp.appDsl.ApplicationElement
import at.fhj.gaar.androidapp.appDsl.Service

class ServiceClassGenerator extends AbstractClassGenerator {
	
	override protected isAllowedElement(ApplicationElement element) {		
		return element instanceof Service;
	}
	
	override protected retrieveElementTemplate(Application application, ApplicationElement element) {
		var service = element as Service;
		
		return '''
		package «application.name».service;

		import android.app.Service;
		import android.content.Intent;
		import android.os.IBinder;
		
		public class «service.name» extends Service {
		    public «service.name»() {
		    }
		
		    @Override
		    public IBinder onBind(Intent intent) {
		        return null;
		    }
		}
		
		''';
	}
	
}