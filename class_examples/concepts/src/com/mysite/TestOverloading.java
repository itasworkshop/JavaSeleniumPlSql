package com.mysite;

public class TestOverloading {

    //overloading --> same name methods within same class
    //we achive it by changing number or type of parameters
    public void addition(int x,int y){
        int result = x+y;
        System.out.println("the addition of "+x+" and "+y+" is : "+result);
    }

    //by changing number of parameters
    public void addition(int x,int y,int z){
        int result = x+y+z;
        System.out.println("the addition of "+x+" and "+y+" and "+z+ " is : "+result);
    }

    //by changing type of parameters
    public void addition(double x,double y){
        double result = x+y;
        System.out.println("the addition of "+x+" and "+y+" is : "+result);
    }

    public static void main(String[] args){
        TestOverloading testOverloading = new TestOverloading();
        testOverloading.addition(10,15);
        testOverloading.addition(23,34,56);
        testOverloading.addition(10.0,15.5);
    }
}
