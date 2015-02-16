package at.fhj.gaar.androidapp.generator.content;

import at.fhj.gaar.androidapp.appDsl.Activity;
import at.fhj.gaar.androidapp.appDsl.ActivityAttribute;
import at.fhj.gaar.androidapp.appDsl.ActivityLayoutAttribute;
import at.fhj.gaar.androidapp.appDsl.Application;
import at.fhj.gaar.androidapp.appDsl.ApplicationAttribute;
import at.fhj.gaar.androidapp.appDsl.ApplicationElement;
import at.fhj.gaar.androidapp.appDsl.ApplicationElementList;
import at.fhj.gaar.androidapp.appDsl.Button;
import at.fhj.gaar.androidapp.appDsl.LayoutElement;
import at.fhj.gaar.androidapp.appDsl.Text;
import at.fhj.gaar.androidapp.generator.content.AbstractGenerator;
import com.google.common.base.Objects;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class LayoutResourcesGenerator extends AbstractGenerator {
  public void generate(final List<Application> applications, final IFileSystemAccess filesystem) {
    for (final Application app : applications) {
      {
        final String projectName = this.getProjectName(applications, app);
        EList<ApplicationAttribute> _attributes = app.getAttributes();
        ApplicationElementList appElements = this.<ApplicationElementList>getFieldData(_attributes, ApplicationElementList.class);
        boolean _notEquals = (!Objects.equal(appElements, null));
        if (_notEquals) {
          EList<ApplicationElement> _elements = appElements.getElements();
          final Function1<ApplicationElement, Boolean> _function = new Function1<ApplicationElement, Boolean>() {
            public Boolean apply(final ApplicationElement element) {
              return Boolean.valueOf((element instanceof Activity));
            }
          };
          Iterable<ApplicationElement> _filter = IterableExtensions.<ApplicationElement>filter(_elements, _function);
          final Procedure1<ApplicationElement> _function_1 = new Procedure1<ApplicationElement>() {
            public void apply(final ApplicationElement curr) {
              Activity activity = ((Activity) curr);
              String _name = activity.getName();
              String _javaToAndroidIdentifier = LayoutResourcesGenerator.this.javaToAndroidIdentifier(_name);
              String _format = String.format("%s/src/main/res/layout/%s.xml", projectName, _javaToAndroidIdentifier);
              String _generateActivityLayout = LayoutResourcesGenerator.this.generateActivityLayout(activity);
              filesystem.generateFile(_format, _generateActivityLayout);
            }
          };
          IterableExtensions.<ApplicationElement>forEach(_filter, _function_1);
        }
      }
    }
  }
  
  private String generateActivityLayout(final Activity activity) {
    EList<ActivityAttribute> _attributes = activity.getAttributes();
    ActivityLayoutAttribute layout = this.<ActivityLayoutAttribute>getFieldData(_attributes, ActivityLayoutAttribute.class);
    boolean _or = false;
    boolean _equals = Objects.equal(layout, null);
    if (_equals) {
      _or = true;
    } else {
      EList<LayoutElement> _layoutElements = layout.getLayoutElements();
      int _size = _layoutElements.size();
      boolean _equals_1 = (_size == 0);
      _or = _equals_1;
    }
    if (_or) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
      _builder.newLine();
      _builder.append("<LinearLayout");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("xmlns:android=\"http://schemas.android.com/apk/res/android\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("android:layout_width=\"match_parent\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("android:layout_height=\"match_parent\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("android:paddingLeft=\"@dimen/activity_horizontal_margin\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("android:paddingRight=\"@dimen/activity_horizontal_margin\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("android:paddingTop=\"@dimen/activity_vertical_margin\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("android:paddingBottom=\"@dimen/activity_vertical_margin\">");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("</LinearLayout>");
      _builder.newLine();
      return _builder.toString();
    }
    final StringBuilder string = new StringBuilder();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    _builder_1.newLine();
    _builder_1.append("<LinearLayout");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("xmlns:android=\"http://schemas.android.com/apk/res/android\"");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("android:layout_width=\"match_parent\"");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("android:layout_height=\"match_parent\"");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("android:paddingLeft=\"@dimen/activity_horizontal_margin\"");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("android:paddingRight=\"@dimen/activity_horizontal_margin\"");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("android:paddingTop=\"@dimen/activity_vertical_margin\"");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("android:paddingBottom=\"@dimen/activity_vertical_margin\">");
    _builder_1.newLine();
    _builder_1.newLine();
    string.append(_builder_1);
    final AtomicInteger textIndex = new AtomicInteger(0);
    EList<LayoutElement> _layoutElements_1 = layout.getLayoutElements();
    final Procedure1<LayoutElement> _function = new Procedure1<LayoutElement>() {
      public void apply(final LayoutElement element) {
        if ((element instanceof Button)) {
          String _name = activity.getName();
          String _javaToAndroidIdentifier = LayoutResourcesGenerator.this.javaToAndroidIdentifier(_name);
          String _plus = (_javaToAndroidIdentifier + "_");
          String _name_1 = ((Button)element).getName();
          String _javaToAndroidIdentifier_1 = LayoutResourcesGenerator.this.javaToAndroidIdentifier(_name_1);
          String _plus_1 = (_plus + _javaToAndroidIdentifier_1);
          String buttonTitleRes = (_plus_1 + "_title");
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("<Button");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("android:id=\"@+id/");
          String _name_2 = ((Button)element).getName();
          String _javaToAndroidIdentifier_2 = LayoutResourcesGenerator.this.javaToAndroidIdentifier(_name_2);
          _builder.append(_javaToAndroidIdentifier_2, "\t");
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("android:text=\"@string/");
          _builder.append(buttonTitleRes, "\t");
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("android:layout_height=\"wrap_content\"");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("android:layout_weight=\"match_parent\" />");
          _builder.newLine();
          _builder.newLine();
          string.append(_builder);
        } else {
          if ((element instanceof Text)) {
            String _name_3 = activity.getName();
            String _javaToAndroidIdentifier_3 = LayoutResourcesGenerator.this.javaToAndroidIdentifier(_name_3);
            String _plus_2 = (_javaToAndroidIdentifier_3 + "_text");
            String textTitleRes = (_plus_2 + textIndex);
            textIndex.addAndGet(1);
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("<TextView android:text=\"@string/");
            _builder_1.append(textTitleRes, "");
            _builder_1.append("\"");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("    ");
            _builder_1.append("android:layout_width=\"wrap_content\"");
            _builder_1.newLine();
            _builder_1.append("    ");
            _builder_1.append("android:layout_height=\"wrap_content\" />");
            _builder_1.newLine();
            _builder_1.newLine();
            string.append(_builder_1);
          }
        }
      }
    };
    IterableExtensions.<LayoutElement>forEach(_layoutElements_1, _function);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("</LinearLayout>");
    _builder_2.newLine();
    string.append(_builder_2);
    return string.toString();
  }
}
