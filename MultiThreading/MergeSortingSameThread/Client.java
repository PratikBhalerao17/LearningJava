package org.example.MultiThreading.MergeSortingSameThread;

import java.util.List;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> arrayToSort=List.of(6,5,3,8,1,4,2);
        MergeSorter sorter=new MergeSorter(arrayToSort);

        List<Integer> sortedList=sorter.call();

        System.out.println(sortedList);
    }
}
