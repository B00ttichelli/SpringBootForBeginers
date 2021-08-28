package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).
                addAnnotatedClass(Detail.class).
                buildSessionFactory();

        Session session = null;

        try {

       /*     Session session = sessionFactory.getCurrentSession();
            Employee employee = new Employee("Ivan","Zalupan","IT",500);

            Detail detail = new Detail("Baku","14253667", "fuck@fuck.ru");
            employee.setEmpDetail(detail);

            session.beginTransaction();
            session.save(employee);

            session.getTransaction().commit();
*/


  /*          Session session = sessionFactory.getCurrentSession();

            Employee  employee = new Employee("Oleg","Smirnov","Sales",700);
            Detail detail = new Detail("Moscow","9876243567586","olegka@mail.ru");

            employee.setEmpDetail(detail);

            session.beginTransaction();
            session.save(employee);

            session.getTransaction().commit();*/

            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class,2);

            session.delete(employee);


            session.getTransaction().commit();
            System.out.println("Done");
        }finally {
            session.close();
            sessionFactory.close();
        }
    }
}