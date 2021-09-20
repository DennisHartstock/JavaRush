package com.javarush.task.task18.task1822;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()))) {
            while ((string = bufferedReader.readLine()) != null) {
                if (string.startsWith(args[0] + " ")) {
                    System.out.println(string);
                    break;
                }
            }
        }
    }
}
