package com.mysite;


import java.util.ArrayList;
import java.util.Collections;

public class TestJava8LambdaComparator {
    public static void main(String[] args) {

        Employee2 ep1 = new Employee2(54, "Tom");
        Employee2 ep2 = new Employee2(11, "Suraj");
        Employee2 ep3 = new Employee2(43, "Ronald");

        ArrayList<Employee2> mylist = new ArrayList<Employee2>();

        mylist.add(ep1);
        mylist.add(ep2);
        mylist.add(ep3);

        System.out.println(mylist);

        //we can not perform sorting without comparing logic
        //Collections.sort(mylist);
        //Collections.sort(mylist,new EmployeeComparator());

        //same comparator using lambda
        Collections.sort(mylist,(Employee2 o1, Employee2 o2) -> {
            return o1.getName().compareTo(o2.getName());
        });

        System.out.println(mylist);
    }
}
