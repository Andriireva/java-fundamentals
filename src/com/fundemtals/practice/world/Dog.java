package com.fundemtals.practice.world;

public class Dog extends Mammal implements Soundable {
    public Dog(String animalName, int age) {
        super(animalName, age);
    }

    public void doSound() {
        System.out.println("Bark Bark");
    }
}
