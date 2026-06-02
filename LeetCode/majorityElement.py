class Solution(object):
    def majorityElement(self, nums):
        freq = {}

        for num in nums:
            if num in freq:
                freq[num] += 1
            else:
                freq[num] = 1

        n = len(nums)

        for key, value in freq.items():
            if value > n // 2:
                return key
