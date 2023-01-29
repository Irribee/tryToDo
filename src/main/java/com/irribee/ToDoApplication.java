package com.irribee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ToDoApplication.class, args);//run() выполняет фактическую загрузку приложения,создавая контекст приложения Spring. Метод run() принимает два
        //параметра: класс конфигурации и аргументы командной строки.
    }
}
