package com.mysite;

class Student4{

    private int rollno;
    private String name;

    Student4(String n,int rn){
        this.name = n;
        this.rollno = rn;
    }


    //over ridding object's equals method
    public boolean equals(Object obj){
        if(this.rollno == ((Student4)obj).rollno){
            return true;
        }else{
            return false;
        }
    }

    //what is hashcode? - int but like big bucket
    //do i have to override equals for hashcode? -- yes
    //can two different object have same hascode? -- yes
    //can two equal object have different hascode? -- no
    public int hashCode(){
        return this.rollno*5;
    }

}

public class TestObjectClass3 {

    public static void main(String[] args) {
        Student4 st1 = new Student4("Rajesh",101);
        Student4 st2 = new Student4("Rajesh",101);

        System.out.println(st1);
        System.out.println(st2);

        System.out.println("objects are equal? "+ st1.equals(st2));
    }
}
