/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
*/

//Runtime: 837 ms & Memory: 432.7 MB

public boolean isPalindrome(String s) {
        String str = "";

        for(int i=0; i<s.length(); i++){
            if((s.charAt(i)>47 && s.charAt(i)<58) || (s.charAt(i)>64 && s.charAt(i)<91) 
            || (s.charAt(i)>96 && s.charAt(i)<123)){
                str += (s.charAt(i)+"").toLowerCase();
            }
        }

        if(str.equals(" ") || str.length()==0){
            return true;
        }

        for(int i=0; i<=(str.length()/2); i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }

        return true;
    }


//Runtime: 3 ms & Memory: 42.1 MB

public class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while(head <= tail) {
        	cHead = s.charAt(head);
        	cTail = s.charAt(tail);
        	if (!Character.isLetterOrDigit(cHead)) {
        		head++;
        	} else if(!Character.isLetterOrDigit(cTail)) {
        		tail--;
        	} else {
        		if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
        			return false;
        		}
        		head++;
        		tail--;
        	}
        }
        
        return true;
    }
}
