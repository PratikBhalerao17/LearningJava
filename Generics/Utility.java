package org.example.Generics;

public class Utility {

    // generic method
    public static <T> void getValue(T t){
        System.out.println("The Value for t is :" + t);
        System.out.println("The type of T is " + t.getClass().getName());

    }
    public static void main(String[] args) {
        getValue("Pratik");
        getValue(156);
        getValue(121.12);
        getValue('A');
        getValue(3);
        /*
        OP:
The Value for t is :Pratik
The type of T is java.lang.String
The Value for t is :156
The type of T is java.lang.Integer
The Value for t is :121.12
The type of T is java.lang.Double
The Value for t is :A
The type of T is java.lang.Character
The Value for t is :3
The type of T is java.lang.Integer

         */

    }
}
