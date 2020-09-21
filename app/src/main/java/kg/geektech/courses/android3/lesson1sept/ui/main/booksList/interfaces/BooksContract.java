package kg.geektech.courses.android3.lesson1sept.ui.main.booksList.interfaces;

import java.util.ArrayList;

import kg.geektech.courses.android3.lesson1sept.data.models.Book;

public interface BooksContract {

    interface View{
        void showBooks(ArrayList<Book> books);
    }

    interface Presenter{
        void showRecycler();
        ArrayList<Book> loadBooks();
        String showDescription(int position);
    }

    interface Model{
        ArrayList<Book> getBooks();
    }

}
