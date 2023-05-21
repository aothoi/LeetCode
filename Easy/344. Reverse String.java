/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

example:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
*/

//Runtime: 1ms & Memory: 50.6 MB

class Solution {
    public void reverseString(char[] s) {
        char temp;
        int len = s.length-1;
        for(int i=0; i<s.length/2; i++){
            temp  = s[i];
            s[i] = s[len-i];
            s[len-i] = temp;
        }
    }
}
