package com.fundemtals.practice.world;

import com.fundemtals.practice.world.exceptions.MyVeryStrictException;

public interface Climbable {
    // Interface method can declare that it throws Exception
    public void climb() throws NullPointerException;  //throws MyVeryStrictException;
}
