package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        Set<Integer> bytes = new TreeSet<>();
        try (FileInputStream FileInputStream = new FileInputStream(fileName)) {
            while (FileInputStream.available() > 0) {
                bytes.add(FileInputStream.read());
            }
        }
        for (Integer aByte : bytes) System.out.print(aByte + " ");
    }
}
