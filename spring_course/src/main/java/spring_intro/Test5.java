package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog mydog = context.getBean("myPet",Dog.class);
        mydog.say();

        Dog youdog  =  context.getBean("myPet",Dog.class);
        youdog.say();
        context.close();
    }
}
