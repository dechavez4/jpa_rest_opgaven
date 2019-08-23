package rest.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dto.EmployeeDTO;
import entities.Employee;
import facades.EmployeeFacade;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("employee")
public class EmployeeResource {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    EmployeeFacade facade = EmployeeFacade.getFacadeExample(emf);
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String demo() {
        return "{\"msg\":\"succes\"}";
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(Employee entity) {
        throw new UnsupportedOperationException();
    }

    @PUT
    @Path("/{id}")
    @Consumes({MediaType.APPLICATION_JSON})
    public void update(Employee entity, @PathParam("id") int id) {
        throw new UnsupportedOperationException();
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllEmployees() {
        List<Employee> employee = facade.getAllEmployees();
        List<EmployeeDTO> emDTO = new ArrayList();
        for (Employee emp : employee) {
            emDTO.add(new EmployeeDTO(emp));
        }
        return Response.ok().entity(gson.toJson(emDTO)).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getEmployeeById( @PathParam("id") long id) {
        Employee employee = facade.getEmployeeById(1);
        EmployeeDTO emDTO = new EmployeeDTO(employee);
        return gson.toJson(emDTO);
    }
    
    @GET
    @Path("/salery")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHighestSallery(){
        List<Employee> employee = facade.getHighestSallery();
        List<EmployeeDTO> emDTO = new ArrayList();
        for (Employee emp : employee) {
            emDTO.add(new EmployeeDTO(emp));
        }
     return Response.ok().entity(gson.toJson(emDTO)).build();
    }
}
