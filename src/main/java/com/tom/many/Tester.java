package com.tom.many;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList <Integer> list  =new ArrayList() ;
        list.add(5);



        //array();
    }

    private static void array() {
        int [] numbers = new int[5];
        numbers [0] =4;
        //    nubers [5] = 7 ;
        int [] score =  {66 , 88 , 55 , 99 ,6};
        System.out.println(score);
        for (int i=0 ;i<5 ;i++) {
            System.out.println( score [i]);
        }
        for ( int n :score ) {
            System.out.println( n );
        }
    }
}
