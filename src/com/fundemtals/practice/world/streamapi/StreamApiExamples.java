package com.fundemtals.practice.world.streamapi;

import com.fundemtals.practice.Elephant;
import com.fundemtals.practice.world.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiExamples {

    public static void main(String[] args) {
        List<Animal> zoo = List.of(
                new Lion("Simba", 1),
                new Cat("Snow", 5),
                new Dog("Rex", 10),
                new Lion("Mufasa", 15),
                new Elephant(),
                new Cow("Milka", 10),
                new Cat("Snow", 8)
        );

        List<String> names = zoo.stream()
                .map(animal -> animal.getName()) // It returns Stream of Strings
                .filter(name -> name != null)
                .map(name -> name.toLowerCase())
                .distinct() // leave only unique it works based equals method
                .collect( Collectors.toList() );

//        List<String> animalsNames = new ArrayList<>();
//        for (Animal animal : zoo) {
//            if (animal.getName() != null) {
//                animalsNames.add(animal.getName());
//            }
//        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
