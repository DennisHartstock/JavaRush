package com.javarush.task.task19.task1925;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) {
        String fileName = args[0];
        String fileName1 = args[1];
        String input;

        ArrayList<String> fileContent = new ArrayList<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while ((input = fileReader.readLine()) != null)
                fileContent.add(input);
        } catch (IOException ignore) {
            // NOP
        }

        StringBuilder stringBuffer = new StringBuilder();
        for (String line : fileContent) {
            String[] splitedLine = line.split(" ");
            for (String word : splitedLine) {
                if (word.length() > 6)
                    stringBuffer.append(word).append(" ");
            }
        }

        String resultLine = stringBuffer.toString().trim().replaceAll(" ", ",");
        try (FileWriter fileWriter = new FileWriter(fileName1)) {
            fileWriter.write(resultLine);
        } catch (IOException ignore) {
            // NOP
        }
    }
}
