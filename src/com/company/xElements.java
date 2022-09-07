package com.company;

public class xElements {
    public static void main(String[] args) {
int r[]={0,4,3,0,4};
        System.out.println(ch(r));
    }
    static int ch(int[] arr){
        int i=0;
        while (i<=arr.length){
            int c=0;
            for (int j = 0; j < arr.length; j++) {
                if(i<=arr[j])c++;
            }
            if (i==c && c!=0)return c;
            i++;
        }
        return -1;
    }
}
