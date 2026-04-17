class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        nums.sort()
        # 1 2 3 3
        for i in range(len(nums)):
            if nums[i] == nums[i - 1]:
                return True
        
        return False
        