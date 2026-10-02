class Solution {
    public int tribonacci(int n) {
        int dp [] = new int[n+1];
        return solve(n,dp);



        
    }
    public int solve (int n, int[] dp){
        if(n == 1 || n == 0) return n;
        if(n==2)return 1;
        if(dp[n] != 0) return dp[n];
        dp[n] = solve(n-1, dp) + solve(n-2, dp) + solve(n-3, dp);
        return dp[n];
    }
}