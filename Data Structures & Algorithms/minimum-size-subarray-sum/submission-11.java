class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            int count = i;
            for(int j = i + 1; j < nums.length; j++){

                count += nums[j];
                if(count >= target){
                    ans = Math.min(ans, j - i + 1);
                    break;
                }
                j++;
                
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}