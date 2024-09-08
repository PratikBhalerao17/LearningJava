package org.example.OOPs.Interfaces;

public interface Car {

    public default void startEngine(){
        System.out.println("Engine is starting inside Car Interface");
    }
}
