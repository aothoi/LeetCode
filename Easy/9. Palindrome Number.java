/* 
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
*/

class Solution {
    public boolean isPalindrome(int x) {
    
        Boolean flag = true;
        String str = ""+x;
      
          for(int i=0; i<str.length(); i++){
              if(!(str.charAt(i) == str.charAt(str.length()-i-1))){
                  flag = false;
              }
          }

         return flag == true;
    
    }
}
