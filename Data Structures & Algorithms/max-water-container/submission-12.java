class Solution {
    public int maxArea(int[] heights) {
        
        int l = 0;
        int r = heigths.length() - 1;
        int maxA = 0;

        if(l < r){
            if(heigths[l] < heigths[r]){
                maxA = Math.max(maxA , heigths[r] * (r - l))
                l++;
            }else{
                maxA = Math.max(maxA , heigths[l] * (r - l))
                r--;
            }
        }
        return maxA;
    }
}
