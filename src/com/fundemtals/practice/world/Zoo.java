package com.fundemtals.practice.world;



public class Zoo {

    public static void main(String[] args) {
        Animal dog = new Animal("Super Rex");
        ////
        dog.setAge(5);

        Animal dog2 = new Animal("MaxX");

        Animal cat = new Animal("Y");
        cat.setName("MewMew");
        cat.setAge(3);

        // Animal -> Mammal -> Cat, Dog, Bat
        //        -> Fish   -> Shark,...
        //        -> birds  -> Peguines, Chiken
        //        -> Insects -> Ant, Bee

        Animal crocodile = new Animal();
        crocodile.setName("Crocs");

        Animal bat = new Animal("Battie", 1);
        Mammal rabbit = new Mammal("Little one", 4);
//        rabbit.setName();
//        rabbit.name = "Somename";

        Mammal rat = new Mammal("Anna");
        System.out.println(rat.getMammalName());
        System.out.println(rat.getName());


        System.out.println(bat.getDescription());
        System.out.println(rabbit.getDescription());
        System.out.println("My mammal name is " + rabbit.getName());
        System.out.println("My mammal age is " + rabbit.getAge());
        System.out.println("My mammal capitalized name is " + rabbit.getUpperCasedName());
        System.out.println("My animal name is " + cat.describeMe());
    }
}
