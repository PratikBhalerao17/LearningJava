package org.example;

import java.awt.*;

public class Topic4StringsBasics {
    public static void main(String[] args) {
//1. Immutability: Once a String object is created, its value cannot be changed.
// Modifying a string actually creates a new string in memory.
//        String s="Pratik";
////        String p='p'+s; //"p"+s gives same output it means we can add char or string to string
//        // // This doesn't alter the original "Pratik" string but creates a new "pPratik" string.
////        System.out.println(p); //op pPratik
//        //We can print memory address of string using hashCode method
//        System.out.println(s.hashCode()); //-1896349257
//        s='p' + s;
//        System.out.println(s.hashCode()); //-1280184793
        //Here address is changing it means new memory address is assigned to string when we modified string.
        /*
2. String Pool: Java maintains a special memory region called the "string pool" for storing literal strings.
When a new string is created using string literals, Java checks the pool first. If the string already exists,
the same reference is returned instead of creating a new object.
         */
//        String p="pratik";
////        String s="pratik";
////        System.out.println(s.hashCode()); //-980216425
////        System.out.println(p.hashCode());//-980216425
////        //Boh hashcodes are same means internally they are pointing to the same location in string pool.
////        System.out.println(p == s); //return true as both have same reference == checks the reference not value
////        System.out.println(p.equals(s)); //returns true checks the value not the reference
//        String x=new String("pratik");
//
//        System.out.println(p == x); //return false as both don't same reference
//        System.out.println(p.equals(x)); //returns true checks the value not the reference
/*
3. String memory:
String literal e.g. “abc” (anything which is inside double quotes are String literal in Java) are maintained
in a String pool.
String pool is a pool of Strings( String literal) stored in Java Heap Memory.
String strLiteral = “abc”;

New String object is created as using new operator as below:
String strNew = new String(“abc”);
Everytime we use this new operator to create string object,
it always creates new object stored inside Java Heap memory outside the string pool.

Any time you create a new String object using String literal, JVM first checks String pool and if an object with
similar content available, than it returns that and doesn’t create a new object.
JVM doesn’t perform String pool check if you create object using new operator.
 /*
 */

    }
}
