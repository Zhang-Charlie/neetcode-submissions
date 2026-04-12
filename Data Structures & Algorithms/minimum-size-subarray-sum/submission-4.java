class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = 0;
        int l = 0;
        for(int r = 0; r < nums.length - 1; r++){
            System.out.println(r + " " + nums.length());

            while(r < nums.length){
                Math.min(ans, r - l + 1);
                if(sum < target){
                    l++;
                }else {
                    r++;
                }
            }
        }
        return ans;


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