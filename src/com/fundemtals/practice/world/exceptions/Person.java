package com.fundemtals.practice.world.exceptions;

public class Person {

    private String name;

    public void setName(String name) throws MyVeryStrictException {
        if (name == null) {
            throw new ApplicationException();
        }

        if (name.startsWith("1")) {
            throw new NotValidNameException();
        }
        if (name.length() > 10) {
            throw new MyVeryStrictException("Length is too big", 10);
        }


        this.name = name;
    }
}
