package com.company;

import java.util.Arrays;

public class checkExist {
    public static void main(String[] args) {
        int a[]={-2,0,10,-19,4,6,-8};
        for (int i = 0; i < a.length; i++) {
           int r=a[i]*2;
           int j=Ser(a,r);
           if(i!=j) System.out.println(true);


        }
    }

    static int Ser(int arr[],int targert){
       Arrays.sort(arr);
        int start=0; int end=arr.length-1;
       int i=0;
       while (start<=end){
           int mid=start+(end-start)/2;
           if(arr[mid]==targert){
               return mid;
           }else if(arr[mid]>targert){
               end=mid-1;
           }else start=mid+1;
       }

        return -1;
    }
}
