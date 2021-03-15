package com.javarush.task.pro.task15.task1507;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

/* 
Пропускаем не всех
*/

public class Solution {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> lines = Files.readAllLines(Path.of(scanner.nextLine()));
            AtomicInteger counter = new AtomicInteger();
            lines.stream().filter(s -> counter.getAndIncrement() % 2 == 0).forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }
    }
}

