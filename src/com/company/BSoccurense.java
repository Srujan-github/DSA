package com.company;
//first and last occurence of an element in array using binary serch
public class BSoccurense {
    public static void main(String[] args) {
        int e[]={1,1,2,3,3,3,3,4,56,78};
        int first=occurec(e,1,true);
        int last=occurec(e,1,false);
        System.out.println(first);
        System.out.println(last);
        //for count of occurence last-firsr+1;
        int count =last-first+1;
        System.out.println(count);
    }
    static int occurec(int[] arr,int tar,boolean toKnow)
    {
        int start=0;int end=arr.length-1;
       int res=-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == tar) {
                if (toKnow) {
                    end = mid - 1;
                } else start = mid + 1;
                res = mid;
            } else if (arr[mid] > tar) {
                end = mid - 1;
            } else start = mid + 1;

        }

        return res;
    }
}
