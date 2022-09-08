package com.fundemtals.practice;

import com.fundemtals.practice.world.Animal;

public class Elephant extends Animal {

    public void someMethod() {
        name = "some"; // name is accessible because name is protected
    }

    public String move(int x, int y, int z) {
        return "I'm moved to " + x + ":" + y + ":" + z
                + " using legs and tail and my big nose";
    }
}
