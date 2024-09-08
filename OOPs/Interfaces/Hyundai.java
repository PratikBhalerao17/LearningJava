package org.example.OOPs.Interfaces;

public class Hyundai implements Car,Vehicle{
    @Override
    public void startEngine() {
        Car.super.startEngine();
    }

    public static void main(String[] args) {
        Hyundai hyundai =new Hyundai();
        hyundai.startEngine();
    }
}
