package Backtracking;
import java.util.*;
public class PrintAllPalimdromicPartition {
    public static boolean isPallindrome(String str){
        int i =0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void printAll(String str,ArrayList<ArrayList<String>> ans,ArrayList<String> path, int index){
        if(index ==str.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        String temp ="";
        for(int i = index ;i<str.length();i++){
            temp+=str.charAt(i);
            if(isPallindrome(temp)){
                path.add(temp);
                printAll(str,ans,path,i+1);
                path.remove(path.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        String str = "nitin";
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        ArrayList<String> path = new ArrayList<>();
        printAll(str,ans,path,0);
        System.out.println(ans);
    }
}
