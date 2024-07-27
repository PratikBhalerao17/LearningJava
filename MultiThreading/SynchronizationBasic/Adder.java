package org.example.MultiThreading.SynchronizationBasic;

//Task : to add 1 to 10000 to count
public class Adder implements Runnable{
    private Count count;
    public Adder(Count count){
        this.count=count;
    }
    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
            count.val+=i;
        }
    }
}
