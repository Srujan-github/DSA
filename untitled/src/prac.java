 

public class prac {
    public static void main(String[] args) {
    //occurences practice
    //first and last

    int ar[]={1,2,3,3,3,3,4,4,45};
    int a1=ocrence(ar,3,true);
    int a2=ocrence(ar,3,false);
//        System.out.println(a1+" "+a2);
int ar1[]={1,2,4,8,9,10};
        System.out.println(floor2(ar1,2));
    }
    static int ocrence(int arr[],int tar,boolean oc){
 int res=-1;
 int start=0;
 int end=arr.length-1;
 while (start<=end){
     int mid=start+(end-start)/2;
     if(arr[mid]==tar){
         if(oc)end=mid-1;else start=mid+1;
         res=mid;
     }
     else if(arr[mid]>tar)end=mid-1;else start=mid+1;
 }

 return res;
    }
    //flooor by aditya verma
    static int floor(int arr[],int ele){
        int res=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if (arr[mid]==ele){
                return mid;
            }
             if(arr[mid]>ele){
              end=mid-1;}
            if(arr[mid]<ele){start=mid+1;
            res=arr[mid];}

        }


   return res;
    }
    //floor by kunal kushawaha
    static int floor2(int arr[],int tar){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]>tar)end=mid-1;
            else if(arr[mid]<tar)start=mid+1;
            else return mid;
        }
        //floor ite end
        //celling ite start
        return arr[start];
    }

}
