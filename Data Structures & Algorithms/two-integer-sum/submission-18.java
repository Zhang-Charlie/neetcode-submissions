class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length; i++){
            int diff = target - num;
            if(map.contains(diff)) return new int[] {map.getKey(diff), i};
            map.put(nums[i], i);

        }

        return new int[] {};
    }
}
