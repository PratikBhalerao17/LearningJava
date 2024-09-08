package org.example.MultiThreading.ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable{
    private Queue<Object> store;
    private int maxSize;
    private String name;

    private Lock lock;

    public Consumer(Queue<Object> store,int maxSize,String name,Lock lock){
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.lock = lock;
    }
//    @Override
//    public void run() {
//        while (true) {
//            synchronized (store) {
//                if (store.size() > 0) {
//                    store.remove();
//                    System.out.println(name + " removed the consumer and size is " + store.size());
//                }
//            }
//        }
//    }

    @Override
    public void run() {
        while (true) {
            lock.lock();
                if (store.size() > 0) {
                    store.remove();
                    System.out.println(name + " removed the consumer and size is " + store.size());
                }
                lock.unlock();
            }
    }
}
