package spring_intro;

import org.springframework.context.annotation.*;

@Configuration
/*@ComponentScan("spring_intro")*/
/*@PropertySource("/home/platon/IdeaProjects/spring_course/resources/myApp.properties")*/
public class MyConfig {


    @Bean
    @Scope("singleton")
    public Pet catBean (){
        return new Cat();
    }
    @Bean
    public Person personBean (){
        return new Person(catBean());
    }
}
