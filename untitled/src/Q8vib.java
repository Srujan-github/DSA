public class Q8vib {
    public static void main(String[] args) {
int a[]={1,1,2,2,2,0,0};
 //[1,1,2,2,2,0,0]
        //0
        System.out.println(search(a,0));
    }
    public static int search(int[] nums, int target) {
        if(nums.length<=1){
            if(nums[0]==target)return 0;
        }
        int index=rot(nums);
        int ch1=bs(nums,0,index-1,target);
        int ch2=bs(nums,index,nums.length-1,target);
        if(ch1!=-1)return ch1;else if(ch2!=-1) return ch2;else return -1;


    }
    static int rot(int arr[]){
        int start=0;
        int end=arr.length-1;
        int n=arr.length;
        while (start<=end){
            //very imp condition
            if(arr[start] < arr[end]){
                return start;
            }
            int mid=start+(end-start)/2;
            int prev=(mid+n-1)%n;
            int next=(mid+1)%n;
            if(arr[mid]<=arr[prev]&&arr[next]>=arr[mid])
            {
                return  mid;
            }else if(arr[start]<=arr[mid])start=mid+1;
            else {
                end=mid-1;
            }
        }
        return -1;
    }
    static int bs(int arr[],int start,int end,int target){

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;

}

}
