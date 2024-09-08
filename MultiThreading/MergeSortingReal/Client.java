package org.example.MultiThreading.MergeSortingReal;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> arrayToSort=List.of(6,5,3,8,1,4,2);
        ExecutorService executor= Executors.newCachedThreadPool();

        //we are passing same executor everywhere so we can have only one pool
        MergeSorter sorter=new MergeSorter(arrayToSort,executor);

        //To submit the code for callable we use .submit method for runnable it was .execute or .submit
        // Here as callable return something there might be a possibility that parallel task need other task to complete
        // So we use Future object for it and run remaining code parallel and when we need the future task

        Future<List<Integer>> FuturesortedList=executor.submit(sorter);

        // we can call future.get() method and continue our execution
        List<Integer> sortedList=FuturesortedList.get();

        executor.shutdown();

        System.out.println(sortedList);
    }
}
