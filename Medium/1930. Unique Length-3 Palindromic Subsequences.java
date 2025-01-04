/*
Given a string s, return the number of unique palindromes of length three that are a subsequence of s.
Note that even if there are multiple ways to obtain the same subsequence, it is still only counted once.
A palindrome is a string that reads the same forwards and backwards.
A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
For example, "ace" is a subsequence of "abcde".
 
Example 1:
----------
Input: s = "aabca"
Output: 3
Explanation: The 3 palindromic subsequences of length 3 are:
- "aba" (subsequence of "aabca")
- "aaa" (subsequence of "aabca")
- "aca" (subsequence of "aabca")

Example 2:
----------
Input: s = "adc"
Output: 0
Explanation: There are no palindromic subsequences of length 3 in "adc".

Example 3:
----------
Input: s = "bbcbaba"
Output: 4
Explanation: The 4 palindromic subsequences of length 3 are:
- "bbb" (subsequence of "bbcbaba")
- "bcb" (subsequence of "bbcbaba")
- "bab" (subsequence of "bbcbaba")
*/

class Solution {
    public int countPalindromicSubsequence(String s) {
        HashSet<String> result = new HashSet<>();
        HashSet<Character> left = new HashSet<>();
        HashMap<Character, Integer> right = new HashMap<>();
        char[] input = s.toCharArray();

        left.add(input[0]);

        for (int c = 1; c < input.length; c++) {
            char curr = input[c];

            if (right.containsKey(curr)) {
                right.put(curr, right.get(curr) + 1);
            } else {
                right.put(curr, 1);
            }
        }

        for (int m = 1; m < input.length; m++) {
            char curr = input[m];
            right.put(curr, right.get(curr) - 1);

            if (right.get(curr) == 0) {
                right.remove(curr);
            }

            for (int i = 0; i <26; i++) {
                char val = (char) (i+97);

                if (left.contains(val) && right.containsKey(val)) {
                    result.add(val + "" + curr + "" + val);
                }
            }
            
            left.add(curr);
        }

        return result.size();
    }
}
