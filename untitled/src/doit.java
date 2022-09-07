import java.util.Arrays;

public class doit {
    public static void main(String[] args) {
//     int arr[][]={{ 4,5},{2,3},{1,2}};
//
//     //[3,4],[2,3],[1,2] [[4,5],[2,3],[1,2]]
//       System.out.println(Arrays.toString( ansd(arr)));
//        System.out.println(staeps(5));
    
    }
     static int[] ansd(int arr[][]){
        int n=arr.length;
int[] ans=new int[n];
int start[]=new int[n];
int tar[]=new int[n];
         for (int i = 0; i < n; i++) {

                 start[i]=arr[i][0];
                 tar[i]=arr[i][1];

         }
         for (int i = 0; i < n; i++) {
             int ind=forser(start,tar[i]);
 if(ind!=-1)ans[i]=ind;else ans[i]=-1;

         }


        return  ans;
     }
     static int forser(int ar[],int tar){
        for (int i=0;i<ar.length;i++)if(ar[i] ==tar)return i;
        return -1;
     }
static int staeps(int target){
        target = Math.abs(target);
        int sum =0;
        int steps =0;
        while(sum<target){
            steps++;
            sum+=steps;
        }
        while((sum-target)%2!=0){
            steps++;
            sum+=steps;
        }
        return steps;
    }

    }


