/*
 * generated by Xtext 2.35.0
 */
package es.unican.istr.pasys.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import es.unican.istr.pasys.MyPasysRuntimeModule;
import es.unican.istr.pasys.MyPasysStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MyPasysIdeSetup extends MyPasysStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MyPasysRuntimeModule(), new MyPasysIdeModule()));
	}
	
}
