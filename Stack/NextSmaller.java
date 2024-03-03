package Stack;
import java.util.*;
public class NextSmaller {
    public static int[] nextSmaller(int[]arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int ans[] = new int[n];
        ans[n-1] =-1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()!=0 && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={4,8,5,2,25};
        int ans[] = nextSmaller(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
