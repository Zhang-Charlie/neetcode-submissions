class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        // getting the counts of the numbers
        for(int n : nums){
            map.put(n, map.getOrDefault(n , 0) + 1);
        }

        // fill buckets
        for(Map.Entry<Integer,Integer> fill : map.entrySet()){
            freq[fill.getValue()].add(fill.getKey());
        }

        int index = 0;
        int[] ans = new int[k];

        for(int i = freq.length - 1; i > 0 && index < k; i--){
            for(int n : freq[i]){
                ans[index++] = n;

                if(index == k){
                    return ans;
                }
            }
        }
        return ans;
        
    }
}
