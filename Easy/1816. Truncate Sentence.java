/*
Example 1:
Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"

Example 2:
Input: s = "What is the solution to this problem", k = 4
Output: "What is the solution"
*/

//Runtime: 0ms & Memory: 40.3 MB

class Solution {
    public String truncateSentence(String s, int k) {
        int len = s.length();
        int spaceCount = 0;
        int i=0; 

        for(;i<len; i++)
            if(s.charAt(i) == ' '){
                if(++spaceCount == k) break;
            }

        return s.substring(0, i);
    }
}
