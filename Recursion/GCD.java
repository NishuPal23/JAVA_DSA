package Recursion;

public class GCD {
    public static int find(int x, int y){
        if(y%x==0)return x;
        return find(y%x,x);
    }
    public static void main(String[] args) {
        int x = 4;
        int y = 9;
        int ans = find(x,y);
        System.out.println(ans);
    }
}
