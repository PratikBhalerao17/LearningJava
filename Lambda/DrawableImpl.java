package org.example.Lambda;

public class DrawableImpl implements Drawable{

    @Override
    public void Draw() {
        System.out.println("The drawing is implemented");
    }

    public static void main(String[] args) {
        int width = 10;
        //without lambda, Drawable implementation using anonymous class
        Drawable d = new DrawableImpl() {
            public void Draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.Draw();


        // with lambda
        Drawable d2 = () -> {
            System.out.println("Drawing using lambda" + width);
        };
        d2.Draw();
    }
}
