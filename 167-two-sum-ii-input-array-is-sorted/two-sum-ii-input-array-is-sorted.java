
class Solution {
    public int[] twoSum(int[] nums, int target) {

       int num[] = new int[2]; 
       // Answer store karne ke liye 2 elements ka array banaya

       int n = nums.length;
       // nums array mein kitne elements hain, unki sankhya nikali

       int i = 0;
       // i ko pehle element ke index par rakha

       int j = n - 1;
       // j ko aakhri element ke index par rakha

       while (i < j) {
       // Jab tak i, j se chhota hai, loop chalta rahega

        int sum = nums[i] + nums[j];
        // Dono pointers ke elements ko add kiya

        if (sum == target) {
        // Agar sum target ke barabar hai

            num[0] = i + 1;
            // Pehla index answer array mein store kiya (1-based index)

            num[1] = j + 1;
            // Dusra index answer array mein store kiya

            break;
            // Loop ko rok diya
        }

        else if (sum < target) {
        // Agar sum target se chhota hai

            i++;
            // Left pointer ko ek step aage badhaya
        }

        else {
        // Agar sum target se bada hai

            j--;
            // Right pointer ko ek step peeche kiya
        }
       }

       return num;
       // Answer wala array return kiya
    }
}
