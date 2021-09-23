package com.mysite;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestCollection2 {
    public static void main(String[] args) {
        //collection of objects

        Laptop lp1 = new Laptop(200000, "HP");
        Laptop lp2 = new Laptop(25000, "ACCER");
        Laptop lp3 = new Laptop(45000, "DELL");

        System.out.println(lp1);
        System.out.println(lp2);
        System.out.println(lp3);

        //Organise your multiple laptops as list
        //list data structure --> list of items-- duplicates are allowed
        //LinkedList
        List<Laptop> mylist = new LinkedList<Laptop>();
        mylist.add(lp3);
        mylist.add(lp2);
        mylist.add(lp1);

        System.out.println(mylist);

    }
}
