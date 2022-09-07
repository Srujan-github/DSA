public class problem2 {
    public static void main(String[] args) {
int a[]={2,5,0,0};
        System.out.println(canJump(a));

    }
    public static  boolean canJump(int[] arr) {
      int i=1;

      int co=arr[0];
      int n=arr.length;
      while (arr[0]>0&&i<n){

          co+=arr[co];i++;
          if(co>=n||co==n-1)return true;
      }
        return false;
    }
}
