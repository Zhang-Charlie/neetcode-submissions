class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int l = 0;
        int sum = 0;

        for(int r = 0 ; r < nums.length; r++){
           
            sum += nums[r];
            
            // if count is less than or equal to sum then move left pointer and remove l from sum
            while(sum >= count){
                ans = Math.min(ans , r - l + 1);
                int sum -= nums[l];
                l++;
            }
        }

        // if ans is same as start(MAX_VALUE), return 0 if true. return ans if false
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}