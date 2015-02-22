# Android app code generation

Project work for generating an Android app using a special domain specific language. This is achieved using the [Eclipse Xtext](https://eclipse.org/Xtext/) toolkit. For instance, the following code creates a small demo project with an activity and a broadcast receiver:

```
application "at.fhj.demoapp" {
	min-sdk 14,
	target-sdk 21, 
	title "My first app",
	main-activity FirstDemoActivity,
	permissions [
		"android.permission.RECEIVE_BOOT_COMPLETED"
	],
	elements [
		activity FirstDemoActivity {
			title "My Activity",
			layout-elements [
				text "This app gets started on every boot.",
				spacer,
				button firstButton {
					title "My first button within an App",
					action show-toast "Hello world!"
				},
				button openSecondActivityButton {
					title "Open another Activity",
					action start-activity SecondDemoActivity
				}
			]
		},
		receiver DemoReceiver {
			title "Demo Receiver",
			action start-activity FirstDemoActivity,
			intents [
				"android.intent.action.BOOT_COMPLETED"
			]
		},
		service EmptyService {
			title "Empty service"
		},
		activity SecondDemoActivity {
			title "Second activity",
			parent FirstDemoActivity,
			layout-elements [
				text "This is another activity.",
				spacer,
				text "Use the back button on upper left to return back to the original activity."
			]
		}
	]
}
```

## How to use

* Import the projects located in the "xtext-dsl-implementation" subfolder into an Eclipse IDE with Xtext support
* For the "at.fhj.gaar.androidapp.dsl" project: Add the files located in the lib-directory to the build path of that project

You will find the "Launch Runtime Eclipse" option in the "Run" menu. Using this newly launched IDE, you can create your Android applications with the DSL shown above. For that, create a new project and add a new file which ends with the file extension ".androidapp". The opened editor then provides code completion and validation for the DSL. 

The resulting Android application is automatically generated and stored in a subfolder called "application-gen" of your project. The contents of this folder can directly be imported as a new Android Studio project.  

## Code validation

When editing your application source code in the IDE some features are validated. Examples are duplicated application elements, duplicated intents, duplicated permissions or unknown identifiers.

## See also

Interesting resources to read about Xtext that helped me developing:

* [The official tutorial](http://www.eclipse.org/Xtext/documentation.html#DomainModelWalkThrough)
* http://www.slideshare.net/schwurbel/the-xtext-grammar-language
* [About cross-referencing elements](https://blogs.itemis.de/leipzig/archives/776)
* [Naming elements with the "name" attribute](http://www.euclideanspace.com/software/development/eclipse/xtext/infrastructure/naming/index.htm)
