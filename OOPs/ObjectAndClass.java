package org.example.OOPs;

public class ObjectAndClass {
//    int a;
//    String name;
    int a = 100;
    String name = "Pratik";

    public ObjectAndClass(int a, String name){
        this.a = a;
        // this is used to refer left side a as the current object parameter
        this.name = name;
    }

    public ObjectAndClass(){

    }
    public static void main(String[] args) {
        /*
 software system should have entities each entity can have attributes or behaviours.
  Anything in my stw system is an idea an idea will have attributes or behaviours or both
 Class is a blueprint for such entities.
 Class takes no space in a memory but object takes which is a real instance of a class.
         */
        ObjectAndClass obj = new ObjectAndClass();
        //ObjectAndClass() is a default constructor which  An object is created in the memory with attribute values as default values
        // new assigns memory
        // obj is a reference variable
        // ObjectAndClass data type here we have class data type
        // If we have custom constructor then also mention the default constructor else we'll get an error.
        System.out.println(obj); // prints org.example.OOPs.ObjectAndClass@4dd8dc3
        System.out.println(obj.name + obj.a); // null0 as no value is assigned
        System.out.println(obj.name + obj.a); // Pratik100 after assigning the value


        ObjectAndClass obj1 = new ObjectAndClass(200,"Akshay");
        System.out.println(obj1.a+" "+obj1.name); // 200 Akshay


        System.out.println(obj.toString()); //org.example.OOPs.ObjectAndClass@4dd8dc3
        System.out.println(obj1.toString()); // org.example.OOPs.ObjectAndClass@312b1dae

        ObjectAndClass obj2 = obj1; // we are assigning the refernce of obj1 to obj2 to no new object is created only refer
        // to same object inside heap memory.

        System.out.println(obj2.toString()); // org.example.OOPs.ObjectAndClass@312b1dae

        //we can also modify the values using this new reference
        obj2.name = "Pratik";
        obj2.a = 100;
        //This will now change for both obj1 and obj2

        System.out.println(obj2.name + " " + obj2.a); //Pratik 100
        System.out.println(obj1.name + " " + obj1.a); //Pratik 100

        System.out.println(obj1 == obj2); //true
        System.out.println(obj == obj1); //false

    }
}
