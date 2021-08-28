package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();
            Employee employee = new Employee("Oleg","Sidorov","HR",7000);

            session.beginTransaction();
            session.save(employee);
            /*session.getTransaction().commit();*/

            int myID = employee.getId();
            /*session = sessionFactory.getCurrentSession();
            session.beginTransaction();*/
            Employee employee1 = session.get(Employee.class,myID);
            session.getTransaction().commit();
            System.out.println(employee1);

        } finally {
            sessionFactory.close();


        }


    }
}
