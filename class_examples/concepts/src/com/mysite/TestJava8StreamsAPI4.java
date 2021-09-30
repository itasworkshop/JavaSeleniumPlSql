package com.mysite;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class TestJava8StreamsAPI4 {
    public static void main(String[] args) {
        List<String> mylist = Arrays.asList("sunday","monday");

        System.out.println(mylist);

        mylist.stream().forEach(i -> System.out.println(i.substring(0,1).toUpperCase()+i.substring(1)));


    }
}
