public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // sort the array to handle duplicates easier
        Map<Integer, Integer> map = new HashMap<>(); // map to store frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1); // add number to map or increase its count
        }

        List<List<Integer>> list = new ArrayList<>(); // list to store the result triplets
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.get(nums[i]) - 1); // use up one occurrence of nums[i]
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicate first numbers

            for (int j = i + 1; j < nums.length; j++) {
                map.put(nums[j], map.get(nums[j]) - 1); // use up one occurrence of nums[j]
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // skip duplicate second numbers

                int target = -(nums[i] + nums[j]); // compute the third number needed
                if (map.getOrDefault(target, 0) > 0) { // check if target exists and is still unused
                    list.add(Arrays.asList(nums[i], nums[j], target)); // add triplet to result
                }
            }

            for (int j = i + 1; j < nums.length; j++) {
                map.put(nums[j], map.get(nums[j]) + 1); // restore nums[j] counts after inner loop
            }
        }
        return list; // return the list of unique triplets
    }
}
