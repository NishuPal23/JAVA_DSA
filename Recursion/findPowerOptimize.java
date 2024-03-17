package Recursion;

public class findPowerOptimize {
    public static int pow(int a, int b){
        if(b==1){
            return a;
        }
        if(b%2!=0){
            return a*pow(a,b-1);
        }
        return pow(a,b/2)*pow(a,b/2);
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int ans = pow(a,b);
        System.out.println(ans);

    }
}
