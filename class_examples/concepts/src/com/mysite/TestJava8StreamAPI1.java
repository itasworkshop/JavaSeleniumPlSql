package com.mysite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Filter<T>{
    boolean filter(T t);
}

class FilterHelper{

    public static <T> List<T> filter(List<T> input, Filter<T> filter){
        List<T> result = new ArrayList<T>();

        for(T t:input){
            if(filter.filter(t)){
                result.add(t);
            }
        }
        return result;
    }

}

public class TestJava8StreamAPI1 {
    public static void main(String[] args) {
        List<Integer> mylist = Arrays.asList(1,2,34,5,6,7,56,78);

        System.out.println(mylist);

        List<Integer> output = FilterHelper.filter(mylist, (Integer i) -> {
            return i%2 == 0;

        });

        System.out.println(output);

        mylist.stream().map(x -> x*2).forEach(i -> System.out.println(i));

    }

}
