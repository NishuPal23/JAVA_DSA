package Backtracking;
import java.util.*;
public class wordBreak {
    public static void generate(String str, ArrayList<String> wordDict,ArrayList<ArrayList<String>> ans,ArrayList<String> path, int start){
        if(start==str.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        String temp = "";
        for(int end = start+1;end<=str.length();end++){
              temp = str.substring(start,end);
              if(wordDict.contains(temp)){
                path.add(temp);
                generate(str,wordDict,ans,path , end);
                path.remove(path.size()-1);
              }
        }
    }
    public static void main(String[] args) {
        String str = "catsanddog";
        ArrayList<String> wordDict  = new ArrayList<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("dog");
        wordDict.add("sand");
       ArrayList<ArrayList<String>> ans = new ArrayList<>();
       ArrayList<String> path = new ArrayList<>();
       generate(str,wordDict,ans,path,0);
       System.out.println(ans);

    }
}
