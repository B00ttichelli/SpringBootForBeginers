package com.udemy.springboot.springboot_rest.dao;

import com.udemy.springboot.springboot_rest.entity.Employee;
/*import org.hibernate.Session;
import org.hibernate.query.Query;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    EntityManager entityManager;


    @Override
    public void SaveEmployee(Employee employee) {
  /*      Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(employee);*/

        //jpa
       Employee employee1 =  entityManager.merge(employee);
       employee.setId(employee1.getId());  // для возврата адекватной инфы
    }

    @Override
    public Employee getEmployee(int id) {
   /*     Session session = entityManager.unwrap(Session.class);
        return session.get(Employee.class,id);*/

        //JPA
        return entityManager.find(Employee.class,id);
    }

    @Override
    public void deleteEmployee(int id) {
      /*  Session session = entityManager.unwrap(Session.class);
        Query query =session.createQuery("delete from Employee where id =:employeeId");
        query.setParameter("employeeId",id);
        query.executeUpdate();*/


        Query query = entityManager.createQuery("delete from Employee where id =:employeeId");
        query.setParameter("employeeId",id);
        query.executeUpdate();


    }

    @Override
    public List<Employee> getAllEmployees() {

        Query query = entityManager.createQuery("from Employee");
        return query.getResultList();

   /*     Session session = entityManager.unwrap(Session.class);

        Query<Employee> query = session.createQuery("from Employee ", Employee.class);

        return query.getResultList();*/
    }
}
