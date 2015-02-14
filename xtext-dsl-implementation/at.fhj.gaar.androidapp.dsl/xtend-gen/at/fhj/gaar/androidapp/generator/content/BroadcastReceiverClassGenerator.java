package at.fhj.gaar.androidapp.generator.content;

import at.fhj.gaar.androidapp.appDsl.ActionShowToast;
import at.fhj.gaar.androidapp.appDsl.ActionStartActivity;
import at.fhj.gaar.androidapp.appDsl.ActionStartService;
import at.fhj.gaar.androidapp.appDsl.Activity;
import at.fhj.gaar.androidapp.appDsl.Application;
import at.fhj.gaar.androidapp.appDsl.ApplicationElement;
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiver;
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiverAction;
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiverActionAttribute;
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiverAttribute;
import at.fhj.gaar.androidapp.appDsl.Service;
import at.fhj.gaar.androidapp.generator.content.AbstractClassGenerator;
import com.google.common.base.Objects;
import java.util.logging.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class BroadcastReceiverClassGenerator extends AbstractClassGenerator {
  protected String getSubClassPath() {
    return "receiver";
  }
  
  protected boolean isAllowedElement(final ApplicationElement element) {
    return (element instanceof BroadcastReceiver);
  }
  
  protected String retrieveElementTemplate(final Application application, final ApplicationElement element) {
    BroadcastReceiver receiver = ((BroadcastReceiver) element);
    EList<BroadcastReceiverAttribute> _attributes = receiver.getAttributes();
    BroadcastReceiverActionAttribute action = this.<BroadcastReceiverActionAttribute>getFieldData(_attributes, BroadcastReceiverActionAttribute.class);
    Logger _logger = Logger.getLogger("AppGenerator");
    EList<BroadcastReceiverAttribute> _attributes_1 = receiver.getAttributes();
    String _plus = ("receiver action =" + _attributes_1);
    _logger.info(_plus);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _name = application.getName();
    _builder.append(_name, "");
    _builder.append(".receiver;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import android.content.BroadcastReceiver;");
    _builder.newLine();
    _builder.append("import android.content.Context;");
    _builder.newLine();
    _builder.append("import android.content.Intent;");
    _builder.newLine();
    _builder.append("import android.util.Log;");
    _builder.newLine();
    _builder.newLine();
    String _insertPackageImportsForAction = this.insertPackageImportsForAction(application, action);
    _builder.append(_insertPackageImportsForAction, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    String _name_1 = receiver.getName();
    _builder.append(_name_1, "");
    _builder.append(" extends BroadcastReceiver {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    String _name_2 = receiver.getName();
    _builder.append(_name_2, "    ");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void onReceive(Context context, Intent intent) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Log.d(\"App\", \"");
    String _name_3 = receiver.getName();
    _builder.append(_name_3, "        ");
    _builder.append(": received intent action = \" + intent.getAction());");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    String _insertAction = this.insertAction(receiver, action);
    _builder.append(_insertAction, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
  
  private String insertPackageImportsForAction(final Application application, final BroadcastReceiverActionAttribute action) {
    boolean _equals = Objects.equal(action, null);
    if (_equals) {
      return "";
    }
    BroadcastReceiverAction concreteAction = action.getAction();
    if ((concreteAction instanceof ActionShowToast)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import android.widget.Toast;");
      _builder.newLine();
      return _builder.toString();
    } else {
      if ((concreteAction instanceof ActionStartService)) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("import ");
        String _name = application.getName();
        _builder_1.append(_name, "");
        _builder_1.append(".service.");
        Service _service = ((ActionStartService)concreteAction).getService();
        String _name_1 = _service.getName();
        _builder_1.append(_name_1, "");
        _builder_1.append(";");
        _builder_1.newLineIfNotEmpty();
        return _builder_1.toString();
      } else {
        if ((concreteAction instanceof ActionStartActivity)) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("import ");
          String _name_2 = application.getName();
          _builder_2.append(_name_2, "");
          _builder_2.append(".activity.");
          Activity _activity = ((ActionStartActivity)concreteAction).getActivity();
          String _name_3 = _activity.getName();
          _builder_2.append(_name_3, "");
          _builder_2.append(";");
          _builder_2.newLineIfNotEmpty();
          return _builder_2.toString();
        }
      }
    }
    return null;
  }
  
  private String insertAction(final BroadcastReceiver receiver, final BroadcastReceiverActionAttribute action) {
    boolean _equals = Objects.equal(action, null);
    if (_equals) {
      return "";
    }
    BroadcastReceiverAction concreteAction = action.getAction();
    if ((concreteAction instanceof ActionShowToast)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Toast.makeText(context, context.getString(R.string.");
      String _name = receiver.getName();
      String _javaToAndroidIdentifier = this.javaToAndroidIdentifier(_name);
      _builder.append(_javaToAndroidIdentifier, "");
      _builder.append("_toast), Toast.LENGTH_LONG).show();");
      _builder.newLineIfNotEmpty();
      return _builder.toString();
    } else {
      if ((concreteAction instanceof ActionStartService)) {
        StringConcatenation _builder_1 = new StringConcatenation();
        Service _service = ((ActionStartService)concreteAction).getService();
        String _name_1 = _service.getName();
        _builder_1.append(_name_1, "");
        _builder_1.append(".startService(context);");
        _builder_1.newLineIfNotEmpty();
        return _builder_1.toString();
      } else {
        if ((concreteAction instanceof ActionStartActivity)) {
          StringConcatenation _builder_2 = new StringConcatenation();
          Activity _activity = ((ActionStartActivity)concreteAction).getActivity();
          String _name_2 = _activity.getName();
          _builder_2.append(_name_2, "");
          _builder_2.append(".startActivity(context);");
          _builder_2.newLineIfNotEmpty();
          return _builder_2.toString();
        }
      }
    }
    return null;
  }
}
