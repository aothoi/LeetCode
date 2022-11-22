"""
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Ecample:
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
"""

#Approach 01: Runtime: 38ms & Memory: 13.2 MB

class Solution(object):
    def removeElement(self, nums, val):
        while True:
            try:
                nums.pop(nums.index(val))
            except:
                break
        return len(nums)
