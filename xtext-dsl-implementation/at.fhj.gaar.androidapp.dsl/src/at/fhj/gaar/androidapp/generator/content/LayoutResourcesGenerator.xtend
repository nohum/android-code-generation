package at.fhj.gaar.androidapp.generator.content

import at.fhj.gaar.androidapp.appDsl.Activity
import at.fhj.gaar.androidapp.appDsl.ActivityLayoutAttribute
import at.fhj.gaar.androidapp.appDsl.Application
import at.fhj.gaar.androidapp.appDsl.ApplicationElementList
import at.fhj.gaar.androidapp.appDsl.Button
import at.fhj.gaar.androidapp.appDsl.Text
import java.util.List
import java.util.concurrent.atomic.AtomicInteger
import org.eclipse.xtext.generator.IFileSystemAccess
import at.fhj.gaar.androidapp.appDsl.Spacer

public class LayoutResourcesGenerator extends AbstractGenerator {
	
	override generate(List<Application> applications, IFileSystemAccess filesystem) {
		for (app: applications) {
			val projectName = getProjectName(applications, app);
			var appElements = getFieldData(app.attributes, typeof(ApplicationElementList));
			
			if (appElements != null) {
				appElements.elements.filter[element | element instanceof Activity].forEach[curr |
					var activity = curr as Activity;
					
					filesystem.generateFile(String.format("%s/src/main/res/layout/%s.xml", projectName,
						javaToAndroidIdentifier(activity.name)
					),
						generateActivityLayout(activity)
					);
				];
			}
		}
	}
	
	private def String generateActivityLayout(Activity activity) {
		var layout = getFieldData(activity.attributes, typeof(ActivityLayoutAttribute));
		if (layout == null || layout.layoutElements.size == 0) {
			return '''
			<?xml version="1.0" encoding="utf-8"?>
			<LinearLayout
			    xmlns:android="http://schemas.android.com/apk/res/android"
			    android:layout_width="match_parent"
			    android:layout_height="match_parent"
			    android:paddingLeft="@dimen/activity_horizontal_margin"
			    android:paddingRight="@dimen/activity_horizontal_margin"
			    android:paddingTop="@dimen/activity_vertical_margin"
			    android:paddingBottom="@dimen/activity_vertical_margin"
			    android:orientation="vertical">
				
			</LinearLayout>
			''';
		}
		
		val string = new StringBuilder();
		string.append('''
		<?xml version="1.0" encoding="utf-8"?>
		<LinearLayout
		    xmlns:android="http://schemas.android.com/apk/res/android"
		    android:layout_width="match_parent"
		    android:layout_height="match_parent"
		    android:paddingLeft="@dimen/activity_horizontal_margin"
		    android:paddingRight="@dimen/activity_horizontal_margin"
		    android:paddingTop="@dimen/activity_vertical_margin"
		    android:paddingBottom="@dimen/activity_vertical_margin"
		    android:orientation="vertical">
		
		''');
		
		val AtomicInteger textIndex = new AtomicInteger(0);
		layout.layoutElements.forEach[element |
			if (element instanceof Button) {
				var buttonTitleRes = javaToAndroidIdentifier(activity.name) + "_"
					+ javaToAndroidIdentifier(element.name) + "_title";
				
				string.append('''
					<Button
						android:id="@+id/«javaToAndroidIdentifier(element.name)»"
						android:text="@string/«buttonTitleRes»"
						android:layout_height="wrap_content"
						android:layout_width="match_parent" />

				''');
			} else if (element instanceof Text) {
				var textTitleRes = javaToAndroidIdentifier(activity.name) + "_text" + textIndex;
				textIndex.addAndGet(1);
				
				string.append('''
				    <TextView android:text="@string/«textTitleRes»"
				        android:layout_width="wrap_content"
				        android:layout_height="wrap_content" />
				    
				''');
			} else if (element instanceof Spacer) {
				string.append('''
					<View
						android:layout_width="match_parent"
						android:layout_height="@dimen/spacer_height" />
				''');
			}
		]

		string.append('''
		</LinearLayout>
		''');

		return string.toString;
	}
	
}