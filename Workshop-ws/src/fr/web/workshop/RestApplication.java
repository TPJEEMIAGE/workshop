package fr.web.workshop;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import fr.web.workshop.category.AptitudeWS;

@ApplicationPath("/workshop")
public class RestApplication extends Application{

	@Override
	public Set<Class<?>> getClasses(){
		Set<Class<?>> set = new HashSet<>();
		set.add(AptitudeWS.class);
		return set;
	}
	
}
