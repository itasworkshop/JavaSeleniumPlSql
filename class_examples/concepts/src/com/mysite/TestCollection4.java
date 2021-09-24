package com.mysite;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//set --> unique items
//POJO class
class Laptop3{

    private int price;

    private String company;

    public Laptop3(int price, String company) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop3 laptop3 = (Laptop3) o;
        return price == laptop3.price && Objects.equals(company, laptop3.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, company);
    }
}

public class TestCollection4 {
    public static void main(String[] args) {
        Laptop3 lp1 = new Laptop3(200000, "HP");
        Laptop3 lp2 = new Laptop3(25000, "ACCER");
        Laptop3 lp3 = new Laptop3(25000, "ACCER");

        Set<Laptop3> myset = new HashSet<Laptop3>();
        //Set<String> myset = new HashSet<String>();

        myset.add(lp1);
        myset.add(lp2);
        myset.add(lp3);

        System.out.println(myset);
    }


}
