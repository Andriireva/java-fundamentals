package com.fundemtals.practice.world.intternalclassexmp;

import java.util.Arrays;

public class Laptop {
    private String name;
    private double diagonal;
    private MotherBoard motherBoard;
    private Keyboard keyboard;

    public static String Color;

    public Laptop(String name, double diagonal) {
        this.name = name;
        this.diagonal = diagonal;

        this.motherBoard = new MotherBoard();
        motherBoard.name = "AsusX71";
        motherBoard.serialNumber = "123XXXX";
        keyboard = new Keyboard();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    // This is internal static class
    // internal class variable are accesible from External class event variables are private
    private static class MotherBoard {
        private String name;
        private String serialNumber;
    }

    static class TouchPad {
        private Double sensity;
    }

    // This is internal dynamic class
    class Keyboard {
        // .... some varialbes
    }
}
