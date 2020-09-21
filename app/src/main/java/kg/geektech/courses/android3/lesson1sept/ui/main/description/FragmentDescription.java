package kg.geektech.courses.android3.lesson1sept.ui.main.description;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kg.geektech.courses.android3.lesson1sept.R;

public class FragmentDescription extends Fragment {

    public FragmentDescription() {
    }

    public static FragmentDescription newInstance(String param1, String param2) {
        FragmentDescription fragment = new FragmentDescription();
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
        return inflater.inflate(R.layout.fragment_description, container, false);
    }
}