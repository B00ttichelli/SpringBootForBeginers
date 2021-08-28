package com.udemy.springboot.spring_data_jpa.service;

import com.udemy.springboot.spring_data_jpa.dao.EmployeeRepository;
import com.udemy.springboot.spring_data_jpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;


    @Override

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override

    public void saveEmployee(Employee employee) {

        employeeRepository.save(employee);

    }

    @Override
    public List<Employee> findAllEmployeeByName(String name) {
       return employeeRepository.findAllByName(name);
    }

    @Override

    public Employee getEmployee(int id) {

        //MaybeBetter to use isPresent before return ??
        return employeeRepository.findById(id).isPresent()?employeeRepository.findById(id).get():null;
    }

    @Override

    public Employee deleteEmployee(int id) {
        employeeRepository.deleteById(id);
        return employeeRepository.getById(id);
    }
}
