class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l = 0
        r = len(prices) - 1
        max = 0

        while l < r:
            if prices[l] < prices[r]:
                max = Math.max(max, prices[r] - prices[l])
                l += 1
            else:
                r += 1
            
        return max                


                            


        