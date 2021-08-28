package com.udemy.springboot.spring_data_jpa.service;

import com.udemy.springboot.spring_data_jpa.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public Employee deleteEmployee(int id);

    public List<Employee> findAllEmployeeByName (String name);

}
