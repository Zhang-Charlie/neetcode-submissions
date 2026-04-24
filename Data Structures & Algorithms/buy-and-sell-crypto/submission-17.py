class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        pointer = 0
        sell = 0
        buy = prices[0]

        while pointer < len(prices):
            buy = min(buy, prices[pointer])
            sell = max(sell, prices[pointer] - buy)
            pointer += 1

        return sell


        