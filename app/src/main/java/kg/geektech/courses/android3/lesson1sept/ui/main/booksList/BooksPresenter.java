package kg.geektech.courses.android3.lesson1sept.ui.main.booksList;

import java.util.ArrayList;

import kg.geektech.courses.android3.lesson1sept.data.models.Book;
import kg.geektech.courses.android3.lesson1sept.ui.main.booksList.interfaces.BooksContract;

public class BooksPresenter implements BooksContract.Presenter {

    private BooksContract.View mView;
    private BooksContract.Model model;

    public BooksPresenter(BooksContract.View mView) {
        this.mView = mView;
        model = new BooksModel();
    }

    @Override
    public void showRecycler() {
        mView.showBooks(loadBooks());
    }

    @Override
    public ArrayList<Book> loadBooks() {
        return model.getBooks();
    }

    @Override
    public String showDescription(int position) {
        return loadBooks().get(position).getDesc();
    }
}
