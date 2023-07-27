/*
-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick)."
*/

// Runtime: 0 ms & Memory: 39.8 MB

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long start=1, end=n, mid;
        while( start<=end){
            
            mid= (start+end)/2;

            if( guess((int)mid)==0) return (int)mid;
            else if( guess((int)mid)==1) start=mid+1;
            else end=mid-1; 
        }

        return -1;
    }
}
