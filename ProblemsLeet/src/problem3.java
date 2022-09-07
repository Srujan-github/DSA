import java.util.Arrays;

public class problem3 {
    //https://leetcode.com/problems/product-of-array-except-self/
    public static void main(String[] args) {
        int a[]={-1,1,0,-3,3};
//        int a[]={1,2,3,4};
        System.out.println(Arrays.toString(scam(a)));
//        System.out.println(addp(a,4));
    }
    static int[] scam(int[] arr){
        int i=0;
        int ar[]=new int[arr.length];
        for (int j = 0; j < ar.length; j++) {
            ar[j]=addp(arr,i);
            i++;
        }
        return ar;
    }
    static int addp(int[] a,int i){
        int pr0=1;
        int n=a.length;int j = i+1;if(j>=n)j=j%n;
        while (j!=i) {
            pr0*=a[j];j++;
            if(j>=n)j=j%n;
        }
        return pr0;
    }
}
