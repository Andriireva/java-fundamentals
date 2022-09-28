package com.fundemtals.practice.world.abstractpackage.collections;

import com.fundemtals.practice.Elephant;
import com.fundemtals.practice.world.Animal;
import com.fundemtals.practice.world.Cat;
import com.fundemtals.practice.world.Dog;
import com.fundemtals.practice.world.Lion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExampleLists {

    public static void main(String[] args) {
        Animal[] animals = new Animal[2]; // always fixed size
        // Collection is kind of root interface for all main collection ,except Map
        // List, Set, Queue

        Cat cat1 = new Cat("Snow", 5);
        Cat cat2 = new Cat("Snow2", 5);
        Cat anotherCat = new Cat("Snow2", 5);

        Collection<Animal> animalCollection = new ArrayList<>();
        animalCollection.add(cat1);
        animalCollection.add(cat2);
        animalCollection.add(new Cat("Snow6", 5));
        animalCollection.add(new Cat("Snow3", 5));
        animalCollection.add(new Cat("Snow5", 5));
        animalCollection.add(new Dog("Max", 10));
        System.out.println("Animal collection is empty : " + animalCollection.isEmpty());
        System.out.println("Animal collection size is : " + animalCollection.size());

        // it is possible to use any collection if foreach loop
        for (Animal animal : animalCollection) {
            System.out.println(animal.getName());
        }

        // in for each statement we can use a variable that is implements/extends Iterable Interface
        MyIterableClass myIterableClass = new MyIterableClass();
//        for (Object object: myIterableClass) {
//
//        }


        System.out.println("======  List =======");
        // List is collection that allows to use index for all needs
        // List is ordered collection
        List<Animal> animalList = new ArrayList<>(animalCollection);
        animalList.add(new Elephant());

        System.out.println("List size is " + animalList.size());
        Animal firstAnimal = animalList.get(0);
        firstAnimal.setName("Updated name");
        System.out.println(animalList.get(0).getName());
        System.out.println(cat2.equals(anotherCat));

        // Contains method works based on element equals method
        System.out.println("Contains " + animalList.contains(anotherCat));

        animalList.remove(0);
        System.out.println("Size after remove by index is : " + animalList.size());

        // remove is tolerant remove, if it object is not found than anything happens
        animalList.remove(new Cat("Snow6", 5));
        System.out.println("Size after remove by Object is : " + animalList.size());

        animalList.set(3, new Lion("Simba", 1));

        List<Animal> animalSubList = animalList.subList(1, 3);
        System.out.println("Sub list size is : " + animalSubList.size());

        // clear is delete all elements from collection
        animalList.clear();
        System.out.println("Size is : " + animalList.size());


        System.out.println("====== Person examples =======");
        Person p1 = new Person("Charles");
        Person p2 = new Person("Charles");
        System.out.println(p1.equals(p2));

    }

}
