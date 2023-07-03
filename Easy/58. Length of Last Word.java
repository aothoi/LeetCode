/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
*/

//Runtime: 0ms & Memory: 40.8 MB

class Solution {
    public int lengthOfLastWord(String s) {
        int res = 0;
        String str = s.trim();

        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i) == 32) return res;
            res++;
        }

        return res;
    }
}
