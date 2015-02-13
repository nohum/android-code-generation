package at.fhj.gaar.androidapp;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.STRINGValueConverter;

import com.google.inject.Inject;

/**
 * Extend the default converters by our PACKAGE_NAME converter.
 */
public class TerminalConverters extends DefaultTerminalConverters {

	@Inject
	private STRINGValueConverter packageNameValueConverter;
	
	@ValueConverter(rule = "PACKAGE_NAME")
	public IValueConverter<String> PACKAGE_NAME() {
		return packageNameValueConverter;
	}
	
}
