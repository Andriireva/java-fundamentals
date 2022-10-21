package com.fundemtals.practice.world.threads;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExampleThreads {

    // Main method is run under the "root" thread
    // Main thread has name "main" the same as main method
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);
//        Thread.

        List<String> data = new ArrayList<>();
        Map<String, String> dataMap = new HashMap<>(); // 100 - 1 / 10

//        Thread t = new Thread(() -> System.out.println("Hello from thread"));
        Thread writeThread = new Thread() { // It is extending "on the fly"
            @Override
            public void run() {
                for (int i = 1; i < 10; i ++){
                    dataMap.put(String.valueOf(i), "asdasda");
                    data.add(String.valueOf(i));
                    try {
                        Thread.sleep( 500L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread removeThread = new Thread() { // It is extending "on the fly"
            // We are overrided the method
            @Override
            public void run() {
                for (int i = 1; i < 10; i ++){
                    data.remove(String.valueOf(i));
                    dataMap.remove(String.valueOf(i));
                    try {
                        Thread.sleep( 300L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        };
        Thread readThread = new Thread() { // It is extending "on the fly"
            // We are overrided the method
            @Override
            public void run() {
                for (int i = 1; i < 10; i ++){
                    try {
                        Thread.sleep( 280L);
                        System.out.println(dataMap.get(String.valueOf(i)));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        };

        Runnable runnable = () -> {
            String d = "Hello from runnable" + Instant.now();
            data.add(d);
            data.remove("3");
            System.out.println(d);
        };

//        Thread t3 = new Thread(runnable);

        // Start method it

        writeThread.start();
        removeThread.start();
        readThread.start();
//        System.out.println(data);

//        Thread readMessageFromChat = new Thread(); // runs infinite // it call some method to read NEW MESAGEs
//
//        try {
//            // Sleep it is a statis method
//
//            Thread.sleep(2L * 1000L);
//            System.out.println("it is a message right after the sleep");
//        } catch (InterruptedException e) { // InterruptedException is checked Exception, so we need to handle it
//            e.printStackTrace();
//        }
//        System.out.println(data);
//        t3.start();
//        System.out.println(data);

//

//
//        System.out.println(Thread.currentThread().getName());
//        for (int i = 0; i < 10; i++) {
//            new Thread("" + i) {
//                public void run() {
//                    System.out.println("Thread: " + getName() + " running");
//                }
//            }.start();
//        }
    }
}
