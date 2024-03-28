package Backtracking;

import Heap.SlidingWindowMaximum.Pair;

public class FindLongestPath {
    public static class pair{
        boolean found;
        int val;
        pair(boolean found, int val){
            this.found = found;
            this.val = val;
        }
    }
    public static pair findLongestPathUtil(int[][]mat,int i,int j, int x, int y, boolean[][]visited){
        int r = mat.length;
        int c = mat[0].length;
        if(i==x && j==y){
            return new pair(true,0);
        }
        if(i<0 || i>=r ||j<0 ||j>=c ||mat[i][j]==0 ||visited[i][j]){
            return new pair(false,Integer.MAX_VALUE);
        }
        visited[i][j] = true;
        int res = Integer.MIN_VALUE;
        //left
        pair sol = findLongestPathUtil(mat,i,j-1,x,y,visited);

        if(sol.found){
            res = Math.max(res,sol.val);
        }

        //right
         sol = findLongestPathUtil(mat,i,j+1,x,y,visited);

        if(sol.found){
            res = Math.max(res,sol.val);
        }


        //up
        sol = findLongestPathUtil(mat,i-1,j,x,y,visited);

        if(sol.found){
            res = Math.max(res,sol.val);
        }

        //down
        sol = findLongestPathUtil(mat,i+1,j,x,y,visited);

        if(sol.found){
            res = Math.max(res,sol.val);
        }
        visited[i][j] = false;
        if(res != Integer.MIN_VALUE)
      return new pair(true, res+1);
 
    // if destination can't be reached from current cell,
    // return false
    else
      return new pair(false, Integer.MAX_VALUE);
    }
    public static void findLongestPath(int[][]mat,int i, int j, int x, int y){
        int r = mat.length;
        int c = mat[0].length;
        boolean visited[][] = new boolean[r][c];
        pair p = findLongestPathUtil(mat, i, j, x, y, visited);
 
        if(p.found)
      System.out.println("Length of longest possible route is " + p.val);
 
    // If the destination is not reachable
    else
      System.out.println("Destination not reachable from given source");
 
  }
    
    public static void main(String[] args) {
        int mat[][] = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },{ 1, 1, 0, 1, 1, 0, 1, 1, 0, 1 },{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };
        
        findLongestPath(mat, 0, 0, 1, 7);            
    }
}
