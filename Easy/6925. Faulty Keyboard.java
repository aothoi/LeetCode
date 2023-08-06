/*
Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written. Typing other characters works as expected.
You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.
Return the final string that will be present on your laptop screen.

Example 1:
Input: s = "string"
Output: "rtsng"

Example 2:
Input: s = "poiinter"
Output: "ponter"
*/

class Solution {
    
    public String reverseString(String s){
        if (s.isEmpty()) return s;

        return reverseString(s.substring(1)) + s.charAt(0);
    }
    
    public String finalString(String s) {
        String str = "";
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == 'i') str = reverseString(str);
            else str += c+"";
        }
        
        return str;
    }
}
