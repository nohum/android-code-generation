/*
 * generated by Xtext
 */
package at.fhj.gaar.androidapp.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import at.fhj.gaar.androidapp.ui.internal.AppDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AppDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return AppDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return AppDslActivator.getInstance().getInjector(AppDslActivator.AT_FHJ_GAAR_ANDROIDAPP_APPDSL);
	}
	
}
