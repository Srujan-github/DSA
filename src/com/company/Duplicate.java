package com.company;
//leet code 287. Find the Duplicate Number
public class Duplicate {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        System.out.println(dup(arr));
    }
    static int dup(int[] arr){
       cyclic(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i+1)return arr[i];
        }
       return 0;
    }
    static void cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int co=arr[i]-1;
            if(arr[i]!=arr[co]){
                swap(arr,i,co);
            }else{
                i++;
            }
        }
    }
    static void swap(int arr[],int fr, int sec){
        int temp=arr[fr];
        arr[fr]=arr[sec];
        arr[sec]=temp;
    }
}
