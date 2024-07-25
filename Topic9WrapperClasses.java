package org.example;

import java.util.ArrayList;

public class Topic9WrapperClasses {
    public static void main(String[] args) {
        /*
Wrapper classes in Java are fundamental components for working with Java's primitive data types as objects.
-->Purpose of Wrapper Classes
Object Representation of Primitives: Wrapper classes provide a way to use primitive data types
(int, char, double, etc.) as objects.
Utility Methods: They offer a range of utility methods for converting, comparing, and managing primitive values.
         */

//        Integer a=10; //Autoboxing: The automatic conversion that the Java compiler makes between the
//        // primitive types and their corresponding object wrapper classes.
//        //Here 10 is an int value which is automatically converted into Integer.
//        System.out.println(a);
//        Integer b=10;
//        System.out.println(b);
//        /*
//Wrapper classes are used extensively in Java collections like ArrayList, HashMap, etc., which store
//objects, not primitive types.
//         */
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(100); // Autoboxing is used here
        //Wrapper classes can hold null, providing an advantage when dealing with optional or missing values.
        // However, unboxing a null reference leads to a NullPointerException.
//        Integer a=null; //no errror we can hold it
//        System.out.println(a); //prints null
//        //But when we unbox it or convert to primitive gives nullPointerException
//        int b=a; //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "a" is nullat org.example.Topic9WrapperClasses.main(Topic9WrapperClasses.java:32)


//        Integer x=Integer.valueOf(10); // we use .valueOf to convert primitive and string to wrapper class
//        System.out.println(x); // prints 10
//        Integer y=Integer.valueOf(null); //NumberFormatException as null string cannot be parsed
//        Integer z=Integer.valueOf("123"); //parse string to Integer
//        System.out.println(z); //prints 123

        //To convert string to primitive use parseXXX methods
//        String a="123";
////        int b=Integer.parseInt(a); //convert string to primitive int
////        System.out.println(b); //print 123
//        System.out.println(Integer.valueOf(a)); // prints 123
//        int num=Integer.valueOf(a); //can also use to convert string to primitive
//        System.out.println(num);  // prints 123
        /*
Objects of wrapper classes are immutable and should be compared using .equals() for value comparison rather
than using ==, which checks for reference equality.
         */
//        Integer a=1445644;
//        Integer b=1445644;
//        System.out.println(a==b); //return false but true for small value due to caching
//        System.out.println(a.equals(b)); // return true
//        Integer c=127;
//        Integer d=127;
//        System.out.println(c==d); //returns true for values between -128 to 127 due to caching
//        // for all values above 127 it returns false
//        System.out.println(c.equals(d)); // return true
        /*
These aspects of wrapper classes in Java make them crucial for any Java developer, especially when dealing with
collections, handling null-safe operations, and performing conversions between primitives and objects.
         */
    }
}
