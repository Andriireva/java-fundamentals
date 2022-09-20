package com.fundemtals.practice.world.exceptions;

// This type of Exception must be caught
// It is a bad practice to make your own Exception extended from Exception class
public class MyVeryStrictException extends Exception {
    private Integer nameLength;

    public MyVeryStrictException(String message) {
        super(message);
    }

    public MyVeryStrictException(String message, Integer nameLength) {
        super(message);
        this.nameLength = nameLength;
    }

    public Integer getNameLength() {
        return nameLength;
    }
}
