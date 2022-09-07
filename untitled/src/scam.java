public class scam {
    public static void main(String[] args) {
int r[]={4,5,6,7,0,1,2};//[4,5,6,7,0,1,2]
        System.out.println(ans(r));
        System.out.println(nof(r));
    }
    static int ans(int nums[]){
        int l =0, len = nums.length, r = len-1;
         int res = nums[l];
         int prev, next;
         while(l<=r){
             //when array is already sorted
             if(nums[l] <= nums[r]){
                 return nums[l];
             }

             int mid= l+ (r-l)/2;
             prev = (mid+len-1)%len;
             next = (mid+1)%len;

             //mid is less then the prev and the next element
             if(nums[mid]<= nums[prev] && nums[mid] <= nums[next]){
                 return nums[mid];
             }
             else if(nums[mid] >= nums[l]){
                 l = mid+1;
             }
             else {
                 r= mid-1;
             }

         }

         return res;
    }
    static int nof(int arr[]){
        int start=0;int end= arr.length-1;
        int n=arr.length;
        int res=arr[start];
        while (start<=end){
            int mid=start+(end-start)/2;
            int prev=(mid+n-1)%n;
            int next=(mid+1)%n;
            if(arr[mid]<=arr[prev]&&arr[mid]<=arr[next])
            {
                return arr[mid];
            }
            else if(arr[mid] >= arr[start]){
                start = mid+1;
            }
            else {
                end= mid-1;
            }
            // }else if(arr[mid]>=arr[start])start=mid+1;
            // else {
            // end=mid-1;
            // }
        }
        return res;
    }
}
