//746. Min Cost Climbing Stairs
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
       int  [] dp = new int [n+1];
       for(int i = 0; i<=n; i++){
        dp[i] = -1;

       }
return solve(cost,n,dp);
       

    }
       public int solve(int[] cost, int n , int dp[]) {
        if (n <= 1) return 0;
        if(dp[n] != -1) return dp[n];

        int oStep = cost[n-1] + solve(cost, n - 1, dp);
        int dStep = cost[n-2] + solve(cost, n - 2, dp);
        dp[n]  = Math.min(oStep, dStep);
        return dp[n];
    }
}