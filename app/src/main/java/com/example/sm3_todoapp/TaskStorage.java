package com.example.sm3_todoapp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {

    private static TaskStorage instance = null;
    private final List<Task> tasks;

    public List<Task> getTasks(){
        return tasks;
    }

    public static TaskStorage getInstance(){
        if(instance == null){
            instance = new TaskStorage();
        }
        return instance;
    }

    private TaskStorage() {
        tasks = new ArrayList<>();
        for(int i=1; i<=150; i++){
            Task task = new Task();
            task.setName("Pilne zadanie numer " + i);
            task.setDone(i%3 == 0);
            tasks.add(task);

        }
    }

    public Task getTask(UUID index) {
        for(Task t: tasks) {
            if(t.getId().equals(index)) {
                return t;
            }
        }
        return null;
    }
}