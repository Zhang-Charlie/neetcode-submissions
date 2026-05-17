class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen = set()

        for num in range(len(nums)):
            if num in seen:
                return True
            seen.add(num)

        return False