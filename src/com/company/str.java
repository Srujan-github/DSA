package com.company;

import java.util.Scanner;

public class str {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String str=in.nextLine();
        char ch[]=str.toCharArray();
        String tr="";
        for (int i = ch.length-1; i >=0; i--) {
            tr+=ch[i];
        }
        System.out.println(tr);
    }
}
