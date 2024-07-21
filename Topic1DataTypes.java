package org.example;

public class Topic1DataTypes {
    public static void main(String[] args) {
//There are two data types of categories in Java: Primitive and Non-Primitive.
//-->Primitive data types specify the size and type of variable values.
//They are the building blocks of data manipulation and cannot be further divided into simpler data types.
//There are 8 Primitive data types in Java – Boolean, char, byte, int, short, long, float, and double
/*
1. byte :	1 byte	Stores whole numbers from -128 to 127
*/
//        byte a= -128; //range 2^8 = 256 so range is -2^7 to 2^7-1
//        byte b[]=new byte[5];
//        System.out.println(b[0]); //returns 0 as default value of byte is 0
/*
2. short :	2 bytes	Stores whole numbers from -32,768 to 32,767
 */
//        short c = 32767; // range -2^15 to 2^15-1

//3. int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//        int a=1555555574;
//        System.out.println(a);
//4. long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//        long is a 64-bit signed two’s complement integer that stores values ranging from -9223372036854775808(-2^63) to 9223372036854775807(2^63 -1). It is used when we need a range of values more than those provided by int.
//        Its default value is 0L. This data type ends with ‘L’ or ‘l’.
//        long var= 45455845646545l;
////        System.out.println(var);
//
//        char []chars=new char[5];
//        System.out.println(chars[0]);
//
//        System.out.println(Integer.MAX_VALUE);
        //The precision of a floating point value indicates how many digits the value can have after the
        // decimal point. The precision of float is only six or seven decimal digits, while double variables
        // have a precision of about 15 digits. Therefore it is safer to use double for most calculations.

//        float e= 12.4F;
//        double f=22.55D;
//        double x=12e5 + .17d; //e represents power of 10
//        double y =12E5D; //E and e both are same
//        System.out.println(y);

        char a='A';
        char b='b';
        char c=65;
        char d=97;
        System.out.println(c); //op A which is ascii value 65
        System.out.println(d);//op a which is ascii value 97
        System.out.println(c+3); //op is 68 as When you add 3 to c, the char is implicitly converted to its
        // integer value (65), and then the addition is performed. So, 65 + 3 = 68.
        System.out.println(a+3); //op is still 68 as first convert to integer and then add 3
        System.out.println((char)a+3); //op 68 as only a is casted to char
        System.out.println((char) (a+3));// op D as we casted after calulation

        /*
    Non-primitive data types are called reference types because they refer to objects.

The main difference between primitive and non-primitive data types are:

Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
A primitive type has always a value, while non-primitive types can be null.
A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
         */

    }
}
