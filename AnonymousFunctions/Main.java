package org.example.AnonymousFunctions;

public class Main {
    public static void main(String[] args) {
        A a = new A(){

            @Override
            void add() {
                System.out.println("Add method of abstract class is overridden");
            }
        };
        a.add(); //Add method of abstract class is overridden


        //B b = new B(); // gives error as we can't create  a object of abstract class or interface
        //But we can create anonymous class for it.
        B b = new B(){
            public void b(){
                System.out.println("b method of B class");
            }
        };
        b.b(); //b method of B class

        //we can create lambda for it too
        B blambda = () -> System.out.println("b method of B class using lambda");
        blambda.b(); //b method of B class using lambda

        Runnable r = () -> System.out.println("The current thread is "+Thread.currentThread().getName());
        Thread t1 = new Thread(r);
        t1.start(); // The current thread is Thread-0

    }

    public abstract static class A{
        abstract void add();
    }

    public interface B{
        void b();
    }
}
