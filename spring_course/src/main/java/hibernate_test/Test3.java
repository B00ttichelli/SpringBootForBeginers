package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
/*            List<Employee> employees = session.createQuery("from Employee").getResultList();
            employees.forEach(System.out::println);*/

          /*  List<Employee>  aleksanders = session.createQuery("from Employee where name = 'Alex'").getResultList();
            aleksanders.forEach(System.out::println);*/

            List<Employee>  alexMMoreThan600 = session.createQuery("from Employee where name = 'Alex' AND salary > 650").getResultList();

            alexMMoreThan600.forEach(System.out::println);
            session.getTransaction().commit();
            System.out.println("Done");
        }finally {
            sessionFactory.close();
        }
    }
}
