package kg.geektech.courses.android3.lesson1sept.data;

import java.util.ArrayList;
import java.util.List;

import kg.geektech.courses.android3.lesson1sept.data.models.Book;

public class TestRepo {

    public static ArrayList<Book> getBookList() {
        ArrayList<Book> books = new ArrayList<Book>(){};
        for (int i = 0; i < 14 ; i++) {
            books.add(new Book("book"+i,"number of book"+i));
        }
        return books;
    }

    public static Book getBookById(int id) {
        return new Book("book 2", "");
    }

}
