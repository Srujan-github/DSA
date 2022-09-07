package com.company;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.ArrayList;
import java.util.List;

class disapper {
    public static void main(String[] args) {
        int arr[]={1,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
ArrayList<Integer> list=new ArrayList<>(3);
cyclic(arr);
for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i+1) list.add(i+1);
        }

       return list;
    }
    static void cyclic(int arr[]) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int co = arr[i]-1;
            if (co< n&& arr[i]!=arr[co]) {
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