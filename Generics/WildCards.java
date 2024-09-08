package org.example.Generics;

import java.util.ArrayList;
import java.util.List;

/*
Wildcards (?) are used to specify an unknown type. They are especially useful in parameters:
 */

public class WildCards {

    //We can specify ? if we don't know the datatype.
    public void PrintList(List<?> list){
        for(Object obj : list){
            System.out.print(obj);
        }
    }

    public static void main(String[] args) {
        WildCards wildCards = new WildCards();
        List<String> names = new ArrayList<>();
        names.add("Pratik");
        names.add("Pankaj");
        names.add("Priyanka");
        wildCards.PrintList(names); // PratikPankajPriyanka
        List<Integer> val = new ArrayList<>();
        val.add(50);
        val.add(20);
        wildCards.PrintList(val); //5020

    }

    //Type erasure is a process where the Java compiler removes all generic type information during compilation,
    // ensuring that there are no generics at runtime.
    // This maintains backward compatibility with older versions of Java that do not support generics.
}
