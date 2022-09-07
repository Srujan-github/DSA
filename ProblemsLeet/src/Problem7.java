public class Problem7 {
    public static void main(String[] args) {
int a[]={1,2,3,1};
        System.out.println(giv(a));
    }
    static int giv(int arr[]){
        int max=arr[0];
        int in=0;
        int i=0;
        while(i<arr.length){
            if(max<arr[i]){
                max=arr[i];
                in=i;
            }i++;
        }
        int ans=max;
        int j=0;


        return ans;
    }
}
