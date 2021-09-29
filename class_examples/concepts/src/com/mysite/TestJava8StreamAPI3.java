package com.mysite;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestJava8StreamAPI3 {
    public static void main(String[] args) {
        List<Integer> mylist = Arrays.asList(1,2,34,5,6,7,56,78);

        System.out.println(mylist);

        //map,filter and reduce
        mylist.stream().filter(i -> i%2!=0).forEach(x -> System.out.println(x));

        Optional<Integer> result = mylist.stream().reduce((i, j) -> i+j);

        System.out.println(result.get());

    }
}
