import java.util.Arrays;

public class Problem4 {
    //https://leetcode.com/problems/product-of-array-except-self/
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        System.out.println(Arrays.toString(  fi(a)));
    }
    static int[] fi(int[] arr){
        int l[]=new int[arr.length];
        int r[]=new int[arr.length];
        int p=1;
        for (int i = 0; i < arr.length; i++) {
            l[i]=p;
            p*=arr[i];

        }
        int h=1;
        for (int i = arr.length-1; i >=0; i--) {
            r[i]=h;
            h*=arr[i];

        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=l[i]*r[i];
        }
   return arr;
    }
}
