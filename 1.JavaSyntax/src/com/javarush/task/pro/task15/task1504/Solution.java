package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var src = Files.newInputStream(Paths.get(scanner.nextLine()));
             var dest = Files.newOutputStream(Paths.get(scanner.nextLine()))) {
            byte[] bytesIn = src.readAllBytes();
            byte[] bytesOut = new byte[bytesIn.length];
            for (int i = 0; i < bytesIn.length; i += 2) {
                if (i < bytesIn.length - 1) {
                    bytesOut[i] = bytesIn[i + 1];
                    bytesOut[i + 1] = bytesIn[i];
                } else {
                    bytesOut[i] = bytesIn[i];
                }
            }
            dest.write(bytesOut);
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e);
        }
    }
}