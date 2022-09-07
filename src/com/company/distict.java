package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class distict {
    public static void main(String[] args) {
int[] a={5,10,10,5,6,7};
        System.out.println(fi(a));
    }
    //no of distict values
    static int fi(int[] arr){
        Set<Integer> set=new HashSet<>();
//        ArrayList<Integer> list=new ArrayList<>(1);
        for (int e:
arr             ) {
      set.add(e);
        }

        return set.size();
    }
}
