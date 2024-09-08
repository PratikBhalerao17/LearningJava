package org.example.MultiThreading.SynchronisedKeyword;

//Task : to add 1 to 10000 to count
public class Adder implements Runnable{
    private Count count;
    public Adder(Count count){
        this.count=count;
    }

    private synchronized void add(int i){
        this.count.val+=i;
    }
//    @Override
//    public void run() {
//        for(int i=1;i<=10000;i++) {
//            synchronized (count) {
//                count.val += i;
//            }
//        }
//    }

    @Override
    public void run() {
        for(int i=1;i<=10000;i++) {
            count.add(i);
        }
    }
}
