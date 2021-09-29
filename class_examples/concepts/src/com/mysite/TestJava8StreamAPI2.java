package com.mysite;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestJava8StreamAPI2 {

    public static void main(String[] args) {
        List<Integer> mylist = Arrays.asList(1,2,34,5,6,7,56,78);

        System.out.println(mylist);

        //System.out.println(mylist.stream().map( i -> i+2));

        //mylist.stream().map( i -> i+2).forEach(j -> System.out.println(j));

        //A container object which may or may not contain a non-null value.
        Optional<Integer> maximum = mylist.stream().max((i, j) -> i.compareTo(j));

        System.out.println(maximum);

    }
}
