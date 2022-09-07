import java.util.Arrays;
import java.util.Scanner;

public class twosumBS {
    public static void main(String[] args) {
       int a[]={1,2,3,4,5};
//        System.out.println(Arrays.toString(twoSum(a,6)));
        Scanner in=new Scanner(System.in);

        String str=in.nextLine().trim();
        int l=str.length();
        char arr[]=new char[l];
        arr=str.toCharArray();
        char n=str.charAt(1);
        char h='0';
        System.out.println((int)h);
//        System.out.println(Arrays.toString(arr));
    }
 static int[] twoSum(int[] numbers, int target) {

        int s=0, e=numbers.length-1;
        while(s<e){
            if(numbers[s]+numbers[e]>target){
                e--;
            }else if(numbers[s]+numbers[e]<target){
                s++;
            }else
            {
                //In the question says that index start from 1 not 0
                return new int[]{s+1,e+1}; // create new      array for put s & e
            }
        }
        return new int[]{};
    }
}
