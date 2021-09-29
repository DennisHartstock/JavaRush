package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    static Hippodrome game;
    private List<Horse> horses;

    void run() {

    }

    void move() {

    }

    void print() {

    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(new Horse("One", 3, 0));
        game.getHorses().add(new Horse("Two", 3, 0));
        game.getHorses().add(new Horse("Three", 3, 0));
    }
}