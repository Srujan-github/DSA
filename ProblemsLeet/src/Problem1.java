import java.util.Arrays;

public class Problem1 {
    //Date 12-04-22
//https://leetcode.com/problems/first-missing-positive/
    public static void main(String[] args) {
int ar[]={33,22,1};
cyclic(ar);
        System.out.println(Arrays.toString(ar));

    }
static int mis(int[] arr){
        return 0;
}
static void cyclic(int[] arr){
int i=0;
while (i<arr.length)
{
    int co=arr[i]-1;
    if(co< arr.length &&arr[i] != arr[co]){
        int temp=arr[co];
        arr[co]=arr[i];
        arr[i]=temp;
    }
    i++;
}

}

}
