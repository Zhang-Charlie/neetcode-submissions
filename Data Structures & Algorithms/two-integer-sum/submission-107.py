class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        print(dir(set))

        seen = set()

        for i in range(len(nums)):
            diff = target - nums[i]

            if diff in seen:
                return [diff, i]

            seen.add(nums[i])

    

        