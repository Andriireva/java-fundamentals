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

//         Animal -> Mammal -> Cat, Dog, Bat
//                -> Fish   -> Shark,...
//                -> birds  -> Peguines, Chiken
//                -> Insects -> Ant, Bee

        Animal crocodile = new Animal(); // Default is called here
        crocodile.setName("Crocs");

        Animal bat = new Animal("Battie", 1);
        Mammal rabbit = new Mammal("Little one", 4);

        Mammal rat = new Mammal("Anna"); // <-

        Animal elephant = new Mammal("Dumbo");

//        bat.getUpperCasedName();  we try to call Mammal method on Animal instance method, but it fails
//        elephant.getUpperCasedName();

        if (bat instanceof Mammal) {
            System.out.println( ((Mammal) bat)  .getUpperCasedName());
        }

        if (elephant instanceof Mammal) {
            System.out.println( ((Mammal) elephant) .getUpperCasedName());
        }


        Animal[] animals = { dog, dog2, cat, bat, rabbit, rat, elephant };

        // Number is a supper class of Long, Float, Integer, Float...
        // Tha is why we can create an array of different types
        Number[] numbers = { 1, 0.5, 111223232323L, 122.66f };

        printAnimalNames(animals);
    }

    private static void printAnimalNames(Animal[] animals) {
        System.out.println("====== ANIMALS ======");
        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            String name = "";
            if (animal instanceof Mammal) {
                name = ((Mammal) animal).getUpperCasedName();
            } else {
                name = animal.getName();
            }
            System.out.println(name);
        }
    }
}
