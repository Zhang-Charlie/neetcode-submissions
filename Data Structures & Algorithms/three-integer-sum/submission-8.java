class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
		Arrays.sort(nums);

		for(int i = 0; i < nums.length; i++){
			for(int j = i + 1; j < nums.length; j++){
				for(int k = j + 1; k < nums.length; k++){
					if(nums[i] + nums[j] + nums[k] == 0 && !ans.contains(Arrays.asList(nums[i],nums[j],nums[k]))){
						ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
					}
				}
			}

		}
		return new ArrayList<>(ans);
    }
}
