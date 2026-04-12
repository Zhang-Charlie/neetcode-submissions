class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        
        int l = 0, r = nums.length - 1;

        for(int i = 0; i < nums.length; i++){
            while(l < r){
                if(nums[i] + nums[l] + nums[r] == 0){
                    set.add(Arrays.asList(nums[i], nums[l], nums[r]));
                }else if(nums[i] + nums[l] + nums[r] < 0) {
                    // if 0 greater than sum 
                    l++;
                }else{
                    r--;
                }
            }
        }
        return set;
    }
}
