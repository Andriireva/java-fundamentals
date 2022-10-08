package com.fundemtals.practice.world.lambda;

public class ConvertIntegerToString implements ExampleFunctionInterface {
    @Override
    public String doSomething(Integer integer) {
        if (integer == null) {
            return null;
        }
        return integer.toString();
    }
}
