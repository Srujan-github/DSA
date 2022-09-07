import java.util.Arrays;

public class Q7Video {
    public static void main(String[] args) {
int rot[]={4,5,1,2,6,7};//[4,5,6,7,0,1,2]
//        System.out.println(gfgans(rot,rot.length));
        System.out.println(nof(rot ));
//        int a=Arrays.binarySearch(rot,3);
//        System.out.println(a);
    }
    static int gfgans(int arr[],int n){
        int l = 0, r = n-1, mid;
        while(l < r){
            mid = (l+r)/2;
            if(arr[mid] < arr[r])
                r = mid;
            else
                l = mid+1;
        }
        return arr[l];
    }
    static int nof(int arr[]){
        int start=0;int end= arr.length-1;
        int n=arr.length;

        while (start<=end){
                //very imp condition
            if(arr[start] <= arr[end]){
                return arr[start];
            }
            int mid=start+(end-start)/2;
            int prev=(mid+n-1)%n;
            int next=(mid+1)%n;
            if(arr[mid]<=arr[prev]&&arr[next]>=arr[mid])
            {
                return n-mid;
            }else if(arr[start]<=arr[mid])start=mid+1;
            else {
            end=mid-1;
            }
        }
        return 0;
    }

}
