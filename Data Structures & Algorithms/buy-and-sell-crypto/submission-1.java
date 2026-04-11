class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;

        for(int i = 0; i < prices.length; i++){
            int curr = prices[i];
            for(int j = i + 1; j < prices.length; j++){
                int sell = prices[j];
                res = Math.max(res, sell - curr);
                // 10 - 1
            }
        
        }
        return res;

    }
}
