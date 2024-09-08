package org.example.Generics;

public class Holder {

    private Object data;

    public void setData(Object data){
        this.data = data;
    }

    public Object getData(){
        return data;
    }

    public static void main(String[] args) {
        Holder holder = new Holder();
        holder.setData("Hello");
        //String data = holder.getData(); // java: incompatible types: java.lang.Object cannot be converted to java.lang.String
        //The error is due to we are trying to store the object inside String type without casting since object has highest scope
        // It's like saving double data into byte
        //System.out.println(holder.getData()); // Hello
        String data = (String) holder.getData(); //No error as we manually casted.
        System.out.println(data); //Hello
    }
}
