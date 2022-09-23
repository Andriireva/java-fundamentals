package com.fundemtals.practice.world.comparison;

import com.fundemtals.practice.world.Mammal;

import java.util.Comparator;

public class MammalAgeComparator implements Comparator<Mammal> {
    @Override
    public int compare(Mammal o1, Mammal o2) {
        // Integer.compare is static method to compare integers
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
