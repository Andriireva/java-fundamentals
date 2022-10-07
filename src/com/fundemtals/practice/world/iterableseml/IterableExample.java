package com.fundemtals.practice.world.iterableseml;

import java.util.*;

public class IterableExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Andrii");
        strings.add("can");
        strings.add("swim");
        strings.add("another string");
        System.out.println(strings.size());


        // it is the simplest way of iterate over iterator instance
        Iterator<String> iterator = strings.iterator(); // Here we use iterator() method from Collection class
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        Planet p = new Planet();
//        for (Object s: p) {
//            System.out.println(s);
//        }

        System.out.println("==== listIterator ====");

        ListIterator<String> stringListIterator = strings.listIterator(); // Here we use method from List interface
        String next = stringListIterator.next(); // return "Andrii" and point to "can"
        String nextMore = stringListIterator.next(); // return "can" point to "swim"
        String previous = stringListIterator.previous(); // return "can" point

        // next it returns element and shift point to the next element
        //
        System.out.println(next);
        System.out.println(nextMore);
        System.out.println(previous);
    }
}
