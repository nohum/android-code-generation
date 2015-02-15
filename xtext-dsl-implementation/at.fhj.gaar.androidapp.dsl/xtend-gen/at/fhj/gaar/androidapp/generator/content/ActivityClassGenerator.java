package at.fhj.gaar.androidapp.generator.content;

import at.fhj.gaar.androidapp.appDsl.ActionShowToast;
import at.fhj.gaar.androidapp.appDsl.ActionStartActivity;
import at.fhj.gaar.androidapp.appDsl.ActionStartService;
import at.fhj.gaar.androidapp.appDsl.Activity;
import at.fhj.gaar.androidapp.appDsl.ActivityAttribute;
import at.fhj.gaar.androidapp.appDsl.ActivityLayoutAttribute;
import at.fhj.gaar.androidapp.appDsl.Application;
import at.fhj.gaar.androidapp.appDsl.ApplicationElement;
import at.fhj.gaar.androidapp.appDsl.Button;
import at.fhj.gaar.androidapp.appDsl.ButtonActionAttribute;
import at.fhj.gaar.androidapp.appDsl.ButtonAttribute;
import at.fhj.gaar.androidapp.appDsl.LayoutElement;
import at.fhj.gaar.androidapp.appDsl.LayoutElementClickAction;
import at.fhj.gaar.androidapp.appDsl.Service;
import at.fhj.gaar.androidapp.generator.content.AbstractClassGenerator;
import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ActivityClassGenerator extends AbstractClassGenerator {
  protected String getSubClassPath() {
    return "activity";
  }
  
  protected boolean isAllowedElement(final ApplicationElement element) {
    return (element instanceof Activity);
  }
  
  protected String retrieveElementTemplate(final Application application, final ApplicationElement element) {
    Activity activity = ((Activity) element);
    EList<ActivityAttribute> _attributes = activity.getAttributes();
    ActivityLayoutAttribute layout = this.<ActivityLayoutAttribute>getFieldData(_attributes, ActivityLayoutAttribute.class);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _name = application.getName();
    _builder.append(_name, "");
    _builder.append(".activity;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import android.support.v7.app.ActionBarActivity;");
    _builder.newLine();
    _builder.append("import android.os.Bundle;");
    _builder.newLine();
    _builder.append("import android.support.v7.widget.Toolbar;");
    _builder.newLine();
    _builder.append("import android.view.View;");
    _builder.newLine();
    String _insertPackageImports = this.insertPackageImports(application, layout);
    _builder.append(_insertPackageImports, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name_1 = activity.getName();
    _builder.append(_name_1, "");
    _builder.append(" extends ActionBarActivity implements View.OnClickListener {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _insertLayoutFields = this.insertLayoutFields(layout);
    _builder.append(_insertLayoutFields, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void onCreate(Bundle savedInstanceState) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super.onCreate(savedInstanceState);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("setContentView(R.layout.");
    String _name_2 = activity.getName();
    String _javaToAndroidIdentifier = this.javaToAndroidIdentifier(_name_2);
    _builder.append(_javaToAndroidIdentifier, "        ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("setSupportActionBar((Toolbar) findViewById(R.id.toolbar));");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("getSupportActionBar().setDisplayHomeAsUpEnabled(true);");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    String _insertLayoutFieldInit = this.insertLayoutFieldInit(layout);
    _builder.append(_insertLayoutFieldInit, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void onClick(View v) {");
    _builder.newLine();
    _builder.append("        ");
    String _insertLayoutClickActions = this.insertLayoutClickActions(activity, layout);
    _builder.append(_insertLayoutClickActions, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
  
  private String insertPackageImports(final Application application, final ActivityLayoutAttribute layout) {
    boolean _equals = Objects.equal(layout, null);
    if (_equals) {
      return "";
    }
    StringConcatenation _builder = new StringConcatenation();
    String data = _builder.toString();
    EList<LayoutElement> _layoutElements = layout.getLayoutElements();
    final Function1<LayoutElement, Boolean> _function = new Function1<LayoutElement, Boolean>() {
      public Boolean apply(final LayoutElement element) {
        return Boolean.valueOf((element instanceof Button));
      }
    };
    Iterable<LayoutElement> _filter = IterableExtensions.<LayoutElement>filter(_layoutElements, _function);
    int _size = IterableExtensions.size(_filter);
    boolean hasButton = (_size > 0);
    if (hasButton) {
      String _data = data;
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("import android.widget.Button;");
      _builder_1.newLine();
      data = (_data + _builder_1);
    }
    EList<LayoutElement> _layoutElements_1 = layout.getLayoutElements();
    for (final LayoutElement element : _layoutElements_1) {
      if ((element instanceof Button)) {
        EList<ButtonAttribute> _attributes = ((Button)element).getAttributes();
        ButtonActionAttribute action = this.<ButtonActionAttribute>getFieldData(_attributes, ButtonActionAttribute.class);
        boolean _notEquals = (!Objects.equal(action, null));
        if (_notEquals) {
          LayoutElementClickAction concreteAction = action.getAction();
          if ((concreteAction instanceof ActionShowToast)) {
            String _data_1 = data;
            StringConcatenation _builder_2 = new StringConcatenation();
            _builder_2.append("import android.widget.Toast;");
            _builder_2.newLine();
            data = (_data_1 + _builder_2);
          } else {
            if ((concreteAction instanceof ActionStartService)) {
              String _data_2 = data;
              StringConcatenation _builder_3 = new StringConcatenation();
              _builder_3.append("import ");
              String _name = application.getName();
              _builder_3.append(_name, "");
              _builder_3.append(".service.");
              Service _service = ((ActionStartService)concreteAction).getService();
              String _name_1 = _service.getName();
              _builder_3.append(_name_1, "");
              _builder_3.append(";");
              _builder_3.newLineIfNotEmpty();
              data = (_data_2 + _builder_3);
            } else {
              if ((concreteAction instanceof ActionStartActivity)) {
                String _data_3 = data;
                StringConcatenation _builder_4 = new StringConcatenation();
                _builder_4.append("import ");
                String _name_2 = application.getName();
                _builder_4.append(_name_2, "");
                _builder_4.append(".activity.");
                Activity _activity = ((ActionStartActivity)concreteAction).getActivity();
                String _name_3 = _activity.getName();
                _builder_4.append(_name_3, "");
                _builder_4.append(";");
                _builder_4.newLineIfNotEmpty();
                data = (_data_3 + _builder_4);
              }
            }
          }
        }
      }
    }
    return data;
  }
  
  private String insertLayoutFields(final ActivityLayoutAttribute attribute) {
    boolean _equals = Objects.equal(attribute, null);
    if (_equals) {
      return "";
    }
    StringConcatenation _builder = new StringConcatenation();
    String data = _builder.toString();
    EList<LayoutElement> _layoutElements = attribute.getLayoutElements();
    for (final LayoutElement element : _layoutElements) {
      if ((element instanceof Button)) {
        String _data = data;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("private Button ");
        String _name = ((Button)element).getName();
        _builder_1.append(_name, "");
        _builder_1.append(";");
        _builder_1.newLineIfNotEmpty();
        data = (_data + _builder_1);
      }
    }
    return data;
  }
  
  private String insertLayoutFieldInit(final ActivityLayoutAttribute attribute) {
    boolean _equals = Objects.equal(attribute, null);
    if (_equals) {
      return "";
    }
    StringConcatenation _builder = new StringConcatenation();
    String data = _builder.toString();
    EList<LayoutElement> _layoutElements = attribute.getLayoutElements();
    for (final LayoutElement element : _layoutElements) {
      if ((element instanceof Button)) {
        String _data = data;
        StringConcatenation _builder_1 = new StringConcatenation();
        String _name = ((Button)element).getName();
        _builder_1.append(_name, "");
        _builder_1.append(" = (Button) findViewById(R.id.");
        String _name_1 = ((Button)element).getName();
        String _javaToAndroidIdentifier = this.javaToAndroidIdentifier(_name_1);
        _builder_1.append(_javaToAndroidIdentifier, "");
        _builder_1.append(");");
        _builder_1.newLineIfNotEmpty();
        data = (_data + _builder_1);
      }
    }
    return data;
  }
  
  private String insertLayoutClickActions(final Activity activity, final ActivityLayoutAttribute attribute) {
    boolean _equals = Objects.equal(attribute, null);
    if (_equals) {
      return "";
    }
    StringConcatenation _builder = new StringConcatenation();
    String data = _builder.toString();
    EList<LayoutElement> _layoutElements = attribute.getLayoutElements();
    for (final LayoutElement element : _layoutElements) {
      if ((element instanceof Button)) {
        EList<ButtonAttribute> _attributes = ((Button)element).getAttributes();
        ButtonActionAttribute action = this.<ButtonActionAttribute>getFieldData(_attributes, ButtonActionAttribute.class);
        String _data = data;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("if (v.equals(");
        String _name = ((Button)element).getName();
        _builder_1.append(_name, "");
        _builder_1.append(")) {");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        String _insertActionCode = this.insertActionCode(activity, action);
        _builder_1.append(_insertActionCode, "\t");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("return;");
        _builder_1.newLine();
        _builder_1.append("}");
        _builder_1.newLine();
        data = (_data + _builder_1);
      }
    }
    return data;
  }
  
  private String insertActionCode(final Activity activity, final ButtonActionAttribute action) {
    boolean _equals = Objects.equal(action, null);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("// insert your code here");
      _builder.newLine();
      return _builder.toString();
    }
    LayoutElementClickAction concreteAction = action.getAction();
    if ((concreteAction instanceof ActionShowToast)) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Toast.makeText(context, context.getString(R.string.");
      String _name = activity.getName();
      String _javaToAndroidIdentifier = this.javaToAndroidIdentifier(_name);
      _builder_1.append(_javaToAndroidIdentifier, "");
      _builder_1.append("_toast), Toast.LENGTH_LONG).show();");
      _builder_1.newLineIfNotEmpty();
      return _builder_1.toString();
    } else {
      if ((concreteAction instanceof ActionStartService)) {
        StringConcatenation _builder_2 = new StringConcatenation();
        Service _service = ((ActionStartService)concreteAction).getService();
        String _name_1 = _service.getName();
        _builder_2.append(_name_1, "");
        _builder_2.append(".startService(context);");
        _builder_2.newLineIfNotEmpty();
        return _builder_2.toString();
      } else {
        if ((concreteAction instanceof ActionStartActivity)) {
          StringConcatenation _builder_3 = new StringConcatenation();
          Activity _activity = ((ActionStartActivity)concreteAction).getActivity();
          String _name_2 = _activity.getName();
          _builder_3.append(_name_2, "");
          _builder_3.append(".startActivity(context);");
          _builder_3.newLineIfNotEmpty();
          return _builder_3.toString();
        }
      }
    }
    return null;
  }
}
