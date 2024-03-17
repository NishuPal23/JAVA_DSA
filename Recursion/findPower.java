package Recursion;

public class findPower {
    public static int pow(int a, int b){
        if(b==1){
            return a;
        }
        return a*pow(a,b-1);
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int ans = pow(a,b);
        System.out.println(ans);
    }
}
