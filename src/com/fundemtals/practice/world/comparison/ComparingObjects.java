package com.fundemtals.practice.world.comparison;

import com.fundemtals.practice.world.Animal;
import com.fundemtals.practice.world.Cat;
import com.fundemtals.practice.world.Mammal;

import java.util.Comparator;

public class ComparingObjects {

    public static void main(String[] args) {
        Cat cat1 = new Cat("ЇAlexا", 9, true);
        Cat cat2 = new Cat("ФAlexب", 10, true);
        Cat cat3 = (Cat) cat1;
        // cat1 and cat3 are reference to the same allocate space memory

        // == is comparison that 2 objects have the same reference
        boolean areCats12Equals = cat1 == cat2;
        boolean areCats13Equals = cat1 == cat3;

        System.out.println(areCats12Equals);
        System.out.println(areCats13Equals);
        // Comparing object by values must be happening via .equals() method


        boolean equalsByEqualsMethod = cat1.equals(cat2); // The default .equals() method compares instance by references
        System.out.println("equalsByEqualsMethod = " + equalsByEqualsMethod);

        int i = cat1.compareTo(cat2);
        System.out.println("Compare to " + i);

        MammalAgeComparator mammalAgeComparator = new MammalAgeComparator();
        int ageComparatorResult = mammalAgeComparator.compare(cat1, cat2);
        System.out.println("ageComparatorResult " + ageComparatorResult);

        MammalNameComparator mammalNameComparator = new MammalNameComparator();
        int nameComparatorResult = mammalNameComparator.compare(cat1, cat2);
        System.out.println("nameComparatorResult " + nameComparatorResult);

        Comparator<Mammal> ageComparator = (m1, m2) -> Integer.compare(m1.getAge(), m2.getAge());
                // Implementation are the same in general
        Comparator<Mammal> ageComparator2 = Comparator.comparingInt(Animal::getAge);
        System.out.println("ageComparator lambda " + nameComparatorResult);
    }
}
