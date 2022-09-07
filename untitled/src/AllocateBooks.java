public class AllocateBooks {
    public static void main(String[] args) {
    int a[]={1,2,3,4,5,6,7,8,9};
    int k=5;
    int res=-1;
    int n=a.length;
    int maxinarr=a[0];
        for (int i:a)
             {
            maxinarr=Math.max(i,maxinarr);
        }
        int sumofele=0;
        for (int j:a)
        {
            sumofele+=j;
        }
    int start=maxinarr;int end= sumofele;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(isVaild(a,mid,k,n)){
            res=mid;
            end=mid-1;
        }
        else start=mid+1;

    }
        System.out.println(res);
    }
    static boolean isVaild(int arr[],int max,int k,int n){
        int student=1;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>max){
                student++;
                sum=arr[i];
            }
            if(student>k)return false;
        }

        return true;
    }
}
