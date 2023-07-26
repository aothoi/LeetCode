/*
Example 1:
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true

Example 2:
Input: sentence = "leetcode"
Output: false
*/

//Runtime: 1ms & Memory: 40.8 MB

class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] letters = new int[26];
        int len = sentence.length();

        for(int i=0; i<len; i++)
            letters[sentence.charAt(i)-97]++;

        for(int i=0; i<26; i++)
            if(letters[i] == 0) return false;

        return true;
    }
}

//Runtime: 0ms & Memory: 40.7 MB

class Solution {
    public boolean checkIfPangram(String sentence) {
        for(int i=0;i<26;i++){
            char c=(char)('a'+i);
            if(sentence.indexOf(c)==-1)
                return false;
        }
        return true;
    }
}
