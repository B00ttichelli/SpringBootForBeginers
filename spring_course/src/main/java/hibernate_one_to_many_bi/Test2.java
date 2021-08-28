package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class).buildSessionFactory();

        Session session = null;
        try {

            /*session = sessionFactory.getCurrentSession();

            Department department  = new Department("Seles",800,1500);

            Employee employee1 = new Employee("Ivan","Pupkin",800);
            Employee employee2 = new Employee("Elena","Pokoleno",1500);
            Employee employee3 = new Employee("Anton","Sidorov",1200);

            department.addEmployeeToDepartment(employee1);
            department.addEmployeeToDepartment(employee2);
            department.addEmployeeToDepartment(employee3);
            session.beginTransaction();
            session.save(department);
            session.getTransaction().commit();*/


            session  = sessionFactory.getCurrentSession();

            session.beginTransaction();
            System.out.println("get Department");
            Department department = session.get(Department.class,6);
            System.out.println("Show Department");
            System.out.println(department);

            session.getTransaction().commit();

            System.out.println("Show Employees of the department");
            System.out.println(department.getEmps());

        }finally {
            session.close();
            sessionFactory.close();
        }
    }
}
