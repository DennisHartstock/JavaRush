package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Иванов", 3.);
        grades.put("Петров", 4.);
        grades.put("Сидоров", 2.);
        grades.put("Смирнов", 1.);
        grades.put("Кириллов", 5.);
    }
}
