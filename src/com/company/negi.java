package com.company;

import java.util.Arrays;
//negitive values to a side
public class negi {
    public static void main(String[] args) {
        int ar[]={-5, 7, -3, -4, 9, 10, -1, 11};
        sac(ar,ar.length);
        System.out.println(Arrays.toString(ar));
    }
    static void sac(int arr[],int n){
        int[] temp = new int[n];
        int count = 0;

        for(int i=0; i<n; i++){
            if(arr[i]>0){
//                continue;
            temp[count] = arr[i];
            count++;}
        }

        for(int i=0; i<n; i++){
            if(arr[i]<0){
                temp[count] = arr[i];
                count++;
            }
        }

        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }


    }

}
