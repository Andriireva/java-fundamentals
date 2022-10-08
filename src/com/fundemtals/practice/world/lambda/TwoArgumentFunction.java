package com.fundemtals.practice.world.lambda;

// This functional interface is similar to BiFunction
@FunctionalInterface
public interface TwoArgumentFunction {
    public double calculate(Double a, Double b);

    default Double checkOnNull(Double a, Double b) {
        if (a != null && b != null) {
            return calculate(a, b);
        } else {
            return null;
        }
    }
}
