package Recursion;

public class RateInMaze {
    public static void printPath(int tr, int tc, int r, int c, String str ){
        if(r>tr || c>tc){
            return;
        }
        if(r==tr-1 && c ==tc-1){
            System.out.println(str);
            return;
        }
        printPath(tr,tc,r,c+1,str+"R");
        printPath(tr,tc,r+1,c,str+"D");

    }
    public static void main(String[] args) {
        int tr = 2;
        int tc = 2; 
        printPath(tr,tc,0,0,"");
    }
}
