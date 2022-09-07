import java.util.Arrays;

public class rec {
    public static void main(String[] args) {
        int a[]={0, 4,3,4,4,3 };
       //now(a) ;
        for (int i = 1; i < 5001; i++) {
            if(i%60==0) System.out.print(i+"  ");
        }

    }
    static void now(int arr[]){
        int bu[]=new int[10];
        for(int i: arr)bu[i]++;
        System.out.println(Arrays.toString(bu));
    }
static int hij(int arr[]){
        int n=arr.length-1;
        int ser=0;
        while (ser<=n){
            if(arr[ser]==arr[ser+1])ser+=2;else return arr[ser];
        }

        return -1;
}
    static int  Array1(int[] arr) {
        int i=0;
        if(i>=arr.length)return -1;
        int c=0;
        for(int j=0;j<arr.length;j++){
            if(i<=arr[j])c++;
            if(i==c && i!=0)return i;else i++;
        }
        return -1;
    }
   static int  Array(int[] arr) {
        int i=0;
        while (i<=arr.length){
            int c=0;
            for (int j = 0; j < arr.length; j++) {
                if(i<=arr[j])c++;
            }
            if (i==c && c!=0)return c;
            i++;
        }
        return -1;
    }
}
