package com.irribee.services;


import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.GregorianCalendar;

@Data
@Service
public class TaskService {
    String text;
    GregorianCalendar date;
    String status;
}

