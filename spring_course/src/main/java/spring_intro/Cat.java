package spring_intro;

import org.springframework.stereotype.Component;

/*@Component("catBean")*/
public class Cat implements Pet{

    public Cat(){
        System.out.println("Cat is Created");
    }
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }


}
