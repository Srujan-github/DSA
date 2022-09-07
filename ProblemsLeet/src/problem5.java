import java.util.ArrayList;
import java.util.List;
//sipral matrix
public class problem5 {
    public static void main(String[] args) {
        int a[][] ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(a));
    }
    public static List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> list=new ArrayList<>(3);
        int rowS=0;
        int rowE=arr.length-1;
        int colS=0;
        int colE=arr[0].length-1;
        while (rowS<=rowE && colS<=colE){
            for (int i = colS; i <=colE ; i++) {
                list.add(arr[rowS][i]);
            }
            rowS++;
            for (int i = rowS; i <= rowE; i++) {
                list.add(arr[i][colE]);
            }
            colE--;
            if(rowS<=rowE){
                for (int i = colE; i >=colS ; i--) {
                    list.add(arr[rowE][i]);
                }
            }
            rowE--;
            if(colS<=colE){
                for (int i = rowE; i >=rowS ; i--) {
                    list.add(arr[i][colE]);
                }
            }
            colE--;
        }



        return list;
    }
}

