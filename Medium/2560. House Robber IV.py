""""
There are several consecutive houses along a street, each of which has some money inside. There is also a robber, who wants to steal money from the homes, but he refuses to steal from adjacent homes.
The capability of the robber is the maximum amount of money he steals from one house of all the houses he robbed.
You are given an integer array nums representing how much money is stashed in each house. More formally, the ith house from the left has nums[i] dollars.
You are also given an integer k, representing the minimum number of houses the robber will steal from. It is always possible to steal at least k houses.
Return the minimum capability of the robber out of all the possible ways to steal at least k houses.
""""

class Solution(object):
    def minCapability(self, nums, k):
        def is_valid(cap):
            i, c = 0, 0

            while i < len(nums):
                if nums[i] <= cap:
                    i += 2
                    c += 1
                else:
                    i += 1
                if c == k:
                    break
            
            return c == k
            
        res, l, r = 0, min(nums), max(nums)

        while l <= r:
            m = (l+r) // 2

            if is_valid(m):
                res = m
                r = m - 1
            else:
                l = m + 1
        
        return res
