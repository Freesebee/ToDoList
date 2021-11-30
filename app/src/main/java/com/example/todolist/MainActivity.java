
package com.example.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.Fragment;

import java.util.UUID;

public class MainActivity extends SingleFragmentActivity {

    private static final String KEY_EXTRA_TASK_ID = "taskId";
    private Task task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createFragment();
    }

    @Override
    protected Fragment createFragment() {
        UUID taskId = (UUID) getIntent().getSerializableExtra(TaskListFragment.KEY_EXTRA_TASK_ID);
        return TaskFragment.newInstance(taskId);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class); //TODO: add getActivity() instead of "this"
        intent.putExtra(KEY_EXTRA_TASK_ID, task.getId());
        startActivity(intent);
    }
}