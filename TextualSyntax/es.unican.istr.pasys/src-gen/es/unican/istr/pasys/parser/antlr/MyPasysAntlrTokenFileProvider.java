/*
 * generated by Xtext 2.35.0
 */
package es.unican.istr.pasys.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MyPasysAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("es/unican/istr/pasys/parser/antlr/internal/InternalMyPasys.tokens");
	}
}
