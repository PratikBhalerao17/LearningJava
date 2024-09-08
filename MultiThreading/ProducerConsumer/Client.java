package org.example.MultiThreading.ProducerConsumer;

import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) {
        Queue<Object> store = new ConcurrentLinkedQueue<>();
        int maxSize = 6;
        Lock lock = new ReentrantLock();

        Producer p1 = new Producer(store,maxSize,"P1",lock);
        Producer p2 = new Producer(store,maxSize,"P2",lock);
        Producer p3 = new Producer(store,maxSize,"P3",lock);

        Consumer c1 = new Consumer(store,maxSize,"C1",lock);
        Consumer c2 = new Consumer(store,maxSize,"C2",lock);
        Consumer c3 = new Consumer(store,maxSize,"C3",lock);
        Consumer c4 = new Consumer(store,maxSize,"C4",lock);
        Consumer c5 = new Consumer(store,maxSize,"C5",lock);
        Consumer c6 = new Consumer(store,maxSize,"C6",lock);

        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();
        Thread t4 = new Thread(c1);
        t4.start();
        Thread t5 = new Thread(c2);
        t5.start();
        Thread t6 = new Thread(c3);
        t6.start();

        Thread t7 = new Thread(c4);
        t7.start();
        Thread t8 = new Thread(c5);
        t8.start();
        Thread t9 = new Thread(c6);
        t9.start();


// Here we can see the size is becoming 7 also which must not be the case
        //P2 added the new producer and size is 7

        // ALso getting the exception : Exception in thread "Thread-3" Exception in thread "Thread-4" Exception in thread "Thread-8" java.util.NoSuchElementException
        //	at java.base/java.util.AbstractQueue.remove(AbstractQueue.java:117)
        //	at org.example.MultiThreading.ProducerConsumer.Consumer.run(Consumer.java:19)
        //	at java.base/java.lang.Thread.run(Thread.java:1589)
        //java.util.NoSuchElementException

        // means we are trying to remove the element from an empty list.

        System.out.println(store.size());

        /*

        Here we can see that only one producer or consumer is getting the access but we want multiple
P2 added the new producer and size is 1
P2 added the new producer and size is 2
P2 added the new producer and size is 3
P2 added the new producer and size is 4
P2 added the new producer and size is 5
P2 added the new producer and size is 6
C6 removed the consumer and size is 5
C6 removed the consumer and size is 4
C6 removed the consumer and size is 3
C6 removed the consumer and size is 2
C6 removed the consumer and size is 1
C6 removed the consumer and size is 0
P3 added the new producer and size is 1
P3 added the new producer and size is 2
P3 added the new producer and size is 3
P3 added the new producer and size is 4
P3 added the new producer and size is 5
P3 added the new producer and size is 6
C1 removed the consumer and size is 5
C1 removed the consumer and size is 4
C1 removed the consumer and size is 3
C1 removed the consumer and size is 2
C1 removed the consumer and size is 1
C1 removed the consumer and size is 0
P3 added the new producer and size is 1
P3 added the new producer and size is 2
P3 added the new producer and size is 3
P3 added the new producer and size is 4
P3 added the new producer and size is 5
P3 added the new producer and size is 6
C3 removed the consumer and size is 5
C3 removed the consumer and size is 4
C3 removed the consumer and size is 3
C3 removed the consumer and size is 2
C3 removed the consumer and size is 1
C3 removed the consumer and size is 0
         */

    }
}
