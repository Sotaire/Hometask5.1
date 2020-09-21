package kg.geektech.courses.android3.lesson1sept.ui.main.booksList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import kg.geektech.courses.android3.lesson1sept.R;
import kg.geektech.courses.android3.lesson1sept.data.models.Book;
import kg.geektech.courses.android3.lesson1sept.ui.main.booksList.interfaces.OnBooksListener;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.BooksViewHolder> {

    ArrayList<Book> books = new ArrayList<>();

    public void setOnBooksListener(OnBooksListener onBooksListener) {
        this.onBooksListener = onBooksListener;
    }

    private OnBooksListener onBooksListener;

    public void setBooks(ArrayList<Book> books1){
        books = books1;
    }

    @NonNull
    @Override
    public BooksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BooksViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.books_recycler_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull BooksViewHolder holder, int position) {
        holder.setBook(books.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public class BooksViewHolder extends RecyclerView.ViewHolder {

        TextView book;

        public BooksViewHolder(@NonNull View itemView) {
            super(itemView);
            book = itemView.findViewById(R.id.book_name_tv);
            book.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onBooksListener.onBookClick(getAdapterPosition());
                }
            });
        }

        public void setBook(String book) {
            this.book.setText(book);
        }
    }

}
