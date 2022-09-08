package com.fundemtals.practice.world;

public class Mammal extends Animal {

    private String name;

    public Mammal(String animalName) {
        //  1st statement of the constructor should call super constructor
        //  System.out.println("Mammal constructor is called");
        super(); // if constructor is not specified at 1 line of this class,
                // then parent default constructor is called
        name = animalName; // equals to below
        this.name = animalName;
        super.name = animalName; // call parent field name
    }

    public Mammal(String animalName, int age) {
        super(animalName, age); // -> it calls parent constructor -> ~ Animal(animalName, age)
    }

    public String move(int x, int y, int z) {
        System.out.println("Mammal method move is called");
        return "I'm moved to " + x + ":" + y + ":" + z + " using legs";
    }


    public String getMammalName() {
        return name;
    }

    public String getUpperCasedName() {
        if (getName() != null) {
            return getName().toUpperCase();
        } else {
            return null;
        }
    }
}
