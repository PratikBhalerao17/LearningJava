package org.example.OOPs;

public class CopyConstructor {

    int val;
    String name;

    public CopyConstructor(CopyConstructor obj){
        this.name = obj.name;
        this.val = obj.val;
    }

    public CopyConstructor(int val , String name){
        this.name=name;
        this.val=val;
    }
    public static void main(String[] args) {
        /*
If we need to copy a constructor we need to write separate logic for it . we can't do by referencing because that
won't be a copy and we refer to the same object only.
         */
        CopyConstructor obj = new CopyConstructor(100,"Pratik");
        System.out.println(obj.toString()); //org.example.OOPs.CopyConstructor@4dd8dc3
        System.out.println(obj.val+" "+obj.name); //100 Pratik

        //Now to copy the values of other object we can call custom constructor with that object

        CopyConstructor obj1 = new CopyConstructor(obj);
        System.out.println(obj1);
        System.out.println(obj1.val+" "+obj1.name); // 100 Pratik
        // obj1 has same values as obj so we have copied it perfectly.

        System.out.println(obj1.name.hashCode()); //-1896349257
        System.out.println(obj.name.hashCode());  //-1896349257
        // The hash code itself is a derived numerical value that represents the object but is not an address and does not
        // provide the ability to manipulate the object directly.
        // We can see the hashcode for name is same for both the objects it means it is pointing to same location.
        // As name is string which holds a memory address and not the actual value. So both object points to same memory address


        obj.name = "Ruturaj";
        System.out.println(obj.name); //Ruturaj
        System.out.println(obj1.name); //Pratik
        //The obj1.name is not changed because strings are immutable in nature else it would have been changed

//        Shallow Copy :
//        when we have created a copy object internally they both points to same memory location for
//        Non primitive attributes it is called as Shallow copy.
//        Here while creating the copy object internally name attribute of both the objects points to same memory address.
//        This is an example of shallow copy.

//        Deep Copy :
//        It is almost impossible to create deep copy.
//        No shared objects or reference.
//
//        Lazy copy :
//        Apart from deep and shallow copy, there is another term called lazy copy.
//        Lazy copy is, in fact, the mixture of the deep and shallow copy.
//        In lazy copy, the shallow copy is used at the starting stage.
//        When one modifies the original content, the program checks whether the content is shared among the other objects or
//        not with the help of a counter. If the content is shared, then the deep copy mechanism is applied.

//   Java always send value to the function using pass by value only.
//   https://sentry.io/answers/java-pass-by-reference-or-value/# refer to this link for detail analysis.
//   Pass-by-reference: When a method is called, the method arguments reference the same variable in memory as the caller.
//   Pass-by-value: When a method is called, the caller passes a copy of the argument variables to the method resulting
//   in two values in memory.
//   Although the objects or non primitives in java holds the reference and we can still achieve the functionality of
//   call by reference using these non primitive objects. But not exactly the same because in the stack there are 2
//   different reference variables.

    }
}
