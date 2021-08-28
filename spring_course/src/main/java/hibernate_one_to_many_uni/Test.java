package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class).buildSessionFactory();
        Session session = null;
        try {

            /*session = sessionFactory.getCurrentSession();

            Department department = new Department("HR",1000,1500);

            Employee employee1 = new Employee("Ivan","Zalupan",1000);
            Employee employee2 = new Employee("Zaur","Dalbaeb",1200);


            department.addEmployeeToDepartment(employee1);
            department.addEmployeeToDepartment(employee2);


            session.beginTransaction();
            session.save(department);
            session.getTransaction().commit();
            System.out.println("Done !!!");*/

            /*______________________________________*/

          /*  session = sessionFactory.getCurrentSession();

            session.beginTransaction();

            Department department = session.get(Department.class,5);
            System.out.println(department);
            System.out.println(department.getEmps());

            session.getTransaction().commit();*/
            /*______________________________________*/

            session = sessionFactory.getCurrentSession();

            session.beginTransaction();
            Department department1 = session.get(Department.class,2);
            Department department2 = session.get(Department.class,4);
            Department department3 = session.get(Department.class,5);
                         session.delete(department1);
                         session.delete(department2);
                         session.delete(department3);

            session.getTransaction().commit();

            System.out.println("Done !!!");
        }finally {
            session.close();
            sessionFactory.close();
        }

    }
}
