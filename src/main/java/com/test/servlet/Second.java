package com.test.servlet;


public class Second extends First {
    public Second(){
        aMethod();
    }
    public void aMethod(){
        System.out.println("in the Second class");
    }

    public static void main(String[] args) {
        new Second();
    }
}
