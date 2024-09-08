package org.example.MultiThreading.ProducerConsumer;

import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable{

    //Job of Producer is to produce the items

    private Queue<Object> store;
    private int maxSize;
    private String name;
    private Lock lock;

    public Producer(Queue<Object> store,int maxSize,String name,Lock lock){
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.lock = lock;
    }
//    @Override
//    public void run() {
//        while (true){
//            synchronized (store) {
//                if (store.size() < maxSize) {
//                    store.add(new Object());
//                    System.out.println(name + " added the new producer and size is " + store.size());
//                }
//            }
//        }
//    }

    @Override
    public void run() {
        while (true){
            lock.lock();
                if (store.size() < maxSize) {
                    store.add(new Object());
                    System.out.println(name + " added the new producer and size is " + store.size());
                }
            lock.unlock();
        }
    }
}
