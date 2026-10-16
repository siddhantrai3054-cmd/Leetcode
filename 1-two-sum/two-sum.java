import java.util.HashMap; // HashMap class import ki
import java.util.Map;     // Map interface import ki

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Number aur uska index store karne ke liye map banaya
        Map<Integer, Integer> mp = new HashMap<>();

        // Array ke har element par loop chalaya
        for (int i = 0; i < nums.length; i++) {

            // Target tak pahunchne ke liye required number nikala
            int remaining = target - nums[i];

            // Check ki required number map mein hai ya nahi
            if (mp.containsKey(remaining)) {

                // Dono numbers ke indices return kiye
                return new int[]{mp.get(remaining), i};
            }

            // Current number aur uska index map mein store kiya
            mp.put(nums[i], i);
        }

        // Pair nahi mila to empty array return kiya
        return new int[]{};
    }
}