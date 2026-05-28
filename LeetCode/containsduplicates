# full program
num = int(input("Enter the size:"))
a=[]
for i  in range(num):
    element=int(input("Enter the element:"))
    a.append(element)
a.sort()
for i in range(num - 1):
    if a[i] == a[i + 1]:
        print("true")
        break
else:
    print("false") 

# brute force approach
arr = []
for i in range(num):
    element = int(input("Enter the element:"))
    arr.append(element)
for i in range(num):
    for j in range(i + 1, num):
        if arr[i] == arr[j]:
            print("true")
            break
else:    print("false")
# OPTIMIZED
class Solution:

    def containsDuplicate(self, nums):

        seen = set()

        for num in nums:

            if num in seen:
                return True
