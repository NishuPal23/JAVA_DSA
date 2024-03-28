package Backtracking;

public class NQueenPrintWays {
    public static boolean isSafe(char[][]mat,int r, int c){
        int n = mat.length;
        //row
        int rc = r;
        for(int j = 0;j<mat.length;j++){
            if(mat[rc][j]=='Q'){
                return false;
            }
        }

        //column
        int cc = c;
        for(int i = 0;i<mat.length;i++){
            if(mat[i][cc]=='Q'){
                return false;
            }
        }


        //north east
        rc = r;
        cc = c;
        while(rc>=0 &&cc<n){
            if(mat[rc][cc]=='Q'){
                return false;
            }
            rc--;
            cc++;
        }
        //south east
        rc = r;
        cc = c;
        while(rc<n &&cc<n){
            if(mat[rc][cc]=='Q'){
                return false;
            }
            rc++;
            cc++;
        }
        //north west
        rc = r;
        cc = c;
        while(rc>=0 &&cc>=0){
            if(mat[rc][cc]=='Q'){
                return false;
            }
            rc--;
            cc--;
        }
        //south west
        rc = r;
        cc = c;
        while(rc<n &&cc>=0){
            if(mat[rc][cc]=='Q'){
                return false;
            }
            rc++;
            cc--;
        }
        return true;
    }
    public static void nQueen(char[][]mat, int r){
        //Base case
        int n = mat.length;
        if(r==n){
            for(int i =0;i<n;i++){
                for(int j =0;j<n;j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
            return;
        }
        System.out.println();
        for(int j =0;j<n;j++){
            if(isSafe(mat,r,j)){
                mat[r][j]='Q';
                nQueen(mat,r+1);
                mat[r][j] = '.';
            }
        }
        
    }
    public static void main(String[] args) {
        int n =4;
        char [][]mat = new char[n][n];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                mat[i][j] = '.';

            }
        }
        nQueen(mat,0);
    }
}
