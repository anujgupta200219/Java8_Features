package org.example;

import java.util.*;

public class Comparator {
    public static void main(String args[]){
//        ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(6,3,5,2,8,9));
//        Collections.sort(arr,(a,b)->b-a);
//        System.out.println(arr);
        Map<Integer,String>map=new TreeMap<>((a,b)->b-a);
        map.put(2,"def");
        map.put(1,"abc");
        map.put(3,"hij");
        System.out.println(map);
    }
}
