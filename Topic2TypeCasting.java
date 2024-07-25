package org.example;

public class Topic2TypeCasting {
    public static void main(String[] args) {
        /*
Type casting is when you assign a value of one primitive data type to another type.
In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double (bs cha ithe lfda)

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte

//         */
//        int yInt = 9;
//        double yDouble = yInt; // Automatic casting: int to double
//        System.out.println(yDouble);
//        /*
//Narrowing Casting
//Narrowing casting must be done manually by placing the type in parentheses () in front of the value:
//         */
//        double myDouble = 9.78d;
//          double val=78;
//          int a=val; //error
//        java: incompatible types: possible lossy conversion from double to int
//        int myInt = (int) myDouble; // Manual casting: double to int
//        System.out.println(myInt); //op 9
//
//        int a=45454545;
////        byte b=a; //It gives error as we can't assign bigger data type to smaller directly
//        byte b=(byte)a;
//        /*
//        First convert integer to 32 bit binary then take least significant 8 bits as byte range is 8 bit.
//        Make it 2's complement if 8 bit's most significant bit is 1 then answer is neagative else positive
//         */
//        System.out.println(b); //here ans is -47

////        bs ch ithe lfd
//        int a=65;
////        char b=a; //error as int is higher
//        char b=(char)a; //will print char of ascii value 65 as a is 65
//        System.out.println(b); // ans is A

//        int a= 9465499;
//        char b=(char) a; //converted decimal is 7547
//        System.out.println(b); //charcter at that decimal is 溛
        /*
        When you cast an int to a char in Java, only the lower 16 bits of the integer value are used to
        determine the char value as char limit is 2bytes. This is because a char in Java is a 16-bit unsigned
         Unicode character. As char is unsigned the limit is from 0 to 65,535(2^16-1)
        So after the extraction of 16 bits converted to decimal and then print the unicode belongs to that.
         */
    }
}
