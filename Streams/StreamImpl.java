package org.example.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamImpl {
    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Pratik","Pankaj","Ajay");
//
//        names.stream()
//                .filter(name -> name.startsWith("P")) //first stream filter the data
//                .forEach(name -> System.out.print(name + " ")); // then stream print it
        // OP : Pratik Pankaj

        List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8,9,10);
//        List<Integer> squares = numbers.stream()
//                .map(number -> number * number) //Transforms the elements of the stream by applying a function to each element.
//                .collect(Collectors.toList()); //Transforms the elements of the stream into a different form, such as a list or a map.
//
//        numbers.forEach(n-> System.out.print(n+" ")); //2 3 4 5 6
//        System.out.println();
//        squares.forEach(n-> System.out.print(n+" ")); // 4 9 16 25 36
//
//        System.out.println();
//        int sum = squares.stream()
//                .reduce(0, (a,b)-> a+b); //Combines the elements of the stream to produce a single summary result.
//        System.out.println("The sum is "+sum); // The sum is 90


        int sum = numbers.parallelStream()
                .peek(num -> System.out.println("Processing: " + num + " - " + Thread.currentThread().getName()))
                .reduce(0,(a,b)->a+b); // for reduce 0 is starting value from where operation starts
        System.out.println(sum);

    }
}
