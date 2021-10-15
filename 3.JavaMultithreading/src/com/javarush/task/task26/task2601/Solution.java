package com.javarush.task.task26.task2601;

import java.util.Arrays;

/* 
Почитать в инете про медиану выборки
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static Integer[] sort(Integer[] array) {
        final double median = getMedian(array);

        Arrays.sort(array, (o1, o2) -> {
            double v1 = o1 - median;
            double v2 = o2 - median;
            return (int) ((v1 * v1 - v2 * v2) * 100);
        });
        return array;
    }

    private static double getMedian(Integer[] array) {
        Arrays.sort(array);
        double res;
        int length = array.length;

        if (length % 2 == 1) {
            res = array[length / 2];
        } else {
            res = (array[length / 2 - 1] + array[length / 2]) / 2.;
        }
        return res;
    }
}
