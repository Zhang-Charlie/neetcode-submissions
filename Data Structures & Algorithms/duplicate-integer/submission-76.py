class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen = set()

        for num in nums:
            if seen.contains(num):
                return True
            seen.add(num)
        return False
        