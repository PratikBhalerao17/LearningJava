package org.example.Interface;

public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving the car with the speed of "+Speed + "km/hr");
    }

//    public void driveVehicle(){
//        System.out.println("Drive Vehicle method of Car class");
//    }

    public static void main(String[] args) {
        Vehicle car = new Car();

        car.drive(); // Driving the car with the speed of 100km/hr
        car.driveVehicle(); // I am driving the vehicle
        // default method don't need to give implementation

        Vehicle.driveStatic(); // Driving from the static method
    }
}
