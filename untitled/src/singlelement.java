public class singlelement {
    public static void main(String[] args) {
        int a[]={3,3,7,7,10,11,11};
        System.out.println(BS(a));
    }
    static int BS(int arr[]){
       int start=0;
       int end=arr.length-1;
       int n=arr.length;
       if(end==0){
           return arr[0];
       }else if(arr[start]!=arr[start+1])return arr[start];
       else if(arr[end]!=arr[end-1])return arr[end];
       while(start<=end){
           int mid=start+(end-start)/2;
           int prev=(mid+n-1)%n;
           int next=(mid+1)%n;
       if(arr[prev]!=arr[mid]&&arr[mid]!=arr[next]){
           return arr[mid];
       }
       //very imp
       else if(((mid%2)==0 && arr[mid]==arr[next])
               ||  ((mid%2)==1 && arr[mid]==arr[prev])){
         start=mid+1;
       }else     end=mid-1;
       }

        return -1;
    }
}
