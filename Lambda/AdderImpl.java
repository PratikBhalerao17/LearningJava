package org.example.Lambda;

public class AdderImpl implements Adder{
    @Override
    public int add(int a, int b) {
        return 0;
    }


    public static void main(String[] args) {
        // This is how we can pass multiple parameters and return value
        // This is with return keyword
        Adder a = (p,q) ->{
            //System.out.println("The addition is "+(p+q));
            return p+q;
        };
        System.out.println(a.add(5,6));

        //Without return
        Adder b = (p,q) -> (p+q);
        System.out.println(b.add(15,6));
    }
}
