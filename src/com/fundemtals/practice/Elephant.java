package com.fundemtals.practice;

import com.fundemtals.practice.world.Animal;

public class Elephant extends Animal {

    public void someMethod() {
        name = "some"; // name is accessible because name is protected
    }
}
