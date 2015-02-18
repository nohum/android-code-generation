package at.fhj.gaar.androidapp.generator.content;

import at.fhj.gaar.androidapp.appDsl.Application;
import at.fhj.gaar.androidapp.generator.content.AbstractGenerator;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Logger;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccessExtension3;

@SuppressWarnings("all")
public class DrawableResourcesGenerator extends AbstractGenerator {
  public void generate(final List<Application> applications, final IFileSystemAccess filesystem) {
    if ((!(filesystem instanceof IFileSystemAccessExtension3))) {
      Logger _logger = Logger.getLogger("");
      _logger.warning("filesystem does not support writing binary files, skipping");
      return;
    }
    IFileSystemAccessExtension3 binaryFilesystem = ((IFileSystemAccessExtension3) filesystem);
    for (final Application app : applications) {
      {
        String projectName = this.getProjectName(applications, app);
        String _format = String.format("%s/src/main/res/drawable-hdpi/ic_launcher.png", projectName);
        InputStream _drawableStream = this.getDrawableStream("ic_launcher_hdpi.png");
        binaryFilesystem.generateFile(_format, _drawableStream);
        String _format_1 = String.format("%s/src/main/res/drawable-xhdpi/ic_launcher.png", projectName);
        InputStream _drawableStream_1 = this.getDrawableStream("ic_launcher_xhdpi.png");
        binaryFilesystem.generateFile(_format_1, _drawableStream_1);
        String _format_2 = String.format("%s/src/main/res/drawable-xxhdpi/ic_launcher.png", projectName);
        InputStream _drawableStream_2 = this.getDrawableStream("ic_launcher_xxhdpi.png");
        binaryFilesystem.generateFile(_format_2, _drawableStream_2);
      }
    }
  }
  
  private InputStream getDrawableStream(final String filename) {
    Class<? extends DrawableResourcesGenerator> _class = this.getClass();
    ClassLoader _classLoader = _class.getClassLoader();
    String _format = String.format("at/fhj/gaar/androidapp/generator/resources/%s", filename);
    return _classLoader.getResourceAsStream(_format);
  }
}
