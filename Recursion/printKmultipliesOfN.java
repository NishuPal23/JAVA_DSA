package Recursion;

public class printKmultipliesOfN {
    public static void multiply(int n, int k){
        if(k==1){
            System.out.print(n+" ");
            return;
        }
        multiply(n,k-1);
        System.out.print(n*k+" ");
    }
    public static void main(String[] args) {
        int n =12;
        int k = 4;
        multiply(n,k);
    }
}
