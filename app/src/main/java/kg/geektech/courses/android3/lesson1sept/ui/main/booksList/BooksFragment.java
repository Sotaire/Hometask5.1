package kg.geektech.courses.android3.lesson1sept.ui.main.booksList;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import kg.geektech.courses.android3.lesson1sept.R;
import kg.geektech.courses.android3.lesson1sept.data.models.Book;
import kg.geektech.courses.android3.lesson1sept.ui.main.booksList.interfaces.BooksContract;
import kg.geektech.courses.android3.lesson1sept.ui.main.booksList.interfaces.OnBooksListener;

public class BooksFragment extends Fragment implements BooksContract.View{

    BooksContract.Presenter bPresenter;
    RecyclerView recyclerView;
    BooksAdapter booksAdapter;

    public BooksFragment() {}

    public static BooksFragment newInstance() {
        BooksFragment fragment = new BooksFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_books, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        booksAdapter = new BooksAdapter();
        recyclerView = view.findViewById(R.id.books_recyclerview);
        recyclerView.setAdapter(booksAdapter);
        bPresenter = new BooksPresenter(this);
        bPresenter.showRecycler();
        booksAdapter.setOnBooksListener(new OnBooksListener() {
            @Override
            public void onBookClick(int position) {
//                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);
//                navController.navigate(R.id.action_booksFragment_to_fragmentDescription);
            }
        });
    }

    @Override
    public void showBooks(ArrayList<Book> books) {
        booksAdapter.setBooks(books);
    }

}