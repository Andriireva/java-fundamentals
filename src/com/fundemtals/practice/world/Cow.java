package com.fundemtals.practice.world;

public class Cow extends Mammal implements Soundable {
    public Cow(String name, int age) {
        super(name, age);
    }

    public void doSound() {
        System.out.println("Mew Mew");
    }
}
