class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int maxP = 0;

        while(r < prices.length){
            int profit = prices[r] - prices[l];

            if(prices[l] < prices[r]){
                maxP = Math.max(profit, maxP);
            } else{
                l = r;
            }
            r++;

        }
        return maxP;
    }
}
