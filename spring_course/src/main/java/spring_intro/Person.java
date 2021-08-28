package spring_intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*@Component("personBean")*/
public class Person {
/*    @Autowired
    @Qualifier("catBean")*/
    private Pet pet;
/*    @Value("${person.surname}")*/
    private String surname;
/*    @Value("${person.age}")*/
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: Set Surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: Set Age");
        this.age = age;
    }
/*    @Autowired
    @Qualifier("myDog")*/
    public void setPet(Pet pet) {
        System.out.println("Pet is setted");
        this.pet = pet;
    }
/*    @Autowired*/
    public Person(/*@Qualifier("catBean")*/ Pet pet) {
        System.out.println("Person is created");
        this.pet = pet;


    }

/*    public Person(){
        System.out.println("Person is Created");
    }*/

    public void callYourPet() {
        System.out.println("Hello my lovely pet");
        pet.say();

    }
}
