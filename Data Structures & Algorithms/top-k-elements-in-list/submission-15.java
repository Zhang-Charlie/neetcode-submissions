class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        // create empty bucket
        for(int i = 0;i < freq.length;i++){
            freq[i] = new ArrayList();
        }

        // fill in the count
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> ind : map.entrySet()){
            freq[ind.getValue()].add(ind.getKey());
        }

        int index = 0;
        int[] ans = new int[k];

        for(int i = freq.length; i > 0 && k > index ; i--){
            for(int n : freq[i]){
                ans[index++] = n;
                if (index == k) return ans;
            }
        }
        return ans;
    }
}
