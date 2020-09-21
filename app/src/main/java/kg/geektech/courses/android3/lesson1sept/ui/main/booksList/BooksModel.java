package kg.geektech.courses.android3.lesson1sept.ui.main.booksList;

import java.util.ArrayList;

import kg.geektech.courses.android3.lesson1sept.data.TestRepo;
import kg.geektech.courses.android3.lesson1sept.data.models.Book;
import kg.geektech.courses.android3.lesson1sept.ui.main.booksList.interfaces.BooksContract;

public class BooksModel implements BooksContract.Model {
    @Override
    public ArrayList<Book> getBooks() {
        return TestRepo.getBookList();
    }
}
