package com.mysite;

import java.util.Scanner;

public class TestIfElse {

    public static boolean canIVote(int age){
        if(age >= 18){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){

        //taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = Integer.parseInt(sc.next());

        if(canIVote(age)){
            System.out.println("yes you can vote.");
        }else {
            System.out.println("no, you cann't vote.");
        }
    }
}
