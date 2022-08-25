/* 
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote. 

Constraints: 1 <= ransomNote.length, magazine.length <= 105 & ransomNote and magazine consist of lowercase English letters.
*/


//Approach 01 : Runtime 34 ms & Memory 43.2 MB

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i=0; i<ransomNote.length(); i++){
            if(magazine.contains(""+ransomNote.charAt(i))){
                magazine = magazine.replaceFirst(""+ransomNote.charAt(i), "");
            } else{
                return false;
            }
        }
        return true;
    }
}


//Approach 02 : Runtime 4 ms & Memory 46.6 MB

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for(char ch: magazine.toCharArray()) {
            count[ch - 'a']++;
        }
        for(char ch: ransomNote.toCharArray()) {
            int val = ch - 'a';
            if(count[val] <= 0) return false;
            count[val]--;
        }
        return true;
    }
}
