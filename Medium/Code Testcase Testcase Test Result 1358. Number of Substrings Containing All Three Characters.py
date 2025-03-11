"""
Given a string s consisting only of characters a, b and c.
Return the number of substrings containing at least one occurrence of all these characters a, b and c.

Example 1:
-------------
Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 

Example 2:
-------------
Input: s = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb". 

Example 3:
-------------
Input: s = "abc"
Output: 1

Constraints:
-------------
3 <= s.length <= 5 x 10^4
s only consists of a, b or c characters.
"""

class Solution(object):
    def numberOfSubstrings(self, s):
        abc = defaultdict(int)
        res = 0
        l = 0

        for r in range(len(s)):
            if s[r] in "abc":
                abc[s[r]] += 1
            
            while len(abc) == 3:
                res += (len(s) - r)

                if s[l] in "abc":
                    abc[s[l]] -= 1
                if abc[s[l]] == 0:
                    abc.pop(s[l])
                
                l += 1
        
        return res
