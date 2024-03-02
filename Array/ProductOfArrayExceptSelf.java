package Array;
/*Given an array, return an array where each element is the product of all the elements in the array except itself. */
public class ProductOfArrayExceptSelf {
    //Time Complexity = O(n^2)
    //Space Complexity = O(n);
    public static int[] productExceptSelf1(int[]arr){
        int n = arr.length;
        int ans[] = new int[n];
        //left to right
        int sum=1;
        for(int i=0;i<n;i++){
            for(int j =i+1;j<n;j++){
                sum*=arr[j];
            }
            ans[i] = sum;
            sum = 1;

        }
        ans[n-1] = 1;

        //right to left
        int ans2[] = new int[n];
        sum = 1;
        for(int i = n-1;i>0;i--){
            for(int j = i-1;j>=0;j--){
                sum*=arr[j];
            }
            ans2[i] = sum;
            sum = 1;
        }
        ans2[0] = 1;
        int res[] = new int[n];
        for(int i =0;i<n;i++){
            res[i] = ans[i]*ans2[i];
        }

        return res;
    }

    //Time Complexity = O(n)
    //Space Complexity = O(n);
    public static int[] productExceptSelf2(int[]arr){
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int lp = 1;
        for(int i=0;i<n;i++){
            left[i] =lp;
            lp*=arr[i];
        }
        int rp =1;
        for(int i=n-1;i>=0;i--){
            right[i] = rp;
            rp*=arr[i];
        }
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
             ans[i] = left[i]*right[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] ={2,3,5,0};
        int ans[] = productExceptSelf1(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
