class Solution {
    public int[] productExceptSelf(int[] nums) {
		// edge case
        if (nums == null || nums.length == 0) {
            return new int[0];
        } 

        int n = nums.length; // length
        int[] res = new int[n]; // initlise the ans

        // Build prefix products
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            res[i] = prefix;
			System.out.println(res[i] + "=" + prefix);

            prefix *= nums[i];
			System.out.println(prefix + "*=" + nums[i]);
        }

        // Multiply by suffix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= suffix;
            suffix *= nums[i];
        }

        return res;
    }
}