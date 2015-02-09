package at.fhj.gaar.androidapp.generator.content;

import java.util.List;

import org.eclipse.xtext.generator.IFileSystemAccess;

import at.fhj.gaar.androidapp.appDsl.Application;

/**
 * Content generator
 */
public interface ContentGenerator {

	public void generate(List<Application> applications, IFileSystemAccess filesystem);
	
}