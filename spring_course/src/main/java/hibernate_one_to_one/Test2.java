package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).
                addAnnotatedClass(Detail.class).buildSessionFactory();
                Session session = null;
        try {

            session = sessionFactory.getCurrentSession();
/*
            Employee employee = new Employee("Nikolay","Ivanov","HR",850);
            Detail detail  = new Detail("NewYork","0987635243564","nikolay@vasya.com");*/

            session.beginTransaction();
//            Detail detail = session.get(Detail.class,4);
//
//            System.out.println(detail.getEmployee());
            Detail detail = session.get(Detail.class,1);
            detail.getEmployee().setEmpDetail(null);

            session.delete(detail);

     /*       detail.setEmployee(employee);
            employee.setEmpDetail(detail);
            session.save(detail);*/
            session.getTransaction().commit();
            System.out.println("Done");
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
