package org.example.OOPs.Abstraction;

public abstract class Animal {

    private String name;
    private String Color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public abstract void eat();
    public abstract void makeSound();

}
