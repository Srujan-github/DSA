package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaxPrime {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int m=n;int s=0;
        int ji=n;
        while (m>0){
            m/=10;
            s++;
        }
        int arr[]=new int[s];
        for (int i = s-1; i >=0; i--) {
            arr[i]=n%10;
            n/=10;
        }
int nu=0;
        while (nu<ji){
            int i=0;
            while (i<s){

                i++;
            }
            nu++;
        }



    }
    static Boolean isPrime(int n){
     if (n==0 || n==1){
         return false;
     }if(n==2){
         return true;
        }
     int c=0;
        for (int i = 2; i < n; i++) {
            if(n%i==0)c=1;
        }
        if(c==0){
            return true;}
        return false;
    }
}
