package com.testpack;

import com.mysite.Test1;

public class TestAccess {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        //System.out.println("value of a is "+test1.a); //java: a has private access in com.mysite.Test1
        System.out.println("value of b is "+test1.b);
       // System.out.println("value of c is "+test1.c); //protected is not available outside package
    }
}
