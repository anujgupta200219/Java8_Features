package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Comparator {
    public static void main(String args[]){
        ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(6,3,5,2,8,9));
        Collections.sort(arr,(a,b)->b-a);
        System.out.println(arr);
    }
}
