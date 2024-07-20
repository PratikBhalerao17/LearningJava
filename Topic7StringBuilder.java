package org.example;

public class Topic7StringBuilder {
    public static void main(String[] args) {
        /*
--> StringBuilder: StringBuilder is a mutable sequence of characters, which means you can modify its contents
without creating new objects. This makes StringBuilder more efficient than String for certain operations, particularly
when you need to perform a lot of modifications, such as appending, inserting, or deleting characters in a loop.
-->Why Use StringBuilder?
1. Performance: String objects are immutable. Each time you modify a String, a new object is created, which can be
inefficient for repetitive operations. StringBuilder allows you to modify the same object without creating new
ones, which improves performance.
2. Memory Efficiency: Since StringBuilder doesn't create new objects for each modification, it consumes less
memory compared to using String for extensive manipulations.
         */
        /*
-->Common methods of String Builder:
         */
        //1.Append :
        String s="Pratik";
        StringBuilder sb=new StringBuilder(s);
//        sb.append(" Bhalerao");
//        System.out.println(sb); // Prints "Pratik Bhalerao"
//        System.out.println(sb.toString()); // Prints "Pratik Bhalerao" in string format
        //2. Insert: Inserts a string representation of any data type at the specified index.
//        sb.insert(2,"x"); //inserts x at 2 index 0 based
//        System.out.println(sb); // prints Prxatik
//        sb.insert(2,2); // we can also insert number
//        System.out.println(sb); // prints Pr2xatik the remaining string is push forward
        //3.Delete: Removes characters from the sequence between the specified start and end indices.
//        sb.deleteCharAt(2); // delete character at index 2.
//        System.out.println(sb); // prints Pratik from Prxatik
//        sb.delete(2,3); // delete from index 2 to 3 where second is exclusive ie [2,3)
//        System.out.println(sb); // prints Pratik from Prxatik
// 4.Replace: Replaces characters in the sequence between the specified start and end indices with the given string.
//        sb.replace(2,3,"@"); // takes 3 parameters start index,end and char to relace with
//        System.out.println(sb); // print Pr@atik from Prxatik
//        sb.replace(2,3,"pratik"); // we can replace with entire string
//        System.out.println(sb); // op is Prpratikatik from Prxatik
        //5.Reverse: Reverses the sequence of characters.
//        sb.reverse();
//        System.out.println(sb.toString()); // prints kitarP
        //we can use reverse function of string builder for some DSA problems
    }
}
