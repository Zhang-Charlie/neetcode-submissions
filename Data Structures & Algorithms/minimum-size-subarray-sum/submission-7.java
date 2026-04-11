class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int l = 0;
        int sum = 0;

        for(int r = 0; r < nums.length; r++){
            sum += nums[r];

            while(sum >= target){
                ans = Math.min(ans, r-l + 1);
                sum -= nums[l];
                l++;
            }
            
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;


    //     - Math.min function
        // - if sum of the window =< 10 // hit target
        // then l++ to increase the number
        // else
        // r++ because sum of the window < 10

    // - return the size of the array that contains it
    }
}

// // Thoughts before coding

// // Objective
//     - given array of nums
//     - positive int target

//     - Goal : return minimal length of a subarray && if no sub array exists return 0

// // How
//     - Use l and r pointers
//     - Math.min() fcuntion

//     - l to r has to be greater that target

//     - one pass
//     - o(n)
// -------------------------------------------------

//     - Math.min function
//     - if sum of the window =< 10 // hit target
//     then l++ to increase the number
//     else
//     r++ because sum of the window < 10

//     - return the size of the array that contains it