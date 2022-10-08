package com.fundemtals.practice.world.lambda;

public class SelfMultiplier implements ExampleFunctionInterface {
    @Override
    public String doSomething(Integer integer) {
        return String.valueOf(integer * integer);
    }
}
