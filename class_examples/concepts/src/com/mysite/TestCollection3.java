package com.mysite;

import java.util.HashMap;
import java.util.Map;

class Laptop2{

    private int price;

    private String company;

    public Laptop2(int price, String company) {
        this.price = price;
        this.company = company;
    }

    //primitive integet type
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

public class TestCollection3 {

    public static void main(String[] args) {

        Laptop2 lp1 = new Laptop2(200000, "HP");
        Laptop2 lp2 = new Laptop2(25000, "ACCER");
        Laptop2 lp3 = new Laptop2(45000, "DELL");

        //wrapper class Integer --> 25 vs 25 as wrapped around object
        Map<Integer,Laptop2> mymap = new HashMap<Integer,Laptop2>();

        mymap.put(111,lp2);
        mymap.put(222,lp1);
        mymap.put(333,lp3);

        System.out.println(mymap);
    }

}
