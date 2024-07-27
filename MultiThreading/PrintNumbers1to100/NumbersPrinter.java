package org.example.MultiThreading.PrintNumbers1to100;

public class NumbersPrinter implements Runnable{
    //Task : To print a single number

    private int numToPrint;

    public NumbersPrinter(int numToPrint){
        this.numToPrint=numToPrint;
    }

    @Override
    public void run() {
        System.out.println("Number is "+numToPrint+" printed by thread "+Thread.currentThread().getName());
    }
}
