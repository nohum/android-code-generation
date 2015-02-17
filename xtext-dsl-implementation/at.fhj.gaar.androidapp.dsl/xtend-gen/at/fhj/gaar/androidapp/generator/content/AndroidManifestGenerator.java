package at.fhj.gaar.androidapp.generator.content;

import at.fhj.gaar.androidapp.appDsl.Activity;
import at.fhj.gaar.androidapp.appDsl.ActivityAttribute;
import at.fhj.gaar.androidapp.appDsl.ActivityParentAttribute;
import at.fhj.gaar.androidapp.appDsl.Application;
import at.fhj.gaar.androidapp.appDsl.ApplicationAttribute;
import at.fhj.gaar.androidapp.appDsl.ApplicationElement;
import at.fhj.gaar.androidapp.appDsl.ApplicationElementList;
import at.fhj.gaar.androidapp.appDsl.ApplicationMainActivity;
import at.fhj.gaar.androidapp.appDsl.ApplicationPermissionList;
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiver;
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiverAttribute;
import at.fhj.gaar.androidapp.appDsl.ElementEnabledAttribute;
import at.fhj.gaar.androidapp.appDsl.ElementExportedAttribute;
import at.fhj.gaar.androidapp.appDsl.ElementIntentList;
import at.fhj.gaar.androidapp.appDsl.ElementLabelAttribute;
import at.fhj.gaar.androidapp.appDsl.Intent;
import at.fhj.gaar.androidapp.appDsl.Permission;
import at.fhj.gaar.androidapp.appDsl.Service;
import at.fhj.gaar.androidapp.appDsl.ServiceAttribute;
import at.fhj.gaar.androidapp.generator.content.AbstractGenerator;
import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class AndroidManifestGenerator extends AbstractGenerator {
  public void generate(final List<Application> applications, final IFileSystemAccess filesystem) {
    for (final Application app : applications) {
      {
        String projectName = this.getProjectName(applications, app);
        String _format = String.format("%s/src/main/AndroidManifest.xml", projectName);
        String _retrieveAndroidManifest = this.retrieveAndroidManifest(app);
        filesystem.generateFile(_format, _retrieveAndroidManifest);
      }
    }
  }
  
  private String retrieveAndroidManifest(final Application application) {
    EList<ApplicationAttribute> _attributes = application.getAttributes();
    ApplicationPermissionList permissions = this.<ApplicationPermissionList>getFieldData(_attributes, ApplicationPermissionList.class);
    EList<ApplicationAttribute> _attributes_1 = application.getAttributes();
    ApplicationMainActivity mainActivity = this.<ApplicationMainActivity>getFieldData(_attributes_1, ApplicationMainActivity.class);
    EList<ApplicationAttribute> _attributes_2 = application.getAttributes();
    ApplicationElementList elements = this.<ApplicationElementList>getFieldData(_attributes_2, ApplicationElementList.class);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    _builder.newLine();
    _builder.append("<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("package=\"");
    String _name = application.getName();
    _builder.append(_name, "    ");
    _builder.append("\" >");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    String _generatePermissions = this.generatePermissions(permissions);
    _builder.append(_generatePermissions, "    ");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<application");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:allowBackup=\"true\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:label=\"@string/app_title\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("android:theme=\"@style/AppTheme\" >");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    String _generateAppElements = this.generateAppElements(elements, mainActivity);
    _builder.append(_generateAppElements, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("</application>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</manifest>");
    _builder.newLine();
    return _builder.toString();
  }
  
  private String generatePermissions(final ApplicationPermissionList permissions) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Permission> _permissions = permissions.getPermissions();
      for(final Permission permission : _permissions) {
        _builder.append("<uses-permission android:name=\"");
        String _name = permission.getName();
        _builder.append(_name, "");
        _builder.append("\" />");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  private String generateAppElements(final ApplicationElementList elements, final ApplicationMainActivity mainActivity) {
    String result = "";
    EList<ApplicationElement> _elements = elements.getElements();
    for (final ApplicationElement element : _elements) {
      if ((element instanceof Activity)) {
        String _result = result;
        boolean _and = false;
        boolean _notEquals = (!Objects.equal(mainActivity, null));
        if (!_notEquals) {
          _and = false;
        } else {
          Activity _launcherActivity = mainActivity.getLauncherActivity();
          boolean _equals = ((Activity)element).equals(_launcherActivity);
          _and = _equals;
        }
        String _generateActivity = this.generateActivity(((Activity) element), _and);
        result = (_result + _generateActivity);
      } else {
        if ((element instanceof Service)) {
          String _result_1 = result;
          String _generateService = this.generateService(((Service) element));
          result = (_result_1 + _generateService);
        } else {
          if ((element instanceof BroadcastReceiver)) {
            String _result_2 = result;
            String _generateBroadcastReceiver = this.generateBroadcastReceiver(((BroadcastReceiver) element));
            result = (_result_2 + _generateBroadcastReceiver);
          }
        }
      }
    }
    return result;
  }
  
  private String generateActivity(final Activity activity, final boolean launchable) {
    EList<ActivityAttribute> _attributes = activity.getAttributes();
    ActivityParentAttribute parent = this.<ActivityParentAttribute>getFieldData(_attributes, ActivityParentAttribute.class);
    EList<ActivityAttribute> _attributes_1 = activity.getAttributes();
    ElementEnabledAttribute enabled = this.<ElementEnabledAttribute>getFieldData(_attributes_1, ElementEnabledAttribute.class);
    EList<ActivityAttribute> _attributes_2 = activity.getAttributes();
    ElementExportedAttribute exported = this.<ElementExportedAttribute>getFieldData(_attributes_2, ElementExportedAttribute.class);
    EList<ActivityAttribute> _attributes_3 = activity.getAttributes();
    ElementLabelAttribute label = this.<ElementLabelAttribute>getFieldData(_attributes_3, ElementLabelAttribute.class);
    EList<ActivityAttribute> _attributes_4 = activity.getAttributes();
    ElementIntentList intents = this.<ElementIntentList>getFieldData(_attributes_4, ElementIntentList.class);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<activity android:name=\".activity.");
    String _name = activity.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    {
      boolean _notEquals = (!Objects.equal(enabled, null));
      if (_notEquals) {
        _builder.append("            ");
        _builder.append("android:enabled=\"");
        boolean _isEnabled = enabled.isEnabled();
        _builder.append(_isEnabled, "            ");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _notEquals_1 = (!Objects.equal(exported, null));
      if (_notEquals_1) {
        _builder.append("android:exported=\"");
        boolean _isExported = exported.isExported();
        _builder.append(_isExported, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _notEquals_2 = (!Objects.equal(parent, null));
      if (_notEquals_2) {
        _builder.append("android:parentActivityName=\".activity.");
        Activity _parent = parent.getParent();
        String _name_1 = _parent.getName();
        _builder.append(_name_1, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _notEquals_3 = (!Objects.equal(label, null));
      if (_notEquals_3) {
        _builder.append("android:label=\"@string/");
        String _name_2 = activity.getName();
        String _javaToAndroidIdentifier = this.javaToAndroidIdentifier(_name_2);
        _builder.append(_javaToAndroidIdentifier, "");
        _builder.append("_title\"");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t    ");
      }
    }
    _builder.append(" >");
    _builder.newLineIfNotEmpty();
    {
      if (launchable) {
        _builder.append("            ");
        _builder.append("<intent-filter>");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("    ");
        _builder.append("<action android:name=\"android.intent.action.MAIN\" />");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("    ");
        _builder.append("<category android:name=\"android.intent.category.LAUNCHER\" />");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("</intent-filter>");
        _builder.newLine();
      }
    }
    _builder.append("            ");
    String _generateIntentList = this.generateIntentList(intents);
    _builder.append(_generateIntentList, "            ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("</activity>");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    return _builder.toString();
  }
  
  private String generateService(final Service service) {
    EList<ServiceAttribute> _attributes = service.getAttributes();
    ElementEnabledAttribute enabled = this.<ElementEnabledAttribute>getFieldData(_attributes, ElementEnabledAttribute.class);
    EList<ServiceAttribute> _attributes_1 = service.getAttributes();
    ElementExportedAttribute exported = this.<ElementExportedAttribute>getFieldData(_attributes_1, ElementExportedAttribute.class);
    EList<ServiceAttribute> _attributes_2 = service.getAttributes();
    ElementLabelAttribute label = this.<ElementLabelAttribute>getFieldData(_attributes_2, ElementLabelAttribute.class);
    EList<ServiceAttribute> _attributes_3 = service.getAttributes();
    ElementIntentList intents = this.<ElementIntentList>getFieldData(_attributes_3, ElementIntentList.class);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<service android:name=\".service.");
    String _name = service.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    {
      boolean _notEquals = (!Objects.equal(enabled, null));
      if (_notEquals) {
        _builder.append("            ");
        _builder.append("android:enabled=\"");
        boolean _isEnabled = enabled.isEnabled();
        _builder.append(_isEnabled, "            ");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _notEquals_1 = (!Objects.equal(exported, null));
      if (_notEquals_1) {
        _builder.append("android:exported=\"");
        boolean _isExported = exported.isExported();
        _builder.append(_isExported, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _notEquals_2 = (!Objects.equal(label, null));
      if (_notEquals_2) {
        _builder.append("android:label=\"@string/");
        String _name_1 = service.getName();
        String _javaToAndroidIdentifier = this.javaToAndroidIdentifier(_name_1);
        _builder.append(_javaToAndroidIdentifier, "");
        _builder.append("_title\"");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t    ");
      }
    }
    _builder.append(" >");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    String _generateIntentList = this.generateIntentList(intents);
    _builder.append(_generateIntentList, "            ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("</service>");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    return _builder.toString();
  }
  
  private String generateBroadcastReceiver(final BroadcastReceiver receiver) {
    EList<BroadcastReceiverAttribute> _attributes = receiver.getAttributes();
    ElementEnabledAttribute enabled = this.<ElementEnabledAttribute>getFieldData(_attributes, ElementEnabledAttribute.class);
    EList<BroadcastReceiverAttribute> _attributes_1 = receiver.getAttributes();
    ElementExportedAttribute exported = this.<ElementExportedAttribute>getFieldData(_attributes_1, ElementExportedAttribute.class);
    EList<BroadcastReceiverAttribute> _attributes_2 = receiver.getAttributes();
    ElementLabelAttribute label = this.<ElementLabelAttribute>getFieldData(_attributes_2, ElementLabelAttribute.class);
    EList<BroadcastReceiverAttribute> _attributes_3 = receiver.getAttributes();
    ElementIntentList intents = this.<ElementIntentList>getFieldData(_attributes_3, ElementIntentList.class);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<receiver android:name=\".receiver.");
    String _name = receiver.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    {
      boolean _notEquals = (!Objects.equal(enabled, null));
      if (_notEquals) {
        _builder.append("android:enabled=\"");
        boolean _isEnabled = enabled.isEnabled();
        _builder.append(_isEnabled, "");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _notEquals_1 = (!Objects.equal(exported, null));
      if (_notEquals_1) {
        _builder.append("            ");
        _builder.append("android:exported=\"");
        boolean _isExported = exported.isExported();
        _builder.append(_isExported, "            ");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _notEquals_2 = (!Objects.equal(label, null));
      if (_notEquals_2) {
        _builder.append("android:label=\"@string/");
        String _name_1 = receiver.getName();
        String _javaToAndroidIdentifier = this.javaToAndroidIdentifier(_name_1);
        _builder.append(_javaToAndroidIdentifier, "");
        _builder.append("_title\"");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t    ");
      }
    }
    _builder.append(" >");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    String _generateIntentList = this.generateIntentList(intents);
    _builder.append(_generateIntentList, "            ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("</receiver>");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    return _builder.toString();
  }
  
  private String generateIntentList(final ElementIntentList intents) {
    boolean _or = false;
    boolean _equals = Objects.equal(intents, null);
    if (_equals) {
      _or = true;
    } else {
      EList<Intent> _intents = intents.getIntents();
      int _size = _intents.size();
      boolean _equals_1 = (_size == 0);
      _or = _equals_1;
    }
    if (_or) {
      return "";
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<intent-filter>");
    _builder.newLine();
    {
      EList<Intent> _intents_1 = intents.getIntents();
      for(final Intent intent : _intents_1) {
        _builder.append("<action android:name=\"");
        String _name = intent.getName();
        _builder.append(_name, "");
        _builder.append("\" />");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</intent-filter>");
    _builder.newLine();
    return _builder.toString();
  }
}
