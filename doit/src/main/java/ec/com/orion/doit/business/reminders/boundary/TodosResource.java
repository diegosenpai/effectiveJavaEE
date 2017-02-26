package ec.com.orion.doit.business.reminders.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path(value = "todos")
public class TodosResource {
	
	@GET
	public String hello(){
		return "hola "+System.currentTimeMillis();
		
	}

}
