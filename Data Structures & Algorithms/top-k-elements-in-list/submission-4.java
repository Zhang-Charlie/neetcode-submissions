class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> store = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        // intialise the freq 

        for(int i = 0 ; i < freq.length;i++){
            freq[i] = new ArrayList<>();
        }
        
        // count them
        // 0 1 2 3 4 5 - value
        // ------------
        // 1 2 2 3 3 3 - key
        for(int n : nums){
            store.put(n, store.getOrDefault(n, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> ind : store.entrySet()){
            freq[ind.getValue()].add(ind.getKey());
        }
        // in freq 
        // 0 = null
        // 1 = [1]
        // 2 = [2]
        // 3 = [3]

        int index = 0;
        int[] ans = new int[k];
        // i = 5; i > 0 && 
        // index++
        for(int i = freq.length - 1; i > 0 && index < k;i--){
            for(int n : freq[i]){
                // 0 = 3
                // 1 = 2
                // end k == index
                // 2 = 2
                ans[index++] = n;
                if(index == k){
                    return ans;
                }
                
            }
        }
        return ans;
        
    }
}
