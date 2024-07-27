package org.example.MultiThreading.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
       // Instead of creating 100 threads we can use executorService where we can reuse the threads once completed
        // because creating a new thread each time is memory inefficient and time consuming.
        // In executor service we just have to create a task and submit it to executor, we don't need to create
        // threads manually .Exceutor will handle it for us. Task class won't change

        /*
Steps to use Executor:
1. create a task class for the task we need to perform parallely.
2. create an executor service class and choose the   type for it
    i.e.Executors.newFixedThreadPool(10) or Executors.newCachedThreadPool()
3. Now submit the tasks to the executor using .execute method
    Here we are only submitting tasks the threads allocation and start of thread is done by executor.
4. Close the executor using .shutdown() method
         */

//        ExecutorService executorService= Executors.newFixedThreadPool(10); // max 10 threads assign
//
//        for (int i=1;i<=100;i++){
//            if(i==5 || i == 18 || i== 97){
//                //for 5 size of workQueue=0 & Workers=4
//                // for 18 size of workQueue=7 & Workers=10
//                // for 97 size of workQueue=86 & Workers=10
//                System.out.println("DEBUG");
//            }
//            NumbersPrinter printer=new NumbersPrinter(i);
//            executorService.execute(printer);
//        }
//        executorService.shutdown();

        ExecutorService executorService= Executors.newCachedThreadPool(); // size is not mentioned it assigns
        // threadpool of some default size and if any thread is empty then assign task to it and if it is
        // not empty then create new thread
        // here any number of threads can be created but in workQueue there will be 0 only

        for (int i=1;i<=100;i++){
            if(i==5||i==10 || i == 18 || i== 97){
                //for 5 size of workQueue=0 & Workers=4
                // for 10 size of workQueue=0 & Workers=9
                // for 18 size of workQueue=0 & Workers=17
                // for 97 size of workQueue=0 & Workers=90
                System.out.println("DEBUG");
            }
            NumbersPrinter printer=new NumbersPrinter(i);
            executorService.execute(printer);
        }
        executorService.shutdown();
        /*
        Executors.newCachedThreadPool:
Creates a thread pool that creates new threads as needed, but will reuse previously constructed threads when they
 are available. These pools will typically improve the performance of programs that execute many short-lived
 asynchronous tasks. Calls to execute will reuse previously constructed threads if available. If no existing
 thread is available, a new thread will be created and added to the pool. Threads that have not been used for
 sixty seconds are terminated and removed from the cache.

 For instance, If you have a huge number of long running tasks I would suggest the FixedThreadPool.
  As for the CachedThreadPool, the docs say that "These pools will typically improve the performance of programs
   that execute many short-lived asynchronous tasks".
         */
    }
}