package GreedyAlgorithm;
/* Geekina got stuck on an island. There is only one shop on this island and it is open on all days of the week except for Sunday. Consider following constraints:

N – The maximum unit of food you can buy each day.
S – Number of days you are required to survive.
M – Unit of food required each day to survive.
Currently, it’s Monday, and she needs to survive for the next S days.
Find the minimum number of days on which you need to buy food from the shop so that she can survive the next S days, or determine that it isn’t possible to survive.*/



public class CheckPossibleToSurviveOnIsland {

    //Time Complexity = O(n)
    //Space Complexity = O(1)
    public static int solve(int s, int n, int m){
        if(m>n)return -1;
        int sunday = s/7;
        int totalFood = s*m;
        int buyDays = s-sunday;
        int ans = 0;
        if(totalFood%n==0){
            ans = totalFood/n;
        }
        else{
           ans = totalFood/n+1;
        }
        if(ans<=buyDays){
            return ans;
        }
        else{
            return-1;
        }
    }
    public static void main(String[] args) {
        int s = 10;
        int n = 16;
        int m = 2;
        int ans = solve(s,n,m);
        System.out.println(ans);
        
    }
}
