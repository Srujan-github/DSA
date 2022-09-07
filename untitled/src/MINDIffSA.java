public class MINDIffSA {
    //given a sorted array aand ele ,now we have to find min diff ele in array
    //floor and BS
    public static void main(String[] args) {
        int arr[]={1,3,8,10,15};
        System.out.println(floor(arr,12));
    

    }
    static int floor(int arr[],int tar){
       int res=-1;
       int start=0;int end=arr.length-1;
       while(start<=end){
           int mid=start+(end-start)/2;
           if(arr[mid]==tar)return arr[mid];
           if(arr[mid]>tar){
               end=mid-1;res=arr[end];
           }else if(arr[mid]<tar){
//               System.out.println();
start=mid+1;

           }
       }

        return res;
    }
}
