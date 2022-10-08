package com.fundemtals.practice.world.lambda;

// It is a marker interface
// Functional interface is interface that has ONLY 1 abstract method
// Functional interfaces can have a default methods ( methods that are implemented )
@FunctionalInterface
public interface ExampleFunctionInterface {
    public String doSomething(Integer integer);

    default String checkOnNull(Integer integer) {
        if (integer != null) {
            return doSomething(integer);
        } else {
            return null;
        }
    }
}
