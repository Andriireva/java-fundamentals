package com.fundemtals.practice.world;

public class Cat extends Mammal implements Combined {

    public static int numbers = 0;

    public Cat(String animalName, int age) {
        super(animalName, age);
        numbers++; // the same as number = number + 1
    }

    public void doSound() {
        System.out.println("Mew Mew");
    }

    public void climb() {
        System.out.println("I can climb over some rock");
    }
}
