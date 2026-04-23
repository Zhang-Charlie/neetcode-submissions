class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:

        for i in range(len(nums)):
            for j in range(i + j, len(nums)):
                if nums[i] == nums[j]:
                    return True
        return False
