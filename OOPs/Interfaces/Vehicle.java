package org.example.OOPs.Interfaces;

public interface Vehicle {
    public default void startEngine(){
        System.out.println("Engine is starting inside Vehicle Interface");
    }
}
