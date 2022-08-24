/* Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x. 

Constraints: -2^(31) <= n <= 2^(31) - 1 */


//Approach 01 : Runtime 18 ms & Memory 47 MB

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 0){
          return false;  
        } else if(n == 1) {
            return true;
        } else if (n%3 == 0) {
            return isPowerOfThree(n/3);
        }
        return false;
    }
}


//Approach 02 : Runtime 19 ms & Memory 46.7 MB

class Solution {
    public boolean isPowerOfThree(int n) {

        /* math.log(2**31-1)/math.log(3) = 19.558822360291316
        3**19 = 1162261467
        3 is prime number */
            
        if (n == 0 || n < 0){ 
            return false;
        }
           
        return 1162261467 % n == 0;
    }
}
