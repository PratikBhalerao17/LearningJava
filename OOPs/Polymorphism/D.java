package org.example.OOPs.Polymorphism;

public class D extends C{
//    public String doSomething(){
//
//    }
    // It gives the compile time error as the method inside the child class must have the same return type
    // if name and signature is same (Method overriding)

//    public String doSomething(int val, int res){
//        return "P";
//    }
    //The above is not giving compile time error as signature is different (Method overloading)

    public static void main(String[] args) {
//        A obj1 =new D();
//        obj1.doSomething(); // Inside C (As the method is overridden till we get at D)
//        // Here we can see that the datatype is A and still we are able to access the method of C only due to overridding
//        // obj1.myName(); // Gives error as datatype is A so overridden methods are special methods.
//
//        D d = new D();
//        d.doSomething(); // Inside C (As the method is overridden till we get at D)
//
//        B b = new C();
//        b.doSomething(); // Inside C (As the method is overridden till we get at C)
//
//        B b2 = new B();
//        b2.doSomething(); // Inside A (As the method is not overridden till we get at B)
//
//        A a = new A();
//        a.doSomething(); // Inside A (As the method is not overridden till we get at A)
//
//        A a2 = new B();
//        a2.doSomething(); // Inside A (As the method is not overridden till we get at B)

        // Note : For the above examples the methods where inside A and C
//
// ---------------------------------------------------------------------------------------------------------------------
        // Note : For the below examples the methods where inside B and C

        A a = new A();
        // a.doSomething(); // Compile time error as A and its parents don't have this method.
        // So the overridding are special only if we are taking the reference of class which has that method or its parents

        A c = new C();
        // c.doSomething(); // error as datatype A don't know this method.

        C c1 =new C();
        c1.doSomething(); // Inside C (datatype C and his parents have doSomething method)
    }
}
