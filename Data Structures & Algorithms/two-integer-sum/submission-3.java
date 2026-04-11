class Solution {
    public int[] twoSum(int[] nums, int target) {

        int t = target; 

        for(int i = 0; i < nums.length; i++){

            for(int j = 0; j < nums.length; j++){

                if((nums[i] + nums[j]) == t && i !=j){
                    return new int[]{i,j};
                }

            }
        }
        return null;
    }
}
