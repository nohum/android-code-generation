package at.fhj.gaar.androidapp.generator.content;

import at.fhj.gaar.androidapp.appDsl.ActionShowToast;
import at.fhj.gaar.androidapp.appDsl.Activity;
import at.fhj.gaar.androidapp.appDsl.ActivityAttribute;
import at.fhj.gaar.androidapp.appDsl.ActivityLayoutAttribute;
import at.fhj.gaar.androidapp.appDsl.Application;
import at.fhj.gaar.androidapp.appDsl.ApplicationAttribute;
import at.fhj.gaar.androidapp.appDsl.ApplicationElement;
import at.fhj.gaar.androidapp.appDsl.ApplicationElementList;
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiver;
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiverAction;
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiverActionAttribute;
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiverAttribute;
import at.fhj.gaar.androidapp.appDsl.Button;
import at.fhj.gaar.androidapp.appDsl.ButtonActionAttribute;
import at.fhj.gaar.androidapp.appDsl.ButtonAttribute;
import at.fhj.gaar.androidapp.appDsl.ElementLabelAttribute;
import at.fhj.gaar.androidapp.appDsl.LayoutElement;
import at.fhj.gaar.androidapp.appDsl.LayoutElementClickAction;
import at.fhj.gaar.androidapp.appDsl.Service;
import at.fhj.gaar.androidapp.appDsl.ServiceAttribute;
import at.fhj.gaar.androidapp.appDsl.Text;
import at.fhj.gaar.androidapp.generator.content.AbstractGenerator;
import com.google.common.base.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class ValueResourcesGenerator extends AbstractGenerator {
  public void generate(final List<Application> applications, final IFileSystemAccess filesystem) {
    for (final Application app : applications) {
      {
        String projectName = this.getProjectName(applications, app);
        String _format = String.format("%s/src/main/res/values/dimens.xml", projectName);
        String _generateDimensXml = this.generateDimensXml(app);
        filesystem.generateFile(_format, _generateDimensXml);
        String _format_1 = String.format("%s/src/main/res/values/styles.xml", projectName);
        String _generateStylesXml = this.generateStylesXml(app);
        filesystem.generateFile(_format_1, _generateStylesXml);
        String _format_2 = String.format("%s/src/main/res/values/strings.xml", projectName);
        String _generateStringsXml = this.generateStringsXml(app, projectName);
        filesystem.generateFile(_format_2, _generateStringsXml);
      }
    }
  }
  
  private String generateDimensXml(final Application application) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    _builder.newLine();
    _builder.append("<resources>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dimen name=\"activity_horizontal_margin\">16dp</dimen>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<dimen name=\"activity_vertical_margin\">16dp</dimen>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<dimen name=\"spacer_height\">14dp</dimen>");
    _builder.newLine();
    _builder.append("</resources>");
    _builder.newLine();
    return _builder.toString();
  }
  
  private String generateStylesXml(final Application application) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    _builder.newLine();
    _builder.append("<resources>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<style name=\"AppTheme\" parent=\"Theme.AppCompat.Light.NoActionBar\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</style>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</resources>");
    _builder.newLine();
    return _builder.toString();
  }
  
  private String generateStringsXml(final Application application, final String projectName) {
    Map<String, String> strings = new HashMap<String, String>();
    EList<ApplicationAttribute> _attributes = application.getAttributes();
    ElementLabelAttribute appTitleField = this.<ElementLabelAttribute>getFieldData(_attributes, ElementLabelAttribute.class);
    EList<ApplicationAttribute> _attributes_1 = application.getAttributes();
    ApplicationElementList appElements = this.<ApplicationElementList>getFieldData(_attributes_1, ApplicationElementList.class);
    boolean _notEquals = (!Objects.equal(appElements, null));
    if (_notEquals) {
      this.processApplicationTreeForStrings(appElements, strings);
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    _builder.newLine();
    _builder.append("<resources>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<string name=\"app_title\">");
    {
      boolean _notEquals_1 = (!Objects.equal(appTitleField, null));
      if (_notEquals_1) {
        String _title = appTitleField.getTitle();
        _builder.append(_title, "    ");
      } else {
        _builder.append(projectName, "    ");
      }
    }
    _builder.append("</string>");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      Set<Map.Entry<String, String>> _entrySet = strings.entrySet();
      for(final Map.Entry<String, String> string : _entrySet) {
        _builder.append("\t");
        _builder.append("<string name=\"");
        String _key = string.getKey();
        _builder.append(_key, "\t");
        _builder.append("\">");
        String _value = string.getValue();
        _builder.append(_value, "\t");
        _builder.append("</string>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</resources>");
    _builder.newLine();
    return _builder.toString();
  }
  
  private void processApplicationTreeForStrings(final ApplicationElementList list, final Map<String, String> strings) {
    EList<ApplicationElement> _elements = list.getElements();
    final Function1<ApplicationElement, Boolean> _function = new Function1<ApplicationElement, Boolean>() {
      public Boolean apply(final ApplicationElement element) {
        return Boolean.valueOf((element instanceof Activity));
      }
    };
    Iterable<ApplicationElement> _filter = IterableExtensions.<ApplicationElement>filter(_elements, _function);
    final Procedure1<ApplicationElement> _function_1 = new Procedure1<ApplicationElement>() {
      public void apply(final ApplicationElement activity) {
        EList<ActivityAttribute> _attributes = ((Activity) activity).getAttributes();
        ElementLabelAttribute titleField = ValueResourcesGenerator.this.<ElementLabelAttribute>getFieldData(_attributes, ElementLabelAttribute.class);
        String title = activity.getName();
        boolean _notEquals = (!Objects.equal(titleField, null));
        if (_notEquals) {
          String _title = titleField.getTitle();
          title = _title;
        }
        String _name = activity.getName();
        String _javaToAndroidIdentifier = ValueResourcesGenerator.this.javaToAndroidIdentifier(_name);
        String _plus = (_javaToAndroidIdentifier + "_title");
        strings.put(_plus, title);
        EList<ActivityAttribute> _attributes_1 = ((Activity) activity).getAttributes();
        ActivityLayoutAttribute layouts = ValueResourcesGenerator.this.<ActivityLayoutAttribute>getFieldData(_attributes_1, ActivityLayoutAttribute.class);
        boolean _notEquals_1 = (!Objects.equal(layouts, null));
        if (_notEquals_1) {
          EList<LayoutElement> _layoutElements = layouts.getLayoutElements();
          final Function1<LayoutElement, Boolean> _function = new Function1<LayoutElement, Boolean>() {
            public Boolean apply(final LayoutElement layoutElement) {
              return Boolean.valueOf((layoutElement instanceof Button));
            }
          };
          Iterable<LayoutElement> _filter = IterableExtensions.<LayoutElement>filter(_layoutElements, _function);
          final Procedure1<LayoutElement> _function_1 = new Procedure1<LayoutElement>() {
            public void apply(final LayoutElement button) {
              EList<ButtonAttribute> _attributes = ((Button) button).getAttributes();
              ElementLabelAttribute buttonTitleField = ValueResourcesGenerator.this.<ElementLabelAttribute>getFieldData(_attributes, ElementLabelAttribute.class);
              String buttonTitle = "Button";
              boolean _notEquals = (!Objects.equal(buttonTitleField, null));
              if (_notEquals) {
                String _title = buttonTitleField.getTitle();
                buttonTitle = _title;
              }
              String _name = activity.getName();
              String _javaToAndroidIdentifier = ValueResourcesGenerator.this.javaToAndroidIdentifier(_name);
              String _plus = (_javaToAndroidIdentifier + "_");
              String _name_1 = ((Button) button).getName();
              String _javaToAndroidIdentifier_1 = ValueResourcesGenerator.this.javaToAndroidIdentifier(_name_1);
              String _plus_1 = (_plus + _javaToAndroidIdentifier_1);
              String _plus_2 = (_plus_1 + "_title");
              strings.put(_plus_2, buttonTitle);
              EList<ButtonAttribute> _attributes_1 = ((Button) button).getAttributes();
              ButtonActionAttribute buttonAction = ValueResourcesGenerator.this.<ButtonActionAttribute>getFieldData(_attributes_1, ButtonActionAttribute.class);
              boolean _and = false;
              boolean _notEquals_1 = (!Objects.equal(buttonAction, null));
              if (!_notEquals_1) {
                _and = false;
              } else {
                LayoutElementClickAction _action = buttonAction.getAction();
                _and = (_action instanceof ActionShowToast);
              }
              if (_and) {
                LayoutElementClickAction _action_1 = buttonAction.getAction();
                ActionShowToast toastAction = ((ActionShowToast) _action_1);
                String _name_2 = activity.getName();
                String _javaToAndroidIdentifier_2 = ValueResourcesGenerator.this.javaToAndroidIdentifier(_name_2);
                String _plus_3 = (_javaToAndroidIdentifier_2 + "_");
                String _name_3 = ((Button) button).getName();
                String _javaToAndroidIdentifier_3 = ValueResourcesGenerator.this.javaToAndroidIdentifier(_name_3);
                String _plus_4 = (_plus_3 + _javaToAndroidIdentifier_3);
                String _plus_5 = (_plus_4 + "_toast");
                String _toastText = toastAction.getToastText();
                strings.put(_plus_5, _toastText);
              }
            }
          };
          IterableExtensions.<LayoutElement>forEach(_filter, _function_1);
          EList<LayoutElement> _layoutElements_1 = layouts.getLayoutElements();
          final Function1<LayoutElement, Boolean> _function_2 = new Function1<LayoutElement, Boolean>() {
            public Boolean apply(final LayoutElement layoutElement) {
              return Boolean.valueOf((layoutElement instanceof Text));
            }
          };
          Iterable<LayoutElement> _filter_1 = IterableExtensions.<LayoutElement>filter(_layoutElements_1, _function_2);
          final Procedure2<LayoutElement, Integer> _function_3 = new Procedure2<LayoutElement, Integer>() {
            public void apply(final LayoutElement text, final Integer index) {
              String _name = activity.getName();
              String _javaToAndroidIdentifier = ValueResourcesGenerator.this.javaToAndroidIdentifier(_name);
              String _plus = (_javaToAndroidIdentifier + "_text");
              String _plus_1 = (_plus + index);
              String _text = ((Text) text).getText();
              strings.put(_plus_1, _text);
            }
          };
          IterableExtensions.<LayoutElement>forEach(_filter_1, _function_3);
        }
      }
    };
    IterableExtensions.<ApplicationElement>forEach(_filter, _function_1);
    EList<ApplicationElement> _elements_1 = list.getElements();
    final Function1<ApplicationElement, Boolean> _function_2 = new Function1<ApplicationElement, Boolean>() {
      public Boolean apply(final ApplicationElement element) {
        return Boolean.valueOf((element instanceof Service));
      }
    };
    Iterable<ApplicationElement> _filter_1 = IterableExtensions.<ApplicationElement>filter(_elements_1, _function_2);
    final Procedure1<ApplicationElement> _function_3 = new Procedure1<ApplicationElement>() {
      public void apply(final ApplicationElement service) {
        EList<ServiceAttribute> _attributes = ((Service) service).getAttributes();
        ElementLabelAttribute titleField = ValueResourcesGenerator.this.<ElementLabelAttribute>getFieldData(_attributes, ElementLabelAttribute.class);
        String title = service.getName();
        boolean _notEquals = (!Objects.equal(titleField, null));
        if (_notEquals) {
          String _title = titleField.getTitle();
          title = _title;
        }
        String _name = service.getName();
        String _javaToAndroidIdentifier = ValueResourcesGenerator.this.javaToAndroidIdentifier(_name);
        String _plus = (_javaToAndroidIdentifier + "_title");
        strings.put(_plus, title);
      }
    };
    IterableExtensions.<ApplicationElement>forEach(_filter_1, _function_3);
    EList<ApplicationElement> _elements_2 = list.getElements();
    final Function1<ApplicationElement, Boolean> _function_4 = new Function1<ApplicationElement, Boolean>() {
      public Boolean apply(final ApplicationElement element) {
        return Boolean.valueOf((element instanceof BroadcastReceiver));
      }
    };
    Iterable<ApplicationElement> _filter_2 = IterableExtensions.<ApplicationElement>filter(_elements_2, _function_4);
    final Procedure1<ApplicationElement> _function_5 = new Procedure1<ApplicationElement>() {
      public void apply(final ApplicationElement receiver) {
        EList<BroadcastReceiverAttribute> _attributes = ((BroadcastReceiver) receiver).getAttributes();
        ElementLabelAttribute titleField = ValueResourcesGenerator.this.<ElementLabelAttribute>getFieldData(_attributes, ElementLabelAttribute.class);
        String title = receiver.getName();
        boolean _notEquals = (!Objects.equal(titleField, null));
        if (_notEquals) {
          String _title = titleField.getTitle();
          title = _title;
        }
        String _name = receiver.getName();
        String _javaToAndroidIdentifier = ValueResourcesGenerator.this.javaToAndroidIdentifier(_name);
        String _plus = (_javaToAndroidIdentifier + "_title");
        strings.put(_plus, title);
        EList<BroadcastReceiverAttribute> _attributes_1 = ((BroadcastReceiver) receiver).getAttributes();
        BroadcastReceiverActionAttribute action = ValueResourcesGenerator.this.<BroadcastReceiverActionAttribute>getFieldData(_attributes_1, BroadcastReceiverActionAttribute.class);
        boolean _and = false;
        boolean _notEquals_1 = (!Objects.equal(action, null));
        if (!_notEquals_1) {
          _and = false;
        } else {
          BroadcastReceiverAction _action = action.getAction();
          _and = (_action instanceof ActionShowToast);
        }
        if (_and) {
          BroadcastReceiverAction _action_1 = action.getAction();
          ActionShowToast toastAction = ((ActionShowToast) _action_1);
          String _name_1 = receiver.getName();
          String _javaToAndroidIdentifier_1 = ValueResourcesGenerator.this.javaToAndroidIdentifier(_name_1);
          String _plus_1 = (_javaToAndroidIdentifier_1 + "_toast");
          String _toastText = toastAction.getToastText();
          strings.put(_plus_1, _toastText);
        }
      }
    };
    IterableExtensions.<ApplicationElement>forEach(_filter_2, _function_5);
  }
}
