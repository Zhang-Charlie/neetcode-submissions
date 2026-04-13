class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numbSet = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }

        long longest = 0;
        for(int num : numbSet){
            if(!numbSet.contains(num - 1)){
                int length = 1;
                while(set.contains(num + 1)){
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
        
    }
}
