package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problems {
    public static void main(String[] args) {
int a[]={1,1};
int b[]={2,2};
        System.out.println(Arrays.toString(Fa2(a,b)));
    }
    static int[] Fa(int a[],int b[]){
       Set<Integer>list=new HashSet<>();
        int[] ans=new int[2];
        int sum1=0;
        int sum2=0;
        for(int x:a){
            sum1+=x;
        }
        for(int x:b){
            sum2+=x;
            list.add(x);
        }
        int dif=(sum2-sum1)/2;
      for(int x:a){
          if(list.contains(x+dif)){
              ans[0]=x;
              ans[1]=x+dif;
              break;
          }
      }

        return ans;
    }
    static int[] Fa2(int a[],int b[]){
       ArrayList<Integer>list=new ArrayList<>(3);
        int[] ans=new int[2];
        int sum1=0;
        int sum2=0;
        for(int x:a){
            sum1+=x;
        }
        for(int x:b){
            sum2+=x;
            list.add(x);
        }
        int dif=(sum2-sum1)/2;
      for(int x:a){
          if(list.contains(x+dif)){
              ans[0]=x;
              ans[1]=x+dif;
              break;
          }
      }

        return ans;
    }


}
