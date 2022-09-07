package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);

        int t=in.nextInt();
        while(t>0){
            int n=in.nextInt();
            int left=in.nextInt();
        if(n>left){
            int ans;
            ans=n*2;
            ans=ans-left;
            System.out.println(ans);
        }else{
            int ans=0;
            left=left-n;
            ans=n;
            System.out.println(ans);
        }

//new
            t--;
        }
    }
}
