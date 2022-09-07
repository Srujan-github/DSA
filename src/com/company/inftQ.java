package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class inftQ {
    public static void main(String[] args) {
        int ar[]={-1,-5,3,6,5,90,8};
//        System.out.println(ar.length);
        System.out.println(Arrays.toString(dif(ar)));
    }
    static int[] dif(int[] arr){
        if(arr.length==0)return new int[]{};
//        if(arr.length==1)return new int[]{};
       int pos=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                if(arr[i]==arr[pos]){
                    pos++;
                }else {
                    int temp=arr[pos];
                    arr[pos]=arr[i];
                    arr[i]=temp;
                }
            }
        }

//        ArrayList<Integer> list=new ArrayList<>(3);
        int h=0; int y=1; int ar[]=new int[arr.length-1];
        int i=0;
        while (h< arr.length && y<arr.length && i< ar.length){

            int n1=arr[y];
            int n2=arr[h];
            if((n1-n2)>1){
                ar[i]=fun(n2,n1);

            }else{
//                list.add(0)
            ar[i]=0;
            }
            h++;  y=h+1;i++;
        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                int n1=arr[j-1];
//                int n2=arr[j];
//                if((n2-n1)>0){
//                    list.add(fun(n2,n1));
//                }else{
//                    list.add(0);
//                }
//            }
//        }
//       Object[] objects= list.toArray();
        return ar;
    }

    static int fun(int n,int n1){
        int sum=0;
                ++n;
        while (n<n1){

            sum+=n;
            n++;
        }
        return sum;
    }
}
