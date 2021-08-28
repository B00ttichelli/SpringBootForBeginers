package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary library = context.getBean("libraryBean",UniLibrary.class);
        Book book = context.getBean("book",Book.class);
        library.getBook();
        library.addBook("Zaur",book);
        library.addMagazine();
       /* library.returnMagazine();
        library.addBook();*/
        /*library.returnBook();*/
 /*     library.getMagazine();*/
        /*SchoolLibrary schoolLibrary = context.getBean("schoolLibrary",SchoolLibrary.class);
        schoolLibrary.getBook();*/
        context.close();

    }
}
