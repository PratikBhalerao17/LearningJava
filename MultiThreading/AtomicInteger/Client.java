package org.example.MultiThreading.AtomicInteger;

// write a code that perform addition from 1 to 10000 using 1 thread & subtraction from 1 to 10000 using another
public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count=new Count();
        Adder adder=new Adder(count);
        Subtractor subtractor=new Subtractor(count);

        Thread t1=new Thread(adder);
        Thread t2=new Thread(subtractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.val); // here expected output is 0 but we are getting diff op each time
        //Due to synchronization issue in this code
    }
}
