package org.example.Interface;

import java.util.function.Predicate;

public interface FunctionalInterface {

    /*
A Functional Interface is an interface that contains exactly one abstract method. These interfaces are also known as
 Single Abstract Method (SAM) interfaces. Despite having only one abstract method, functional interfaces can have multiple
  default or static methods.

Enhanced Compatibility with Lambda Expressions

While functional interfaces primarily focus on a single abstract method, they can also contain multiple default and
static methods.
These methods can have an implementation and do not affect the functional interface status of the abstract interface.



Java provides several built-in functional interfaces in the java.util.function package, each designed for specific scenarios:

Predicate<T>: Accepts an argument of type T and returns a boolean. Useful for filtering data.
Function<T,R>: Accepts an argument of type T and produces a result of type R. Useful for transforming data.
Consumer<T>: Accepts an argument and returns no result, typically used for consuming data, like printing out.
Supplier<T>: Represents a supplier of results, with no input and a return of type T.
     */
    public static void main(String[] args) {
        Predicate<String> isStringLessThan5 = s -> s.length() > 5;
        System.out.println(isStringLessThan5.test("HelloMn"));
    }

}
