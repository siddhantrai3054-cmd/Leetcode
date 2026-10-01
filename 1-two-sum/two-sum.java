// Leetcode 1. Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i<n; i++){
            int val = target - nums[i];
            if(map.containsKey(val) && i != map.get(val)){
                return new int[]{i, map.get(val)};
            }
        }
         return new int[]{0,0};
    }
}