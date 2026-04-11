public class Solution { // class wrapper for the solution
    public int findMin(int[] nums) { // method to find minimum value in a rotated sorted array
        int l = 0; // left pointer (start of current search window)
        int r = nums.length - 1; // right pointer (end of current search window) — assumes nums != null

        while (l < r) { // continue while the search window is valid
            int m = l + (r - l) / 2; // safe mid index calculation to avoid overflow

            if (nums[m] < nums[r]) { // if left half nums[l..m] is non-decreasing (pivot not in left half)
                r =m ; // discard left half up to m, search in right half
            } else { // nums[m] < nums[l], meaning pivot (minimum) lies in left half including m
                l = m + 1; // move right boundary left of m (we already considered nums[m] in res)
            }
        }
        return nums[l]; // return the smallest value found
    } // end of findMin method
} // end of Solution class
