package com.mysite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TestJava8StreamAPI5 {
    public static void main(String[] args) {
        //{"Rajesh":[67,78,65]}
        HashMap<String, ArrayList<Integer>> stMap1 = new HashMap<String, ArrayList<Integer>>();
        HashMap<String, ArrayList<Integer>> stMap2 = new HashMap<String, ArrayList<Integer>>();
        HashMap<String, ArrayList<Integer>> stMap3 = new HashMap<String, ArrayList<Integer>>();

        ArrayList<Integer> stMarks1 = new ArrayList<>();
        ArrayList<Integer> stMarks2 = new ArrayList<>();
        ArrayList<Integer> stMarks3 = new ArrayList<>();

        stMarks1.add(67);
        stMarks1.add(78);
        stMarks1.add(83);

        stMarks2.add(57);
        stMarks2.add(68);
        stMarks2.add(73);

        stMarks3.add(87);
        stMarks3.add(58);
        stMarks3.add(63);

        stMap1.put("Rajesh",stMarks1);
        stMap2.put("Suresh",stMarks2);
        stMap3.put("Tom",stMarks3);

        System.out.println(stMap1);
        System.out.println(stMap2);
        System.out.println(stMap3);

        List<HashMap<String,ArrayList<Integer>>> studentlist = Arrays.asList(stMap1,stMap2,stMap3);

        System.out.println(studentlist);

        studentlist.stream().forEach(st -> {
            st.values().stream().forEach(i -> {
                System.out.println(i.stream().max((k, j) -> k.compareTo(j)));
            });
        });


    }
}
