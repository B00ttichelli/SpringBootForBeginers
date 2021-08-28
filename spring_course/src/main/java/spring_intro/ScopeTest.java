package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

                Dog myDog = context.getBean("myDog",Dog.class);
                Dog yourDog = context.getBean("myDog",Dog.class);

        System.out.println("Переменные ссылаютса на один и тотже обьект ?" + (myDog==yourDog));
        System.out.println(myDog);
        System.out.println(yourDog);
        context.close();

    }
}
