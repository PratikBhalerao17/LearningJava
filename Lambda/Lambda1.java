package org.example.Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

/*
Why use Lambda Expression
1. To provide the implementation of Functional interface.
2. Less coding.
 */
public class Lambda1 {
    public static void main(String[] args) {
//        IntConsumer intConsumer = a -> System.out.println("Hello, World! " + a * a);
//
//        intConsumer.accept(5); // Passing 5 as the parameter

        //Integer val = a -> System.out.println("The square is :"+ a*a); //java: incompatible types: java.lang.Integer is not a functional interface
        //We can store the lambda only on functional interfaces.

//        Predicate<Integer> va = (a) ->  a>5;
//        System.out.println(va.test(6));
//        System.out.println("The type of T is " + va.getClass().getName());

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //list.forEach(n -> System.out.print(n + " ")); // 1 2 3
        //Lambda expressions can be stored in variables if the variable's type is an interface which has only one method.
        // The lambda expression should have the same number of parameters and the same return type as that method.
        // Java has many of these kinds of interfaces built in, such as the Consumer interface (found in the java.util
        // package) used by lists.
        Consumer<Integer> val = n -> System.out.print(n + " ");

        list.forEach(val);

    }
}
