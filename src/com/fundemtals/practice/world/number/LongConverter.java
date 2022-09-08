package com.fundemtals.practice.world.number;

public class LongConverter extends AbstractNumberConverter {
    public Long convert(String sValue) {
        return Long.valueOf(sValue);
    }
}
