# optimized
class Solution(object):
    def moveZeroes(self, nums):
        
        for i in range(len(nums)):
            for j in range(i + 1,len(nums)):
                if nums[i] == 0 and nums[j] != 0:
                    nums[i], nums[j] = nums[j], nums[i]
                    break
