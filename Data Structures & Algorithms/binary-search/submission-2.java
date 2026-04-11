class Solution {
    public int bsearch(int l, int r, int[] nums, int target) {
        if(l > r) return -1;
        int m = l + (r - l) / 2;

        if(nums[m] == target) return m;

        if (nums[m] < target) {
            
            return bsearch(m + 1, r, nums, target);
            }
        else{
            return bsearch(l, m - 1, nums, target);
        }

        
    
    }
    
    public int search( int[] nums, int target) {
        return bsearch(0, nums.length - 1, nums, target);
    }
}
