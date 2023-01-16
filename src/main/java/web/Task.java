package web;

import lombok.Data;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
@Data
public class Task {

    static int nextId = 1;
    int id;
    GregorianCalendar date;
    String text;
    String status;

    @Override
    public String toString() {
        return getId() + getText();
    }
}