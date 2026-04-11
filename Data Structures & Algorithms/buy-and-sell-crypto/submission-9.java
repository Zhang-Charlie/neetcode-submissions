class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int sell = prices[0];

        for(int s : prices){
            maxP = Math.max(maxP, s - sell );
            sell = Math.min(sell, s );
        }
        return maxP;
    }
}
