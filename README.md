Android app code Generation
---------------------------

Project work for generating an Android app using a special domain specific language. This is done using the [Eclipse Xtext](https://eclipse.org/Xtext/) toolkit. For instance, the following code creates a small demo project with an activity and a broadcast receiver:

```
application "at.fhj.demoapp" {
	min-sdk 14,
	target-sdk 21, 
	title "My first app",
	main-activity "FirstDemoActivity",
	permissions [
		"android.permission.RECEIVE_BOOT_COMPLETED"
	],
	elements [
		activity "FirstDemoActivity" {
			title "My Activity",
			layout-elements [
				text "This app gets started on every boot.",
				spacer,
				button "firstButton" {
					title "My first button within an App"
				}
			]
		},
		receiver "DemoReceiver" {
			title "Demo Receiver",
			action start-activity "FirstDemoActivity",
			intents [
				"android.intent.action.BOOT_COMPLETED"
			]
		}
	]
}
```
