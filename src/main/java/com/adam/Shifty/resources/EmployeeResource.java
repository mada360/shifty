package com.adam.Shifty.resources;

import com.adam.Shifty.beans.EmployeeFilterBean;
import com.adam.Shifty.model.Employee;
import service.EmployeeService;


import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.List;

/**
 * Created by adam on 10/02/2017.
 */
@Path("/employees")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResource {

    private EmployeeService employeeService = new EmployeeService();

    @GET
    public List<Employee> getEmployees(@BeanParam EmployeeFilterBean filterBean){
        if(filterBean.getYear() > 0 ){
            return employeeService.getEmployeeByYear(filterBean.getYear());
        }
        if(filterBean.getStart() >= 0 && filterBean.getSize() > 0){
            return employeeService.getAllEmployeesPaginated(filterBean.getStart(), filterBean.getSize());
        }
        return employeeService.getAllEmployees();
    }


    @POST
    public Response addEmployee(Employee employee, @Context UriInfo uriInfo){

        Employee newEmployee = employeeService.addEmployee(employee);

        String newID = String.valueOf(newEmployee);
        URI uri = uriInfo.getAbsolutePathBuilder().path(newID).build();

        return Response.created(uri)
                .entity(newEmployee)
                .build();
    }

    @PUT
    @Path("/{employeeId}")
    public Employee updateEmployee(@PathParam("employeeId") Long employeeID, Employee employee){
        employee.setEmployeeId(employeeID);
        employeeService.updateEmployee(employee);
        return employee;
    }

    @DELETE
    @Path("/{employeeId}")
    public void deleteEmployee(@PathParam("employeeId") Long employeeID){
        employeeService.removeEmployee(employeeID);
    }

    @GET
    @Path("/{employeeId}")
    public Employee getEmployee(@PathParam("employeeId") Long employeeId){
        return employeeService.removeEmployee(employeeId);
    }

    @Path("/{employees}/shifts")
    public ShiftResource shiftResource(){
        return new ShiftResource();
    }


}
