package com.test.spring.rest.controller;

import com.test.spring.rest.entity.Employee;
import com.test.spring.rest.exeption_handling.NoSuchEmployeeException;
import com.test.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees(){

        return  employeeService.getAllEmployees();
    }


    @GetMapping("/employees/{id}")

    public Employee getEmployee(@PathVariable int id) throws NoSuchEmployeeException {
        Employee employee = employeeService.getEmployee(id);
        if(employee == null){
            throw  new NoSuchEmployeeException("There is no employee with ID = "+id);
        }

        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee){

        employeeService.saveEmployee(employee);
        return employee;

    }
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){

        employeeService.saveEmployee(employee);

        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) throws NoSuchEmployeeException {
        Employee employee = employeeService.getEmployee(id);
        if(employee == null){
            throw new NoSuchEmployeeException("There is not employee with id  = " +id +" in database");
        }
        employeeService.deleteEmployee(id);
        return "Employee with id " + id + " is deleted";
    }
}
