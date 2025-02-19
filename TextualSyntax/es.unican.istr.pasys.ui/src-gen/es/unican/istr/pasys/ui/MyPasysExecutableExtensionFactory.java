/*
 * generated by Xtext 2.35.0
 */
package es.unican.istr.pasys.ui;

import com.google.inject.Injector;
import es.unican.istr.pasys.ui.internal.PasysActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyPasysExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(PasysActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		PasysActivator activator = PasysActivator.getInstance();
		return activator != null ? activator.getInjector(PasysActivator.ES_UNICAN_ISTR_PASYS_MYPASYS) : null;
	}

}
