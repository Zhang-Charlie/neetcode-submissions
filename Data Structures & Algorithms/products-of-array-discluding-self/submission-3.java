class Solution {
    public int[] productExceptSelf(int[] nums) {
        List<Integer> list = new List[nums.length + 1];
		int product = 0;
		for(int i = 0; i < nums.length; i++){

			for(int j = 0; j < nums.lenghth; j++){
				if(i == j) continue;
				product *= nums[j];
			}
			list.add(product);

		}
		return list;
    }
}  
