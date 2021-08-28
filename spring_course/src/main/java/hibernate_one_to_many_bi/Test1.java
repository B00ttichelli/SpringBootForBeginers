package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").
                                                            addAnnotatedClass(Employee.class).
                                                            addAnnotatedClass(Department.class)
                                                            .buildSessionFactory();

        Session session = null;

        try {

/*
            session = sessionFactory.getCurrentSession();

            Department department = new Department("IT",300,1200);

            Employee emp1 = new Employee("Fakir","Durbilev",500);
            Employee emp2 = new Employee("Marussia","Pilotkina", 700);

            department.addEmployeeToDepartment(emp1);
            department.addEmployeeToDepartment(emp2);

            session.beginTransaction();
            session.save(department);
            session.getTransaction().commit();
*/



         /*   session.beginTransaction();
            Department department = session.get(Department.class,1);
            System.out.println(department);
            System.out.println(department.getEmps());
            session.getTransaction().commit();*/



           /* session = sessionFactory.getCurrentSession();

            session.beginTransaction();

            Employee employee = session.get(Employee.class,1);
            System.out.println(employee);
            System.out.println(employee.getDepartment());

            session.getTransaction().commit();

            System.out.println("Done");*/
/*____________________________________________________________________*/
            session = sessionFactory.getCurrentSession();

            session.beginTransaction();

            Employee employee = session.get(Employee.class,3);

            session.delete(employee);
            session.getTransaction().commit();

            System.out.println("Done");

        }finally {
            session.close();
            sessionFactory.close();

        }
    }
}
