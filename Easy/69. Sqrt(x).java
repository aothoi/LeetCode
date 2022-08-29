/*
Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

Constraints: 0 <= x <= 231 - 1
*/

//Approach 01: Runtime: 3 ms & Memory Usage: 41.7 MB

class Solution {
    public int mySqrt(int x) {
        return (int)Math.floor(Math.pow(x, 0.5));
    }
}

//Approach 02: Runtime: 3 ms & Memory Usage: 41.7 MB

class Solution {
    public int mySqrt(int x) {
        if(x <= 1) return x;
        int start = 1, mid = 1, end = x/2;
        while(start<=end){
            mid = start + (end - start)/2;
            if(mid == x/mid) return mid;
            if(mid > x/mid) end = mid-1;
            else if(mid < x/mid) start = mid+1;
        }
        return end;
    }
}
