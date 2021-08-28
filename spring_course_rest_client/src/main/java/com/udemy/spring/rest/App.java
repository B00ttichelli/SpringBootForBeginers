package com.udemy.spring.rest;

import com.udemy.spring.rest.configuration.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
/*
        List<Employee> allEmployees = communication.getAllEmployees();

        System.out.println(allEmployees);*/

        /*   System.out.println( communication.getEmployee(3));*/

/*
        Employee employee = new Employee();
        employee.setName("Sveta");
        employee.setSurname("Sokolova");
        employee.setDepartment("HR");
        employee.setSalary(1100);
        employee.setId(11);

        communication.saveEmployee(employee);
*/


        communication.deleteEmployee(11);


    }
}
