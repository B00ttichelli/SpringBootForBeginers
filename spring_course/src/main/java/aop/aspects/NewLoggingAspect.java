package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("В библиотеку пытаютса вернуть книгу");

/*        long begin  = System.currentTimeMillis();*/


        Object proceed = null;
        try {
            proceed = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("aroundReturnBookLoggingAdvice: было поймано исключение " + e );

            throw  e;
        }
/*        long end = System.currentTimeMillis();
        System.out.println("aroundReturnBookLoggingAdvice выполнил  работа за "+(end-begin) + " милисекунд");*/
        System.out.println("В библиотеку успешно вернули книгу");
/*        proceed = "Преступление и наказание";*/

        return  proceed;
    }
}
