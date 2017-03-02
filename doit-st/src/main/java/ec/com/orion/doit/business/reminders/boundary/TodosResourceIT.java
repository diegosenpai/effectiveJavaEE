package ec.com.orion.doit.business.reminders.boundary;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertTrue;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;

public class TodosResourceIT {
	
	private Client client;
	private WebTarget tut;

	@Before
	public void initClient(){
		client = ClientBuilder.newClient();
		this.tut = this.client.target("http://localhost:8080/doit/api/todos");		
	}

	
	@Test
	public void fetchToDos(){
		Response response = this.tut.request(MediaType.TEXT_PLAIN).get();
		assertThat(response.getStatus(),is(200));
		String payload = response.readEntity(String.class);
		assertTrue(payload.startsWith("hola"));
	}


	private void assertThat(int status, Matcher<Integer> matcher) {
		// TODO Auto-generated method stub
		
	}
}
