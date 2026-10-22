class Solution {
    public int trap(int[] height) {
        int si = 0;
        int ei = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;
        while(si < ei){
            if(height[si] < height[ei]){
                if(height[si] > leftMax){
                    leftMax = height[si];
                }else{
                    water += leftMax - height[si];
                }
                si++;
            }else{
                if(height[ei] > rightMax){
                    rightMax = height[ei];
                }else{
                    water += rightMax - height[ei];
                }
                ei--;
            }
        }
        return water;
    }
}