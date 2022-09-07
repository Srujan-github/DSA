package com.company;

import java.util.ArrayList;
import java.util.Arrays;
// we need to come back again
public class SubarraySum {
    public static void main(String[] args) {
        int ar[]={1,2,3,7,5};
        int t=128;
        System.out.println( (subsum(ar,t)));
    }
    //retuen index piar
    static ArrayList<Integer> subsum(int[] arr,int tar){
        ArrayList<Integer> list=new ArrayList<>(3);
        int i=0;
        int start=0;
        int sum=0;
        int n=arr.length;
        while (i<n){
            if(sum==tar){
                list.add(start);
                list.add(i-1);
                return list;}
            else if(sum<tar){
                sum+=arr[i];++i;
            }else {
                sum=sum-arr[start];start++;
            }
        }

        return  new ArrayList<Integer>(1);
    }
    static int sum(int a[],int i,int j){
        int sum=0;
        for (int k = i; k <=j; k++) {
            sum+=a[i];
        }
        return sum;
    }
}
