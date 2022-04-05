package com.company;

import java.util.ArrayList;

public class idea {
    public static void main(String[] args) {
   int[][] a={{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(ok(a));
        int ar[]={5,15 ,14,1,1,13,11,14,2,15,12};
        int l=ar.length;
        System.out.println(peek(ar,l));
    }
    static int peek(int arr[],int n){
     int peek=Integer.MIN_VALUE;
     int in=0;
        for (int i = 0; i < n; i++) {

                if(arr[i]>peek){

                    peek= arr[i] ;
                    in=i;
            }
        }


        return in;
    }
    static ArrayList<Integer> ok(int[][] arr){
        ArrayList<Integer> list=new ArrayList<>(3);
        int n= arr.length;
        int m= arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                list.add(arr[i][j]);

            }

        }
        return list;

    }
}
