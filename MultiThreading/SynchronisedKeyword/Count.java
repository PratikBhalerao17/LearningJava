package org.example.MultiThreading.SynchronisedKeyword;

public class Count {
    int val=0;

    // Synchronized method to add value to count
    public synchronized void add(int value) {
        this.val += value;
    }

    // Synchronized method to subtract value from count
    public synchronized void subtract(int value) {
        this.val -= value;
    }
}
