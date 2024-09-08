package org.example.MultiThreading.PrintHelloWorld;

public class ClientHelloWorldPrinter {
    public static void main(String[] args) {
        /*
When we run any program(chrome)  it comes from hdd to RAM and becomes a process which has process control block
(PCB) and inside which there are threads which runs the code.
Process is program in execution and thread is execution unit of CPU(Core).
CPU has core and each core can run 1 thread at a time
         */
        //System.out.println("Hello World Printed By "+Thread.currentThread().getName()); //Hello World Printed By main
        //main is default thread

        //If we want to print something from other thread we can do it by below steps
        /*
    1. Identify the task --> Print hello world
    2. Create a separate class for our task --> HelloWorldPrinter.java
    3. Make this class implements the runnable interface
    4. Implement the run method of runnable interface
    5. Create a thread object from where we need to call the thread and pass the task object to it
    6. Start the thread
         */

        //Create object of class
        HelloWorldPrinter printer=new HelloWorldPrinter();
        Thread t=new Thread(printer); //create a object of thread class and pass object of our task
        t.start(); //Hello World from thread Thread-0
        t.run();
        //Thread t1=new Thread(printer);
//        t1.start(); //Hello World from thread Thread-1
        //Threads submits in a order but executes in any order as they are parallel
        //t1.run(); //Hello World from thread main
        //If we call run method instead of start() then code runs in a same thread and treat it as a normal
        //run() method directly which our class implements
        //To achieve multithreading use start method only
        //We can call start() method only once but can call run() any number of time

    }
}
