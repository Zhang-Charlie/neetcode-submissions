class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        maps = {}

        for i in range(len(nums)):
            diff = target - nums[i]
            if diff in maps:
                return [maps.get(diff) , i ]
            maps[nums[i]] = i


