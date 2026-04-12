class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);
       
        for(int i = 0; i < nums.length; i++){
            int l = i + 1, r = nums.length - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                } else if(sum < 0){ // 0 is greater than sum
                    l++;
                }else{
                    r--;
                }
                
            }
        }

        return ans;
        
    }
}
