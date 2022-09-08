package com.fundemtals.practice.world.number;

public class IntegerConverter extends AbstractNumberConverter {

    public Integer convert(String sValue) {
        return Integer.valueOf(sValue);
    }
}
