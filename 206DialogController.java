package com.gregpaterek.todolist.datamodel;

import java.time.LocalDate;

public class TodoItem {
    private String shortDescription;
    private String details;
    private LocalDate deadLine;

    public TodoItem(String shortDescription, String details, LocalDate deadLine) {
        this.shortDescription = shortDescription;
        this.details = details;
        this.deadLine = deadLine;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

//    @Override
//    public String toString() {
//        return shortDescription;
//    }
}
