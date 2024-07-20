package org.example;

public class Topic5StringFunctions {
/*
    String Methods:
            */
    String a="Pratik";
//        System.out.println(a.length()); //returns 6
//        System.out.println(a.charAt(2)); //returns a index starts from 0
//        System.out.println(a.charAt(0)); //returns P
//        System.out.println(a.substring(2)); //returns "atik" string from seconds char till end
//        System.out.println(a.substring(2,4)); //returns "at" start index to end index-1 ie [start,end)
    //end is not inclusive
//        System.out.println(a.contains("at")); //returns true as string has "at" in it
//        System.out.println(a.contains('a')); // error as char cannot converted to string
    //With .contains method we can't use character it should be string only
//        System.out.println(a.contains("a")); //use double quote returns true
//        System.out.println(a.equals("Pratik")); //returns true use to compare content of String
//        System.out.println(a.equalsIgnoreCase("praTiK")); //returns true
//        System.out.println(a.startsWith("Pra")); //return true
//        System.out.println(a.startsWith("pra")); //return false as case is not matching
//        System.out.println(a.endsWith("ik")); //returns true
//        System.out.println(a.endsWith("IK")); //returns false as case is not matching
//        System.out.println(a.endsWith("IK".toLowerCase())); //returns true as we are converting "IK" to "ik" before comparison
//        System.out.println(a.toLowerCase()); //To convert to lower case
//        System.out.println(a.toUpperCase());// To convert to uppper case
        /*
Using + Operator: Java allows string concatenation using the + operator, which is internally converted to
StringBuilder (or StringBuffer) operations for better performance in compiled code.Because Strings are
immutable in nature and frequent modification can takes alot of memory.
         */
//        String b=a+" Bhalerao";
//        System.out.println(b); //returns "Pratik Bhalerao"
        /*
StringBuilder and StringBuffer: For frequent modifications, such as loops that concatenate strings,
use StringBuilder (non-thread-safe) or StringBuffer (thread-safe) to enhance performance.

         */
//        StringBuilder sb = new StringBuilder("P");
//        for (int i = 0; i < 100; i++) {
//            sb.append(i); // more efficient than using string concatenation in a loop
//        }
//        System.out.println(sb);

}
