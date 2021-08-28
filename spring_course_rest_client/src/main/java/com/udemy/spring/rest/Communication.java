package com.udemy.spring.rest;


import com.udemy.spring.rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {

    private final String URL = "http://localhost:8080/spring_cource_rest_war_exploded/api/employees";
    @Autowired
    private RestTemplate restTemplate;

    public List<Employee> getAllEmployees() {

        ResponseEntity<List<Employee>> responseEntity = restTemplate.exchange(URL,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Employee>>() {
                });

        List<Employee> body = responseEntity.getBody();
        return body;
    }

    public Employee getEmployee(int id) {

        Employee forObject = restTemplate.getForObject(URL + "/" + id, Employee.class);
        return forObject;
    }

    public void saveEmployee(Employee employee) {

        int id = employee.getId();
        if (id == 0) {
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(URL, employee, String.class);
            System.out.println("New employee was added");
            System.out.println(responseEntity.getBody());
        } else {

            restTemplate.put(URL, employee);
            System.out.println("Employee with id " + id + " was updated ");
        }


    }

    public void deleteEmployee(int id) {
        restTemplate.delete(URL + "/" + id);
        System.out.println("Employee with id " + id + " from database");
    }
}
