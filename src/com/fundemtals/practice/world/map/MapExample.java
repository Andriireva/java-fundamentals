package com.fundemtals.practice.world.map;

import com.fundemtals.practice.Elephant;
import com.fundemtals.practice.world.Animal;
import com.fundemtals.practice.world.Cat;
import com.fundemtals.practice.world.Dog;
import com.fundemtals.practice.world.Lion;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        // 1st type is key type
        // 2nd is value type
        // put method add a new key value or replace existing key
        Map<String, Animal> personAnimalMap = new HashMap<>();
        personAnimalMap.put("Andrii", new Cat("Sonya", 10));
        personAnimalMap.put("Charles", new Dog("Corgi1", 15));

        Animal andriiAnimal = personAnimalMap.get("Andrii"); // Actual type is Cat
        Animal charlesAnimal = personAnimalMap.get("Charles"); // Actual type is Dog
        System.out.println(andriiAnimal.getName());
        System.out.println(charlesAnimal.getName());


        Animal someoneAnimal = personAnimalMap.get("Max"); // "max" does not exist so get() returns null
        try {
            System.out.println(someoneAnimal.getName());
        } catch (NullPointerException e) {
            System.out.println("Max does not exist in map");
        }

        personAnimalMap.size(); // return 2
        // personAnimalMap.clear(); // deletes everything
        boolean doesKeyExistAndrii = personAnimalMap.containsKey("Andrii");
        boolean doesKeyExistJohn = personAnimalMap.containsKey("John");

        System.out.println("==== Entry Examples =====");
        Set<Map.Entry<String, Animal>> entries = personAnimalMap.entrySet();
        for (Map.Entry<String, Animal> entry: entries) {
            System.out.println(entry.getKey() + " " + entry.getValue().getName());
        }


        personAnimalMap.put("Andrii", new Lion("Simba", 1));
        personAnimalMap.put("Max", new Lion("Simba", 1));
        Animal andriiAnimal2 = personAnimalMap.get("Andrii");
        System.out.println(andriiAnimal2.getName());

        Set<String> keyNames = personAnimalMap.keySet(); // is a set of keys
        Collection<Animal> animals = personAnimalMap.values(); // elements of values can be duplicated

        Animal noExistingKey = personAnimalMap.getOrDefault("NoExistingKey", new Elephant());
    }
}
