package com.fundemtals.practice.world.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<CustomKey, String> customKeyStringMap = new HashMap<>();
        CustomKey key1 = new CustomKey("AAA", 1);
        CustomKey key2 = new CustomKey("AAA", 1);
        // key1 == key2 it is false
        customKeyStringMap.put(key2, "2nd value");
        System.out.println(customKeyStringMap.size());
        CustomKey key3 = new CustomKey("AAA", 1);
        System.out.println("Key2 equals key3: " + key2.equals(key3));

        // it is a bad practice to have a setter in class that is used as key in hashMap
        // Because key may be lost
        // key2.setSkey("asdasdasdasdadasdasdasd");
        System.out.println("Key2 equals key3: " + key2.equals(key3));
        System.out.println(customKeyStringMap.get(key3));
        System.out.println(customKeyStringMap.get(key2));
    }
}
