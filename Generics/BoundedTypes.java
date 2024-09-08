package org.example.Generics;

/*
You can restrict the types that can be used as type parameters.
For example, you might want a method to accept only numbers:
 */

public class BoundedTypes <T extends Number>{
    public double square(T number){
        return number.doubleValue() * number.doubleValue();
    }

    public static void main(String[] args) {
        BoundedTypes<Integer> types = new BoundedTypes<>();
        System.out.println(types.square(50)); // return 2500.0

        //BoundedTypes<String> obj = new BoundedTypes<>(); // gives error as BoundedTypes extends Number so only work with types that are subclasses of Number.
    }
}
