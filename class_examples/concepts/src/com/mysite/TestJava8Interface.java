package com.mysite;

//Functional Interface -- with just one method

@FunctionalInterface
interface MyInterface{

    public void printMe();
}

public class TestJava8Interface implements MyInterface{
    @Override
    public void printMe() {
        System.out.println("Hello from my functional interface.");
    }

    public static void main(String[] args){
        TestJava8Interface obj = new TestJava8Interface();
        obj.printMe();
    }
}
