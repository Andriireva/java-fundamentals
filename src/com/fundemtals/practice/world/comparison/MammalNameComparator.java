package com.fundemtals.practice.world.comparison;

import com.fundemtals.practice.world.Mammal;

import java.util.Comparator;

public class MammalNameComparator implements Comparator<Mammal> {
    @Override
    public int compare(Mammal o1, Mammal o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
