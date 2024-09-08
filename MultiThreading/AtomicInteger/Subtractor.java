package org.example.MultiThreading.AtomicInteger;
//Task : to subtract 1 to 10000 from count

public class Subtractor implements Runnable{
    private Count count;
    public Subtractor(Count count){
        this.count=count;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            count.val.addAndGet(-i);
        }
    }
}
