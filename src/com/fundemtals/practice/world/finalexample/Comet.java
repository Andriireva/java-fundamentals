package com.fundemtals.practice.world.finalexample;

// Class marked as final CANNOT be extended
// Interface and abstract class cannot be marked as final
public final class Comet extends Planet {
    public Comet(String name, double temperature) {
        super(name, temperature);
    }

//    @Override
//    public String getName() {
//        return "COMET get name is called";
//    }
}
