package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String source = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(source);
        
        Scanner scanner = new Scanner(fileInputStream);
        StringBuilder stringBuilder = new StringBuilder();
        
        while (scanner.hasNextLine()) {
            stringBuilder.append(scanner.nextLine()).append("\n");
        }

        System.out.print(stringBuilder);
        
        scanner.close();
        reader.close();
    }
}