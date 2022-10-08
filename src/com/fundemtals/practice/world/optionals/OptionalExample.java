package com.fundemtals.practice.world.optionals;

import com.fundemtals.practice.world.Animal;
import com.fundemtals.practice.world.Cat;
import com.fundemtals.practice.world.Lion;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

//        if ()
//
//        Optional optional =
//        String name = ;
        System.out.println(getUpperCasedName(new Cat("andy", 5)));
        System.out.println(getUpperCasedName(new Cat("amie", 1)));
        System.out.println(getUpperCasedName(new Cat("Snow", 5)));
        System.out.println(getUpperCasedName(new Cat(null, 5)));
        System.out.println(getUpperCasedName(null));
        System.out.println(getUpperCasedName(new Cat("amigo", 10), new Lion("alion", 10)));
        System.out.println(getUpperCasedName(null, new Lion("alion", 6)));
        System.out.println(getUpperCasedName(null, new Lion("alion", 3)));
    }

    public static String getUpperCasedName(Animal animal1, Animal animal2) {
//        if (animal == null || animal.getName() == null) {
//            return null;
//        }
//        return animal.getName().toUpperCase();

//        Optional<Animal> optionalAnimal = Optional.ofNullable(animal);
//        if (optionalAnimal.isPresent()) {
//            Optional<String> stringOptional = Optional.ofNullable(optionalAnimal.get().getName());
//            if (stringOptional.isPresent()) {
//                return stringOptional.get().toUpperCase();
//            } else {
//                return null;
//            }
//        } else {
//            return null;
//        }

//        boolean present = Optional.ofNullable(animal)
//                .map(animal1 -> animal1.getName()) // After this map method return type is Option<String>
//                .isPresent();
//        if (present) {
//            return animal.getName().toUpperCase();
//        } else {
//            return null;
//        }

//        Animal animal = null;
//        if (animal1 == null) {
//            animal = animal2;
//        }
        // do others wit animal

        //


        Optional<String> stringOptional = Optional.ofNullable(animal1)
                .or(() -> Optional.ofNullable(animal2))
                .filter(animal -> animal.getAge() > 4)
                .map(animal -> animal.getName()) // After this map method return type is Option<String>
                .filter(name -> name.startsWith("a"))
                .map(name -> name.toUpperCase());

        // it suits the case where we don't return a type
//        stringOptional.ifPresentOrElse(
//                (name) -> System.out.println("Name is valid " + name),
//                () -> System.out.println("Name is not valid ")
//        );

        return stringOptional
                .orElseGet(() -> "defaultName"); // is a lazy call of method
    }

    public static String getUpperCasedName(Animal animal1) {
        return getUpperCasedName(animal1, null);
    }
}
