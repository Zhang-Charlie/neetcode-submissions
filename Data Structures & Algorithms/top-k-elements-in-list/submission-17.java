class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for(int i = 0 ; i < freq.length; i++ ){
            freq[i] = new ArrayList();
        }

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> ind : map.entrySet()){
            freq[ind.getValue()].add(ind.getKey());
        }

        int index = 0;
        int[] res = new int[k];
        for(int i = freq.length - 1; i > 0 && index < k; i--){
            for(int n : freq[i]){
                System.out.println(n);
                res[index++] = n;
                System.out.println(index);
                if(index == k) return res;
            }
        }
        return res;
    }
}
