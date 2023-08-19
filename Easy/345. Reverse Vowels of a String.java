/*
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:
Input: s = "hello"
Output: "holle"

Example 2:
Input: s = "leetcode"
Output: "leotcede"
*/

class Solution {
    public String reverseVowels(String s) {
        String str = "";
        Stack<Character> chars = new Stack<>();
        Queue<Character> vowels = new LinkedList<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                vowels.offer(c);
                chars.push('*');
            } else{
                chars.push(c);
            }
        }

        for(int i=0; i<s.length(); i++){
            if(chars.peek() == '*'){
                str = vowels.poll() + str;
                chars.pop();
            } else{
                str = chars.pop() + str;
            }
        }

        return str;
    }
}
