# class Solution(object):
#     def isAnagram(self, s, t):

#         if len(s) != len(t):
#             return False

#         return sorted(s) == sorted(t)
class Solution(object):
    def duplicates(self, nums):
        print("enter the list of numbers:")
        nums.sort()
        return list(set(nums))