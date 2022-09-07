package com.company;

import java.util.ArrayList;

//gfg
//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
public class ser {
    public static void main(String[] args) {
int ar[]={1,2,3,7,5};
int n=ar.length;
int s=12;
        System.out.println(subarraySum(ar,n,s));
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> list=new ArrayList<>(3);
       int st=0;
       int end=n-1;
       while (st<=end){
           int sum=0;
           for (int i = st; i <= end; i++) {
               sum+=arr[i];
           }
           if(sum==s){
               list.add(st);
               list.add(end);return list;
           }else if(sum>s){
               end--;
           }else st++;
       }
       return list;
        }



}
