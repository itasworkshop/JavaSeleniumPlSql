package com.mysite;

@FunctionalInterface
interface MyInterface1{

    //public void printMe();
    public void printMe(String name);
}

public class TestJava8Lambda {

    public static void main(String[] args){
/*
        MyInterface1 obj = () -> {
            System.out.println("Hello from my functional interface inside lambda.");
        };

 */
        //lambda with parameter
        MyInterface1 obj = (n) -> {
            System.out.println("Hello from my functional interface inside lambda "+n);
        };
        obj.printMe("praveen");
    }

}
