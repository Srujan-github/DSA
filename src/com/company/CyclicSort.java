package com.company;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={3,2,1};
//        int n=arr.length;
//    int i=0;
//     while (i<n){
//         int co=arr[i]-1;
//         if(arr[i]!=arr[co]){
//             int temp=arr[co];
//             arr[co]=arr[i];
//             arr[i]=temp;}
//         else
//         {
//             i++;
//         }
//     }
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void cyclic(int arr[]) {
//        int n = ;
        int i = 0;
        while (i < arr.length) {
            int co = arr[i]-1;
            if ( arr[i] != arr[co]) {
                swap(arr, i , co);
            } else {
                i++;
            }
        }

    }
        static void swap ( int a[], int st, int end){
            int temp = a[end];
            a[end] = a[st];
            a[st] = temp;

        }

    }
