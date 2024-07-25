package org.example;

import java.util.Objects;

public class Topic6StringsUseWithDataTypes {
    @Override
    public String toString() {
        return "Pratik";
    }
    public static void main(String[] args) {
        /*
--> To convert any data type to string either use String.valueOf or "" + e.g.
int a=100
String s="" +a;
1. Using String.valueOf() Method: This is one of the most common methods.
It can take any primitive type or an object and returns its string representation.
         */
    int a=100;
//    System.out.println(a+" Pratik"); //returns 100 Pratik as "Pratik" considers everything as string
//    String b=String.valueOf(a); //valueOf converted integer value to string
//    System.out.println(b + " Pratik"); // returns "100 Pratik"
//    System.out.println(b+ 10); //returns 10010 as 100 in b is string now so it appends 10 by + operator
//    System.out.println(a+10); //returns 110 as a is integer and + is addition operation here
//        char a = 'p';
//        String s=String.valueOf(a);
//        System.out.println(s); // prints p as string
//        System.out.println(s+'p'); //prints pp
//        System.out.println(a+'p'); //returns 224 as a is char
        // when you use the + operator with char types, it performs arithmetic addition using the
        // Unicode (or ASCII) values of the characters. Each character has a corresponding integer value.
        // The Unicode value for 'p' is 112. that is why it is returning 224
//        System.out.println(""+a+'p'); // this will print pp as first "" makes the string
        /*
2. Convert String to primitive datatypes -- > Use parseXXX of wrapper class.
Java offers wrapper classes for all primitive data types, and these classes provide methods to parse strings
into respective primitive types:
         */
//        String str = "123";
//        int num = Integer.parseInt(str);
//        System.out.println(num); // returns 123 as int
//        System.out.println(Double.parseDouble(str)); // prints 123.0
//        System.out.println(Boolean.parseBoolean(str)); //return false by default
        // method returns true if the string is "true", and false for any other value, including the string "123".
        /*
       parseCharacter method is not available. We can convert string to char using charArray ot toString
3. Objects to String --> toString() method
Using toString() Method: Most objects in Java inherit a toString() method from the Object class,
which can be overridden to provide a meaningful string representation.
         */
//
//        Topic6StringsUseWithDataTypes obj=new Topic6StringsUseWithDataTypes();
//        System.out.println(obj); //calls default obj.toString method and prints org.example.Topic6StringsUseWithDataTypes@4dd8dc3
//        System.out.println(obj.toString()); //prints org.example.Topic6StringsUseWithDataTypes@4dd8dc3
        //returns the string representation of any object along with memory address.
        //After we override toString method we can print anything we want with object

/*
4.Character to String:
    we can use Character.toString() method or String.valueOf() to convert char to string
 */
//        char x='p';
//        String p=Character.toString(x);
//        System.out.println(x);
////    If you have a string and want to extract a single character, you can use the charAt() method.
//        String str = "hello";
//        char c = str.charAt(0);  // prints 'h'
//    We can get String from char array
//        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
//        String str = new String(charArray);
//        System.out.println(str);  // Outputs: Hello
////    To convert string to char array we can use .charArray method
//        String str1 = "Hello";
//        char[] charArray1 = str.toCharArray();
//        System.out.println(charArray);  // Outputs: Hello


    }
}
