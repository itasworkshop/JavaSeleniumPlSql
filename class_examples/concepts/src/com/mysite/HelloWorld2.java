package com.mysite;


//oops says everything in this real world is object
// objects --> 1. state/properties
//              2. brhaviour/functionality
//we create objects using class
//class --> a template for creating objects --> category
//what is variable --> something which veries --> just a placeholder

//static typed language -- whenever we create variable we need to tell data type it is going to store
class Fan{

    String color = "Black";
    int price = 2500;

    public void getSwitchedOn(){
        System.out.println("getting switched on.");
    }

    public void getRotate(){
        System.out.println("rotating ............");
    }

    public void getSwitchedOff(){
        System.out.println("getting switched off.");
    }

}


public class HelloWorld2 {



    public static void main(String[] args){
        System.out.println("Hello World!!!!!!!!");

        Fan obj = new Fan();
        System.out.println("The price is "+ obj.price);
        System.out.println("The color is "+ obj.color);

        obj.getSwitchedOn(); //dot notation
        obj.getRotate();
        obj.getSwitchedOff();

    }
}
