package com.fundemtals.practice.world.files;

import com.fundemtals.practice.world.Animal;
import com.fundemtals.practice.world.Cat;
import com.fundemtals.practice.world.Dog;
import com.fundemtals.practice.world.Lion;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ReadWriter {
    public void readFiles() throws IOException {
        String file = "src/test/resources/fileTest.txt"; // Related path

        // BufferedReader is a reader that read files by chunks
        // FilerRead Constructor open session to file
        BufferedReader reader = new BufferedReader(new FileReader(file));
        reader.readLine(); // read throws IOException ( checked exception)
        List<String> collect = reader.lines() // Stream
                .collect(Collectors.toList());

        collect.stream().forEach(s -> System.out.println(s));

        // Close method is close session to the file
        reader.close();


        reader = new BufferedReader(new FileReader(file));  // open and close as { }
        // After read is closed we cannot call read method (in general and read of file )
        reader.readLine();
        reader.close();
    }

    public List<Animal> readZoo(String fileName, String separator) throws IOException {
        // try with resources. in braces there can be an object that implements AutoClosable
        List<Animal> animals;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            animals = reader.lines()// Stream of Strings ( file lines)
                    .map(line -> convertFromString(separator, line)) // Stream of Animal
                    .filter(animal -> animal != null) // Stream of Animal excluded null
                    .collect(Collectors.toList());
        }
        return animals;
    }

    // line is single line of the file
    private Animal convertFromString(String separator, String line) {
        if (line.isEmpty()) {
            return null;
        }
        String[] arrayLine = line.split(separator);
        String typeAnimal = arrayLine[0];
        String name = arrayLine[1];
        int age = Integer.parseInt(arrayLine[2]);
        Animal animal;
        if ("cat".equals(typeAnimal)) {
            animal = new Cat(name, age);
        } else if ("dog".equals(typeAnimal)) {
            animal = new Dog(name, age);
        } else if ("lion".equals(typeAnimal)) {
            animal = new Lion(name, age);
        } else {
            animal = null;
        }
        return animal;
    }

    public void writeAnimals(Collection<Animal> animals, String filePath, String separator) throws IOException {
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            // Object.getClass() retunrs actula Type (Class
            // getClass().getName() return full name of class (including package)
            String fileBody = animals.stream()
                    .map(animal -> animal.getClass().getSimpleName().toLowerCase()
                            + separator + animal.getName() + separator + animal.getAge())// Stream of String
                    .collect(Collectors.joining("\n"));//

            outputStream.write(fileBody.getBytes(StandardCharsets.UTF_8));
        }
    }
}
