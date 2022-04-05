package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class newone {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        while (t>0)
        {
            int s=in.nextInt();
            int n[]=new int[s];
            for (int i = 0; i < s; i++) {
                n[i]=in.nextInt();
            }
            Arrays.sort(n);
            if(n[0]==n[s-1]){
                System.out.println(s);
            }else if (n[0]<n[s-1]){
                System.out.println(s-1);
            }
//            int count=Integer.MAX_VALUE;
//            for (int i = 0; i < s; i++) {
//                count=Math.min(n[i],count);
//            }
//            System.out.println(count);

            t--;
        }

    }

}
