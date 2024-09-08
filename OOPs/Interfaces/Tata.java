package org.example.OOPs.Interfaces;

public class Tata implements Vehicle,Car{

    @Override
    public void startEngine() {

    }

    public static void main(String[] args) {
        Tata tata = new Tata();
        tata.startEngine();
    }
}
