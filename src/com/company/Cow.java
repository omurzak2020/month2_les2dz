package com.company;

public class Cow extends Animal{
    private String color;

    public Cow(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void print() {

        System.out.println("_____________________________");
        System.out.println("Свет "+ getColor());
    }
}
