package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");

       /* Cat mycat = classPathXmlApplicationContext.getBean("myCat",Cat.class);
        mycat.say();*/
        Person person = classPathXmlApplicationContext.getBean("personBean",Person.class);
        person.callYourPet();

        System.out.println(person.getAge());
        System.out.println(person.getSurname());
        classPathXmlApplicationContext.close();
    }
}
