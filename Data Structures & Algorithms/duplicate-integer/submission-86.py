class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        nums.sort()

        for i in range(nums):
            if nums[i] == nums[i - 1]:
                return True
            
        return False

        