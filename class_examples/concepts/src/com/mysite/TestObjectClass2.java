package com.mysite;

class Student3{

    private int rollno;
    private String name;

    Student3(String n,int rn){
        this.name = n;
        this.rollno = rn;
    }


    //over ridding object's equals method
    public boolean equals(Object obj){
        if(this.rollno == ((Student3)obj).rollno){
            return true;
        }else{
            return false;
        }
    }

}

public class TestObjectClass2 {
    public static void main(String[] args) {
        Student3 st1 = new Student3("Rajesh",101);
        Student3 st2 = new Student3("Rajesh",101);

        System.out.println(st1);
        System.out.println(st2);

        System.out.println("objects are equal? "+ st1.equals(st2));
    }
}
