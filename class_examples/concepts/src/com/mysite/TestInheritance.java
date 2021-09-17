package com.mysite;

class User{

    int aadhar;
    String name;

    User(int aadhar,String name){
        this.aadhar = aadhar;
        this.name = name;
    }

    public void myIntro(){
        System.out.println("Hey this is user, "+this.name+" aadhar is "+this.aadhar);
    }
}

//By inheritance we
class Student extends User{

    int marks;

    Student(int aadhar, String name,int marks) {
        super(aadhar, name); //super referes to parent object
        this.marks = marks;
    }

    //over ridding -- same name methods with different implementation in terms of inheritance
    public void myIntro(){
        System.out.println("Hey this is user, "+this.name+" aadhar is "+this.aadhar+" and my marks are "+this.marks);
    }
}

class Employee extends User{

    int salary;

    Employee(int aadhar, String name,int salary) {
        super(aadhar, name); //super referes to parent object
        this.salary = salary;
    }

    //over ridding -- same name methods with different implementation in terms of inheritance
    public void myIntro(){
        System.out.println("Hey this is user, "+this.name+" aadhar is "+this.aadhar+" nonsensssssss "+this.salary);
    }
}

public class TestInheritance {

    public static void main(String[] args){
        User user = new User(101,"Rajesh");
        user.myIntro();

        Student student = new Student(102,"Suraj",83);
        student.myIntro();

        Employee employee = new Employee(103,"Tom",60000);
        employee.myIntro();
    }


}
