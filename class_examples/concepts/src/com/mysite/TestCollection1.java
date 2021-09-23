package com.mysite;

//collection API

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Laptop{

    private int price;

    private String company;

    public Laptop(int price, String company) {
        this.price = price;
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + price +
                ", company='" + company + '\'' +
                '}';
    }
}

public class TestCollection1 {

    public static void main(String[] args){
        //collection of objects

        Laptop lp1 = new Laptop(200000,"HP");
        Laptop lp2 = new Laptop(25000,"ACCER");
        Laptop lp3 = new Laptop(45000,"DELL");

        System.out.println(lp1);
        System.out.println(lp2);
        System.out.println(lp3);

        //Organise your multiple laptops as list
        //list data structure --> list of items-- duplicates are allowed
        //ArrayList is more powerful ,no predefined size
        List<Laptop> mylist = new ArrayList<Laptop>();
        mylist.add(lp1);
        mylist.add(lp2);
        mylist.add(lp3);

        System.out.println(mylist);

        for (Laptop lp: mylist) {
            System.out.println(lp);
        }

        mylist.remove(lp1);

        System.out.println(mylist);

        mylist.add(lp1);
        System.out.println(mylist);

        Iterator<Laptop> itr = mylist.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //System.out.println(itr.next());


    }
}
