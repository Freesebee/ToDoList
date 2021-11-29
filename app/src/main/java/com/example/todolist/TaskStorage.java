package com.example.todolist;

import java.util.ArrayList;
import java.util.List;

public class TaskStorage {
    private static final TaskStorage instance = new TaskStorage();
    private final List<Task> tasks;
    public static TaskStorage getInstance() { return instance; }

    private TaskStorage() {
        tasks = new ArrayList<Task>();
        for (int i = 0; i < 100; i++) {
            Task task = new Task();
            task.setName("Zadanie #" + i);
            task.setDone(i % 3 == 0);
            tasks.add(task);
        }
    }
}
