package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    static Hippodrome game;
    private final List<Horse> horses;

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(300);
        }
    }

    void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        Horse result = horses.get(0);
        for (Horse horse : horses) {
            if (horse.getDistance() > result.getDistance())
                result = horse;
        }
        return result;
    }

    public void printWinner() {
        System.out.println("Победитель: " + getWinner().getName() + "!");
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(new Horse("Вита", 3, 0));
        game.getHorses().add(new Horse("Лиля", 3, 0));
        game.getHorses().add(new Horse("Денис", 3, 0));
        game.run();
        game.printWinner();
    }
}