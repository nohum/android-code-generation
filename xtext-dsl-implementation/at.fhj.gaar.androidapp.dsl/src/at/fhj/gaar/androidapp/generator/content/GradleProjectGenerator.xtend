package at.fhj.gaar.androidapp.generator.content

import java.util.List
import at.fhj.gaar.androidapp.appDsl.Application
import org.eclipse.xtext.generator.IFileSystemAccess
import at.fhj.gaar.androidapp.appDsl.ApplicationCompileSdk
import at.fhj.gaar.androidapp.appDsl.ApplicationMinSdk
import at.fhj.gaar.androidapp.appDsl.ApplicationTargetSdk

public class GradleProjectGenerator extends AbstractGenerator {
	
	private static val String USED_BUILD_TOOLS_VERSION = "21.1.2";
	
	private static val int DEFAULT_COMPILE_SDK_VERSION = 21;
	
	override generate(List<Application> applications, IFileSystemAccess filesystem) {
		filesystem.generateFile("build.gradle", retrieveRootBuildGradle());
		filesystem.generateFile("settings.gradle", retrieveSettingsGradle(applications));
		
		for (app: applications) {
			var projectName = getProjectName(applications, app);
			
			filesystem.generateFile(String.format("%s/build.gradle", projectName),
				retrieveProjectGradleFile(app)
			);
			
			// empty default file
			filesystem.generateFile(String.format("%s/proguard-rules.pro", projectName), "");
		}
		
		filesystem.generateFile("gradle.properties", emptyGradleProperties());
	}
	
	def private String retrieveProjectGradleFile(Application application) {
		var ApplicationCompileSdk compileSdk = getFieldData(application.attributes, typeof(ApplicationCompileSdk));
		var ApplicationMinSdk minSdk = getFieldData(application.attributes, typeof(ApplicationMinSdk));
		var ApplicationTargetSdk targetSdk = getFieldData(application.attributes, typeof(ApplicationTargetSdk));

		// we always need an compile sdk
		var usedCompileSdk = DEFAULT_COMPILE_SDK_VERSION;
		if (compileSdk != null) {
			usedCompileSdk = compileSdk.compileSdk;
		} else if (targetSdk != null) {
			usedCompileSdk = targetSdk.targetSdk;
		} else if (minSdk != null) {
			usedCompileSdk = minSdk.minSdk;
		}

		return '''
		apply plugin: 'com.android.application'

		android {
		    buildToolsVersion "«USED_BUILD_TOOLS_VERSION»"
		    compileSdkVersion «usedCompileSdk»
		
		    defaultConfig {
		        applicationId "«application.name»"
				«IF minSdk != null»
				minSdkVersion «minSdk.minSdk»
				«ENDIF»
				«IF targetSdk != null»
				targetSdkVersion «targetSdk.targetSdk»
				«ENDIF»
		        
		        versionCode 1
		        versionName "1.0"
		    }
		    
		    buildTypes {
		        release {
		            minifyEnabled false
		            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
		        }
		    }
		}
		
		dependencies {
		    compile 'com.android.support:appcompat-v7:21.0.+'
		}
		
		''';
	}
	
	def private String retrieveRootBuildGradle() {
		return '''
		// Top-level build file where you can add configuration options common to all sub-projects/modules.

		buildscript {
		    repositories {
		        jcenter()
		    }
		    dependencies {
		        classpath 'com.android.tools.build:gradle:1.0.1'
		
		        // NOTE: Do not place your application dependencies here; they belong
		        // in the individual module build.gradle files
		    }
		}
		
		allprojects {
		    repositories {
		        jcenter()
		    }
		}
		
		''';
	}
	
	def private String retrieveSettingsGradle(List<Application> applications) {
		return '''
		«FOR a : applications»
			include '«getProjectName(applications, a)»';
		«ENDFOR» 
		''';
	}
	
	def private String emptyGradleProperties() {
		// copied from an empty default file
		return '''
		# Project-wide Gradle settings.

		# IDE (e.g. Android Studio) users:
		# Gradle settings configured through the IDE *will override*
		# any settings specified in this file.
		
		# For more details on how to configure your build environment visit
		# http://www.gradle.org/docs/current/userguide/build_environment.html
		
		# Specifies the JVM arguments used for the daemon process.
		# The setting is particularly useful for tweaking memory settings.
		# Default value: -Xmx10248m -XX:MaxPermSize=256m
		# org.gradle.jvmargs=-Xmx2048m -XX:MaxPermSize=512m -XX:+HeapDumpOnOutOfMemoryError -Dfile.encoding=UTF-8
		
		# When configured, Gradle will run in incubating parallel mode.
		# This option should only be used with decoupled projects. More details, visit
		# http://www.gradle.org/docs/current/userguide/multi_project_builds.html#sec:decoupled_projects
		# org.gradle.parallel=true
		''';
	}
	
}