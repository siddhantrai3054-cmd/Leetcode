class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
        int n = nums.length;
        int q = queries.length;


        int sumEven = 0;
        for(int i = 0; i<n; i++){
            if(nums[i]%2 ==0){
                sumEven += nums[i];
            }
            }
             int[] result = new int[q];
         
            for(int j = 0; j<q; j++){
                int val = queries[j][0];
                int idx = queries[j][1];
                if(nums[idx]%2 == 0){
                    sumEven -= nums[idx];
                   

                }
                nums[idx]+= val;
                if(nums[idx] %2 == 0){
                    sumEven += nums[idx];

               
                }    
                 result[j] = sumEven;   
            
        }
         
         return result ;
    }
}