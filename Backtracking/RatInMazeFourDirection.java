package Backtracking;

public class RatInMazeFourDirection {
    public static void printPath(int[][]mat,int tr, int tc, int r, int c, String ans){
        if(r>=tr ||c>=tc || r<0 ||c<0){
            return ;
        }
        if(r==tr-1 && c==tc-1){
            System.out.println(ans);
            return;
        }
        if(mat[r][c]==0)return ;
        mat[r][c]=0;
        printPath(mat,tr,tc,r+1,c,ans+"D");
        printPath(mat,tr,tc,r-1,c,ans+"U");
        printPath(mat,tr,tc,r,c+1,ans+"R");
        printPath(mat,tr,tc,r,c-1,ans+"L");
        mat[r][c] = 1;
        
    }
    public static void main(String[] args) {
        int tr = 3;
        int tc = 3;
        int[][]mat = new int[tr][tc];
        for(int i =0;i<tr;i++){
            for(int j = 0;j<tc;j++){
                mat[i][j] = 1;
            }
        }
        String ans = "";
        printPath(mat,tr,tc,0,0,ans);
    }
}
