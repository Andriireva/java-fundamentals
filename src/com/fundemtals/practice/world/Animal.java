package com.fundemtals.practice.world;


public class Animal {

    private String name; // are null
    private String surname; // are null
    private String fullName;
    private int age;  // int Integer default 0
    private Double height; // 0.0
    private Boolean isMultiColor; // default is false

    // public, package private, protected, private
    // Secret property
    private Boolean hasChildren;
    private Integer legsNumber;

    public Animal() {

    }

    public Animal(char isYes) {
        if (isYes == 'Y' || isYes == 'y') {
            hasChildren = true;
        } else {
            hasChildren = false;
        }
    }

    public Animal(String animalName) {
        name = animalName;
        fullName = name + " " + surname;
    }

    public Animal(String animalName, String surname, Integer ageValue) {
        name = animalName;
        age = ageValue;
        fullName = name + " " + surname;
    }

    public void setName(String nameValue) {
        name = nameValue;
    }

    public String getFullName() {
        if (fullName == null) {
            fullName = name + " " + surname;
        }
        return fullName;
    }

    public Boolean getHasChildren() {
        return hasChildren;
    }

    public void setLegsNumber(Integer number) {
        legsNumber = number;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Double getHeight() {
        return height;
    }

    public Boolean getMultiColor() {
        return isMultiColor;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setMultiColor(Boolean multiColor) {
        isMultiColor = multiColor;
    }

    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    // it should return a string presentation of this animal
    public String describeMe() {
        String result = "My name is " + name +
                " and my age is " + age;
        if (height != null) {
            result += " and height is " + height;
        }
        if (isMultiColor != null) {
            result += " and multi color is " + isMultiColor;
        }
        if (hasChildren != null) {
            result += " and have children " + hasChildren;
        }
        if (legsNumber != null) {
            result += " and have legs number " + legsNumber;
        }
        return result;
    }

    public String getName() {
        return name;
    }


    // fields
    // constructor
    // methods



}

