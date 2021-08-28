package spring_intro;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;*/

/*@Component("myDog")*//*
@Scope("prototype")*/
public class Dog implements Pet {

/*    private String name;*/

  /*  public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    public Dog (){
        System.out.println("Dog is created");
    }
    @Override
    public  void say (){
        System.out.println("Gav gav");
    }
/*    @PostConstruct
    public void init(){
        System.out.println("Class dog init method");
    }
    @PreDestroy
    public void destory(){
        System.out.println("Class Dog destroy method");
    }*/
}
