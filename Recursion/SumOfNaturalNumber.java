package Recursion;

public class SumOfNaturalNumber {
    public static int sumOfNatural(int n){
         if(n==1){
            return 1;
         }
         return n+sumOfNatural(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = sumOfNatural( n);
        System.out.println(ans); 
    }
}
