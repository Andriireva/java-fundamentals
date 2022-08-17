package com.fundemtals.practice.world;

public class Zoo {

    public static void main(String[] args) {
        Animal dog = new Animal("Super Rex");
        ////
        dog.setAge(5);
        dog.setMultiColor(true);
        dog.setHeight(0.43);

        Animal dog2 = new Animal("MaxX", "Antsome",  5);
        dog2.setMultiColor(true);
        dog2.setLegsNumber(6);

        Animal cat = new Animal('Y');
        cat.setName("MewMew");
        cat.setAge(3);
        cat.setHeight(0.12);

        System.out.println(dog.describeMe());
        System.out.println(dog2.describeMe());
        System.out.println(cat.describeMe());
    }
}
