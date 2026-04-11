class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0;
        int low = prices[0];

        for(int num : prices){
            // 1 - 5
            profit = Math.max(profit, num - low);
            

            low = Math.min(low , num);
        }
        return profit;
        
    }
}
