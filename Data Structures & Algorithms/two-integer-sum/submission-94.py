class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        seen = set()

        for i in range(len(nums)):
            diff = target - nums[i]

            if diff in seen:
                return [seen.get(diff), i]

            seen.add(nums(i))

            print(dir(nums))
    

        