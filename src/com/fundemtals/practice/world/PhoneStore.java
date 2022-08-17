package com.fundemtals.practice.world;

public class PhoneStore {
    public static void main(String[] args) {
        Cellphone iphone11 = new Cellphone("OSX", "white", true, true,
                true, 5.5, "xxxxqweqwasd3434qweqweqw");

        Cellphone onePlus7 = new Cellphone("android", "grey", true, true,
                true, 6.0, "xxxasndjasdqwpe12312woedwed");
        onePlus7.setColor("blue");

        System.out.println("Phone color is " + iphone11.getColor());
        System.out.println("Phone color is " + onePlus7.getColor());
    }
}
