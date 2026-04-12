class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
		Set<List<Integer>> list = new HashSet<>();

		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				for(int k = j + 1; k < n; k++){

				if(nums[i] + nums[j] + nums[k] == 0){
                    if(list.contains(Arrays.asList(nums[i] ,nums[j] , nums[k]))) break;
					list.add(Arrays.asList(nums[i] ,nums[j] , nums[k]));
				}

				}
			}
		}

		return new ArrayList<>(list);
    }
}
