package com.fundemtals.practice.world;


public abstract class Animal {

    // protected are accessible in child class (does not meter child package)
    // or in the SAME package
    protected String name; // are null

    // private variables are accessible only in scope of this class
    private int age;  // int Integer default 0
    private String description;

    public Animal() {

    }

    public Animal(String animalName) {
        name = animalName;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.description = name + " " + age;
    }

    // There is one abstract method in Animal class
    public abstract String move(int x, int y, int z);

    // This method is Animal's method
    public String getName() {
        return name;
    }

    // This method is Animal's method
    public void setName(String nameValue) {
        name = nameValue;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    // it should return a string presentation of this animal
    public String describeMe() {
        String result = "My name is " + name +
                " and my age is " + age;
        return result;
    }
}

