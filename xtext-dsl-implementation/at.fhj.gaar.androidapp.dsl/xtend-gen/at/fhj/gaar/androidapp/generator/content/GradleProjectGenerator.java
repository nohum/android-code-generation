package at.fhj.gaar.androidapp.generator.content;

import at.fhj.gaar.androidapp.appDsl.Application;
import at.fhj.gaar.androidapp.appDsl.ApplicationAttribute;
import at.fhj.gaar.androidapp.appDsl.ApplicationCompileSdk;
import at.fhj.gaar.androidapp.appDsl.ApplicationMinSdk;
import at.fhj.gaar.androidapp.appDsl.ApplicationTargetSdk;
import at.fhj.gaar.androidapp.generator.content.AbstractGenerator;
import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class GradleProjectGenerator extends AbstractGenerator {
  private final static String USED_BUILD_TOOLS_VERSION = "21.1.1";
  
  public void generate(final List<Application> applications, final IFileSystemAccess filesystem) {
    String _retrieveRootBuildGradle = this.retrieveRootBuildGradle();
    filesystem.generateFile("build.gradle", _retrieveRootBuildGradle);
    String _retrieveSettingsGradle = this.retrieveSettingsGradle(applications);
    filesystem.generateFile("settings.gradle", _retrieveSettingsGradle);
    for (final Application app : applications) {
      {
        String projectName = this.getProjectName(applications, app);
        String _format = String.format("%s/build.gradle", projectName);
        String _retrieveProjectGradleFile = this.retrieveProjectGradleFile(app);
        filesystem.generateFile(_format, _retrieveProjectGradleFile);
        String _format_1 = String.format("%s/proguard-rules.pro", projectName);
        filesystem.generateFile(_format_1, "");
      }
    }
    String _emptyGradleProperties = this.emptyGradleProperties();
    filesystem.generateFile("gradle.properties", _emptyGradleProperties);
  }
  
  private String retrieveProjectGradleFile(final Application application) {
    EList<ApplicationAttribute> _attributes = application.getAttributes();
    ApplicationCompileSdk compileSdk = this.<ApplicationCompileSdk>getFieldData(_attributes, ApplicationCompileSdk.class);
    EList<ApplicationAttribute> _attributes_1 = application.getAttributes();
    ApplicationMinSdk minSdk = this.<ApplicationMinSdk>getFieldData(_attributes_1, ApplicationMinSdk.class);
    EList<ApplicationAttribute> _attributes_2 = application.getAttributes();
    ApplicationTargetSdk targetSdk = this.<ApplicationTargetSdk>getFieldData(_attributes_2, ApplicationTargetSdk.class);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("apply plugin: \'com.android.application\'");
    _builder.newLine();
    _builder.newLine();
    _builder.append("android {");
    _builder.newLine();
    {
      boolean _notEquals = (!Objects.equal(compileSdk, null));
      if (_notEquals) {
        _builder.append("\t");
        _builder.append("compileSdkVersion ");
        int _compileSdk = compileSdk.getCompileSdk();
        _builder.append(_compileSdk, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _notEquals_1 = (!Objects.equal(minSdk, null));
      if (_notEquals_1) {
        _builder.append("    ");
        _builder.append("minSdkVersion ");
        int _minSdk = minSdk.getMinSdk();
        _builder.append(_minSdk, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _notEquals_2 = (!Objects.equal(targetSdk, null));
      if (_notEquals_2) {
        _builder.append("    ");
        _builder.append("targetSdkVersion ");
        int _targetSdk = targetSdk.getTargetSdk();
        _builder.append(_targetSdk, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("buildToolsVersion \"");
    _builder.append(GradleProjectGenerator.USED_BUILD_TOOLS_VERSION, "    ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("defaultConfig {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("applicationId \"");
    String _name = application.getName();
    _builder.append(_name, "        ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("versionCode 1");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("versionName \"1.0\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("buildTypes {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("release {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("minifyEnabled false");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("proguardFiles getDefaultProguardFile(\'proguard-android.txt\'), \'proguard-rules.pro\'");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("dependencies {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("compile \'com.android.support:appcompat-v7:21.0.+\'");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
  
  private String retrieveRootBuildGradle() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Top-level build file where you can add configuration options common to all sub-projects/modules.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("buildscript {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("repositories {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("jcenter()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("dependencies {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("classpath \'com.android.tools.build:gradle:1.0.1\'");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// NOTE: Do not place your application dependencies here; they belong");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// in the individual module build.gradle files");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("allprojects {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("repositories {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("jcenter()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
  
  private String retrieveSettingsGradle(final List<Application> applications) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Application a : applications) {
        _builder.append("include \'");
        String _projectName = this.getProjectName(applications, a);
        _builder.append(_projectName, "");
        _builder.append("\';");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  private String emptyGradleProperties() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Project-wide Gradle settings.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# IDE (e.g. Android Studio) users:");
    _builder.newLine();
    _builder.append("# Gradle settings configured through the IDE *will override*");
    _builder.newLine();
    _builder.append("# any settings specified in this file.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# For more details on how to configure your build environment visit");
    _builder.newLine();
    _builder.append("# http://www.gradle.org/docs/current/userguide/build_environment.html");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Specifies the JVM arguments used for the daemon process.");
    _builder.newLine();
    _builder.append("# The setting is particularly useful for tweaking memory settings.");
    _builder.newLine();
    _builder.append("# Default value: -Xmx10248m -XX:MaxPermSize=256m");
    _builder.newLine();
    _builder.append("# org.gradle.jvmargs=-Xmx2048m -XX:MaxPermSize=512m -XX:+HeapDumpOnOutOfMemoryError -Dfile.encoding=UTF-8");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# When configured, Gradle will run in incubating parallel mode.");
    _builder.newLine();
    _builder.append("# This option should only be used with decoupled projects. More details, visit");
    _builder.newLine();
    _builder.append("# http://www.gradle.org/docs/current/userguide/multi_project_builds.html#sec:decoupled_projects");
    _builder.newLine();
    _builder.append("# org.gradle.parallel=true");
    _builder.newLine();
    return _builder.toString();
  }
}
