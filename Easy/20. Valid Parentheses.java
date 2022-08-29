/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Constraints: 1 <= s.length <= 104 and s consists of parentheses only '()[]{}'.
*/


//Runtime: 2 ms & Memory Usage: 40 MB

class Solution {
    public boolean isValid(String s) {
        
        Stack <Character> openParan = new <Character> Stack();
        
        for(int i=0; i<s.length(); i++){
            
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                openParan.push(s.charAt(i));
            } 
            else if(!openParan.isEmpty() && openParan.peek() == closeParanOf(s.charAt(i))){
                openParan.pop();
            } 
            else{
                return false;
            }
        }
        return openParan.isEmpty(); 
    }
    
    public char closeParanOf(char c){
        
        if(c == ')'){
            return '(';
        }
        else if(c == '}'){
            return '{';
        }
        else{
            return '[';
        }
    }
}
