package com.fundemtals.practice.world;

import com.fundemtals.practice.world.abstractpackage.AbstractExample;
import com.fundemtals.practice.world.abstractpackage.ExampleImplementationOne;
import com.fundemtals.practice.world.abstractpackage.ExampleImplementationTwo;

public class AbstractMainExample {
    public static void main(String[] args) {
        AbstractExample example1 = new ExampleImplementationOne();
        AbstractExample example2 = new ExampleImplementationTwo();

        System.out.println(example1.calculation(4, 5));
        System.out.println(example2.calculation(4, 5));
    }
}
