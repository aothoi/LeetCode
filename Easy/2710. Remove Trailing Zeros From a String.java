/*
Example 1:
Input: num = "51230100"
Output: "512301"

Example 2:
Input: num = "123"
Output: "123"
*/

//Runtime: 1ms & Memory: 43.6MB

class Solution {
    public String removeTrailingZeros(String num) {
        int i = num.length() - 1;
        while(i >= 0 && num.charAt(i) == '0') i --;
        return num.substring(0, i + 1);
    }
}
