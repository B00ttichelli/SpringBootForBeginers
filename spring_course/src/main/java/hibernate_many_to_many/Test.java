package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Child.class).addAnnotatedClass(Section.class).buildSessionFactory();

        Session session = null;

        try {
/*            session = sessionFactory.getCurrentSession();

            Section section1 = new Section("Football");
            Child child1 = new Child("ZZaur",5);
            Child child2 = new Child("Masha",7);
            Child child3 = new Child("Vasya",6 );

            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);

            session.beginTransaction();

            session.save(section1);

            session.getTransaction().commit();
            System.out.println("Done");*/
//_____________________________________________

/*
            session = sessionFactory.getCurrentSession();
            Section section1 = new Section("VoleyBall");
            Section section2 = new Section("Chess");
            Section section3 = new Section("Math");
            Child child1  =  new Child("Igor",10);

            child1.addSectionToChild(section1);
            child1.addSectionToChild(section2);
            child1.addSectionToChild(section3);

            session.beginTransaction();
            session.save(child1);
            session.getTransaction().commit();
            System.out.println("Done");*/

            //_____________________________________________

        /*    session = sessionFactory.getCurrentSession();

            session.beginTransaction();

            Section section = session.get(Section.class,3);

            System.out.println(section.getChildren());

            session.getTransaction().commit();
            System.out.println("Done");*/

            //_____________________________________________
     /*       session = sessionFactory.getCurrentSession();

            session.beginTransaction();

            Child child = session.get(Child.class,10);
            System.out.println(child);
            System.out.println(child.getSections());
            session.getTransaction().commit();
            System.out.println("Done");*/

            //_____________________________________________

  /*          session = sessionFactory.getCurrentSession();

            session.beginTransaction();
            Section section = session.get(Section.class,3);

            session.delete(section);

            session.getTransaction().commit();

            System.out.println("Done");*/

            //_____________________________________________
    /*        session = sessionFactory.getCurrentSession();
             Section section = new Section("Dance");
             Child child1 = new Child("Olga",12);
             Child child2 = new Child("Grisha",8);
             Child child3 = new Child("Pavlik",9);

             section.addChildToSection(child1);
             section.addChildToSection(child2);
             section.addChildToSection(child3);

             session.beginTransaction();

             session.persist(section);

             session.getTransaction().commit();

            System.out.println("Done");*/

            //_____________________________________________

          /*  session = sessionFactory.getCurrentSession();

            session.beginTransaction();

            Section section = session.get(Section.class,9);

            session.delete(section);

            session.getTransaction().commit();
            System.out.println("Done");*/

            //_____________________________________________



            session = sessionFactory.getCurrentSession();

            session.beginTransaction();


            Child child = session.get(Child.class,11);


            session.delete(child);
            session.getTransaction().commit();

            System.out.println("Done");

        }finally {
            session.close();
            sessionFactory.close();
        }
    }
}
