package org.example.OOPs.Inheritance;

public class Dog extends Mammals{

    String name;

    public void bark(){
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        Dog dog =new Dog();
        System.out.println(dog.color);
        System.out.println(dog.noOfLegs);
        System.out.println(dog.Type);
        System.out.println(dog.name);
        dog.eat();
        dog.bark();

        //here we can see we can use all the attributes and behaviours of parent classes of DOG
        // --> when we create an object of a child then default constructor of child class will first call the default constructor
        //  of parent class (super())

        //e.g. A --> B --> C --> D
        // Here D is the child class of C and so on.
        // When we do
        // D d =new D();
        // The default constructor of D will first call the default constructor of C
        // Then the default constructor of C will first call the default constructor of B
        // Then the default constructor of B will first call the default constructor of A
        // So the flow of execution on constructor is like A --> B --> C --> D
        // This is called as constructor chaining.


        Animal animal = new Dog();
        //We can store object of child class in the reference of the parent class
        // Dog dog1 = new Animal(); // but not vice versa It is giving error Incompatible types.
        // Found: 'org.example.OOPs.Inheritance.Animal', required: 'org.example.OOPs.Inheritance.Dog'

        //animal.bark(); // It is giving compile time error as we can't access methods outside the animal as data type is animal.
        animal.eat(); // we can access the methods of animal and its parent only .

        Mammals mammals = new Dog(); // Here we can access the attributes and behaviours from mammals as well as animal but not dog.

        mammals.eat();
        System.out.println(mammals.Type);
        //mammals.bark(); //Error
    }
}
