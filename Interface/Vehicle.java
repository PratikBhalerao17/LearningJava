package org.example.Interface;

public interface Vehicle {

    int Speed = 100;

    static int result = 55;

    void drive();

    default void driveVehicle(){
        System.out.println("I am driving the vehicle");
    }

    static void driveStatic(){
        System.out.println("Driving from the static method");
    }

    //Static methods can be called directly on the interface and cannot be overridden by the implementing class.

    static void changeResult(){
        System.out.println("Result now is " + result);
    }
}
