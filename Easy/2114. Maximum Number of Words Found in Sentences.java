/*
Example 1:
Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6

Example 2:
Input: sentences = ["please wait", "continue to fight", "continue to win"]
Output: 3
*/

// Runtime: 4ms & Memory: 43.8 MB

class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxLen = 0, newLen = 0, len = sentences.length;

        for(int i=0; i<len; i++){
            newLen = sentences[i].split(" ").length;

            if(newLen > maxLen) maxLen = newLen;
        }

        return maxLen;
    }
}
