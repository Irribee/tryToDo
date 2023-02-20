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

}
