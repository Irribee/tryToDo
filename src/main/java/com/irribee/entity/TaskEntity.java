package com.irribee.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.GregorianCalendar;

@Getter
@Setter
public class TaskEntity {

    // todo добавить id, date, text и возможно другие поля

    private String status;
    static int nextId = 1;
    int id;
    GregorianCalendar date;
    String text;

}
