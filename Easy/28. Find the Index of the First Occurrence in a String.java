/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.


Example 2:
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
*/

//Runtime: 11 ms & Memory: 41.4 MB

class Solution {
    public int strStr(String haystack, String needle) {

        if(haystack.equals(needle)){
            return 0;
        }

        for(int i=0; i<haystack.length()-needle.length()+1; i++){
            System.out.println(haystack.substring(i, i+needle.length()));
            if(haystack.substring(i, i+needle.length()).equals(needle) ){
                return i;
            }
        }

        return -1;
    }
}


//Runtime: 1 ms & Memory: 40.8 MB

class Solution {
    public int strStr(String haystack, String needle) {

        int haylength=haystack.length();
        int needlelength=needle.length();
        if(haylength<needlelength)
            return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needle.length()){
                return i;
            }
        }
        return -1;

    }
}
