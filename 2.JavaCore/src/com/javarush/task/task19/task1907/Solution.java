package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    private static int counter = 0;

    public static void main(String[] args) throws IOException {
        
        String fileName;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = bufferedReader.readLine();
        }

        StringBuilder text = new StringBuilder();
        try (FileReader reader = new FileReader(fileName)) {
            char currentChar;
            while (reader.ready()) {
                currentChar = (char) reader.read();
                text.append(currentChar);
            }
        }

        String replacedString = text.toString().replaceAll("\\p{P}", " ").replaceAll("\\s", " ");

        for (String string : replacedString.split(" ")) {
            if (string.equals("world")) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
