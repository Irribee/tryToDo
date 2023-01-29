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

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return getId() + getText();
    }

}
