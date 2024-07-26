package org.example.Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Topic3QueueInterface {
    public static void main(String[] args) {
        /*
Queue:
    Queue interface maintains the first-in-first-out order. It can be defined as an ordered list that is used to
    hold the elements which are about to be processed. There are various classes like PriorityQueue, Deque, and
    ArrayDeque,LinkedList which implements the Queue interface.
         */
//        Queue<Integer> queue=new LinkedList<>();
//        queue.add(4);
//        queue.add(5);
//        queue.offer(3); //add method will throw an exception IllegalStateException if it fails to insert
//        // the element due to capacity restrictions but offer returns false only without exception.
////        System.out.println(queue); // With LinkedList implementation [4, 5, 3]
//        // with priority queue implementation[3, 5, 4]
//        queue.remove(6);
//        System.out.println(queue); // [4, 5, 3] as element is not present
//        queue.remove(); // remove the head which is first in will be first out
//        System.out.println(queue); // 4 is removed [5, 3]
//        queue.poll(); // poll also remove the last element now 5 is deleted
//        System.out.println(queue); // [3]
//        queue.poll(); // poll also remove the last element now 3 is deleted
//        System.out.println(queue); // []

        //so now our queue is empty so lets check for remove and poll now
//        queue.remove(); // gives java.util.NoSuchElementException exception
//        System.out.println(queue.poll()); // poll does not give exeption but it returns null

        //same for element() and peek() method which gives head of the queue without deleting it

//        System.out.println(queue.element()); // exception java.util.NoSuchElementException
//        System.out.println(queue.peek()); // returns null and code works fine

        /*
1.PriorityQueue:
    A queue that orders elements based on their natural ordering or by a Comparator provided at queue construction.

         */
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        queue.offer(6);
        queue.offer(5);
        queue.offer(10);
        queue.offer(3);
        System.out.println(queue.peek());
        System.out.println(queue);

    }
}
