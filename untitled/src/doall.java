public class doall {
    public static void main(String[] args) {
int arr[]={ 9488, 25784, 5652, 9861, 31311, 8611, 1671, 7129, 28183, 2743, 11059, 4473, 7927, 21287, 2259, 7214, 32529};
        for (int i = 0; i < arr.length; i++) {
            boolean le=left(arr,i,arr[i]);
            boolean re=right(arr,i,arr[i]);
            if(le&&re) System.out.println(1);else System.out.println(0);
        }
    }
    //1802. Maximum Value at a Given Index in a Bounded Array
     static int maxValue(int n, int index, int maxSum) {

return -1;
    }
    //prefet peak
    static boolean left(int arr[],int in,int val ){
  //left greater
        int n=0;
        for (int i = 0; i <in; i++) {
            if(arr[i]<val){
                n++;
            }
                else return false;
        }
        return true;
    }
    static boolean right(int arr[],int in,int val ){
//rigth smaller
        int n=0;
        for (int i = in+1; i < arr.length; i++) {
            if(arr[i]>val){
                n++;
            }
            else return false;
        }
        return true;

    }

}
