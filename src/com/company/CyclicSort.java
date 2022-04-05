package com.company;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={3,1,4,2,5};
        int n=arr.length;
    int i=0;
     while (i<n){
         int co=arr[i]-1;
         if(arr[i]!=arr[co]){
             int temp=arr[co];
             arr[co]=arr[i];
             arr[i]=temp;
         }
         else
         {
             i++;
         }

     }


        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int arr[]) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int co = arr[i];
            if ( arr[i]>n &&arr[i] != arr[co]) {
                swap(arr, co , i );
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
