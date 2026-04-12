class Solution {
    public int maxArea(int[] heights) {
        int maxA = 0;
        int l = 0, r = heights.length - 1;
        while(l < r){
            int area = Math.min(heights[l] , heights[r]);
            maxA = Math.max(maxA, area * (r - l));
            // if r is greater than l
            // then increment l by 1
            // else decrement r by 1
            if(heights[l] < heights[r]){
                l++;
            } else{
                r--;
            }
        }
        return areaA;
    }
}
