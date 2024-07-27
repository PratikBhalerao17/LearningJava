package org.example.MultiThreading.MergeSortingSameThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

//This is my task class whose job is to perform the sorting
public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer> arrayList;

    //We are taking the input that we need to sort this array via constructor
    public MergeSorter(List<Integer> arrayList){
        this.arrayList=arrayList;
    }

    @Override
    public List<Integer> call() throws Exception {
        //step 1 : base condition
        if(arrayList.size()<=1) {
            System.out.println("DEBUG");
            return arrayList;
        }
        // step 2: divide list into 2 halves
        List<Integer> leftList=new ArrayList<>();
        List<Integer> rightList=new ArrayList<>();
        int mid=arrayList.size()/2;

        for(int i=0;i<mid;i++){
            leftList.add(arrayList.get(i));
        }
        for(int i=mid;i<arrayList.size();i++){
            rightList.add(arrayList.get(i));
        }
        // so we have divided the list into 2 parts
        //step 3 : we need to sort these 2 lists separately and as these 2 lists are new tasks and we can do it
        // parallely so we pass it to call function
        // as we pass the object to call function we first create the task objects
        MergeSorter leftSorter=new MergeSorter(leftList);
        MergeSorter rightSorter=new MergeSorter(rightList);
        //We are calling the call method on both our tasks
        // this calls will return the sorted arrays
        List<Integer> leftSortedList=leftSorter.call();
        List<Integer> rightSortedList=rightSorter.call();

        //step 4: Now we get the left and right sorted list next step is to merge them into single list
        List<Integer> FinalSortedList=new ArrayList<>();
        int i=0,j=0;
        while(i<leftSortedList.size() && j<rightSortedList.size()){
            if (leftSortedList.get(i)<rightSortedList.get(j)){
                FinalSortedList.add(leftSortedList.get(i));
                i++;
            }
            else{
                FinalSortedList.add(rightSortedList.get(j));
                j++;
            }
        }
        while(i<leftSortedList.size()){
            FinalSortedList.add(leftSortedList.get(i));
            i++;
        }
        while (j<rightSortedList.size()){
            FinalSortedList.add(rightSortedList.get(j));
            j++;
        }

        return FinalSortedList;
    }
}
