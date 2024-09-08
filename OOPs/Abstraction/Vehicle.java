package org.example.OOPs.Abstraction;

/*

An abstract class in Java is a class that cannot be instantiated on its own and must be inherited by other classes.
It's used to establish a common interface and functionality for subclasses, while preventing the instantiation of the class itself.

Abstract classes are used when you want to provide a common, implemented functionality while also enforcing certain methods
to be implemented by any subclass.

Key Features
1. Abstract Methods: These are methods that are declared without an implementation. Subclasses are required to provide
implementations for these methods.
2. Concrete Methods: Abstract classes can also have methods with implementations. These methods can be used as-is by subclasses
or can be overridden.
3. Constructors: Abstract classes can have constructors, which are called when a subclass is instantiated.

Child class must implement all the abstract methods else it will also become abstract class.

Interface are the abstract class with no attributes and all abstract methods -- > 100% Abstraction
 */
public abstract class Vehicle {
    private String Color;

    public abstract void startEngine();

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
// Now my class becomes abstract

    public Vehicle(String Color){
        this.Color = Color;
    }

    public Vehicle(){
    }

}
