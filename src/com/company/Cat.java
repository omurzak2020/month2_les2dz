package com.company;

public class Cat extends Animal  {
    private int age;

    public Cat(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void print() {
        System.out.println("_____________________________");
        System.out.println("Возраст "+ getAge());
    }
}
