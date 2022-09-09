package com.fundemtals.practice.world.staticexample;

public class Calculator {
    // There is static context - "everything" that are marked as static
    // There us dynamic context - without static work
    // Static context (variables or methods) can be called in dynamic context
    // But not vice versa

    private int secretMultiplier;

    private static Integer someValue;

    public Calculator(int secretMultiplier) {
        this.secretMultiplier = secretMultiplier;
    }

    public void setSomeValue(Integer someValue) {
        Calculator.someValue = someValue;
    }

    public Integer getSomeValue() {
        return someValue;
    }

    public double divide(double n, double m) {
        return n / m * secretMultiplier;
    }

    public double multi(byte a, byte b) {
        // we call static method in dynamic method
        Number multiply = multiply(a, b);
        return multiply.doubleValue();
    }

    // there is no state (no class attributes) is touched
    public static Number multiply(int k, int c) {
        // We cannot call dynamic method in static
        // multi(4, 5);
        return k * c * someValue;
    }
}
