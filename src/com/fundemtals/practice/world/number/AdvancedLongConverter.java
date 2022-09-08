package com.fundemtals.practice.world.number;

public class AdvancedLongConverter extends LongConverter {


    // @Override
    // method does not override or implement a method from a supertype
    public Integer convert() {
        return convert("555").intValue();
    }

    // this is annotation
    // Override marks method that override or implement
    // a method from a supertype
    @Override
    public Long convert(String sValue) {
        if (sValue == null || sValue.contains("X")) {
            return null;
        }
        return Long.valueOf(sValue);
    }
}
