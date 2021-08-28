package com.udemy.springboot.springboot_rest.dao;

import com.udemy.springboot.springboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee>  getAllEmployees ();
    public void SaveEmployee(Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);


}

