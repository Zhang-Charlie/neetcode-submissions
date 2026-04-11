class Solution {
    public int search(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        
        if(nums.length < 0) return -1;

        for(int i = 0; i <nums.length; i++){
            set.add(nums[i]);

            if(set.contains(target)){
                return i;
            }


            // if(set.contains(target)){
            //     // -1 0 2 4 6 8
            //     return i;
            // }else{
            //     set.add(nums[i]);
            // }
        }
        return -1;


    }
}
