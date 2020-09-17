package com.company;

public class Dog extends Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("_____________________________");
        System.out.println("Имя "+ getName());
    }
}
