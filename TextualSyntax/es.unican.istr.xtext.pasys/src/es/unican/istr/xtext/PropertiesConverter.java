package es.unican.istr.xtext;

import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.nodemodel.INode;

public class PropertiesConverter extends Ecore2XtextTerminalConverters {

	@ValueConverter(rule = "Properties")
	public IValueConverter<Properties> Properties() {
	    return new AbstractNullSafeConverter<Properties>() {

	        @Override
	        protected String internalToString(Properties value) {
	            StringBuilder sb = new StringBuilder();
	            value.forEach((k, v) -> sb.append(k).append("=")
	            		.append(v).append(","));
	            if (sb.length() > 0) {
	                sb.deleteCharAt(sb.length() - 1);
	            }
	            return sb.toString();
	        }

	        @Override
	        protected Properties internalToValue(String string, INode node) 
	        		throws ValueConverterException {
	            Properties properties = new Properties();
	            Pattern pattern = Pattern.compile("([^=]+)=([^,]+)");
	            Matcher matcher = pattern.matcher(string);
	            while (matcher.find()) {
	                String key = matcher.group(1).trim();
	                String value = matcher.group(2).trim();
	                properties.put(key, value);
	            }
	            return properties;
	        }
	    };
	}
}