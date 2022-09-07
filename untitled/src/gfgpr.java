import java.util.Scanner;

public class gfgpr {
    public static void main (String[] args)
    {
        //code
        Scanner in =new Scanner(System.in);
//        String j=in.next();
//        System.out.println(check(j));

        int n=in.nextInt();

        while(n>0){
            String str=in.next();
            if(check(str)){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
            n--;}
        }
    public static Boolean check(String str){
        int l=str.length();
        int c=0;
        for(int i=0;i<l;i++){
            char g=str.charAt(i);
            //48 to 57
            int val=(int)g;
            if(val>=48&& val<=58){
                c++;
            }
        }
        if(c!=0)return false;else return true;
        //return true;
    }
    static int checo(int a, int b)
    {
        // Everything divides 0
        if (a == 0 || b == 0)
            return 0;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return checo(a-b, b);

        return checo(a, b-a);
    }

    // function to check and print if
    // two numbers are co-prime or not
    static boolean coprime(int a, int b) {

        return checo(a, b) == 1;
    }
}
