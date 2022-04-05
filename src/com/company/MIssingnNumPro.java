package com.company;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number/
public class MIssingnNumPro {
    public static void main(String[] args) {
        int[] arr={3,0,1};
//        int n=arr.length;
         cyclic(arr);

        System.out.println(Arrays.toString(arr));
    }

    static int mis(int arr[]){
        cyclic(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i)return i;
        }
        return arr.length;
    }
    static void cyclic(int arr[]) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int co = arr[i];
            if (arr[i]<arr.length && arr[i]!=arr[co]) {
                swap(arr,i,co);
            } else {
                i++;
            }
        }
    }
    static void swap ( int a[], int st, int end){
        int temp = a[st];
        a[st] = a[end];
        a[end] = temp;

    }

}
