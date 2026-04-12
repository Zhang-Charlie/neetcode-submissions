class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        if(target = null || nums.length == 0) return 0;
        for(int r = 0; r < nums.length;r++){
            sum += nums[r];
            if(sum >= target){
                ans = Math.min(ans , r - l + 1);
                sum -= nums[l];
                l++;
            }

        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}