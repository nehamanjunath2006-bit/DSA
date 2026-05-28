#Solution 1: Brute Force Approach        
class Solution:
    def twoSum(self, nums, target):
        
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                
                if nums[i] + nums[j] == target:
                    return [i, j]
# full program
arr = []
for i in range(num):
    element = int(input("Enter the element:"))
    arr.append(element)
target = int(input("Enter the target:"))
for i in range(num):
    for j in range(i+1, num):
        if arr[i] + arr[j] == target:
            print("The two numbers are:", arr[i], "and", arr[j])
        else:
            print("No two numbers found that add up to the target.")                
