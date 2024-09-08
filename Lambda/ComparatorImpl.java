package org.example.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorImpl {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(1);
        list.add(3);
        list.add(2);

//        Collections.sort(list);
//        list.forEach(n -> System.out.print(n + " ")); // 1 2 3 7

        Collections.sort(list,(p1,p2)->p2.compareTo(p1));
        list.forEach(n -> System.out.print(n + " "));


    }
}
