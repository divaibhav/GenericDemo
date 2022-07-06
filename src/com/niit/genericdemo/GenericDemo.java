package com.niit.genericdemo;

public class GenericDemo {
    public static void main(String[] args) {
        GenericDemo genericDemo = new GenericDemo();
        genericDemo.<String>display("Hello");
    }
    public <M> M display(M t){

        return t;
    }
}
