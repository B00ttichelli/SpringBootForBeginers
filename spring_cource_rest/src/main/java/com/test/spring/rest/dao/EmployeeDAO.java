package com.test.spring.rest.dao;


import com.test.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);
    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
