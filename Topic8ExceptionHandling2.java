package org.example;

import java.util.Scanner;

public class Topic8ExceptionHandling2 {
    public static void main(String[] args) throws MyException{

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the age : ");
//        try{
//            int age= sc.nextInt();
//            if(age>100){
//                throw new RuntimeException();
//            }
//        }catch(Exception e){
//            System.out.println("Exeption is handled");
//        }

        //We can throw custom exceptions with throw keyword
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age : ");
        try{
            int age= sc.nextInt();
            if(age>100){
                throw new MyException("This is exception given to me");
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
    public static class MyException extends Exception{
        public MyException(String message){
            super(message);
        }
    }
}
