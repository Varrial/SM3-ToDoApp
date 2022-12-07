package com.example.sm3_todoapp;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;

    public Task(){
        id = UUID.randomUUID();
        date = new Date();
    }

    public void setName(String n) {
        this.name = n;
    }

    public Date getDate() {
        return date;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean d) {
        this.done = d;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}