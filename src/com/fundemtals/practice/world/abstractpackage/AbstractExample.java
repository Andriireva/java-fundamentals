package com.fundemtals.practice.world.abstractpackage;

import com.fundemtals.practice.world.Soundable;

public abstract class AbstractExample implements Soundable {
    // it can be as usual class with fields, constructs, methods and implementation
    // Some methods can be abstract (without implementation)
    private String name;

    public AbstractExample() {
    }

    public AbstractExample(String name) {
        this.name = name;
    }

    // This abstract method, it is without implementation
    // Keyword abstract is mandatory
    // It can have public, protected or package private accessor
    // Private access is prohibited
    // abstract method can be ONLY in abstract class
    //
    // When ever some class implement abs method (or override)
    // it is possible to change return type
    // to some child of original return type
    protected abstract String doSomething(String prefix);

    // Interface method may be implemented in abstract class
    // But it is optional
    public void doSound() {
        System.out.println("Do somes s");
    }

    public String calculation(int k, int n) {
        Integer result = k * n;
        String stringResult = doSomething(result.toString());
        return stringResult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
