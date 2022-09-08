package com.fundemtals.practice.world.abstractpackage;

public class ExampleImplementationTwo extends AbstractExample {

    protected String doSomething(String prefix) {
        String result = prefix + " To Lower Case";
        return result.toUpperCase();
    }
}
