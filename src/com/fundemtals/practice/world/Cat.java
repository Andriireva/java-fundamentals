package com.fundemtals.practice.world;

public class Cat extends Mammal implements Combined {
    public Cat(String animalName, int age) {
        super(animalName, age);
    }

    public void doSound() {
        System.out.println("Mew Mew");
    }

    public void climb() {
        System.out.println("I can climb over some rock");
    }
}
