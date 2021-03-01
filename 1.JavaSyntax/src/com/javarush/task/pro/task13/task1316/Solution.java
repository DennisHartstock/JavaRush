package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        JavarushQuest[] javarushQuestsValues = JavarushQuest.values();
        for (JavarushQuest javarushQuest : javarushQuestsValues) {
            System.out.println(javarushQuest.ordinal());
        }
    }
}
