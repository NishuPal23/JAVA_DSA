package Recursion;

public class PrintNaturalNumber {
    public static void solve(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        
        solve(n-1);
        System.out.print(n+" ");
    }

    //print in reverse rder
    public static void reversePrint(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        reversePrint(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        solve(n);



        System.out.println();
        //reverse 
       
        reversePrint(n);
    }
}
