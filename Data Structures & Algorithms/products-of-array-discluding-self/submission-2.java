class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;              // store the length of the input array
        int[] res = new int[n];           // result array that will hold the final answer

        res[0] = 1;                       // base case: nothing to the left of index 0, so product = 1
        for (int i = 1; i < n; i++ ) {    // build prefix products for each index
            // res[i] = product of all elements to the LEFT of index i
            res[i] = res[i - 1] * nums[i - 1];
        }
        // After this loop, res[i] contains the prefix product (all elements before i)

        int postfix = 1;                  // variable to keep track of product of elements to the RIGHT

        for (int i = n - 1; i >= 0; i--) {  // traverse from right to left
            res[i] *= postfix;              // multiply prefix (already in res[i]) with suffix (postfix)
            postfix *= nums[i];             // update postfix by multiplying with current nums[i]
        }
        // After this loop, res[i] contains prefix[i] * suffix[i] = product of all except nums[i]

        return res;                       // return the final result array
    }
}
