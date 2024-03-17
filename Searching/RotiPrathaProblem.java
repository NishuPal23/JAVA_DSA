package Searching;

public class RotiPrathaProblem {
    public static boolean isPossible(int[]rank, int chef, int paratha, int mid){
        int totalTime = 0;
        int time =0;
        for(int i =0;i<chef;i++){
            time = rank[i];
            int j =2;
            while(time<=mid){
                totalTime++;
                time =time +(j*rank[i]);
                j++;
            }
            if(totalTime>=paratha){
                return true;
            }
        }
        return false;
    }
    public static int minTime(int[]rank, int paratha, int chef){
        int ub = 1000;
        int lb =0;
        int ans = -1;
        while(lb<=ub){
            int mid = (lb+ub)/2;
            if(isPossible(rank,chef,paratha,mid)){
                ans = mid;
                ub = mid-1;
            }
            else{
                lb = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int ranking[]={1,2,3,4};
        int paratha = 10;
        int chef = 4;
        int ans = minTime(ranking,paratha,chef);
        System.out.println(ans);
    }
}
