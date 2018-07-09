package fr.web.workshop.category;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.entities.rpg.Aptitude;

import fr.workshop.services.AptitudeService;

@Path("/aptitude")
@Stateless
public class AptitudeWS {
	
	@Inject
	private AptitudeService aptService;
	
	@GET
	@Path("/list")
	@Produces("application/json")
	public Response getAptitudesList(){
		 return Response.ok(aptService.findAll()).build();
	}
	
	@GET
	@Path("/listtypes")
	@Produces("application/json")
	public Response getAptitudesTypesList(){
		 return Response.ok(aptService.getAptitudeTypes()).build();
	}
	
	@POST
	@Path("/create")
	@Consumes("application/json")
	public Response saveAptitude(Aptitude apt){
		aptService.saveAptitude(apt);
		return Response.ok().build();
	}
	
	
	

}
