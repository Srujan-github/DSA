public class nearlysort {
    //nearly sorted array by aditya
    public static void main(String[] args) {
     int ra[]= {5,10,30,20,40,50,60,70,90,80};
     int t=80;
        System.out.println(bs(ra,t));
    }
    static int bs(int arr[],int tar){
    int start=0;
    int end=arr.length-1;
    while(start<=end){
        int mid=start+(end-start)/2;

//        if(arr[mid+1]==tar||arr[mid]==tar || arr[mid-1]==tar)return mid;
        if (arr[mid]==tar)return mid;
        if(mid+1<=end&&arr[mid+1]==tar)return mid+1;
        if(mid-1>=start&&arr[mid-1]==tar)return mid-1;
    if(arr[mid]>tar)end=mid-2;
    if(arr[mid]<tar)start=mid+2;
    }
        return -1;
    }
}
