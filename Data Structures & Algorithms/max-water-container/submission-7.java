class Solution {
    public int maxArea(int[] heights) {

        int l = 0, r = heights.length - 1;
        int maxWater = 0;
        while(l < r){
            int length = r - l;
            int minBar = Math.min(heights[l], heights[r]);
            maxWater = Math.max(maxWater, (minBar * length) );
            // if r is greater than L
            // move L by one
            if(heights[l] < heights[r]){
                l++;
            }else{
                r--;
            }
        } 
        return maxWater;
    }
}
