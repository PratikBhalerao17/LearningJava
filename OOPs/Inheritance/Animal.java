package org.example.OOPs.Inheritance;

/*

 Inheritance allows us to share behaviours attributes from parent to child

 Child entity inherits all the attributes and behaviours from its parent
 Child class can also have specific attributes and behaviours of its own.


 --> when we create an object of a child then default constructor of child class will first call the default constructor
  of parent class (super())

 */

public class Animal {
    int color;
    int noOfLegs;

    public void eat(){
        System.out.println("Animal is eating");
    }
}
