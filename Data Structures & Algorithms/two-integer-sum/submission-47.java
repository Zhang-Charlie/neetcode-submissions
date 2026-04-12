class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.hasKey(diff)) return new int[] {map.getValue(diff) , i};
            map.put(nums[i], i);
        }
        return new int[0];

    }
}
