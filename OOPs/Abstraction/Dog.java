package org.example.OOPs.Abstraction;

public class Dog extends Animal{
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog makes sound by barking");
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        System.out.println(animal.getColor()); // Null
        System.out.println(animal.getName()); // Null (It means the default constructor of Vehicle is called
        // so that we get the default values
        animal.eat();
        animal.makeSound();
    }
}
