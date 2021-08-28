package aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class UniLibrary extends AbstractLibrary{

/*    @Override*/
    public void  getBook (){
        System.out.println("Мы берем книгу ");
    }



    public String returnBook (){
        int a = 10/0;
        System.out.println("Мы возвращаем книгу в университетскую библиотеку");
        return "Война и мир";
    }

    public void getMagazine(){
        System.out.println("Мы взяли журнал");
    }

    public void returnMagazine(){
        System.out.println("Мы возвращаем журнал");
    }
    public void addBook(String person_name,Book book){
        System.out.println("Мы добавляем книгу в библиотеку");
        System.out.println("------------------------  ------------------------- ");

    }

    public void addMagazine(){
        System.out.println("Мы добавляем журнал в библиотеку");
        System.out.println("------------------------------------------------- ");
    }
}
