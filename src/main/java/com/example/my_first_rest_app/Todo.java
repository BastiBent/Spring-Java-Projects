package com.example.my_first_rest_app;

import jakarta.persistence.Entity;


public class Todo {

    private Integer id;

    private String description;

    private boolean isDone;


    // Getter

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean getIsDone() {
        return isDone;
    }

    // Setter

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public void setIsDone(boolean done) {
        isDone = done;
    }
}
