class Solution {
    public int[] twoSum(int[] nums, int target) {

        int t = target; 

        for(int i = 0; i < nums.length; i++){

            for(int j = 1; j < nums.length; j++){

                if((nums[i] + nums[j]) == t){
                    return new int[]{i,j};
                }

            }
        }
        return null;
    }
}
