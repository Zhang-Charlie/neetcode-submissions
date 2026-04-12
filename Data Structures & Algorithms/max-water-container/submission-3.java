class Solution {
    public int maxArea(int[] heights) {

        int ans = 0;
        int l = 0, r = heights.length - 1;

        while(l < r){
            if(heights[l] < heights[r]){
                l++;
            } else if(heights[l] > heights[r]){
                r--;
            } else{
                r--;
            }
            int high = Math.min(heights[l], heights[r]);
            ans = Math.max(ans, high * (r - l));
        }
        return ans;
    }
}
