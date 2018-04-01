package th.co.gosoft.onl.alm.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.HashSet;
import java.util.Set;
/**
 * @author sukritsop
 *
 */
@ApplicationPath("/*")
public class RestConfig extends Application{
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(Order.class);
		return classes;
	}
}
