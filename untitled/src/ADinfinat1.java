public class ADinfinat1 {
    public static void main(String[] args) {
        //aditya BS find first 1 in infitane binary array
        //{0,0,0,0,0,,0,0,0,0,1,1,1,,1,1,1,1,1,1,,1,1};
        //1st occurance + infinte array BS
        int a[]={0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(infinate(a,1));
    }
    static int infinate(int arr[],int tar){
        int start=0;int end=1; int res=-1;
//        //for loop
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[end]<tar){
//                start=end;
//                end*=2;
//            }else break;
//        }
//break condition is very imp
        while (tar>arr[end]){
            start=end;
            end*=2;
        }
        //BS apply
        while(start<=end){

            int mid=start+(end-start)/2;
            if(arr[mid]==tar){
                 end=mid-1;res=mid;
                            }
            else if(arr[mid]>tar)end=mid+1;else start=mid+1;
        }
        return res;
    }
}
