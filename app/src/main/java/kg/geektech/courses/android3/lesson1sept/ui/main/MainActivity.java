package kg.geektech.courses.android3.lesson1sept.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Bundle;

import kg.geektech.courses.android3.lesson1sept.R;
import kg.geektech.courses.android3.lesson1sept.ui.main.booksList.BooksFragment;

public class MainActivity
        extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        FragmentManager manager = getSupportFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();
//        transaction.replace(R.id.container,BooksFragment.newInstance());
//        transaction.commit();
    }

}