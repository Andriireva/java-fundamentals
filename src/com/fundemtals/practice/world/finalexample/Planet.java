package com.fundemtals.practice.world.finalexample;

import com.fundemtals.practice.world.Cat;

public class Planet {
    // final is can be added to class variable
    // final variable can be init inline or in ALL constructors

    // The state of the class is a set of variables that are assigned
    private final String name;
    private final double temperature;

    // Final variable can be ini in constructors as well
    public Planet(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    // it is not possible to assign final variable to a new variable
    public void setName(String name) {
//        this.name = name;
    }

    public String getNameWithPrefix(final String prefix, final Integer k) {
        final double multiplier = 5.6d;
//        multiplier = 11.0d; also not possible to re-assign
//        prefix = "another"; it is not possible to re-assign

        final Cat cat = new Cat("Snow", 5);
        // cat = new Cat("Marcy", 7); cannot assign to new variable
        cat.setName("Max"); // we still can call final class instance method

        return prefix + getName();
    }

    // Method marked final CANNOT BE overridden
    public final String getName() {
        return name;
    }

    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 40);
        Planet mars = new Planet("Mars", 70);
//        System.out.println(mars.getName());

        Planet smallOne = new Comet("C1", 1000);

        System.out.println(smallOne.getName());
    }
}
