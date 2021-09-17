package com.mysite;

//POJO class -- plain old java objects
//getter -for getting private values
//setter -for setting private values
//accessors and mutators

class Student1{

    private int rollno;
    private String name;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}

public class TestGettersSetters {

    public static void main(String[] args){
        Student1 student = new Student1();

        //student.rollno = 101;
        //student.name = "Rajesh";
        //student.rollno++;

        student.setRollno(202);
        student.setName("Raj");

        //System.out.println(student.rollno);
        //System.out.println(student.name);

        System.out.println(student.getRollno());
        System.out.println(student.getName());
    }
}
