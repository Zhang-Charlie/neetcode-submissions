class Solution {
    public int maxSubArray(int[] nums) {
        int maxS = nums[0], cur = 0;

        for(int num : nums){
            if(cur < 0){
                cur = 0;
            }
            
            cur += num;
            maxS = Math.max(cur,maxS);

        }
        return maxS;
    }
}
