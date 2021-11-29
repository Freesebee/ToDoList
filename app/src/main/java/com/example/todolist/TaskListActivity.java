package com.example.todolist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class TaskListActivity extends SingleFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createFragment();
    }

    @Override
    protected Fragment createFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment =  fragmentManager.findFragmentById(R.id.fragment_container);

        if(fragment == null) {
            fragment = new TaskFragment();
            fragmentManager.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }

        return fragment;
    }
}