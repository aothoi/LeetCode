/* You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits. 

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
*/

//Approach 01 : Runtime 22 ms & Memory 43.4 MB

import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        String num = "";
        for(int i=0; i<digits.length; i++){
            num += digits[i];
        }
        
        BigInteger addedNum = new BigInteger(num);
        num = addedNum.add(BigInteger.ONE)+"";
        
        int numArr[] = new int[num.length()];
        
        for(int i=0; i<num.length(); i++){
            numArr[i] = (int)num.charAt(i)-48;
        }

        return numArr;
    }
}

//Approach 02 : Runtime 0 ms & Memory 42.4 MB

import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
