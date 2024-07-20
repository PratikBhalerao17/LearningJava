package org.example;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Topic8ExceptionHandling {
    /*
Exception is an event that disrupts the normal flow of a program's instructions.Handling exceptions properly allows
a program to continue running or terminate gracefully, even when encountering errors.
Types of Exceptions in Java
Java exceptions are categorized into three types:

Checked Exceptions: These are exceptions that are checked at compile-time. They must be either caught within a
try block using a catch clause or declared to be thrown in the method's signature with a throws clause.
Examples include IOException and SQLException.

Unchecked Exceptions: These exceptions are not checked at compile time, meaning the compiler does not require
methods to catch or declare them. Unchecked exceptions are derived from the RuntimeException, and common examples
include NullPointerException, ArithmeticException, etc.

Errors: These are not typically trapped within the application code, as they are used by the JVM to indicate
problems that a typical application should not try to catch. Examples include OutOfMemoryError and StackOverflowError.
     */

    public static void main(String[] args) {
        int a[]=new int[5];
//        System.out.println(a[8]); // will give ArrayIndexOutOfBoundsException

        try{
            System.out.println(a[8]);
//        }catch (Exception e){
//            System.out.println(e.fillInStackTrace()); //java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 5
//
        }
        //We can have multiple catch blocks
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception is handled by ArrayIndexOutOfBoundsException");
        }
        catch (ArithmeticException e){
            System.out.println("Exception is handled by ArithmeticException");
        }
        catch(NullPointerException e){
            System.out.println("Exception is handled by NullPointerException");
        }
        catch(RuntimeException e){
            System.out.println("Exception is handled by RuntimeException");
        }
        catch(Exception e){
            System.out.println("Exception is handled by Exception");
        }
        //Under catch blocks multiple exception should be in ascending order else we'll get compile time error
        finally {
            System.out.println("Close all the connections");
        }

        //Finally block should present only once we can have multiple catch blocks.
        //Try can have present without catch block but for catch try must be there.

    }

}
