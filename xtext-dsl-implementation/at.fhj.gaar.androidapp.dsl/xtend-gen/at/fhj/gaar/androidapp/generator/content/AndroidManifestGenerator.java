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
import at.fhj.gaar.androidapp.appDsl.ElementEnabledAttribute;
import at.fhj.gaar.androidapp.appDsl.ElementExportedAttribute;
import at.fhj.gaar.androidapp.appDsl.ElementIntentList;
import at.fhj.gaar.androidapp.appDsl.ElementLabelAttribute;
import at.fhj.gaar.androidapp.appDsl.Service;
import at.fhj.gaar.androidapp.generator.GeneratorHelperUtil;
import at.fhj.gaar.androidapp.generator.content.ContentGenerator;
import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class AndroidManifestGenerator implements ContentGenerator {
  public void generate(final List<Application> applications, final IFileSystemAccess filesystem) {
    for (final Application app : applications) {
      {
        String projectName = GeneratorHelperUtil.getProjectName(applications, app);
        String _format = String.format("%s/src/main/AndroidManifest.xml", projectName);
        String _retrieveAndroidManifest = this.retrieveAndroidManifest(app);
        filesystem.generateFile(_format, _retrieveAndroidManifest);
      }
    }
  }
  
  private String retrieveAndroidManifest(final Application application) {
    EList<ApplicationAttribute> _attributes = application.getAttributes();
    ApplicationPermissionList permissions = GeneratorHelperUtil.<ApplicationPermissionList>getFieldData(_attributes, ApplicationPermissionList.class);
    EList<ApplicationAttribute> _attributes_1 = application.getAttributes();
    ApplicationMainActivity mainActivity = GeneratorHelperUtil.<ApplicationMainActivity>getFieldData(_attributes_1, ApplicationMainActivity.class);
    EList<ApplicationAttribute> _attributes_2 = application.getAttributes();
    ApplicationElementList elements = GeneratorHelperUtil.<ApplicationElementList>getFieldData(_attributes_2, ApplicationElementList.class);
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
      EList<String> _permissions = permissions.getPermissions();
      for(final String permission : _permissions) {
        _builder.append("<uses-permission android:name=\"");
        _builder.append(permission, "");
        _builder.append("\" />");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  private String generateAppElements(final ApplicationElementList elements, final ApplicationMainActivity mainActivity) {
    EList<ApplicationElement> _elements = elements.getElements();
    for (final ApplicationElement element : _elements) {
      if ((element instanceof Activity)) {
        boolean _and = false;
        boolean _notEquals = (!Objects.equal(mainActivity, null));
        if (!_notEquals) {
          _and = false;
        } else {
          Activity _launcherActivity = mainActivity.getLauncherActivity();
          boolean _equals = ((Activity)element).equals(_launcherActivity);
          _and = _equals;
        }
        return this.generateActivity(((Activity) element), _and);
      } else {
        if ((element instanceof Service)) {
          return this.generateService(((Service) element));
        } else {
          if ((element instanceof BroadcastReceiver)) {
            return this.generateBroadcastReceiver(((BroadcastReceiver) element));
          }
        }
      }
    }
    return null;
  }
  
  private String generateActivity(final Activity activity, final boolean launchable) {
    EList<ActivityAttribute> _attributes = activity.getAttributes();
    ActivityParentAttribute parent = GeneratorHelperUtil.<ActivityParentAttribute>getFieldData(_attributes, ActivityParentAttribute.class);
    EList<ActivityAttribute> _attributes_1 = activity.getAttributes();
    ElementEnabledAttribute enabled = GeneratorHelperUtil.<ElementEnabledAttribute>getFieldData(_attributes_1, ElementEnabledAttribute.class);
    EList<ActivityAttribute> _attributes_2 = activity.getAttributes();
    ElementExportedAttribute exported = GeneratorHelperUtil.<ElementExportedAttribute>getFieldData(_attributes_2, ElementExportedAttribute.class);
    EList<ActivityAttribute> _attributes_3 = activity.getAttributes();
    ElementLabelAttribute label = GeneratorHelperUtil.<ElementLabelAttribute>getFieldData(_attributes_3, ElementLabelAttribute.class);
    EList<ActivityAttribute> _attributes_4 = activity.getAttributes();
    ElementIntentList intents = GeneratorHelperUtil.<ElementIntentList>getFieldData(_attributes_4, ElementIntentList.class);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<activity");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("android:name=\".activity.");
    String _name = activity.getName();
    _builder.append(_name, "\t");
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
        _builder.append("android:label=\"android:label=\"@string/");
        String _name_2 = activity.getName();
        String _javaToAndroidIdentifier = GeneratorHelperUtil.javaToAndroidIdentifier(_name_2);
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
    _builder.newLine();
    _builder.append("            ");
    String _generateIntentList = this.generateIntentList(intents);
    _builder.append(_generateIntentList, "            ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("</activity>");
    _builder.newLine();
    return _builder.toString();
  }
  
  private String generateService(final Service service) {
    return "";
  }
  
  private String generateBroadcastReceiver(final BroadcastReceiver receiver) {
    return "";
  }
  
  private String generateIntentList(final ElementIntentList intents) {
    boolean _or = false;
    boolean _equals = Objects.equal(intents, null);
    if (_equals) {
      _or = true;
    } else {
      EList<String> _intents = intents.getIntents();
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
      EList<String> _intents_1 = intents.getIntents();
      for(final String intent : _intents_1) {
        _builder.append("<action android:name=\"");
        _builder.append(intent, "");
        _builder.append("\" />");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</intent-filter>");
    _builder.newLine();
    return _builder.toString();
  }
}
