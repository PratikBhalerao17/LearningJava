package org.example.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Laptop",75.55f));
        products.add(new Product(2,"Mobile",76.55f));
        products.add(new Product(3,"Samsung",55.55f));
        products.add(new Product(4,"Apple",45.55f));

        //Collections.sort method has 2 version one is Collections.sort(list) which can sort in ascending
        // Collections.sort(list,comparator) which can sort based on custom condition.

        Collections.sort(products,(p1,p2)-> p1.name.compareTo(p2.name));
        products.forEach(n-> System.out.println(n.id + " " +n.name+ " " +n.price));
        /*
        4 Apple 45.55
        1 Laptop 75.55
        2 Mobile 76.55
        3 Samsung 55.55
         */
    }
}