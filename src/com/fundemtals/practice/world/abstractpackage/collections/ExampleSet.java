package com.fundemtals.practice.world.abstractpackage.collections;

import com.fundemtals.practice.world.Animal;
import com.fundemtals.practice.world.Cat;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExampleSet {
    public static void main(String[] args) {

        // Set is not ordered collection. The position of elements
        // can be different compare to insertion order
        // Set contains unique objects
        Set<Animal> animalSet = new HashSet<>(); // it works on equals and hashCode
        animalSet.add(new Cat("Rex", 3));
        animalSet.add(new Cat("Snow", 2));
        animalSet.add(new Cat("Rex", 3));
        System.out.println("Set size is : " + animalSet.size());

        for (Animal animal: animalSet) {
            System.out.println(animal.getName());
        }

        System.out.println("===== Names example =====");
        String[] names = { "John", "Andrii", "Max", "John", "Charles" };

        // Linked hash set is the same as HashSet, but it keeps insertion order
//        Set<String> uNames = new LinkedHashSet<>();
        Set<String> uNames = new LinkedHashSet<>();
        for (int i = 0; i < names.length; i++) {
            uNames.add(names[i]);
        }

        for (String name: uNames) {
            System.out.println(name);
        }

        // It works based on Comparable or Comparator interfaces
        // It is not so commonly used
        Set<Animal> treeSet = new TreeSet<>();
        treeSet.add(new Cat("Snow", 1));
        treeSet.add(new Cat("Max", 4));

        System.out.println("Tre set size " + treeSet.size());
    }
}
