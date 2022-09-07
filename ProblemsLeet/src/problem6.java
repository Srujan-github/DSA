import java.util.Arrays;

public class problem6 {
    public static void main(String[] args) {
        int a[][] = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int h=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 0) {
setminus(a,i,j);
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == h) {
                    a[i][j]=0;
                }
            }
        }
        for (int ar[]:a) {
            System.out.println(Arrays.toString(ar));
        }
    }
    static void setminus(int[][] arr,int i, int j ){
int n=Integer.MIN_VALUE;
        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr[k].length; l++) {
               if(arr[i][l]==0) {
                   arr[i][l]=0;  }else arr[i][l]=n;

            }
            if(arr[k][j]==0) {
                arr[k][j]=0;  }else  arr[k][j]=n;
        }
    }
}
