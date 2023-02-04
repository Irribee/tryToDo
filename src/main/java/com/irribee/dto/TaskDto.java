package com.irribee.dto;

import lombok.Data;

import java.util.GregorianCalendar;

/**
 * Data Transfer Object объект для получения и передачи через URL(например Postman)
 */
@Data
public class TaskDto {

    static int nextId = 1;
    int id;
    GregorianCalendar date;
    String text;
    String status;

    public String getStatus() {
        return status;
    }

    public static void setNextId(int nextId) {
        TaskDto.nextId = nextId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return getId() + getText();
    }

}
