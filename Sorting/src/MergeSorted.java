import java.util.ArrayList;

//https://leetcode.com/problems/merge-sorted-array/
public class MergeSorted {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(9);
        System.out.println("befor");
        System.out.print(arr);
        //rotate k=3
        int g=arr.size()-1;
        for (int i = 0; i < arr.size(); i++) {
            int temp=arr.get(i);
            arr.remove(i);
            arr.add(i,arr.get(g));
            //arr.add()
        arr.remove(g);
        arr.add(g,temp);
        g--;
        }
        System.out.println();
        System.out.println(arr);
    }
}
