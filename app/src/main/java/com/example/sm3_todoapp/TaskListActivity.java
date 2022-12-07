package com.example.sm3_todoapp;

import androidx.fragment.app.Fragment;


public class TaskListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new TaskListFragment();
    }
}