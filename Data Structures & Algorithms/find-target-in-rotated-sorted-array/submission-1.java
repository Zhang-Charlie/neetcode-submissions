class Solution {
    public int search(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            if(set.contains(target) || target == nums[i]){
                return i ;
            }else{
                set.add(nums[i]);
            }

        }
        return -1;
    }
}
