package service;

import com.adam.Shifty.database.DatabaseClass;
import com.adam.Shifty.exception.DataNotFoundException;
import com.adam.Shifty.model.Employee;
import com.adam.Shifty.model.Profile;

import java.util.*;

/**
 * Created by adam on 13/02/17.
 */
public class EmployeeService {

    private Map<Long, Employee> employees = DatabaseClass.getEmployees();

    public EmployeeService(){
        employees.put(1L,new Employee(1L,"Adam", "Worley", new Date()));
        employees.put(2L,new Employee(2L,"Richard", "Hankins", new Date()));
        employees.put(3L,new Employee(3L,"George", "Vicarey", new Date()));
    }


    public List<Employee> getAllEmployees(){
        return new ArrayList<Employee>(employees.values());
    }

    public Employee getEmployee(Long id){
        Employee employee = employees.get(id);
        if(employee == null){
            throw new DataNotFoundException("Message with id " + id + " not found");
        }
        return employee;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeId(employees.size()+1);
        employees.put(employee.getEmployeeId(),employee);
        return employee;
    }

    public Employee updateEmployee(Employee employee){
        if(employee.getEmployeeId() <= 0){
            return null;
        }
        employees.put(employee.getEmployeeId(), employee);
        return employee;
    }

    public Employee removeEmployee(Long employeeID){
        return employees.remove(employeeID);
    }

    public List<Employee> getAllEmployeesPaginated(int start, int size){
        ArrayList<Employee> list = new ArrayList<Employee>(employees.values());
        if(start+size > list.size()) return new ArrayList<Employee>();
        return list.subList(start, start+size);

    }

    public List<Employee> getEmployeeByYear(int year){
        List<Employee> employeeYear = new ArrayList<>();
        Calendar cal = Calendar.getInstance();
        for(Employee employee : employees.values()){
            cal.setTime(employee.getStarted());
            if(cal.get(Calendar.YEAR) == year){
                employeeYear.add(employee);
            }
        }
        return employeeYear;

    }

}
