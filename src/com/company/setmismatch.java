package com.company;

import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch/
public class setmismatch {
    public static void main(String[] args) {
int q[]={4,2,2,1};
cyclic(q);
int arr[]=new int[2];
        for (int i = 0; i < q.length; i++) {
            if(q[i]-1!=i){
                arr[0]=i;
            }
        }
        arr[1]=arr[0]+1;
        System.out.println(Arrays.toString(arr));
    }
 static void cyclic(int[] arr){
        int i=0;
        while (i<arr.length){
            int co=arr[i]-1;
            if(arr[i]!=arr[co]){
                swap(arr,i,co);
            }else i++;
        }
 }

     static void swap(int[] arr, int i, int co) {
        int temp=arr[i];
        arr[i]=arr[co];
        arr[co]=temp;
    }
}
