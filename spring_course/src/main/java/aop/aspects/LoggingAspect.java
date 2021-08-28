package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {


/*  @Pointcut("execution(* aop.UniLibrary.* (..))")
  private void allMethodsFromUniLibrary(){}

 @Pointcut ("execution(public void aop.UniLibrary.returnMagazine())")
 private void returnMagazineFromUniLibrary(){}

 @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
 public void allMethodsExceptReturnMagazineFromUniLibrary(){}

 @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
 public void beforeAllMethodsExceptMagazineAdvice(){
  System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Writing Log#10");
 }*/
/*

    @Pointcut("execution(* aop.UniLibrary.get* ())")
    private void allGetMethodsFromUniLibrary(){}
     @Pointcut("execution(* aop.UniLibrary.return* ())")
     private void allReturnMethodsFromUniLibrary(){}
   @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
   private void allGetAndReturnMethodsFromUniLibrary(){}

 @Before("allGetMethodsFromUniLibrary()")
   public void beforeGetLoggingAdvice (){
     System.out.println("beforeGetLoggingAdvice: writing log #1");
    }
 @Before("allReturnMethodsFromUniLibrary()")
 public void beforeReturnLoggingAdvice(){
  System.out.println("beforeReturnLoggingAdvice: writing log #2");
 }

 @Before("allGetAndReturnMethodsFromUniLibrary()")
 public void beforeGetAndReturnLoggingAdvice(){
  System.out.println("beforeGetAndReturnLoggingAdvice: writing log #3");
 }
*/


    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("MethodSignature " + signature);
        System.out.println("MethodSignature.getMethod: " + signature.getMethod());
        System.out.println("MethodSignature.getReturnType: " + signature.getReturnType());
        System.out.println("MethodSignature.getName: " + signature.getName());

        if (signature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for (Object obj : args
            ) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: название " + myBook.getBookName() + " автор " + myBook.getAuthor() + " Год издания " + myBook.getYearOfPublication());
                } else if (obj instanceof String) {
                    System.out.println("Книгу добавил " + obj);
                }
            }
        }

        System.out.println("BeforeGetBookAdvice: логирования Попытки взять книгу/журнал");
        System.out.println("------------------------------------------------- ");


    }


/*    @Before("execution(public * return* ())")
    public void beforeReturnBookAdvice (){

        System.out.println("BeforeReturnBookAdvice: Попытка Вернуть книгу");
    }*/
}

