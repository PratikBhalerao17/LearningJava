package org.example;

public class DataTypes {
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
//        System.out.println(b[0]);
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
        long var= 45455845646545l;
//        System.out.println(var);

        char []chars=new char[5];
        System.out.println(chars[0]);
    }
}
