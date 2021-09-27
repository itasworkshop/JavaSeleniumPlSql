package com.mysite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

//Employee1 is pojo
class Employee1 implements Comparable<Employee1>{

    private int id;
    private String name;

    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return id == employee1.id && Objects.equals(name, employee1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


    @Override
    public int compareTo(Employee1 obj) {
        return this.getName().compareTo(obj.getName());
    }
}

public class TestCollection5 {

    public static void main(String[] args) {

        Employee1 ep1 = new Employee1(54, "Tom");
        Employee1 ep2 = new Employee1(11, "Suraj");
        Employee1 ep3 = new Employee1(43, "Ronald");

        ArrayList<Employee1> mylist = new ArrayList<Employee1>();

        mylist.add(ep1);
        mylist.add(ep2);
        mylist.add(ep3);

        System.out.println(mylist);

        //we can not perform sorting without comparing logic
        Collections.sort(mylist);

        System.out.println(mylist);
    }

}
