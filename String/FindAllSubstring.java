package String;
import java.util.*;
public class FindAllSubstring {
    public static ArrayList<String> solve(String str){
        ArrayList<String> ans = new ArrayList<>();
        int n = str.length();
        for(int i =0;i<n;i++){
            for(int j = i+1;j<=n;j++){
                  ans.add(str.substring(i,j));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "babad";
        ArrayList<String> ans = solve(str);
        System.out.println(ans);
    }
}
