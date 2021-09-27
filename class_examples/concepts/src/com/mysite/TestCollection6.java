package com.mysite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

//how to sort collection? - using two way -- comparable and comparator
class Employee2{

    private int id;
    private String name;

    public Employee2(int id, String name) {
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
        Employee2 employee2 = (Employee2) o;
        return id == employee2.id && Objects.equals(name, employee2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

class EmployeeComparator implements Comparator<Employee2>{

    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class TestCollection6 {
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
        Collections.sort(mylist,new EmployeeComparator());

        System.out.println(mylist);
    }

}
