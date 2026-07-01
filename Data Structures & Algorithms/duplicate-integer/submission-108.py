class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen = set()
        print(type(seen))

        for num in enumerate(nums):
            if num in seen:
                return True
            seen.add(num)
        return False
