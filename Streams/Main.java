package org.example.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,23,50,456,32,756,4,346,8,9,80);
        // For all the odd numbers, take a square and create a new list out of it
        List<Integer> collect = list.stream()
                .filter(n -> n % 2 == 1)
                .map(val -> val * val)
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}
