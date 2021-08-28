package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Ф.Достоевский")
    private String author;
    @Value("Преступление и наказание")
    private String bookName;

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Value("1860")
    private int yearOfPublication;

    public String getBookName() {
        return bookName;
    }
}
