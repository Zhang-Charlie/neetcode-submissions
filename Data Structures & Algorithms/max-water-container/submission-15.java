class Solution {
    public int maxArea(int[] heights) {
        
        int l = 0;
        int r = heights.length - 1;
        int maxA = 0;

        if(l < r){
            if(heights[l] < heights[r]){
                maxA = Math.max(maxA , heights[r] * (r - l));
                l++;
            }else{
                maxA = Math.max(maxA , heights[l] * (r - l));
                r--;
            }
        }
        return maxA;
    }
}
