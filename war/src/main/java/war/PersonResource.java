package war;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import api.MyService;
import api.Person;

@Path("people")
public class PersonResource {

    @Inject
    private MyService myService;

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson(@PathParam("id") Long id) {
        return this.myService.findPerson(id);
    }

}
