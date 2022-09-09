package com.fundemtals.practice.world.staticexample;

public class Machine {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(2);
        Calculator calculator2 = new Calculator(3);

        calculator.setSomeValue(55);
        calculator2.setSomeValue(66);

        System.out.println(calculator.getSomeValue());
    }
}
