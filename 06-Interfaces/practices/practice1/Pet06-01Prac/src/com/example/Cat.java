package com.example;

public class Cat extends Animal implements Pet{
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("Fluffy");
    }

    @Override
    public void play() {
        System.out.println(name + " likes to play with string.");
    }

    @Override
    public void eat() {
        System.out.println(name + "Cats like to eat spiders and fish.");
    }


}
