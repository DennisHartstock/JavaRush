package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());

        System.out.println(getNOD(a, b));
    }

    private static int getNOD(int a, int b) {
        if (a < 1 || b < 1) {
            throw new IllegalArgumentException();
        }

        while (a != b) {
            if (a > b) {
                a -= b;
            }
            if (a < b) {
                b -= a;
            }
        }
        return a;
        }
    }
