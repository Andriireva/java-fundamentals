package com.fundemtals.practice.world.streamapi;

import com.fundemtals.practice.Elephant;
import com.fundemtals.practice.world.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExamples {

    public static void main(String[] args) {
        List<Animal> zoo = List.of(
                new Lion("Simba", 1),
                new Cat("Snow", 5),
                new Cat("Snow", 4),
                new Cat("Snow", 11),
                new Lion("Mufasa", 15),
                new Elephant(),
                new Dog("Rex", 10),
                new Cow("Milka", 10),
                new Cat("Snow", 8)
        );

        List<String> names = getUniqueAnimalLowercasesNames(zoo);

        printStrings(names);

        System.out.println("==== Sorting =====");

        List<Animal> sortedByNonNullNamesAnimals = zoo.stream()
                .filter(animal -> animal.getName() != null)
//                .sorted() // sorted without method argument it is required that EACH element implements Comparable
//                .sorted( (animal1, animal2) -> animal1.getName().compareTo(animal2.getName()))
//                .sorted(Comparator.comparing(animal1 -> animal1.getName())) // it is the same as line above, but key Extractor should return element that implements comparable
                .sorted((animal1, animal2) -> {
                    String cName1 = animal1.getName() == null ? "" : animal1.getName();
                    String cName2 = animal2.getName() == null ? "" : animal2.getName();
                    return cName1.compareTo(cName2);
                })
                .collect(Collectors.toList());

        sortedByNonNullNamesAnimals.forEach(animal -> System.out.println(animal));

        System.out.println("==== Sorting reversed =====");

        Comparator<Animal> nameComparator = (animal1, animal2) -> { // Ascending by name
            String cName1 = animal1.getName() == null ? "" : animal1.getName();
            String cName2 = animal2.getName() == null ? "" : animal2.getName();
            return cName1.compareTo(cName2);
        };

        List<Animal> sortedByNonNullNamesDescAnimals = zoo.stream()
                .sorted(nameComparator
                        .thenComparing((animal1, animal2) -> Integer.compare(animal1.getAge(), animal2.getAge()))
                        .reversed()
                )
                .collect(Collectors.toList()); //
        sortedByNonNullNamesDescAnimals.forEach(animal -> System.out.println(animal));


        System.out.println("==== anyMatch =====");
        boolean isThereRexAge10 = zoo.stream()
                .anyMatch(animal -> "Rex".equals(animal.getName()) && animal.getAge() == 10);
        System.out.println("isThereRexAge10 " + isThereRexAge10);

        System.out.println("==== Reduce SUM =====");

        int ageSum = zoo.stream()// Stream
                .map(animal -> animal.getAge())// Stream of Integer
                .reduce(((age1, age2) -> age1 + age2)) // Optional
                .orElse(0); // Integer
        System.out.println("ageSum = " + ageSum);


        System.out.println("==== Lazy, Terminal, Intermediate =====");
        // Stream is LAZY initialized. It means that stream does not start executions of all chain
        // BEFORE terminal method is calls. Terminal method is a method that DOES not return Stream.
        // Everything that return Stream is Intermediate method, other are Terminal methods
        // Intermediate example method: map, filter, sort, peek.....
        // Terminal example: forEach, collect, anyMatch, reduce.....

//        zoo.stream()
//                .filter(animal -> !animal.getName().startsWith("H")); // Stream
                    // Nothing hap

        zoo.stream()
                .filter(animal -> !animal.getName().startsWith("H")) // Stream
                .peek(animal -> System.out.println(animal))// Stream
                //.anyMatch(animal -> "Snow".equals(animal.getName()) && animal.getAge() == 8)
                ;

        System.out.println("==== Collectors.joining =====");
        String splitNames = zoo.stream()
                .filter(animal -> animal.getName() != null) // Stream
                .map(animal -> animal.getName())// Stream of Strings
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(","));
        System.out.println("splitNames: "  + splitNames);
        // String -> names split via,
    }

    private static void printStrings(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    private static List<String> getUniqueAnimalLowercasesNames(List<Animal> zoo) {
        List<String> names = zoo.stream()
                .map(animal -> animal.getName()) // It returns Stream of Strings
                .filter(name -> name != null)
                .map(name -> name.toLowerCase())
                .distinct() // leave only unique it works based equals method
                .collect(Collectors.toList());
        return names;
    }
}
