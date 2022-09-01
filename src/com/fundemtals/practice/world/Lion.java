package com.fundemtals.practice.world;

public class Lion extends Mammal implements Combined {

    public Lion(String animalName, int age) {
        super(animalName, age);
    }

    @Override
    public void climb() {
        System.out.println("Im lion and i can climb");
    }

    @Override
    public void doSound() {
        System.out.println("Harrrrrrr");
    }
}
