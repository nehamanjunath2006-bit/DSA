#brute force
 class Solution(object):
    def intersection(self, nums1, nums2):
        result = []
        for i in range(len(nums1)):

            for j in range (len(nums2)):

                if nums1[i] == nums2[j]:

                    if nums1[i] not in result:

                        result.append(nums1[i])
        
        return result
# optimized
class Solution:
    def intersection(self ,num1 ,num2):
       return list(set(num1).intersection(set(num2)))
