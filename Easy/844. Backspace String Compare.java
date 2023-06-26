/*
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
Note that after backspacing an empty text, the text will continue empty.


Example 1:
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

Example 2:
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

Example 3:
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
*/

// Runtime: 2ms & Memory: 40.8 MB

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack_s = new Stack<>();
        Stack<Character> stack_t = new Stack<>();
        char currS, currT;

        for(int i=0; i<s.length(); i++){
            currS = s.charAt(i);
            if(currS == '#'){
                if(!stack_s.isEmpty()){
                    stack_s.pop();
                }
                continue; 
            }
            stack_s.push(currS);
        }

        for(int i=0; i<t.length(); i++){
            currT = t.charAt(i);
            if(currT == '#'){
                if(!stack_t.isEmpty()){
                    stack_t.pop();
                }
                continue;   
            }
            stack_t.push(currT);
        }

        int t_size = stack_t.size();
        int s_size = stack_s.size();

        if(t_size != s_size) return false;

        if(t_size == 0 && s_size == 0) return true;

        while(!stack_t.isEmpty() && !stack_s.isEmpty()){
            if(stack_t.pop() != stack_s.pop()) return false;
        }


        return true;

    }
}
