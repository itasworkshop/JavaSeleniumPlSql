package com.mysite;

//what is object class?
//parent of all the classes in java
//toString() --> objects representation
class Student2{

    //int rollno = 101;
    private String name;

    Student2(String n){
        this.name = n;
    }

    //over riding object's toString for our Student2 class
    public String toString(){
        return this.name;
        //return "rollno - "+this.rollno;
    }

}

public class TestObjectClass {

    public static void main(String[] args) {
        Student2 st1 = new Student2("Rajesh");
        Student2 st2 = new Student2("Suresh");

        System.out.println(st1); //it will hashcode
        System.out.println(st2);

    }
}
