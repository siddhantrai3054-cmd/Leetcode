// Leetcode 213. House Robber II
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];

        int[] nums1 = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            nums1[i] = nums[i];
        }

        int[] nums2 = new int[n - 1];
        for (int i = 1; i < n; i++) {
            nums2[i - 1] = nums[i];
        }
        return Math.max(rob1(nums1), rob1(nums2));
    }

        public int rob1(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return solve(nums, n - 1, dp);
    }
    public int solve(int[] nums, int n, int[] dp) {
        if (n == 0) return nums[0];
        if (n == -1) return 0;
        if(dp[n] != -1) return dp[n];
        int pick = nums[n] + solve(nums, n - 2, dp);
        int notPick = solve(nums, n - 1, dp);
        dp[n] = Math.max(pick, notPick);
        return dp[n];
    }
}