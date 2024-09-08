package org.example.OOPs;


/*
Static variables methods we can access without an object of the Case.

Static variables will be initialized at the time of class loading ,so it increases the application start time

 */
public class StaticKeyword {

    private static int val = 200;

    private int marks = 99;
    public static void getVal(){
        System.out.println("The value is :"+val);
        //System.out.println("The value is :"+marks); //Non-static field 'marks' cannot be referenced from a static context
        // getting error as we cannot access non-static attributes inside static method
        //nonStaticMethod(); // same error
    }

    public void nonStaticMethod(){
        System.out.println("The static val is "+ val);
    }
    public static void main(String[] args) {
        System.out.println(val); //200
        getVal(); // The value is :200 (we can call static value without object)

        StaticKeyword staticKeyword = new StaticKeyword();
        staticKeyword.nonStaticMethod(); // so non-static method can access static variables but vice versa is not possible
    }
}
/*

1. public
Access Modifier: The keyword public is an access modifier, meaning that it determines the visibility of the method to other classes.
Why public?: It needs to be public because it must be accessible by the JVM from outside the class to start the application.
2. static
Non-Instance Method: static means that the method is associated with the class, rather than instances of the class. This means you don't need to create an instance of the class to call this method.
Why static?: The JVM calls this method without creating an instance of the class, which is necessary because there isn't an object of the class when the program starts.
3. void
Return Type: void indicates that the method does not return any value.
Why void?: The main method doesn't return a value to the caller, which is the JVM. Instead, it's the point of execution where the program starts.
4. main
Method Name: The name main is not a keyword in Java but is the name used by convention and recognized by the JVM as the entry point of the application.
Why main?: It's a standard that Java follows to look for a method named main as the starting execution point of the application.
5. String[] args
Parameter: args is an array of String objects, representing command-line arguments that can be passed to the application when it is invoked.
Why String[] args?: This allows users to pass initialization parameters to the program when they run it. For example, if you execute a Java class via the command line, you can pass arguments that the program can use to alter its behavior.
 */