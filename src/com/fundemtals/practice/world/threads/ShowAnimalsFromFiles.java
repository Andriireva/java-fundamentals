package com.fundemtals.practice.world.threads;

import com.fundemtals.practice.world.Animal;
import com.fundemtals.practice.world.files.ReadWriter;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class ShowAnimalsFromFiles {

    public static void main(String[] args) {
        ReadWriter readWriter = new ReadWriter();

        Runnable reader = () -> {
            try {
                List<Animal> animalList = readWriter.readZoo("src/test/resources/zoo.txt", " ");
                System.out.println("Reading new zoo data");
                System.out.println("Animal names: " + animalList.stream()
                        .map(animal -> animal.getName()).collect(Collectors.joining(", ")));
            } catch (Exception e) {
                System.out.println("Error appear");
            }
        };
        MyRunnable target = new MyRunnable(reader);
        Thread thread = new Thread(target);

        thread.start();



        try {
            Thread.sleep(60L * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        target.doStop();
    }
}
