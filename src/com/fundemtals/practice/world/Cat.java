package com.fundemtals.practice.world;

import java.util.Objects;

public class Cat extends Mammal implements Combined, Comparable<Cat> {

    private boolean isMultiColor;
    public static int numbers = 0;

    public Cat(String animalName, int age) {
        super(animalName, age);
        numbers++; // the same as number = number + 1
    }

    public Cat(String animalName, int age, boolean isMultiColor) {
        super(animalName, age);
        this.isMultiColor = isMultiColor;
    }

    public void doSound() {
        System.out.println("Mew Mew");
    }

    public void climb() {
        System.out.println("I can climb over some rock");
    }

    public boolean isMultiColor() {
        return isMultiColor;
    }

    public void setMultiColor(boolean multiColor) {
        isMultiColor = multiColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return isMultiColor == cat.isMultiColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isMultiColor);
    }

    @Override
    public int compareTo(Cat o) {
        // we want to compare cats by age,
        // we will use Integer.compareTo() implementation
        // (x < y) ? -1 : ((x == y) ? 0 : 1)
        return Integer.valueOf(getAge()).compareTo(o.getAge()) ;
    }

    // We override the default Object equals() method
//    public boolean equals(Object object) {
//        if ( !(object instanceof Cat) ) {
//            return false;
//        }
//
//        return getName().equals(((Cat)object).getName())
//                && getAge() == ((Cat)object).getAge();
//    }
}
