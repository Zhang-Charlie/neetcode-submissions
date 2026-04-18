class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxP = 0
        lowest = prices[0]
        
        for sell in prices:
            maxP = max(maxP, sell - lowest)
            lowest = min(lowest,sell)
        return maxP

        