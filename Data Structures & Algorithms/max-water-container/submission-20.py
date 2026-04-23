class Solution:
    def maxArea(self, heights: List[int]) -> int:
        max_num = 0;
        l = 0
        r = len(heights) - 1
        while l < r:
            if heights[l] < heights[r]:
                max_num = max(max_num , heights[r] * r - l)
                l += 1
            else:
                max_num = max(max_num, heights[l] * r - l)
                r -= 1
        return max_num