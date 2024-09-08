package org.example.MultiThreading.SynchronizationLock;

import java.util.concurrent.locks.Lock;

//Task : to add 1 to 10000 to count
public class Adder implements Runnable{
    private Count count;
    private Lock lock;
    public Adder(Count count,Lock lock){
        this.count=count;
        this.lock = lock;
    }
    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
            lock.lock();
            try{
            count.val+=i;
        }
            finally {
                lock.unlock();
            }
            }
    }
}
