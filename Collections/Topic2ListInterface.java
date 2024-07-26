package org.example.Collections;

import java.util.*;

public class Topic2ListInterface {
    public static void main(String[] args) {
        /*
List interface is the child interface of Collection interface. It inhibits a list type data structure in which we
 can store the ordered collection of objects. It can have duplicate values.
         */
        //There are 4 classes which implements list interface arraylist,linkedlist,vector and stack
//        List<Integer> list1=new ArrayList<>();
//        List<Integer> list2=new LinkedList<>();
//        List<String> list3=new Vector<>();
//        //Stack class extends vector class Vector provides methods that are useful for stack operations,
//        // such as elementAt, size, and isEmpty. By extending Vector, Stack can directly use these methods.
//        List<Topic2ListInterface> list4=new Stack<>();
//
//        list1.add(15);//here autoboxing is done 15 is int type which is converted to Integer(prims to non primitive)
//        list1.remove(15); // Index out of bounds as list size is not greater than 15 to access it
//        System.out.println(list1); //gives exception java.lang.IndexOutOfBoundsException
        /*
1. ArrayList:
    The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of
     different data types. The ArrayList class maintains the insertion order and is non-synchronized.
     The elements stored in the ArrayList class can be randomly accessed.
         */
//        List<String> names=new ArrayList<>();
//        names.add("Pratik"); // add to the end of the list
//        names.add("Rakesh");
//        names.add("Ramesh");
//        names.add(1,"Pankaj"); // add at index
////        names.add(6,"Sakshi"); // gets exception here as index is not present
////        names.add(5,"Sakshi"); // gets exception here as index is not present
//        names.add(4,"Sakshi");
////        System.out.println(names); //  [Pratik, Pankaj, Rakesh, Ramesh, Sakshi]
//        names.remove(1); //removes object at index
//        System.out.println(names); //[Pratik, Rakesh, Ramesh, Sakshi]
//        names.remove(6); // gets exception here as index is not present as only 4 elements means 3 index

//        //To iterate over all the elements we can use iterator
//        Iterator<String> itr=names.iterator();
//        //itr.hasNext() if there is element in collection
//        while (itr.hasNext()){
//            //itr.next() gives that element
//            System.out.println(itr.next());
//        }

//        //This is also a way to iterate over a collection
//        for(String name:names)
//            System.out.println(name);

/*
2. Linked List:
    LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements.
     It can store the duplicate elements. It maintains the insertion order and is not synchronized.
     In LinkedList, the manipulation is fast because no shifting is required.
 */
//        List<Character> chars=new LinkedList<>();
//        chars.add('P');
//        chars.add('R');
//        chars.add('A');
//        System.out.println(chars); //[P, R, A]
//        List<Character> chars2=new LinkedList<>();
//        chars2.add('T');
//        chars2.add('I');
//        chars2.add('K');
//        System.out.println(chars2); //[T, I, K]
//        chars.addAll(chars2); // adds all elemets to the end in the order as it is list
//        System.out.println(chars); //[P, R, A, T, I, K]

        /*
3. Vector :
    Vector uses a dynamic array to store the data elements. It is similar to ArrayList.
    However, It is synchronized and contains many methods that are not the part of Collection framework.

    Vector: All of the methods of Vector are synchronized. This means it is thread-safe and multiple threads
    can modify a Vector without additional synchronization.
    ArrayList: It is not synchronized. If multiple threads access an ArrayList concurrently, and at least one
    of the threads modifies the list structurally, it must be synchronized externally.

    Vector contains some methods that are not found in ArrayList like addElement which is similar to add but
    synchronized

         */
//        //The () after ArrayList indicates the invocation of the default constructor, which creates a new,
//        // empty ArrayList.
//        List<String> name=new ArrayList<>();
//        //The <>(name) part is particularly noteworthy. Here, the Vector constructor being called is one that
//        // accepts a Collection as an argument. The name list (an ArrayList in this case) is passed to this
//        // constructor.
//        List<String> dobs=new Vector<>(name); // name must be of string type otherwise exception
//        //This usage means that the Vector named dobs is initialized with all the elements of name.
//        // Since name is empty at this point, dobs will also be initialized as an empty Vector. However,
//        // if name contained elements, they would be copied into dobs.
////        System.out.println(name); //prints []
////        System.out.println(dobs);// []
//
//        name.add("Pratik");
//        name.add("Rakshan");
//        name.add("Pulkeet");
//
//        List<String> copy=new Vector<>(name);
//
//        System.out.println(name); //[Pratik, Rakshan, Pulkeet]
//        System.out.println(copy); // [Pratik, Rakshan, Pulkeet]
        // here copy is initialized with the already created name collection.


        /*
4.Stack : The stack is the subclass of Vector. It implements the last-in-first-out data structure, i.e., Stack.
 The stack contains all of the methods of Vector class and also provides its methods like boolean push(),
 boolean peek(), boolean push(object o), which defines its properties.

         */

//        List<Integer> stack=new Stack<>();
//        stack.add(3);
////      stack.push(); // we can't use push because the reference is list so we can access methods in List only.
//
//        Stack<Integer> stack1=new Stack<>();
//        stack1.add(3);
//        //Here I can use both methods because child reference can access both child and parent's methods
//        stack1.push(5);
//        System.out.println(stack1.peek()); // prints 5
//        System.out.println(stack1); //[3, 5] as we can see both elements added

        //We can also iterate over the stack elements
//        Stack<Integer> st=new Stack<>();
//        st.push(3);
//        st.push(5);
//        st.push(7);
//
//        System.out.println(st);
//
//        for (Integer p:st){
//            System.out.println(p);
//        }




    }
}
