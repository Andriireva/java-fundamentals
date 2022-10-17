package com.fundemtals.practice.world;


import java.util.Objects;

public abstract class Animal
        extends Object // ALl classes explicitly extends Object class
{

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


    // RULE1: if objects are equals by equals() method,
    //       their hashCode are also equals, but NOT vice versa
    // RULE2: if you as developer override equals method you also MUST override hashCode() method

    // This method was generated by Intellij idea via context menu
    // Equals is strict comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Objects.equals(name, animal.name) &&
                Objects.equals(description, animal.description);
    }

    // int has a limit from Integer.MIN_VALUE to Integer.MAX_VALUE
    // Object and Objects are different classes
    // hash code is "soft" comparison
    // it some how use some memory "hash tables"
    @Override
    public int hashCode() {
        return Objects.hash(name, age, description);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
