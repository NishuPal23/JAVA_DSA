package GreedyAlgorithm;

public class ReverseWordsInGivenString {
    public static String solve(String str){
        String []arr = str.split("\\.");
        StringBuilder ans= new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
              ans.append(arr[i]);
              if(i>0){
                ans.append(".");
              }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "my.name.is.nishu";
        String ans = solve(str);
        System.out.println(ans);
    }
}
