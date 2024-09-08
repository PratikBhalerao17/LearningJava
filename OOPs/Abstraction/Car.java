package org.example.OOPs.Abstraction;

import org.example.OOPs.Polymorphism.C;

import java.awt.*;

public class Car extends Vehicle{

    private int noOfTyres;
    @Override
    public void startEngine() {
        System.out.println("Car is Starting with "+this.getColor()+" Color and with " +this.noOfTyres+" tyres." );
    }

    public Car(String Color, int noOfTyres){
        super(Color);
        this.noOfTyres = noOfTyres;
    }

    public Car(){

    }

    public static void main(String[] args) {
        //Vehicle vehicle = new Vehicle(); // error as we can't create object of an abstract class

        Vehicle vehicle = new Car("Yellow",4);
        vehicle.startEngine();
        System.out.println(vehicle.getColor());
        vehicle.setColor("RED");
        vehicle.startEngine();
    }
}
