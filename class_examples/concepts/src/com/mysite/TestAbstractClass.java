package com.mysite;

//abstract as well as non abstract methods
abstract class MyAbstractClass{

    public abstract String printMe();

    public String printMeNormal(){
        return "hello from concrete method";
    }


}

//one class can extend only one parent class
public class TestAbstractClass extends MyAbstractClass{
    public static void main(String[] args){
        TestAbstractClass obj = new TestAbstractClass();
        System.out.println(obj.printMe());
        System.out.println(obj.printMeNormal());

    }

    @Override
    public String printMe() {
        return "hello from implemented method";
    }
}
