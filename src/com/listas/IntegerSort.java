package com.listas;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerSort {

   public static void main(String[] args) {
       ArrayList <Integer> integer = new ArrayList<>();
       integer.add(3);
       integer.add(4);
       integer.add(1);
       integer.add(2);

       for (Integer number: integer) {
           System.out.println(number);
       }

       Collections.sort(integer);
       System.out.println(integer);
   }
}
