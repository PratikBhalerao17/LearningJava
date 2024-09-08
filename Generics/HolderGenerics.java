package org.example.Generics;

/*
HolderGenerics<T> is a generic class where T is a type parameter that will be replaced by a real type when an object
of HolderGenerics is created.
 */
public class HolderGenerics<T> {

    private T data;

    public void setData(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public static void main(String[] args) {
        HolderGenerics<String> holder = new HolderGenerics();
        holder.setData("Hello");
        // holder.setData(123); // will give error because type is set to string
        String data = holder.getData(); // No need to type cast
        //Elimination of Casting: With generics, there is no need to cast the object when retrieving it.
        // The return type of get() is T, which in the case of stringHolder is String. This avoids potential runtime
        // exceptions due to incorrect casting.
        System.out.println(data); //Hello

        /*
Code Reusability: The same Holder class can be used to hold any type of object without modifying its implementation.
For example, you can create a Holder<Integer> to hold integers, or a Holder<List<String>> to hold a list of strings,
 using the same class definition.
         */

    }
}
