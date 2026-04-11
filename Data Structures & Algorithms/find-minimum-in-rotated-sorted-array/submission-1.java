class Solution {
    public int findMin(int[] nums) {
        int l = 0, ans = nums[0];

        for(int r = 0; r < nums.length; r++){
            System.out.println(nums[l] + "<" + nums[r]);
            if(nums[l] > nums[r]){
                ans = Math.min(nums[r], ans);
            }else if(nums[l] < nums[r]){
                ans =  Math.min(nums[l], ans);
            }
            l = r;
        }
        return ans;
    }
}
