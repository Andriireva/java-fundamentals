package com.fundemtals.practice.world.files;

import com.fundemtals.practice.world.Animal;
import com.fundemtals.practice.world.Cat;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        ReadWriter readWriter = new ReadWriter();

        List<Animal> animalList = readWriter.readZoo("src/test/resources/zoo.txt", " ");
        animalList.forEach(animal -> System.out.println(animal));

        System.out.println("=================");

        List<Animal> animalList2 = readWriter.readZoo("src/test/resources/zoo2.txt", ",");
        animalList2.forEach(animal -> System.out.println(animal));

        Collection<Animal> cats = animalList2.stream()
                .filter(animal -> animal instanceof Cat) // Stream of Animal
                .map(animal -> (Cat) animal)// Stream of Cat
                .collect(Collectors.toList());

        String pathSeparator = File.separator; // it returns OS file separator

        readWriter.writeAnimals(cats, "src/test/resources/cats.txt", "/");

    }
}
