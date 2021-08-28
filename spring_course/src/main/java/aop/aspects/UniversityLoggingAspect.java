package aop.aspects;

import aop.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect

public class UniversityLoggingAspect {

   /* @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice (){
        System.out.println("beforeGetStudentsLoggingAdvice : Логируем получения списка студентов перед метода getStudents" );

    }*/

   /* @AfterReturning(pointcut = "execution(* getStudents())",
                    returning = "students")
    public void afterReturningGetStudentsLoggingAdvice (JoinPoint joinPoint,List<Student> students){

        Student firstStudent = students.get(0);
        String nameSurname =  firstStudent.getNameSurname();
        nameSurname = "Mrs."+nameSurname;
        firstStudent.setNameSurname(nameSurname);
        double avfGrade = firstStudent.getAvgGrade();
        avfGrade = avfGrade+1;
        firstStudent.setAvgGrade(avfGrade);


        System.out.println("afterReturningGetStudentsLoggingAdvice : Логируем получения списка студентов после метода getStudents" );

    }*/
/*
    @AfterThrowing(pointcut = "execution(* getStudents())",
                                throwing = "exception")
    public void afterThrowingGetStudentLoggingAdvice(Throwable exception){

        System.out.println("afterThrowingGetStudentLoggingAdvice: логируем выброс исключения " + exception);

    }
*/

    @After("execution(* getStudents())")
    public void AfterGetStudentLoggingAdvice(){
        System.out.println("Логируем нормальное окончание метода или выброс исключения");
    }



}
