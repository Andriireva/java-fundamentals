package com.fundemtals.practice.world.intternalclassexmp;


public class Shop {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Asus", 14.1);
        // Access to internal static class: Parent.Internal
        // It is a good practice to not import internal class
        Laptop.TouchPad touchPad = new Laptop.TouchPad();

        // Dynamic internal class can be created from instance of external class
        // Dynamic internal class are very-very rare case
        // Laptop.Keyboard is type
        Laptop.Keyboard keyboard = laptop1.new Keyboard();

        // Reference to variable Color inside Laptop class
        Laptop.Color = "Orange";
        // Laptop.Color is not TYPE (not class)
        //Laptop.Color coloer = new ()

    }
}
