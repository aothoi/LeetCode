/*
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
*/

//Runtime: 1 ms & Memory: 41.4 MB

class Solution {
    public int titleToNumber(String columnTitle) {
        int len = columnTitle.length();
        int ans = 0;

        for(int i=len-1, j=0; i>=0 ; i--, j++){
            ans += (int)Math.pow(26,i) * ((int)columnTitle.charAt(j)-64);
        }

        return ans;
    }
}


//Runtime: 1 ms & Memory: 41.6 MB

class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for(char c : columnTitle.toCharArray())
        {
            int val = c - 'A' + 1;
            result = result * 26 + val;
        }
        return result;
    }
}
