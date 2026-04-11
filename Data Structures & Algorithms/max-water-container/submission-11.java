class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;
        int maxA = 0;
        while(l < r){
            int length = r - l;
            int area = Math.min(heights[l], heights[r]) * length;
            maxA = Math.max(maxA,area);
            // if r is greater move heights to the right
            if(heights[l] < heights[r]){
                l++;
            } else{ // else move right pointer to the left by 1
                r--;
            }
        }
        return maxA;
    }
}
